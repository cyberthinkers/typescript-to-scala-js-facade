/*
 ANTLR4 grammar taken from TypeScript Documentation:
 https://github.com/Microsoft/TypeScript/blob/master/doc/spec.md#12.1.2
 https://www.typescriptlang.org/docs/tutorial.html
 https://basarat.gitbooks.io/typescript/content/
 https://github.com/Microsoft/TypeScript/wiki/What's-new-in-TypeScript

 IntelliJ with antlr4 plugin used: http://plugins.jetbrains.com/plugin/7358?pr=
 to develop this grammar
*/


grammar GenScalaFacadesFromTypescript;

typescriptAmbientDeclarations
 : declarationScript EOF
 ;

//_______________________________ A.1 Types

typeDeclaration
 : 'type' bindingIdentifier '=' type ';'
 ;

typeParameters
 : '<' typeParameterList '>'
 ;

typeParameterList
 : typeParameter ( ',' typeParameter )*
 ;

typeParameter
 : bindingIdentifier constraint?
 ;

constraint
 : 'extends' type
 ;

typeArguments
 : '<' typeArgumentList '>'
 ;

typeArgumentList
 : typeArgument ( ',' typeArgument )*
 ;

typeArgument
 : type
 ;

type
 : unionOrIntersectionOrPrimaryType
 | functionType
 | constructorType
 ;

unionOrIntersectionOrPrimaryType //FIXME-not sure if the following presidence is correct
 : unionOrIntersectionOrPrimaryType '|' unionOrIntersectionOrPrimaryType #unionType
 | unionOrIntersectionOrPrimaryType '&' unionOrIntersectionOrPrimaryType #intersectionType
 | '(' unionOrIntersectionOrPrimaryType ')' #ignore
 | primaryOrArray #primaryOrOptArray
 ;

primaryOrArray
 : primaryType arrayDim*
 ;

nestedType
  : '<' type '>'
  ;

arrayDim
 : ('[' ']') // array dimension could be > 1
 ;

// FIXME: missing type guards - https://www.typescriptlang.org/docs/handbook/advanced-types.html
primaryType //// FIXME: Missing string literal types
 : parenthesizedType
 | predefinedType
 | identifier
 | typeReference
 | objectType
 | tupleType
 | typeQuery
 | thisType
 ;

parenthesizedType
 : '(' type ')'
 ;

predefinedType
 : 'any' | 'number' | 'boolean' | 'string' | 'symbol' | 'void'
 ;

typeReference
 : typeName typeArguments?
 ;

typeName
 : identifier
 | namespaceName '.' identifier
 ;

namespaceName
 : identifier
 | namespaceName '.' identifier
 ;

objectType
 : '{' typeBody? '}'
 ;

typeBody
 : typeMemberList (';' | ',')?
 ;

typeMemberList
 : typeMember ((';' | ',') typeMember )*
 ;

typeMember
 : propertySignature
 | callSignature
 | constructSignature
 | indexSignature
 | methodSignature
 ;

tupleType
 : '[' typeElementTypes ']'
 ;

typeElementTypes
 : type (',' type)*
 ;

functionType
 : typeParameters? '(' parameterList? ')' '=>' type
 ;

constructorType
 : 'new' typeParameters? '(' parameterList? ')' '=>' type
 ;

typeQuery
 : 'typeof' typeQueryExpression
 ;

typeQueryExpression
 : identifier
 | typeQueryExpression '.' identifier
 ;

thisType
 : 'this'
 ;

propertySignature
 : propertyName '?'? typeAnnotation?
 ;

typeAnnotation
 : ':' type
 ;

callSignature
 : typeParameters? '(' parameterList? ')' typeAnnotation?
 ;

parameterList
 : requiredParameterList (',' ((optionalParameterList (',' restParameter)? | restParameter)))?
 | optionalParameterList (',' restParameter)?
 | restParameter
 ;

requiredParameterList
 : requiredParameter (',' requiredParameter)*
 ;

requiredParameter
 : accessibilityModifier? bindingIdentifier typeAnnotation?
 | bindingIdentifier ':' StringLiteral
 ;

accessibilityModifier
 : 'public' | 'private' | 'protected'
 ;

