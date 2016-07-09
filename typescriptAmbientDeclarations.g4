
/*arrayType
 ANTLR4 grammar taken from TypeScript Documentation:
 https://github.com/Microsoft/TypeScript/blob/master/doc/spec.md#12.1.2
 https://www.typescriptlang.org/docs/tutorial.html
 https://basarat.gitbooks.io/typescript/content/
*/

grammar typescriptAmbientDeclarations;

typescriptAmbientDeclarations
 : declarationSourceFile EOF
 ;

declarationSourceFile
 : declarationScript
 | declarationModule
 ;

//_______________________________ A.1 Types

typeParameters
 : '<' typeParameterList '>'
 ;

typeParameterList
 : typeParameter ( ',' typeParameter )*
 ;

typeParameter
 : BindingIdentifier constraint?
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

unionOrIntersectionOrPrimaryType
 : unionType
 | intersectionOrPrimaryType
 ;

intersectionOrPrimaryType
 : intersectionType
 | primaryOrArray
 ;

primaryOrArray
 : primaryType /* no line terminator here */ ('[' ']')+
 ;

primaryType
 : parenthesizedType
 | predefinedType
 | typeReference
 | objectType
 | tupleType
 | typeQuery
 | thisType
 ;

parenthesizedType
 : '(' type ')'
 ;

predefinedType // no support for symbol at this time
 : 'any' | 'number' | 'boolean' | 'string' | 'symbol' | 'void'
 ;

typeReference
 : typeName /* no line terminator here */ typeArguments?
 ;

typeName
 : identifierReference
 | namespaceName '.' identifierReference
 ;

namespaceName
 : identifierReference
 | namespaceName '.' identifierReference
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
 : tupleElementType (',' tupleElementType)*
 ;

tupleElementType
 : type
 ;

unionType
 : unionOrIntersectionOrPrimaryType '|' intersectionOrPrimaryType
 ;

intersectionType
 : intersectionOrPrimaryType '&' primaryType
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
 : identifierReference
 | typeQueryExpression '.' identifierName
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
 : accessibilityModifier? BindingIdentifier /*BindingIdentifierOrPattern*/ typeAnnotation?
 | BindingIdentifier ':' StringLiteral
 ;

accessibilityModifier
 : 'public' | 'private' | 'protected'
 ;

/* can't find anything describing bindingPattern
BindingIdentifierOrPattern
 : BindingIdentifier
 | bindingPattern
 ;*/

optionalParameterList
 : optionalParameter (',' optionalParameter)*
 ;

optionalParameter // (initializer removed because it's only used when there's a function body)
 : accessibilityModifier? BindingIdentifier /*BindingIdentifierOrPattern*/ '?'? typeAnnotation?
 | BindingIdentifier '?' ':' StringLiteral
 ;

restParameter
 : '...' BindingIdentifier typeAnnotation?
 ;

constructSignature
 : 'new' typeParameters? '(' parameterList? ')' typeAnnotation?
 ;

indexSignature
 : '[' BindingIdentifier ':' ('string' | 'number') ']' typeAnnotation
 ;

methodSignature
 : propertyName '?'? callSignature
 ;

typeAliasDeclaration
 : 'type' BindingIdentifier typeParameters? '=' type ';'
 ;

//_______________________________ A.2 Expressions

/// FIXME: need constant expressions here for enum
constExpression
 : numericLiteral
 ;
    
//_______________________________ A.3 Statements
    
//_______________________________ A.4 Functions

functionDeclaration // functionBody removed
 : BindingIdentifier? callSignature ';'
 ;

//_______________________________ A.5 Interfaces

interfaceDeclaration
 : 'interface' BindingIdentifier typeParameters? interfaceExtendsClause? objectType
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

classElement
 : constructorDeclaration
 | constructorDeclaration
 | propertyMemberDeclaration
 | indexMemberDeclaration
 ;
  
constructorDeclaration // functionBody removed
 : accessibilityModifier? 'constructor' '(' parameterList? ')' ';'
 ;
  
propertyMemberDeclaration
 : memberVariableDeclaration
 | memberFunctionDeclaration
 | memberAccessorDeclaration
 ;

memberVariableDeclaration
 : accessibilityModifier? 'static'? propertyName typeAnnotation? /*initializer?*/ ';'
 ;
  
memberFunctionDeclaration // functionBody removed
 : accessibilityModifier? 'static' propertyName callSignature ';'
 ;
  
memberAccessorDeclaration // is there where keyword 'readonly' goes?
 : accessibilityModifier? 'static'? // (getAccessor | setAccessor)
 ;
  
