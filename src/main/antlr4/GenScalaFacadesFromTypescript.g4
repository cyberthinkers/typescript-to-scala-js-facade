/*
 ANTLR4 grammar taken from TypeScript Documentation:
 https://github.com/Microsoft/TypeScript/blob/master/doc/spec.md
 https://github.com/Microsoft/TypeScript/blob/master/doc/spec.md#3.2.7
 https://www.typescriptlang.org/docs/tutorial.html
 https://basarat.gitbooks.io/typescript/content/
 https://github.com/Microsoft/TypeScript/wiki/What's-new-in-TypeScript
 https://www.typescriptlang.org/play/index.html
 missing a lot of stuff, but may be useful->
     https://github.com/vandermore/Randori-Jackalope/blob/master/antlr4/TypeScript.g4
 IntelliJ with antlr4 plugin used: http://plugins.jetbrains.com/plugin/7358?pr=
 to develop this grammar
 https://www.typescriptlang.org/docs/handbook/namespaces.html << namespace vs. modules
*/
grammar GenScalaFacadesFromTypescript;

@lexer::members {
    private boolean strictMode = true;
    public boolean getStrictMode() {
        return this.strictMode;
    }
}

typescriptAmbientDeclarations
 :  declarationScriptElement* EOF
 ;

declarationScriptElement
 : 'declare' (ambientModuleOrNamespace | ambientStatement)
 | interfaceDeclaration // interface doens't need to be preceeded by 'declare'
 ;

//_______________________________ Modules and Namespaces

ambientModuleOrNamespace
 : ('module' | 'namespace') identifierPath '{' ambientStatement* '}'
 ;

ambientStatement
 : variableDeclaration
 | typeAliasDeclaration
 | typeDeclaration
 | functionDeclaration
 | interfaceDeclaration
 | classDeclaration
 | enumDeclaration
 | exportIdentifier
 | ambientModuleOrNamespace // nested moduels and namespaces
 // | importAliasDeclaration FIXME
 ;

variableDeclaration
 : ('var' | 'let' | 'const') variableList ';'
 ;

variableList
: variableName (',' variableName )*
;

variableName
 : bindingIdentifier typeAnnotation?
 ;

functionDeclaration
 : 'function' bindingIdentifier callSignature ';'
 ;

classDeclaration
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
 : accessibilityModifier? Static? propertyName ambientProperty ';'
 ;

ambientProperty
 : typeAnnotation #propertyTypeAnnotation
 | callSignature  #propertyCallSignature
 |                #propertyWithoutTypeAnnotation
 ;

propertyName
 : bindingIdentifier
 ; // computedPropertyName not supported


exportIdentifier
 : 'export' '=' bindingIdentifier ';'
 ;

numericLiteral
 : DecimalLiteral
 | HexIntegerLiteral
 | OctalIntegerLiteral
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

constraint // FIXME: missing "keyof" and "in" // SEE https://www.typescriptlang.org/docs/handbook/release-notes/typescript-2-1.html
 : 'extends' type
 ;

typeArguments
 : '<' typeArgumentList '>'
 ;

typeArgumentList
 : type ( ',' type )*
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

nestedType // FIXME: missing reference to this production
  : '<' type '>'
  ;

arrayDim
 : ('[' ']') // array dimension could be > 1
 ;

primaryType //// FIXME: Missing string literal types
 : parenthesizedType
 | identifier
 | identifier typeGuard
 | typeReference
 | objectType
 | tupleType
 | typeQuery
 | thisType
 ;

typeGuard
 : 'is' type
 ;

parenthesizedType
 : '(' type ')'
 ;

typeReference
 : identifierPath typeArguments?
 ;

objectType
 : '{' typeBody? '}'
 ;

typeBody
 : typeMemberList (';' | ',')?
 ;

typeMemberList // FIXME: trailing "," or ";" is optional when preceeding a '}'
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

typeElementTypes // FIXME: need to check if this is relaxed to also include ";"
 : type (',' type)*
 ;

functionType
 : typeParameters? '(' parameterList? ')' '=>' type
 ;

constructorType
 : 'new' typeParameters? '(' parameterList? ')' '=>' type
 ;

typeQuery
 : 'typeof' identifierPath
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

accessibilityModifier // 'public' is default
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
 : 'type' bindingIdentifier typeParameters? '=' type ';'
 ;

//_______________________________ A.2 Expressions

/// FIXME: need constant expressions here for enum
constExpression
 : numericLiteral
 ;

interfaceDeclaration
 : 'interface' bindingIdentifier typeParameters? extendsClause? objectType
   ;

extendsClause
 : 'extends' classOrInterfaceTypeList
 ;

classOrInterfaceTypeList
 : typeReference (',' typeReference)*
 ;


//_______________________________ A.6 Classes

classHeritage
 : extendsClause? implementsClause?
 ;

implementsClause
 : 'implements' classOrInterfaceTypeList
 ;


//_______________________________ A.7 Enums

enumDeclaration // const enum treated significantly different from plain enum
 : 'const'? 'enum' bindingIdentifier '{' enumBody? '}'
 ;

enumBody // allow for trailing ','
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

////////////////////// identifierPath
identifierPath
 : bindingIdentifier ('.' bindingIdentifier)*
 ;

bindingIdentifier
 : identifier
 | StringLiteral
 ;

identifier // unicode not implemented yet
 : Identifier
  | 'type'
  | 'string'
  | 'number'
  | 'namespace'
  | 'module'
  | 'is'
 ;

///////////////////////////////////////////////////////////////////////////////////


/// 7.3 Line Terminators
LineTerminator
 : [\r\n\u2028\u2029] -> channel(HIDDEN)
 ;

// Tokens

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
Is          : 'is';

Public      : 'public';
Protected   : 'protected';
Private     : 'private';
Static      : 'static';
Readonly    : 'readonly'; // << new keyword not in spec

New         : 'new';
Typeof      : 'typeof';
This        : 'this';
Type        : 'type';

//Any         : 'any';
//Boolean     : 'boolean';
//Symbol      : 'symbol';
//Void        : 'void';

Number      : 'number';
String      : 'string';

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
/* FIXME: this should be added after constant expressions are addded
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
RightShiftArithmeticAssign: '>>=';
RightShiftLogicalAssign   : '>>>=';
BitAndAssign              : '&=';
BitXorAssign              : '^=';
BitOrAssign               : '|=';

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
WS:  [ \t]+ -> skip
  ;
Documentation
 :  '/**' .*? '*/' -> skip // FIXME needs DOCUMENTATION channel to copy docs to scala facade
 ;
Comment
 :   '/*' .*? '*/' -> skip
 ;
LineComment
 :   '//' ~[\r\n]* -> skip
 ;