optionalParameterList
 : optionalParameter (',' optionalParameter)*
 ;

optionalParameter // (initializer removed because it's only used when there's a function body)
 : accessibilityModifier? bindingIdentifier '?'? typeAnnotation?
 | bindingIdentifier '?' ':' StringLiteral
 ;

restParameter
 : '...' bindingIdentifier typeAnnotation?
 ;

constructSignature
 : 'new' typeParameters? '(' parameterList? ')' typeAnnotation?
 ;

indexSignature
 : '[' bindingIdentifier ':'
       ('string' | 'number')
   ']'
  typeAnnotation
 ;

methodSignature
 : propertyName '?'? callSignature
 ;

typeAliasDeclaration
 : Type bindingIdentifier typeParameters? '=' type ';'
 ;

//_______________________________ A.2 Expressions

/// FIXME: need constant expressions here for enum
constExpression
 : numericLiteral
 ;

//_______________________________ A.3 Statements

//_______________________________ A.4 Functions

functionDeclaration // functionBody removed
 : bindingIdentifier? callSignature ';'
 ;

//_______________________________ A.5 Interfaces

interfaceDeclaration
 : 'interface' bindingIdentifier typeParameters? interfaceExtendsClause? objectType
   ;

interfaceExtendsClause
 : 'extends' classOrInterfaceTypeList
 ;

classOrInterfaceTypeList
 : classOrInterfaceType (',' classOrInterfaceType)*
 ;

classOrInterfaceType
 : typeReference
 ;

//_______________________________ A.6 Classes

classHeritage
 : classExtendsClause? implementsClause?
 ;

classExtendsClause
 : 'extends' classType
 ;

classType
 : typeReference
 ;

implementsClause
 : 'implements' classOrInterfaceTypeList
 ;

 /*
classElement // fixme - should this be removed?
 : constructorDeclaration
 | constructorDeclaration
 | propertyMemberDeclaration
 | indexMemberDeclaration
 ;*/
/*
constructorDeclaration // functionBody removed
 : accessibilityModifier? 'constructor' '(' parameterList? ')' ';'
 ;

propertyMemberDeclaration
 : memberVariableDeclaration
 | memberFunctionDeclaration
 | memberAccessorDeclaration
 ;


 
memberVariableDeclaration
 : accessibilityModifier? staticOpt? propertyName typeAnnotation?
   //initializer?
    ';'
 ;
*/

memberFunctionDeclaration // functionBody removed
 : accessibilityModifier? staticOpt propertyName callSignature ';'
 ;

memberAccessorDeclaration // is there where keyword 'readonly' goes?
 : accessibilityModifier? staticOpt? // (getAccessor | setAccessor)
 ;

indexMemberDeclaration
 : indexSignature
 ;
 // getAccesor / setAccessor  missing FIXME

staticOpt
 : 'static'
 ; 
//_______________________________ A.7 Enums

enumDeclaration // const enum treated significantly different from plain enum
 : 'enum' bindingIdentifier '{' enumBody? '}'
 | 'const' 'enum' identifier '{' enumBody? '}'
 ;

enumBody
 : enumMemberList ','?
 ;

enumMemberList
 : enumMember (',' enumMember)*
 ;

enumMember
 : propertyName ('=' enumValue)?
 ;

enumValue
 : constExpression
 ;

//_______________________________ A.8 Namespaces

identifierPath
 : bindingIdentifier ('.' bindingIdentifier)*
 ;

//_______________________________ A.9 Scripts and Modules

declarationScript
 : declarationScriptElement*
 ;

declarationScriptElement
 : ambientDeclareStatement
 | ambientStatement
 ;

ambientDeclareStatement
 : 'declare' (ambientModuleDeclaration | ambientVariableDeclaration | ambientNamespaceDeclaration)
 ;

declarationModule
 : ambientStatement*
 ;

//_______________________________ A.10 Ambients

ambientStatement
 : ambientVariableDeclaration
 | interfaceDeclaration
 | typeAliasDeclaration
 | typeDeclaration
 | ambientFunctionDeclaration
 | ambientClassDeclaration
 | ambientEnumDeclaration
 | ambientNamespaceDeclaration
 | ambientModuleDeclaration
 // | namespaceDeclaration FIXME
 // | importAliasDeclaration FIXME
 ;