indexMemberDeclaration
 : indexSignature
 ;
/*
getAccessor
 :
 ;

setAccessor
 :
 ;
*/

//_______________________________ A.7 Enums

enumDeclaration // const enum treated significantly different from plain enum
 : 'enum' BindingIdentifier '{' enumBody? '}'
 | 'const' 'enum' Identifier '{' enumBody? '}'
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
 : BindingIdentifier ('.' BindingIdentifier)*
 ;
 
//_______________________________ A.9 Scripts and Modules

declarationScript
 : declarationScriptElement*
 ;
 
declarationScriptElement
 : declarationElement
 | ambientModuleDeclaration
 ;
 
declarationElement
 : interfaceDeclaration
 | typeAliasDeclaration
// | namespaceDeclaration FIXME
 | ambientDeclaration
// | importAliasDeclaration FIXME
 ;

declarationModule
 : declarationModuleElement*
 ;
 
declarationModuleElement
 : declarationElement
 ; // longer list may have to be added here

//_______________________________ A.10 Ambients

ambientDeclaration
 : 'declare' ambientStatement
 ;

ambientStatement
 : ambientVariableDeclaration
 | ambientFunctionDeclaration
 | ambientClassDeclaration
 | ambientEnumDeclaration
 | ambientNamespaceDeclaration
 ;

ambientVariableDeclaration
 : ('var' | 'let' | 'const') ambientBindingList ';'
 ;

ambientBindingList
: ambientBinding (',' ambientBinding )*
;

ambientBinding
 : BindingIdentifier typeAnnotation?
 ;

ambientFunctionDeclaration
 : 'function' BindingIdentifier callSignature ';'
 ;

ambientClassDeclaration
 : 'class' BindingIdentifier typeParameters? classHeritage '{' ambientClassElements? '}'
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
 : accessibilityModifier? 'static'? propertyName (typeAnnotation? | callSignature) ';'
 ;

ambientEnumDeclaration
 : enumDeclaration
 ;

ambientNamespaceDeclaration
 : 'namespace' IdentifierPath '{' ambientNamespaceElements '}'
 ;

ambientNamespaceElements // ambientNamespaceBody
 : ambientNamespaceElement (ambientNamespaceElement)*
 ;

ambientNamespaceElement
 : 'export'? ambientNamespaceElement2
 ;

ambientNamespaceElement2
 : ambientVariableDeclaration
// | ambientLexicalDeclaration FIXME
 | ambientFunctionDeclaration
 | ambientClassDeclaration
 | interfaceDeclaration
 | ambientEnumDeclaration
 | ambientNamespaceDeclaration
// | importAliasDeclaration FIXME
 ;

ambientModuleDeclaration
 : 'declare' 'module' StringLiteral '{' declarationModule '}'
 ;

identifierReference
 : Identifier
 ;

identifierName
 : Identifier
 ;

///////////////////////////////////////////////////////////////////////////////////

propertyName
 : (Identifier| StringLiteral)
 | numericLiteral
 ; // computedPropertyName not supported

 
numericLiteral
 : DecimalLiteral
 | HexIntegerLiteral
 | OctalIntegerLiteral
 ;

BindingIdentifier
 : Identifier
 // | StringLiteral // FIXME
 ;
  
///////////////////////////////////////////////////////////////////////////////////

 
/// 7.3 Line Terminators
LineTerminator
 : [\r\n\u2028\u2029] -> channel(HIDDEN)
 ;
 
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

Any         : 'any';
Number      : 'number';
Boolean     : 'boolean';
String      : 'string'; 
Symbol      : 'symbol';
Void        : 'void';

Public      : 'public';
Protected   : 'protected';
Private     : 'private';
Static      : 'static';
Readonly    : 'readonly'; // << new keyword not in spec

New         : 'new';
Type        : 'type';
Typeof      : 'typeof';
This        : 'this';

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
RightShiftArithmetic      : '>>';
LeftShiftArithmetic       : '<<';
RightShiftLogical         : '>>>';
LessThan                  : '<';
MoreThan                  : '>';
LessThanEquals            : '<=';
GreaterThanEquals         : '>=';
Equals                    : '==';
NotEquals                 : '!=';
IdentityEquals            : '===';
IdentityNotEquals         : '!==';
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

/// 7.6 Identifier Names and Identifiers
Identifier // unicode not implemented yet, reserved words not allowed
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

WS :  [ \t\r\n\u000C]+ -> skip
   ;

COMMENT
   :   '/*' .*? '*/' -> skip
   ;

LINE_COMMENT
   :   '//' ~[\r\n]* -> skip
   ;