ambientVariableDeclaration
 : ambientVariableKeyword ambientBindingList ';'
 ;

ambientVariableKeyword
 : ('var' | 'let' | 'const')
 ;

ambientBindingList
: ambientBinding (',' ambientBinding )*
;

ambientBinding
 : bindingIdentifier typeAnnotation?
 ;

ambientFunctionDeclaration
 : 'function' bindingIdentifier callSignature ';'
 ;

ambientClassDeclaration
 : 'abstract'? 'class' bindingIdentifier typeParameters? classHeritage '{' ambientClassElements? '}'
 ;

ambientClassElements // ambientClassBody
 : ambientClassBodyElement (ambientClassBodyElement)*
 ;

ambientClassBodyElement
 : ambientConstructorDeclaration
 | ambientPropertyMemberDeclaration
 | indexSignature
 ;

ambientConstructorDeclaration
 : 'constructor' '(' parameterList? ')' ';'
 ;

ambientPropertyMemberDeclaration
 : accessibilityModifier? staticOpt? propertyName ambientProperty ';'
 ;

ambientProperty
 : typeAnnotation #propertyTypeAnnotation
 | callSignature  #propertyCallSignature
 |                #propertyWithoutTypeAnnotation
 ;

ambientEnumDeclaration
 : enumDeclaration
 ;

ambientNamespaceDeclaration
 : 'namespace' identifierPath '{' ambientNamespaceElements '}'
 ;

ambientNamespaceElements // ambientNamespaceBody
 : ambientNamespaceElement (ambientNamespaceElement)*
 ;

ambientNamespaceElement
 : 'export'? ambientNamespaceElement2
 ;

ambientNamespaceElement2
 : ambientVariableDeclaration
// | ambientLexicalDeclaration FIXME - not sure how this works
 | ambientFunctionDeclaration
 | ambientClassDeclaration
 | typeDeclaration
 | interfaceDeclaration
 | ambientEnumDeclaration
 | ambientNamespaceDeclaration
// | importAliasDeclaration FIXME
 ;

ambientModuleDeclaration
 : 'module' identifierPath
  '{' declarationModule '}'
 ;

bindingIdentifier
 : identifier
 | StringLiteral
 ;

propertyName
 : (identifier | StringLiteral)
 ; // computedPropertyName not supported


numericLiteral
 : DecimalLiteral
 | HexIntegerLiteral
 | OctalIntegerLiteral
 ;
///////////////////////////////////////////////////////////////////////////////////


/// 7.3 Line Terminators
LineTerminator
 : [\r\n\u2028\u2029] -> channel(HIDDEN)
 ;

Abstract    : 'abstract';
Class       : 'class';
Const       : 'const';
Constructor : 'constructor';
Declare     : 'declare';
Enum        : 'enum';
Export      : 'export';
Extends     : 'extends';
Function    : 'function';
Implements  : 'implements';
Interface   : 'interface';
Let         : 'let';
Module      : 'module';
Var         : 'var';

Public      : 'public';
Protected   : 'protected';
Private     : 'private';
Static      : 'static';
Readonly    : 'readonly'; // << new keyword not in spec

New         : 'new';
Typeof      : 'typeof';
This        : 'this';

/*
Any         : 'any';
Number      : 'number';
Boolean     : 'boolean';
String      : 'string';
Symbol      : 'symbol';
Type        : 'type';
Void        : 'void';
*/

ThickArrow                : '=>';
DotDotDot                 : '...';
OpenBracket               : '[';
CloseBracket              : ']';
OpenParen                 : '(';
CloseParen                : ')';
OpenBrace                 : '{';
CloseBrace                : '}';
SemiColon                 : ';';
Comma                     : ',';
Assign                    : '=';
QuestionMark              : '?';
Colon                     : ':';
Dot                       : '.';
PlusPlus                  : '++';
MinusMinus                : '--';
Plus                      : '+';
Minus                     : '-';
BitNot                    : '~';
Not                       : '!';
Multiply                  : '*';
Divide                    : '/';
Modulus                   : '%';

LessThan                  : '<';
MoreThan                  : '>';
LessThanEquals            : '<=';
GreaterThanEquals         : '>=';
Equals                    : '==';
NotEquals                 : '!=';
IdentityEquals            : '===';
IdentityNotEquals         : '!==';
/*
RightShiftLogical         : '>>>';
RightShiftArithmetic      : '>>';
LeftShiftArithmetic       : '<<';
*/
BitAnd                    : '&';
BitXOr                    : '^';
BitOr                     : '|';
And                       : '&&';
Or                        : '||';
MultiplyAssign            : '*=';
DivideAssign              : '/=';
ModulusAssign             : '%=';
PlusAssign                : '+=';
MinusAssign               : '-=';
LeftShiftArithmeticAssign : '<<=';
RightShiftArithmeticAssign : '>>=';
RightShiftLogicalAssign   : '>>>=';
BitAndAssign              : '&=';
BitXorAssign              : '^=';
BitOrAssign               : '|=';

/// 7.8.1 Null Literals
NullLiteral
 : 'null'
 ;

/// 7.8.2 Boolean Literals
BooleanLiteral
 : 'true'
 | 'false'
 ;

/// 7.8.3 Numeric Literals
DecimalLiteral
 : DecimalIntegerLiteral '.' DecimalDigit* ExponentPart?
 | '.' DecimalDigit+ ExponentPart?
 | DecimalIntegerLiteral ExponentPart?
 ;

/// 7.8.3 Numeric Literals
HexIntegerLiteral
 : '0' [xX] HexDigit+
 ;

OctalIntegerLiteral
 : {!strictMode}? '0' OctalDigit+
 ;

/// 7.6 identifier Names and Identifiers
Type        : 'type';

identifier // unicode not implemented yet
 : Identifier
 | Type
 | 'number'
 | 'string'
 ;

Identifier
 : Letter LetterOrDigit*
 ;

fragment
Letter
 : [a-zA-Z$_]
 ;

fragment
LetterOrDigit
 : [a-zA-Z0-9$_]
 ;

/// 7.8.4 String Literals
StringLiteral
 : '"' DoubleStringCharacter* '"'
 | '\'' SingleStringCharacter* '\''
 ;

fragment DoubleStringCharacter
 : ~["\\\r\n]
 | '\\' EscapeSequence
 | LineContinuation
 ;

fragment SingleStringCharacter
 : ~['\\\r\n]
 | '\\' EscapeSequence
 | LineContinuation
 ;

fragment EscapeSequence
 : CharacterEscapeSequence
 | '0' // no digit ahead! TODO
 | HexEscapeSequence
 | UnicodeEscapeSequence
 ;

fragment CharacterEscapeSequence
 : SingleEscapeCharacter
 | NonEscapeCharacter
 ;

fragment HexEscapeSequence
 : 'x' HexDigit HexDigit
 ;

fragment UnicodeEscapeSequence
 : 'u' HexDigit HexDigit HexDigit HexDigit
 ;

fragment SingleEscapeCharacter
 : ['"\\bfnrtv]
 ;

fragment NonEscapeCharacter
 : ~['"\\bfnrtv0-9xu\r\n]
 ;

fragment EscapeCharacter
 : SingleEscapeCharacter
 | DecimalDigit
 | [xu]
 ;

fragment LineContinuation
 : '\\' LineTerminatorSequence
 ;

fragment LineTerminatorSequence
 : '\r\n'
 | LineTerminator
 ;

fragment DecimalDigit
 : [0-9]
 ;

fragment HexDigit
 : [0-9a-fA-F]
 ;

fragment OctalDigit
 : [0-7]
 ;

fragment DecimalIntegerLiteral
 : '0'
 | [1-9] DecimalDigit*
 ;

fragment ExponentPart
 : [eE] [+-]? DecimalDigit+
 ;

//
// Whitespace and comments
//

WS:  [ \t\r\n\u000C]+ -> skip
  ;

Documentation
 :  '/**' .*? '*/' -> skip // FIXME needs DOCUMENTATION channel
 ;

Comment
 :   '/*' .*? '*/' -> skip
 ;

LineComment
 :   '//' ~[\r\n]* -> skip
 ;
