// Generated from C:/cyberthinkers-dev/typescript-to-scala-js-facade/src/main/antlr4\GenScalaFacadesFromTypescript.g4 by ANTLR 4.6
package com.cyberthinkers.tools.generate;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GenScalaFacadesFromTypescriptParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, LineTerminator=2, Abstract=3, As=4, Class=5, Const=6, Constructor=7, 
		Declare=8, Enum=9, Export=10, Extends=11, From=12, Function=13, Implements=14, 
		Import=15, Interface=16, Keyof=17, Let=18, Module=19, Var=20, In=21, Is=22, 
		Public=23, Protected=24, Private=25, Static=26, Readonly=27, New=28, Typeof=29, 
		This=30, Type=31, Number=32, String=33, ThickArrow=34, DotDotDot=35, OpenBracket=36, 
		CloseBracket=37, OpenParen=38, CloseParen=39, OpenBrace=40, CloseBrace=41, 
		SemiColon=42, Comma=43, Assign=44, QuestionMark=45, Colon=46, Dot=47, 
		PlusPlus=48, MinusMinus=49, Plus=50, Minus=51, BitNot=52, Not=53, Multiply=54, 
		Divide=55, Modulus=56, LessThan=57, MoreThan=58, LessThanEquals=59, GreaterThanEquals=60, 
		Equals=61, NotEquals=62, IdentityEquals=63, IdentityNotEquals=64, BitAnd=65, 
		BitXOr=66, BitOr=67, And=68, Or=69, MultiplyAssign=70, DivideAssign=71, 
		ModulusAssign=72, PlusAssign=73, MinusAssign=74, LeftShiftArithmeticAssign=75, 
		RightShiftArithmeticAssign=76, RightShiftLogicalAssign=77, BitAndAssign=78, 
		BitXorAssign=79, BitOrAssign=80, BooleanLiteral=81, DecimalLiteral=82, 
		HexIntegerLiteral=83, OctalIntegerLiteral=84, Identifier=85, StringLiteral=86, 
		WS=87, Documentation=88, Comment=89, LineComment=90;
	public static final int
		RULE_typescriptAmbientDeclarations = 0, RULE_declarationScriptElement = 1, 
		RULE_exportDef = 2, RULE_importDef = 3, RULE_importName = 4, RULE_ambientModuleOrNamespace = 5, 
		RULE_ambientItem = 6, RULE_ambientBracesItem = 7, RULE_ambientStatement = 8, 
		RULE_variableDeclaration = 9, RULE_variableList = 10, RULE_variableName = 11, 
		RULE_functionDeclaration = 12, RULE_classDeclaration = 13, RULE_ambientClassBodyElement = 14, 
		RULE_ambientConstructorDeclaration = 15, RULE_ambientPropertyMemberDeclaration = 16, 
		RULE_exportIdentifier = 17, RULE_numericLiteral = 18, RULE_typeDeclaration = 19, 
		RULE_typeDef = 20, RULE_typeParameters = 21, RULE_typeParameterList = 22, 
		RULE_typeParameter = 23, RULE_constraint = 24, RULE_typeArguments = 25, 
		RULE_typeArgumentList = 26, RULE_type = 27, RULE_unnamedInterface = 28, 
		RULE_unionOrIntersectionOrPrimaryType = 29, RULE_primaryOrArray = 30, 
		RULE_nestedType = 31, RULE_arrayDim = 32, RULE_primaryType = 33, RULE_typeGuard = 34, 
		RULE_parenthesizedType = 35, RULE_typeReference = 36, RULE_objectType = 37, 
		RULE_typeBody = 38, RULE_typeMemberList = 39, RULE_typeMember = 40, RULE_tupleType = 41, 
		RULE_tupleTypeElements = 42, RULE_functionType = 43, RULE_constructorType = 44, 
		RULE_typeQuery = 45, RULE_thisType = 46, RULE_propertySignature = 47, 
		RULE_typeAnnotation = 48, RULE_callSignature = 49, RULE_parameterList = 50, 
		RULE_requiredParameterList = 51, RULE_requiredParameter = 52, RULE_accessibilityModifier = 53, 
		RULE_optionalParameterList = 54, RULE_optionalParameter = 55, RULE_restParameter = 56, 
		RULE_constructSignature = 57, RULE_indexSignature = 58, RULE_methodSignature = 59, 
		RULE_constExpression = 60, RULE_interfaceDeclaration = 61, RULE_extendsClause = 62, 
		RULE_classOrInterfaceTypeList = 63, RULE_classHeritage = 64, RULE_implementsClause = 65, 
		RULE_enumDeclaration = 66, RULE_enumBody = 67, RULE_enumMemberList = 68, 
		RULE_enumMember = 69, RULE_enumValue = 70, RULE_identifierPath = 71, RULE_bindingIdentifier = 72, 
		RULE_identifier = 73, RULE_lineEnd = 74;
	public static final String[] ruleNames = {
		"typescriptAmbientDeclarations", "declarationScriptElement", "exportDef", 
		"importDef", "importName", "ambientModuleOrNamespace", "ambientItem", 
		"ambientBracesItem", "ambientStatement", "variableDeclaration", "variableList", 
		"variableName", "functionDeclaration", "classDeclaration", "ambientClassBodyElement", 
		"ambientConstructorDeclaration", "ambientPropertyMemberDeclaration", "exportIdentifier", 
		"numericLiteral", "typeDeclaration", "typeDef", "typeParameters", "typeParameterList", 
		"typeParameter", "constraint", "typeArguments", "typeArgumentList", "type", 
		"unnamedInterface", "unionOrIntersectionOrPrimaryType", "primaryOrArray", 
		"nestedType", "arrayDim", "primaryType", "typeGuard", "parenthesizedType", 
		"typeReference", "objectType", "typeBody", "typeMemberList", "typeMember", 
		"tupleType", "tupleTypeElements", "functionType", "constructorType", "typeQuery", 
		"thisType", "propertySignature", "typeAnnotation", "callSignature", "parameterList", 
		"requiredParameterList", "requiredParameter", "accessibilityModifier", 
		"optionalParameterList", "optionalParameter", "restParameter", "constructSignature", 
		"indexSignature", "methodSignature", "constExpression", "interfaceDeclaration", 
		"extendsClause", "classOrInterfaceTypeList", "classHeritage", "implementsClause", 
		"enumDeclaration", "enumBody", "enumMemberList", "enumMember", "enumValue", 
		"identifierPath", "bindingIdentifier", "identifier", "lineEnd"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'namespace'", null, "'abstract'", "'as'", "'class'", "'const'", 
		"'constructor'", "'declare'", "'enum'", "'export'", "'extends'", "'from'", 
		"'function'", "'implements'", "'import'", "'interface'", "'keyof'", "'let'", 
		"'module'", "'var'", "'in'", "'is'", "'public'", "'protected'", "'private'", 
		"'static'", "'readonly'", "'new'", "'typeof'", "'this'", "'type'", "'number'", 
		"'string'", "'=>'", "'...'", "'['", "']'", "'('", "')'", "'{'", "'}'", 
		"';'", "','", "'='", "'?'", "':'", "'.'", "'++'", "'--'", "'+'", "'-'", 
		"'~'", "'!'", "'*'", "'/'", "'%'", "'<'", "'>'", "'<='", "'>='", "'=='", 
		"'!='", "'==='", "'!=='", "'&'", "'^'", "'|'", "'&&'", "'||'", "'*='", 
		"'/='", "'%='", "'+='", "'-='", "'<<='", "'>>='", "'>>>='", "'&='", "'^='", 
		"'|='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "LineTerminator", "Abstract", "As", "Class", "Const", "Constructor", 
		"Declare", "Enum", "Export", "Extends", "From", "Function", "Implements", 
		"Import", "Interface", "Keyof", "Let", "Module", "Var", "In", "Is", "Public", 
		"Protected", "Private", "Static", "Readonly", "New", "Typeof", "This", 
		"Type", "Number", "String", "ThickArrow", "DotDotDot", "OpenBracket", 
		"CloseBracket", "OpenParen", "CloseParen", "OpenBrace", "CloseBrace", 
		"SemiColon", "Comma", "Assign", "QuestionMark", "Colon", "Dot", "PlusPlus", 
		"MinusMinus", "Plus", "Minus", "BitNot", "Not", "Multiply", "Divide", 
		"Modulus", "LessThan", "MoreThan", "LessThanEquals", "GreaterThanEquals", 
		"Equals", "NotEquals", "IdentityEquals", "IdentityNotEquals", "BitAnd", 
		"BitXOr", "BitOr", "And", "Or", "MultiplyAssign", "DivideAssign", "ModulusAssign", 
		"PlusAssign", "MinusAssign", "LeftShiftArithmeticAssign", "RightShiftArithmeticAssign", 
		"RightShiftLogicalAssign", "BitAndAssign", "BitXorAssign", "BitOrAssign", 
		"BooleanLiteral", "DecimalLiteral", "HexIntegerLiteral", "OctalIntegerLiteral", 
		"Identifier", "StringLiteral", "WS", "Documentation", "Comment", "LineComment"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "GenScalaFacadesFromTypescript.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GenScalaFacadesFromTypescriptParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class TypescriptAmbientDeclarationsContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(GenScalaFacadesFromTypescriptParser.EOF, 0); }
		public List<DeclarationScriptElementContext> declarationScriptElement() {
			return getRuleContexts(DeclarationScriptElementContext.class);
		}
		public DeclarationScriptElementContext declarationScriptElement(int i) {
			return getRuleContext(DeclarationScriptElementContext.class,i);
		}
		public TypescriptAmbientDeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typescriptAmbientDeclarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).enterTypescriptAmbientDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).exitTypescriptAmbientDeclarations(this);
		}
	}

	public final TypescriptAmbientDeclarationsContext typescriptAmbientDeclarations() throws RecognitionException {
		TypescriptAmbientDeclarationsContext _localctx = new TypescriptAmbientDeclarationsContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_typescriptAmbientDeclarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Declare) | (1L << Export) | (1L << Import) | (1L << Interface))) != 0)) {
				{
				{
				setState(150);
				declarationScriptElement();
				}
				}
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(156);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationScriptElementContext extends ParserRuleContext {
		public AmbientModuleOrNamespaceContext ambientModuleOrNamespace() {
			return getRuleContext(AmbientModuleOrNamespaceContext.class,0);
		}
		public AmbientStatementContext ambientStatement() {
			return getRuleContext(AmbientStatementContext.class,0);
		}
		public LineEndContext lineEnd() {
			return getRuleContext(LineEndContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public ExportDefContext exportDef() {
			return getRuleContext(ExportDefContext.class,0);
		}
		public ImportDefContext importDef() {
			return getRuleContext(ImportDefContext.class,0);
		}
		public DeclarationScriptElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationScriptElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).enterDeclarationScriptElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).exitDeclarationScriptElement(this);
		}
	}

	public final DeclarationScriptElementContext declarationScriptElement() throws RecognitionException {
		DeclarationScriptElementContext _localctx = new DeclarationScriptElementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declarationScriptElement);
		try {
			setState(168);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Declare:
				enterOuterAlt(_localctx, 1);
				{
				setState(158);
				match(Declare);
				setState(163);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(159);
					ambientModuleOrNamespace();
					}
					break;
				case 2:
					{
					{
					setState(160);
					ambientStatement();
					setState(161);
					lineEnd();
					}
					}
					break;
				}
				}
				break;
			case Interface:
				enterOuterAlt(_localctx, 2);
				{
				setState(165);
				interfaceDeclaration();
				}
				break;
			case Export:
				enterOuterAlt(_localctx, 3);
				{
				setState(166);
				exportDef();
				}
				break;
			case Import:
				enterOuterAlt(_localctx, 4);
				{
				setState(167);
				importDef();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExportDefContext extends ParserRuleContext {
		public AmbientStatementContext ambientStatement() {
			return getRuleContext(AmbientStatementContext.class,0);
		}
		public LineEndContext lineEnd() {
			return getRuleContext(LineEndContext.class,0);
		}
		public BindingIdentifierContext bindingIdentifier() {
			return getRuleContext(BindingIdentifierContext.class,0);
		}
		public ExportIdentifierContext exportIdentifier() {
			return getRuleContext(ExportIdentifierContext.class,0);
		}
		public ExportDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exportDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).enterExportDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).exitExportDef(this);
		}
	}

	public final ExportDefContext exportDef() throws RecognitionException {
		ExportDefContext _localctx = new ExportDefContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_exportDef);
		try {
			setState(182);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(170);
				match(Export);
				setState(171);
				match(Declare);
				setState(172);
				ambientStatement();
				setState(173);
				lineEnd();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(175);
				match(Export);
				setState(176);
				match(As);
				setState(177);
				match(T__0);
				setState(178);
				bindingIdentifier();
				setState(179);
				lineEnd();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(181);
				exportIdentifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportDefContext extends ParserRuleContext {
		public ImportNameContext importName() {
			return getRuleContext(ImportNameContext.class,0);
		}
		public List<BindingIdentifierContext> bindingIdentifier() {
			return getRuleContexts(BindingIdentifierContext.class);
		}
		public BindingIdentifierContext bindingIdentifier(int i) {
			return getRuleContext(BindingIdentifierContext.class,i);
		}
		public LineEndContext lineEnd() {
			return getRuleContext(LineEndContext.class,0);
		}
		public ImportDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).enterImportDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).exitImportDef(this);
		}
	}

	public final ImportDefContext importDef() throws RecognitionException {
		ImportDefContext _localctx = new ImportDefContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_importDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(Import);
			setState(185);
			importName();
			setState(186);
			match(As);
			setState(187);
			bindingIdentifier();
			setState(188);
			match(From);
			setState(189);
			bindingIdentifier();
			setState(190);
			lineEnd();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportNameContext extends ParserRuleContext {
		public BindingIdentifierContext bindingIdentifier() {
			return getRuleContext(BindingIdentifierContext.class,0);
		}
		public ImportNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).enterImportName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).exitImportName(this);
		}
	}

	public final ImportNameContext importName() throws RecognitionException {
		ImportNameContext _localctx = new ImportNameContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_importName);
		try {
			setState(194);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case As:
			case From:
			case Import:
			case Module:
			case In:
			case Is:
			case Typeof:
			case Type:
			case Number:
			case String:
			case Identifier:
			case StringLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(192);
				bindingIdentifier();
				}
				break;
			case Multiply:
				enterOuterAlt(_localctx, 2);
				{
				setState(193);
				match(Multiply);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AmbientModuleOrNamespaceContext extends ParserRuleContext {
		public IdentifierPathContext identifierPath() {
			return getRuleContext(IdentifierPathContext.class,0);
		}
		public List<AmbientItemContext> ambientItem() {
			return getRuleContexts(AmbientItemContext.class);
		}
		public AmbientItemContext ambientItem(int i) {
			return getRuleContext(AmbientItemContext.class,i);
		}
		public AmbientModuleOrNamespaceContext ambientModuleOrNamespace() {
			return getRuleContext(AmbientModuleOrNamespaceContext.class,0);
		}
		public AmbientModuleOrNamespaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ambientModuleOrNamespace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).enterAmbientModuleOrNamespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).exitAmbientModuleOrNamespace(this);
		}
	}

	public final AmbientModuleOrNamespaceContext ambientModuleOrNamespace() throws RecognitionException {
		AmbientModuleOrNamespaceContext _localctx = new AmbientModuleOrNamespaceContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ambientModuleOrNamespace);
		int _la;
		try {
			setState(213);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case As:
			case From:
			case Import:
			case Module:
			case In:
			case Is:
			case Typeof:
			case Type:
			case Number:
			case String:
			case Identifier:
			case StringLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(197);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(196);
					_la = _input.LA(1);
					if ( !(_la==T__0 || _la==Module) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				setState(199);
				identifierPath();
				setState(200);
				match(OpenBrace);
				setState(204);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << Abstract) | (1L << As) | (1L << Class) | (1L << Const) | (1L << Enum) | (1L << Export) | (1L << From) | (1L << Function) | (1L << Import) | (1L << Interface) | (1L << Let) | (1L << Module) | (1L << Var) | (1L << In) | (1L << Is) | (1L << Typeof) | (1L << Type) | (1L << Number) | (1L << String) | (1L << OpenBrace))) != 0) || _la==Identifier || _la==StringLiteral) {
					{
					{
					setState(201);
					ambientItem();
					}
					}
					setState(206);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(207);
				match(CloseBrace);
				}
				break;
			case OpenBrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(209);
				match(OpenBrace);
				setState(210);
				ambientModuleOrNamespace();
				setState(211);
				match(CloseBrace);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AmbientItemContext extends ParserRuleContext {
		public AmbientBracesItemContext ambientBracesItem() {
			return getRuleContext(AmbientBracesItemContext.class,0);
		}
		public AmbientStatementContext ambientStatement() {
			return getRuleContext(AmbientStatementContext.class,0);
		}
		public LineEndContext lineEnd() {
			return getRuleContext(LineEndContext.class,0);
		}
		public AmbientItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ambientItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).enterAmbientItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).exitAmbientItem(this);
		}
	}

	public final AmbientItemContext ambientItem() throws RecognitionException {
		AmbientItemContext _localctx = new AmbientItemContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_ambientItem);
		int _la;
		try {
			setState(220);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(215);
				ambientBracesItem();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(216);
				ambientStatement();
				setState(218);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LineTerminator) | (1L << SemiColon) | (1L << Comma))) != 0)) {
					{
					setState(217);
					lineEnd();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AmbientBracesItemContext extends ParserRuleContext {
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public AmbientModuleOrNamespaceContext ambientModuleOrNamespace() {
			return getRuleContext(AmbientModuleOrNamespaceContext.class,0);
		}
		public AmbientBracesItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ambientBracesItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).enterAmbientBracesItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).exitAmbientBracesItem(this);
		}
	}

	public final AmbientBracesItemContext ambientBracesItem() throws RecognitionException {
		AmbientBracesItemContext _localctx = new AmbientBracesItemContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_ambientBracesItem);
		try {
			setState(225);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Interface:
				enterOuterAlt(_localctx, 1);
				{
				setState(222);
				interfaceDeclaration();
				}
				break;
			case Abstract:
			case Class:
				enterOuterAlt(_localctx, 2);
				{
				setState(223);
				classDeclaration();
				}
				break;
			case T__0:
			case As:
			case From:
			case Import:
			case Module:
			case In:
			case Is:
			case Typeof:
			case Type:
			case Number:
			case String:
			case OpenBrace:
			case Identifier:
			case StringLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(224);
				ambientModuleOrNamespace();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AmbientStatementContext extends ParserRuleContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public TypeDeclarationContext typeDeclaration() {
			return getRuleContext(TypeDeclarationContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public ExportIdentifierContext exportIdentifier() {
			return getRuleContext(ExportIdentifierContext.class,0);
		}
		public AmbientStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ambientStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).enterAmbientStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).exitAmbientStatement(this);
		}
	}

	public final AmbientStatementContext ambientStatement() throws RecognitionException {
		AmbientStatementContext _localctx = new AmbientStatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_ambientStatement);
		try {
			setState(232);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(227);
				variableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(228);
				typeDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(229);
				functionDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(230);
				enumDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(231);
				exportIdentifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclarationContext extends ParserRuleContext {
		public VariableListContext variableList() {
			return getRuleContext(VariableListContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).exitVariableDeclaration(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Let) | (1L << Var))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(235);
			variableList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableListContext extends ParserRuleContext {
		public List<VariableNameContext> variableName() {
			return getRuleContexts(VariableNameContext.class);
		}
		public VariableNameContext variableName(int i) {
			return getRuleContext(VariableNameContext.class,i);
		}
		public VariableListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).enterVariableList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).exitVariableList(this);
		}
	}

	public final VariableListContext variableList() throws RecognitionException {
		VariableListContext _localctx = new VariableListContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_variableList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			variableName();
			setState(242);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(238);
					match(Comma);
					setState(239);
					variableName();
					}
					} 
				}
				setState(244);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableNameContext extends ParserRuleContext {
		public BindingIdentifierContext bindingIdentifier() {
			return getRuleContext(BindingIdentifierContext.class,0);
		}
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public VariableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).enterVariableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).exitVariableName(this);
		}
	}

	public final VariableNameContext variableName() throws RecognitionException {
		VariableNameContext _localctx = new VariableNameContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_variableName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			bindingIdentifier();
			setState(247);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(246);
				typeAnnotation();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionDeclarationContext extends ParserRuleContext {
		public BindingIdentifierContext bindingIdentifier() {
			return getRuleContext(BindingIdentifierContext.class,0);
		}
		public CallSignatureContext callSignature() {
			return getRuleContext(CallSignatureContext.class,0);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).exitFunctionDeclaration(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_functionDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(Function);
			setState(250);
			bindingIdentifier();
			setState(251);
			callSignature();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassDeclarationContext extends ParserRuleContext {
		public BindingIdentifierContext bindingIdentifier() {
			return getRuleContext(BindingIdentifierContext.class,0);
		}
		public ClassHeritageContext classHeritage() {
			return getRuleContext(ClassHeritageContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public List<AmbientClassBodyElementContext> ambientClassBodyElement() {
			return getRuleContexts(AmbientClassBodyElementContext.class);
		}
		public AmbientClassBodyElementContext ambientClassBodyElement(int i) {
			return getRuleContext(AmbientClassBodyElementContext.class,i);
		}
		public List<LineEndContext> lineEnd() {
			return getRuleContexts(LineEndContext.class);
		}
		public LineEndContext lineEnd(int i) {
			return getRuleContext(LineEndContext.class,i);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).exitClassDeclaration(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Abstract) {
				{
				setState(253);
				match(Abstract);
				}
			}

			setState(256);
			match(Class);
			setState(257);
			bindingIdentifier();
			setState(259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LessThan) {
				{
				setState(258);
				typeParameters();
				}
			}

			setState(261);
			classHeritage();
			setState(262);
			match(OpenBrace);
			setState(268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << As) | (1L << Constructor) | (1L << From) | (1L << Import) | (1L << Module) | (1L << In) | (1L << Is) | (1L << Public) | (1L << Protected) | (1L << Private) | (1L << Static) | (1L << New) | (1L << Typeof) | (1L << Type) | (1L << Number) | (1L << String) | (1L << OpenBracket) | (1L << OpenParen) | (1L << LessThan))) != 0) || _la==Identifier || _la==StringLiteral) {
				{
				{
				setState(263);
				ambientClassBodyElement();
				setState(264);
				lineEnd();
				}
				}
				setState(270);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(271);
			match(CloseBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AmbientClassBodyElementContext extends ParserRuleContext {
		public AmbientConstructorDeclarationContext ambientConstructorDeclaration() {
			return getRuleContext(AmbientConstructorDeclarationContext.class,0);
		}
		public AmbientPropertyMemberDeclarationContext ambientPropertyMemberDeclaration() {
			return getRuleContext(AmbientPropertyMemberDeclarationContext.class,0);
		}
		public IndexSignatureContext indexSignature() {
			return getRuleContext(IndexSignatureContext.class,0);
		}
		public AmbientClassBodyElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ambientClassBodyElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).enterAmbientClassBodyElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).exitAmbientClassBodyElement(this);
		}
	}

	public final AmbientClassBodyElementContext ambientClassBodyElement() throws RecognitionException {
		AmbientClassBodyElementContext _localctx = new AmbientClassBodyElementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_ambientClassBodyElement);
		try {
			setState(276);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(273);
				ambientConstructorDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(274);
				ambientPropertyMemberDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(275);
				indexSignature();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AmbientConstructorDeclarationContext extends ParserRuleContext {
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public AmbientConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ambientConstructorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).enterAmbientConstructorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).exitAmbientConstructorDeclaration(this);
		}
	}

	public final AmbientConstructorDeclarationContext ambientConstructorDeclaration() throws RecognitionException {
		AmbientConstructorDeclarationContext _localctx = new AmbientConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_ambientConstructorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			match(Constructor);
			setState(279);
			match(OpenParen);
			setState(281);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << As) | (1L << From) | (1L << Import) | (1L << Module) | (1L << In) | (1L << Is) | (1L << Public) | (1L << Protected) | (1L << Private) | (1L << Typeof) | (1L << Type) | (1L << Number) | (1L << String) | (1L << DotDotDot))) != 0) || _la==Identifier || _la==StringLiteral) {
				{
				setState(280);
				parameterList();
				}
			}

			setState(283);
			match(CloseParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AmbientPropertyMemberDeclarationContext extends ParserRuleContext {
		public TypeMemberContext typeMember() {
			return getRuleContext(TypeMemberContext.class,0);
		}
		public AccessibilityModifierContext accessibilityModifier() {
			return getRuleContext(AccessibilityModifierContext.class,0);
		}
		public TerminalNode Static() { return getToken(GenScalaFacadesFromTypescriptParser.Static, 0); }
		public AmbientPropertyMemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ambientPropertyMemberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).enterAmbientPropertyMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).exitAmbientPropertyMemberDeclaration(this);
		}
	}

	public final AmbientPropertyMemberDeclarationContext ambientPropertyMemberDeclaration() throws RecognitionException {
		AmbientPropertyMemberDeclarationContext _localctx = new AmbientPropertyMemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_ambientPropertyMemberDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Public) | (1L << Protected) | (1L << Private))) != 0)) {
				{
				setState(285);
				accessibilityModifier();
				}
			}

			setState(289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Static) {
				{
				setState(288);
				match(Static);
				}
			}

			setState(291);
			typeMember();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExportIdentifierContext extends ParserRuleContext {
		public BindingIdentifierContext bindingIdentifier() {
			return getRuleContext(BindingIdentifierContext.class,0);
		}
		public LineEndContext lineEnd() {
			return getRuleContext(LineEndContext.class,0);
		}
		public ExportIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exportIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).enterExportIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).exitExportIdentifier(this);
		}
	}

	public final ExportIdentifierContext exportIdentifier() throws RecognitionException {
		ExportIdentifierContext _localctx = new ExportIdentifierContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_exportIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			match(Export);
			setState(294);
			match(Assign);
			setState(295);
			bindingIdentifier();
			setState(296);
			lineEnd();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumericLiteralContext extends ParserRuleContext {
		public TerminalNode DecimalLiteral() { return getToken(GenScalaFacadesFromTypescriptParser.DecimalLiteral, 0); }
		public TerminalNode HexIntegerLiteral() { return getToken(GenScalaFacadesFromTypescriptParser.HexIntegerLiteral, 0); }
		public TerminalNode OctalIntegerLiteral() { return getToken(GenScalaFacadesFromTypescriptParser.OctalIntegerLiteral, 0); }
		public NumericLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).enterNumericLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).exitNumericLiteral(this);
		}
	}

	public final NumericLiteralContext numericLiteral() throws RecognitionException {
		NumericLiteralContext _localctx = new NumericLiteralContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_numericLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			_la = _input.LA(1);
			if ( !(((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & ((1L << (DecimalLiteral - 82)) | (1L << (HexIntegerLiteral - 82)) | (1L << (OctalIntegerLiteral - 82)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeDeclarationContext extends ParserRuleContext {
		public List<TypeDefContext> typeDef() {
			return getRuleContexts(TypeDefContext.class);
		}
		public TypeDefContext typeDef(int i) {
			return getRuleContext(TypeDefContext.class,i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).enterTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).exitTypeDeclaration(this);
		}
	}

	public final TypeDeclarationContext typeDeclaration() throws RecognitionException {
		TypeDeclarationContext _localctx = new TypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_typeDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			match(Type);
			setState(301);
			typeDef();
			setState(302);
			match(Assign);
			setState(305);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(303);
				type();
				}
				break;
			case 2:
				{
				setState(304);
				typeDef();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeDefContext extends ParserRuleContext {
		public List<BindingIdentifierContext> bindingIdentifier() {
			return getRuleContexts(BindingIdentifierContext.class);
		}
		public BindingIdentifierContext bindingIdentifier(int i) {
			return getRuleContext(BindingIdentifierContext.class,i);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public TypeDefContext typeDef() {
			return getRuleContext(TypeDefContext.class,0);
		}
		public TypeDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).enterTypeDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).exitTypeDef(this);
		}
	}

	public final TypeDefContext typeDef() throws RecognitionException {
		TypeDefContext _localctx = new TypeDefContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_typeDef);
		int _la;
		try {
			setState(328);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case As:
			case From:
			case Import:
			case Module:
			case In:
			case Is:
			case Typeof:
			case Type:
			case Number:
			case String:
			case Identifier:
			case StringLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(307);
				bindingIdentifier();
				setState(309);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(308);
					typeParameters();
					}
					break;
				}
				}
				break;
			case OpenBrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(311);
				match(OpenBrace);
				setState(312);
				match(OpenBracket);
				setState(313);
				bindingIdentifier();
				setState(314);
				match(In);
				setState(315);
				match(Keyof);
				setState(316);
				bindingIdentifier();
				setState(318);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LessThan) {
					{
					setState(317);
					typeParameters();
					}
				}

				setState(320);
				match(CloseBracket);
				setState(322);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==QuestionMark) {
					{
					setState(321);
					match(QuestionMark);
					}
				}

				setState(324);
				match(Colon);
				setState(325);
				typeDef();
				setState(326);
				match(CloseBrace);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParametersContext extends ParserRuleContext {
		public TypeParameterListContext typeParameterList() {
			return getRuleContext(TypeParameterListContext.class,0);
		}
		public TypeParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).enterTypeParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).exitTypeParameters(this);
		}
	}

	public final TypeParametersContext typeParameters() throws RecognitionException {
		TypeParametersContext _localctx = new TypeParametersContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_typeParameters);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			match(LessThan);
			setState(331);
			typeParameterList();
			setState(332);
			match(MoreThan);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParameterListContext extends ParserRuleContext {
		public List<TypeParameterContext> typeParameter() {
			return getRuleContexts(TypeParameterContext.class);
		}
		public TypeParameterContext typeParameter(int i) {
			return getRuleContext(TypeParameterContext.class,i);
		}
		public TypeParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).enterTypeParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).exitTypeParameterList(this);
		}
	}

	public final TypeParameterListContext typeParameterList() throws RecognitionException {
		TypeParameterListContext _localctx = new TypeParameterListContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_typeParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			typeParameter();
			setState(339);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(335);
				match(Comma);
				setState(336);
				typeParameter();
				}
				}
				setState(341);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParameterContext extends ParserRuleContext {
		public BindingIdentifierContext bindingIdentifier() {
			return getRuleContext(BindingIdentifierContext.class,0);
		}
		public ConstraintContext constraint() {
			return getRuleContext(ConstraintContext.class,0);
		}
		public TypeParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).enterTypeParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).exitTypeParameter(this);
		}
	}

	public final TypeParameterContext typeParameter() throws RecognitionException {
		TypeParameterContext _localctx = new TypeParameterContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_typeParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			bindingIdentifier();
			setState(344);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Extends || _la==In) {
				{
				setState(343);
				constraint();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstraintContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).enterConstraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).exitConstraint(this);
		}
	}

	public final ConstraintContext constraint() throws RecognitionException {
		ConstraintContext _localctx = new ConstraintContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			_la = _input.LA(1);
			if ( !(_la==Extends || _la==In) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(347);
			type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentsContext extends ParserRuleContext {
		public TypeArgumentListContext typeArgumentList() {
			return getRuleContext(TypeArgumentListContext.class,0);
		}
		public TypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).enterTypeArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).exitTypeArguments(this);
		}
	}

	public final TypeArgumentsContext typeArguments() throws RecognitionException {
		TypeArgumentsContext _localctx = new TypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_typeArguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			match(LessThan);
			setState(350);
			typeArgumentList();
			setState(351);
			match(MoreThan);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentListContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public TypeArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).enterTypeArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).exitTypeArgumentList(this);
		}
	}

	public final TypeArgumentListContext typeArgumentList() throws RecognitionException {
		TypeArgumentListContext _localctx = new TypeArgumentListContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_typeArgumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			type();
			setState(358);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(354);
				match(Comma);
				setState(355);
				type();
				}
				}
				setState(360);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public UnionOrIntersectionOrPrimaryTypeContext unionOrIntersectionOrPrimaryType() {
			return getRuleContext(UnionOrIntersectionOrPrimaryTypeContext.class,0);
		}
		public FunctionTypeContext functionType() {
			return getRuleContext(FunctionTypeContext.class,0);
		}
		public ConstructorTypeContext constructorType() {
			return getRuleContext(ConstructorTypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_type);
		try {
			setState(364);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(361);
				unionOrIntersectionOrPrimaryType(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(362);
				functionType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(363);
				constructorType();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnnamedInterfaceContext extends ParserRuleContext {
		public TypeBodyContext typeBody() {
			return getRuleContext(TypeBodyContext.class,0);
		}
		public UnnamedInterfaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unnamedInterface; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).enterUnnamedInterface(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).exitUnnamedInterface(this);
		}
	}

	public final UnnamedInterfaceContext unnamedInterface() throws RecognitionException {
		UnnamedInterfaceContext _localctx = new UnnamedInterfaceContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_unnamedInterface);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			match(OpenBrace);
			setState(368);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << As) | (1L << From) | (1L << Import) | (1L << Module) | (1L << In) | (1L << Is) | (1L << New) | (1L << Typeof) | (1L << Type) | (1L << Number) | (1L << String) | (1L << OpenBracket) | (1L << OpenParen) | (1L << LessThan))) != 0) || _la==Identifier || _la==StringLiteral) {
				{
				setState(367);
				typeBody();
				}
			}

			setState(370);
			match(CloseBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnionOrIntersectionOrPrimaryTypeContext extends ParserRuleContext {
		public List<UnionOrIntersectionOrPrimaryTypeContext> unionOrIntersectionOrPrimaryType() {
			return getRuleContexts(UnionOrIntersectionOrPrimaryTypeContext.class);
		}
		public UnionOrIntersectionOrPrimaryTypeContext unionOrIntersectionOrPrimaryType(int i) {
			return getRuleContext(UnionOrIntersectionOrPrimaryTypeContext.class,i);
		}
		public PrimaryOrArrayContext primaryOrArray() {
			return getRuleContext(PrimaryOrArrayContext.class,0);
		}
		public UnnamedInterfaceContext unnamedInterface() {
			return getRuleContext(UnnamedInterfaceContext.class,0);
		}
		public UnionOrIntersectionOrPrimaryTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unionOrIntersectionOrPrimaryType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).enterUnionOrIntersectionOrPrimaryType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).exitUnionOrIntersectionOrPrimaryType(this);
		}
	}

	public final UnionOrIntersectionOrPrimaryTypeContext unionOrIntersectionOrPrimaryType() throws RecognitionException {
		return unionOrIntersectionOrPrimaryType(0);
	}

	private UnionOrIntersectionOrPrimaryTypeContext unionOrIntersectionOrPrimaryType(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		UnionOrIntersectionOrPrimaryTypeContext _localctx = new UnionOrIntersectionOrPrimaryTypeContext(_ctx, _parentState);
		UnionOrIntersectionOrPrimaryTypeContext _prevctx = _localctx;
		int _startState = 58;
		enterRecursionRule(_localctx, 58, RULE_unionOrIntersectionOrPrimaryType, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(373);
				match(OpenParen);
				setState(374);
				unionOrIntersectionOrPrimaryType(0);
				setState(375);
				match(CloseParen);
				}
				break;
			case 2:
				{
				setState(377);
				primaryOrArray();
				}
				break;
			case 3:
				{
				setState(378);
				unnamedInterface();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(389);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(387);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
					case 1:
						{
						_localctx = new UnionOrIntersectionOrPrimaryTypeContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_unionOrIntersectionOrPrimaryType);
						setState(381);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(382);
						match(BitOr);
						setState(383);
						unionOrIntersectionOrPrimaryType(6);
						}
						break;
					case 2:
						{
						_localctx = new UnionOrIntersectionOrPrimaryTypeContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_unionOrIntersectionOrPrimaryType);
						setState(384);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(385);
						match(BitAnd);
						setState(386);
						unionOrIntersectionOrPrimaryType(5);
						}
						break;
					}
					} 
				}
				setState(391);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PrimaryOrArrayContext extends ParserRuleContext {
		public PrimaryTypeContext primaryType() {
			return getRuleContext(PrimaryTypeContext.class,0);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public List<ArrayDimContext> arrayDim() {
			return getRuleContexts(ArrayDimContext.class);
		}
		public ArrayDimContext arrayDim(int i) {
			return getRuleContext(ArrayDimContext.class,i);
		}
		public PrimaryOrArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryOrArray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).enterPrimaryOrArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).exitPrimaryOrArray(this);
		}
	}

	public final PrimaryOrArrayContext primaryOrArray() throws RecognitionException {
		PrimaryOrArrayContext _localctx = new PrimaryOrArrayContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_primaryOrArray);
		int _la;
		try {
			int _alt;
			setState(406);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(393);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Keyof) {
					{
					setState(392);
					match(Keyof);
					}
				}

				setState(395);
				primaryType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(396);
				primaryType();
				setState(398);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
				case 1:
					{
					setState(397);
					typeArguments();
					}
					break;
				}
				setState(403);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(400);
						arrayDim();
						}
						} 
					}
					setState(405);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NestedTypeContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public NestedTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nestedType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).enterNestedType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).exitNestedType(this);
		}
	}

	public final NestedTypeContext nestedType() throws RecognitionException {
		NestedTypeContext _localctx = new NestedTypeContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_nestedType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
			match(LessThan);
			setState(409);
			type();
			setState(410);
			match(MoreThan);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayDimContext extends ParserRuleContext {
		public ArrayDimContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayDim; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).enterArrayDim(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).exitArrayDim(this);
		}
	}

	public final ArrayDimContext arrayDim() throws RecognitionException {
		ArrayDimContext _localctx = new ArrayDimContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_arrayDim);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(412);
			match(OpenBracket);
			setState(413);
			match(CloseBracket);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryTypeContext extends ParserRuleContext {
		public ParenthesizedTypeContext parenthesizedType() {
			return getRuleContext(ParenthesizedTypeContext.class,0);
		}
		public BindingIdentifierContext bindingIdentifier() {
			return getRuleContext(BindingIdentifierContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeGuardContext typeGuard() {
			return getRuleContext(TypeGuardContext.class,0);
		}
		public TypeReferenceContext typeReference() {
			return getRuleContext(TypeReferenceContext.class,0);
		}
		public ObjectTypeContext objectType() {
			return getRuleContext(ObjectTypeContext.class,0);
		}
		public TupleTypeContext tupleType() {
			return getRuleContext(TupleTypeContext.class,0);
		}
		public TypeQueryContext typeQuery() {
			return getRuleContext(TypeQueryContext.class,0);
		}
		public ThisTypeContext thisType() {
			return getRuleContext(ThisTypeContext.class,0);
		}
		public NumericLiteralContext numericLiteral() {
			return getRuleContext(NumericLiteralContext.class,0);
		}
		public TypeDefContext typeDef() {
			return getRuleContext(TypeDefContext.class,0);
		}
		public PrimaryTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).enterPrimaryType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).exitPrimaryType(this);
		}
	}

	public final PrimaryTypeContext primaryType() throws RecognitionException {
		PrimaryTypeContext _localctx = new PrimaryTypeContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_primaryType);
		try {
			setState(427);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(415);
				parenthesizedType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(416);
				bindingIdentifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(417);
				identifier();
				setState(418);
				typeGuard();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(420);
				typeReference();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(421);
				objectType();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(422);
				tupleType();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(423);
				typeQuery();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(424);
				thisType();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(425);
				numericLiteral();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(426);
				typeDef();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeGuardContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeGuardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeGuard; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).enterTypeGuard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).exitTypeGuard(this);
		}
	}

	public final TypeGuardContext typeGuard() throws RecognitionException {
		TypeGuardContext _localctx = new TypeGuardContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_typeGuard);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			match(Is);
			setState(430);
			type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParenthesizedTypeContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ParenthesizedTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parenthesizedType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).enterParenthesizedType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).exitParenthesizedType(this);
		}
	}

	public final ParenthesizedTypeContext parenthesizedType() throws RecognitionException {
		ParenthesizedTypeContext _localctx = new ParenthesizedTypeContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_parenthesizedType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(432);
			match(OpenParen);
			setState(433);
			type();
			setState(434);
			match(CloseParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeReferenceContext extends ParserRuleContext {
		public IdentifierPathContext identifierPath() {
			return getRuleContext(IdentifierPathContext.class,0);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public TypeReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).enterTypeReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).exitTypeReference(this);
		}
	}

	public final TypeReferenceContext typeReference() throws RecognitionException {
		TypeReferenceContext _localctx = new TypeReferenceContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_typeReference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(436);
			identifierPath();
			setState(438);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(437);
				typeArguments();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ObjectTypeContext extends ParserRuleContext {
		public LineEndContext lineEnd() {
			return getRuleContext(LineEndContext.class,0);
		}
		public TypeBodyContext typeBody() {
			return getRuleContext(TypeBodyContext.class,0);
		}
		public ObjectTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).enterObjectType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).exitObjectType(this);
		}
	}

	public final ObjectTypeContext objectType() throws RecognitionException {
		ObjectTypeContext _localctx = new ObjectTypeContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_objectType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(440);
			match(OpenBrace);
			setState(442);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << As) | (1L << From) | (1L << Import) | (1L << Module) | (1L << In) | (1L << Is) | (1L << New) | (1L << Typeof) | (1L << Type) | (1L << Number) | (1L << String) | (1L << OpenBracket) | (1L << OpenParen) | (1L << LessThan))) != 0) || _la==Identifier || _la==StringLiteral) {
				{
				setState(441);
				typeBody();
				}
			}

			setState(444);
			lineEnd();
			setState(445);
			match(CloseBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeBodyContext extends ParserRuleContext {
		public TypeMemberListContext typeMemberList() {
			return getRuleContext(TypeMemberListContext.class,0);
		}
		public TypeBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).enterTypeBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).exitTypeBody(this);
		}
	}

	public final TypeBodyContext typeBody() throws RecognitionException {
		TypeBodyContext _localctx = new TypeBodyContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_typeBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(447);
			typeMemberList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeMemberListContext extends ParserRuleContext {
		public List<TypeMemberContext> typeMember() {
			return getRuleContexts(TypeMemberContext.class);
		}
		public TypeMemberContext typeMember(int i) {
			return getRuleContext(TypeMemberContext.class,i);
		}
		public TypeMemberListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeMemberList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).enterTypeMemberList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).exitTypeMemberList(this);
		}
	}

	public final TypeMemberListContext typeMemberList() throws RecognitionException {
		TypeMemberListContext _localctx = new TypeMemberListContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_typeMemberList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(449);
			typeMember();
			setState(454);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(450);
					_la = _input.LA(1);
					if ( !(_la==SemiColon || _la==Comma) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(451);
					typeMember();
					}
					} 
				}
				setState(456);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeMemberContext extends ParserRuleContext {
		public PropertySignatureContext propertySignature() {
			return getRuleContext(PropertySignatureContext.class,0);
		}
		public CallSignatureContext callSignature() {
			return getRuleContext(CallSignatureContext.class,0);
		}
		public ConstructSignatureContext constructSignature() {
			return getRuleContext(ConstructSignatureContext.class,0);
		}
		public IndexSignatureContext indexSignature() {
			return getRuleContext(IndexSignatureContext.class,0);
		}
		public MethodSignatureContext methodSignature() {
			return getRuleContext(MethodSignatureContext.class,0);
		}
		public BindingIdentifierContext bindingIdentifier() {
			return getRuleContext(BindingIdentifierContext.class,0);
		}
		public TypeMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeMember; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).enterTypeMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).exitTypeMember(this);
		}
	}

	public final TypeMemberContext typeMember() throws RecognitionException {
		TypeMemberContext _localctx = new TypeMemberContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_typeMember);
		try {
			setState(465);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(457);
				propertySignature();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(458);
				callSignature();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(459);
				constructSignature();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(460);
				indexSignature();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(461);
				methodSignature();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(462);
				bindingIdentifier();
				setState(463);
				callSignature();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TupleTypeContext extends ParserRuleContext {
		public TupleTypeElementsContext tupleTypeElements() {
			return getRuleContext(TupleTypeElementsContext.class,0);
		}
		public TupleTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tupleType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).enterTupleType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).exitTupleType(this);
		}
	}

	public final TupleTypeContext tupleType() throws RecognitionException {
		TupleTypeContext _localctx = new TupleTypeContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_tupleType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(467);
			match(OpenBracket);
			setState(468);
			tupleTypeElements();
			setState(469);
			match(CloseBracket);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TupleTypeElementsContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public TupleTypeElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tupleTypeElements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).enterTupleTypeElements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).exitTupleTypeElements(this);
		}
	}

	public final TupleTypeElementsContext tupleTypeElements() throws RecognitionException {
		TupleTypeElementsContext _localctx = new TupleTypeElementsContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_tupleTypeElements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(471);
			type();
			setState(476);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(472);
				match(Comma);
				setState(473);
				type();
				}
				}
				setState(478);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionTypeContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public FunctionTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).enterFunctionType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).exitFunctionType(this);
		}
	}

	public final FunctionTypeContext functionType() throws RecognitionException {
		FunctionTypeContext _localctx = new FunctionTypeContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_functionType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(480);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LessThan) {
				{
				setState(479);
				typeParameters();
				}
			}

			setState(482);
			match(OpenParen);
			setState(484);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << As) | (1L << From) | (1L << Import) | (1L << Module) | (1L << In) | (1L << Is) | (1L << Public) | (1L << Protected) | (1L << Private) | (1L << Typeof) | (1L << Type) | (1L << Number) | (1L << String) | (1L << DotDotDot))) != 0) || _la==Identifier || _la==StringLiteral) {
				{
				setState(483);
				parameterList();
				}
			}

			setState(486);
			match(CloseParen);
			setState(487);
			match(ThickArrow);
			setState(488);
			type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorTypeContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public ConstructorTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).enterConstructorType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).exitConstructorType(this);
		}
	}

	public final ConstructorTypeContext constructorType() throws RecognitionException {
		ConstructorTypeContext _localctx = new ConstructorTypeContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_constructorType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(490);
			match(New);
			setState(492);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LessThan) {
				{
				setState(491);
				typeParameters();
				}
			}

			setState(494);
			match(OpenParen);
			setState(496);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << As) | (1L << From) | (1L << Import) | (1L << Module) | (1L << In) | (1L << Is) | (1L << Public) | (1L << Protected) | (1L << Private) | (1L << Typeof) | (1L << Type) | (1L << Number) | (1L << String) | (1L << DotDotDot))) != 0) || _la==Identifier || _la==StringLiteral) {
				{
				setState(495);
				parameterList();
				}
			}

			setState(498);
			match(CloseParen);
			setState(499);
			match(ThickArrow);
			setState(500);
			type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeQueryContext extends ParserRuleContext {
		public IdentifierPathContext identifierPath() {
			return getRuleContext(IdentifierPathContext.class,0);
		}
		public TypeQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).enterTypeQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).exitTypeQuery(this);
		}
	}

	public final TypeQueryContext typeQuery() throws RecognitionException {
		TypeQueryContext _localctx = new TypeQueryContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_typeQuery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(502);
			match(Typeof);
			setState(503);
			identifierPath();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ThisTypeContext extends ParserRuleContext {
		public ThisTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thisType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).enterThisType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).exitThisType(this);
		}
	}

	public final ThisTypeContext thisType() throws RecognitionException {
		ThisTypeContext _localctx = new ThisTypeContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_thisType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(505);
			match(This);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropertySignatureContext extends ParserRuleContext {
		public BindingIdentifierContext bindingIdentifier() {
			return getRuleContext(BindingIdentifierContext.class,0);
		}
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public PropertySignatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertySignature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).enterPropertySignature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).exitPropertySignature(this);
		}
	}

	public final PropertySignatureContext propertySignature() throws RecognitionException {
		PropertySignatureContext _localctx = new PropertySignatureContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_propertySignature);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(507);
			bindingIdentifier();
			setState(509);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==QuestionMark) {
				{
				setState(508);
				match(QuestionMark);
				}
			}

			setState(512);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(511);
				typeAnnotation();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeAnnotationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeAnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeAnnotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).enterTypeAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).exitTypeAnnotation(this);
		}
	}

	public final TypeAnnotationContext typeAnnotation() throws RecognitionException {
		TypeAnnotationContext _localctx = new TypeAnnotationContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_typeAnnotation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(514);
			match(Colon);
			setState(515);
			type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CallSignatureContext extends ParserRuleContext {
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public CallSignatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callSignature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).enterCallSignature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).exitCallSignature(this);
		}
	}

	public final CallSignatureContext callSignature() throws RecognitionException {
		CallSignatureContext _localctx = new CallSignatureContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_callSignature);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(518);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LessThan) {
				{
				setState(517);
				typeParameters();
				}
			}

			setState(520);
			match(OpenParen);
			setState(522);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << As) | (1L << From) | (1L << Import) | (1L << Module) | (1L << In) | (1L << Is) | (1L << Public) | (1L << Protected) | (1L << Private) | (1L << Typeof) | (1L << Type) | (1L << Number) | (1L << String) | (1L << DotDotDot))) != 0) || _la==Identifier || _la==StringLiteral) {
				{
				setState(521);
				parameterList();
				}
			}

			setState(524);
			match(CloseParen);
			setState(526);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(525);
				typeAnnotation();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterListContext extends ParserRuleContext {
		public RequiredParameterListContext requiredParameterList() {
			return getRuleContext(RequiredParameterListContext.class,0);
		}
		public OptionalParameterListContext optionalParameterList() {
			return getRuleContext(OptionalParameterListContext.class,0);
		}
		public RestParameterContext restParameter() {
			return getRuleContext(RestParameterContext.class,0);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).exitParameterList(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_parameterList);
		int _la;
		try {
			setState(546);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(528);
				requiredParameterList();
				setState(538);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(529);
					match(Comma);
					{
					setState(536);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__0:
					case As:
					case From:
					case Import:
					case Module:
					case In:
					case Is:
					case Public:
					case Protected:
					case Private:
					case Typeof:
					case Type:
					case Number:
					case String:
					case Identifier:
					case StringLiteral:
						{
						setState(530);
						optionalParameterList();
						setState(533);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==Comma) {
							{
							setState(531);
							match(Comma);
							setState(532);
							restParameter();
							}
						}

						}
						break;
					case DotDotDot:
						{
						setState(535);
						restParameter();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(540);
				optionalParameterList();
				setState(543);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(541);
					match(Comma);
					setState(542);
					restParameter();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(545);
				restParameter();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RequiredParameterListContext extends ParserRuleContext {
		public List<RequiredParameterContext> requiredParameter() {
			return getRuleContexts(RequiredParameterContext.class);
		}
		public RequiredParameterContext requiredParameter(int i) {
			return getRuleContext(RequiredParameterContext.class,i);
		}
		public RequiredParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_requiredParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).enterRequiredParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).exitRequiredParameterList(this);
		}
	}

	public final RequiredParameterListContext requiredParameterList() throws RecognitionException {
		RequiredParameterListContext _localctx = new RequiredParameterListContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_requiredParameterList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(548);
			requiredParameter();
			setState(553);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(549);
					match(Comma);
					setState(550);
					requiredParameter();
					}
					} 
				}
				setState(555);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RequiredParameterContext extends ParserRuleContext {
		public BindingIdentifierContext bindingIdentifier() {
			return getRuleContext(BindingIdentifierContext.class,0);
		}
		public AccessibilityModifierContext accessibilityModifier() {
			return getRuleContext(AccessibilityModifierContext.class,0);
		}
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public TerminalNode StringLiteral() { return getToken(GenScalaFacadesFromTypescriptParser.StringLiteral, 0); }
		public RequiredParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_requiredParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).enterRequiredParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).exitRequiredParameter(this);
		}
	}

	public final RequiredParameterContext requiredParameter() throws RecognitionException {
		RequiredParameterContext _localctx = new RequiredParameterContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_requiredParameter);
		int _la;
		try {
			setState(567);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(557);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Public) | (1L << Protected) | (1L << Private))) != 0)) {
					{
					setState(556);
					accessibilityModifier();
					}
				}

				setState(559);
				bindingIdentifier();
				setState(561);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(560);
					typeAnnotation();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(563);
				bindingIdentifier();
				setState(564);
				match(Colon);
				setState(565);
				match(StringLiteral);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AccessibilityModifierContext extends ParserRuleContext {
		public AccessibilityModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessibilityModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).enterAccessibilityModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).exitAccessibilityModifier(this);
		}
	}

	public final AccessibilityModifierContext accessibilityModifier() throws RecognitionException {
		AccessibilityModifierContext _localctx = new AccessibilityModifierContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_accessibilityModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(569);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Public) | (1L << Protected) | (1L << Private))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptionalParameterListContext extends ParserRuleContext {
		public List<OptionalParameterContext> optionalParameter() {
			return getRuleContexts(OptionalParameterContext.class);
		}
		public OptionalParameterContext optionalParameter(int i) {
			return getRuleContext(OptionalParameterContext.class,i);
		}
		public OptionalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionalParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).enterOptionalParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).exitOptionalParameterList(this);
		}
	}

	public final OptionalParameterListContext optionalParameterList() throws RecognitionException {
		OptionalParameterListContext _localctx = new OptionalParameterListContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_optionalParameterList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(571);
			optionalParameter();
			setState(576);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(572);
					match(Comma);
					setState(573);
					optionalParameter();
					}
					} 
				}
				setState(578);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptionalParameterContext extends ParserRuleContext {
		public BindingIdentifierContext bindingIdentifier() {
			return getRuleContext(BindingIdentifierContext.class,0);
		}
		public AccessibilityModifierContext accessibilityModifier() {
			return getRuleContext(AccessibilityModifierContext.class,0);
		}
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public TerminalNode StringLiteral() { return getToken(GenScalaFacadesFromTypescriptParser.StringLiteral, 0); }
		public OptionalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).enterOptionalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).exitOptionalParameter(this);
		}
	}

	public final OptionalParameterContext optionalParameter() throws RecognitionException {
		OptionalParameterContext _localctx = new OptionalParameterContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_optionalParameter);
		int _la;
		try {
			setState(594);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(580);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Public) | (1L << Protected) | (1L << Private))) != 0)) {
					{
					setState(579);
					accessibilityModifier();
					}
				}

				setState(582);
				bindingIdentifier();
				setState(584);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==QuestionMark) {
					{
					setState(583);
					match(QuestionMark);
					}
				}

				setState(587);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(586);
					typeAnnotation();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(589);
				bindingIdentifier();
				setState(590);
				match(QuestionMark);
				setState(591);
				match(Colon);
				setState(592);
				match(StringLiteral);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RestParameterContext extends ParserRuleContext {
		public BindingIdentifierContext bindingIdentifier() {
			return getRuleContext(BindingIdentifierContext.class,0);
		}
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public RestParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_restParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).enterRestParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).exitRestParameter(this);
		}
	}

	public final RestParameterContext restParameter() throws RecognitionException {
		RestParameterContext _localctx = new RestParameterContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_restParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(596);
			match(DotDotDot);
			setState(597);
			bindingIdentifier();
			setState(599);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(598);
				typeAnnotation();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructSignatureContext extends ParserRuleContext {
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public ConstructSignatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructSignature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).enterConstructSignature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).exitConstructSignature(this);
		}
	}

	public final ConstructSignatureContext constructSignature() throws RecognitionException {
		ConstructSignatureContext _localctx = new ConstructSignatureContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_constructSignature);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(601);
			match(New);
			setState(603);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LessThan) {
				{
				setState(602);
				typeParameters();
				}
			}

			setState(605);
			match(OpenParen);
			setState(607);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << As) | (1L << From) | (1L << Import) | (1L << Module) | (1L << In) | (1L << Is) | (1L << Public) | (1L << Protected) | (1L << Private) | (1L << Typeof) | (1L << Type) | (1L << Number) | (1L << String) | (1L << DotDotDot))) != 0) || _la==Identifier || _la==StringLiteral) {
				{
				setState(606);
				parameterList();
				}
			}

			setState(609);
			match(CloseParen);
			setState(611);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(610);
				typeAnnotation();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IndexSignatureContext extends ParserRuleContext {
		public BindingIdentifierContext bindingIdentifier() {
			return getRuleContext(BindingIdentifierContext.class,0);
		}
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public IndexSignatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexSignature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).enterIndexSignature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).exitIndexSignature(this);
		}
	}

	public final IndexSignatureContext indexSignature() throws RecognitionException {
		IndexSignatureContext _localctx = new IndexSignatureContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_indexSignature);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(613);
			match(OpenBracket);
			setState(614);
			bindingIdentifier();
			setState(615);
			match(Colon);
			setState(616);
			_la = _input.LA(1);
			if ( !(_la==Number || _la==String) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(617);
			match(CloseBracket);
			setState(618);
			typeAnnotation();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodSignatureContext extends ParserRuleContext {
		public BindingIdentifierContext bindingIdentifier() {
			return getRuleContext(BindingIdentifierContext.class,0);
		}
		public CallSignatureContext callSignature() {
			return getRuleContext(CallSignatureContext.class,0);
		}
		public MethodSignatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodSignature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).enterMethodSignature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).exitMethodSignature(this);
		}
	}

	public final MethodSignatureContext methodSignature() throws RecognitionException {
		MethodSignatureContext _localctx = new MethodSignatureContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_methodSignature);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(620);
			bindingIdentifier();
			setState(622);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==QuestionMark) {
				{
				setState(621);
				match(QuestionMark);
				}
			}

			setState(624);
			callSignature();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstExpressionContext extends ParserRuleContext {
		public NumericLiteralContext numericLiteral() {
			return getRuleContext(NumericLiteralContext.class,0);
		}
		public ConstExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).enterConstExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).exitConstExpression(this);
		}
	}

	public final ConstExpressionContext constExpression() throws RecognitionException {
		ConstExpressionContext _localctx = new ConstExpressionContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_constExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(626);
			numericLiteral();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceDeclarationContext extends ParserRuleContext {
		public BindingIdentifierContext bindingIdentifier() {
			return getRuleContext(BindingIdentifierContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public ExtendsClauseContext extendsClause() {
			return getRuleContext(ExtendsClauseContext.class,0);
		}
		public List<TypeMemberContext> typeMember() {
			return getRuleContexts(TypeMemberContext.class);
		}
		public TypeMemberContext typeMember(int i) {
			return getRuleContext(TypeMemberContext.class,i);
		}
		public List<LineEndContext> lineEnd() {
			return getRuleContexts(LineEndContext.class);
		}
		public LineEndContext lineEnd(int i) {
			return getRuleContext(LineEndContext.class,i);
		}
		public InterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).enterInterfaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).exitInterfaceDeclaration(this);
		}
	}

	public final InterfaceDeclarationContext interfaceDeclaration() throws RecognitionException {
		InterfaceDeclarationContext _localctx = new InterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_interfaceDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(628);
			match(Interface);
			setState(629);
			bindingIdentifier();
			setState(631);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LessThan) {
				{
				setState(630);
				typeParameters();
				}
			}

			setState(634);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Extends) {
				{
				setState(633);
				extendsClause();
				}
			}

			setState(636);
			match(OpenBrace);
			setState(642);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << As) | (1L << From) | (1L << Import) | (1L << Module) | (1L << In) | (1L << Is) | (1L << New) | (1L << Typeof) | (1L << Type) | (1L << Number) | (1L << String) | (1L << OpenBracket) | (1L << OpenParen) | (1L << LessThan))) != 0) || _la==Identifier || _la==StringLiteral) {
				{
				{
				setState(637);
				typeMember();
				setState(638);
				lineEnd();
				}
				}
				setState(644);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(645);
			match(CloseBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExtendsClauseContext extends ParserRuleContext {
		public ClassOrInterfaceTypeListContext classOrInterfaceTypeList() {
			return getRuleContext(ClassOrInterfaceTypeListContext.class,0);
		}
		public ExtendsClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extendsClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).enterExtendsClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).exitExtendsClause(this);
		}
	}

	public final ExtendsClauseContext extendsClause() throws RecognitionException {
		ExtendsClauseContext _localctx = new ExtendsClauseContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_extendsClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(647);
			match(Extends);
			setState(648);
			classOrInterfaceTypeList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassOrInterfaceTypeListContext extends ParserRuleContext {
		public List<TypeReferenceContext> typeReference() {
			return getRuleContexts(TypeReferenceContext.class);
		}
		public TypeReferenceContext typeReference(int i) {
			return getRuleContext(TypeReferenceContext.class,i);
		}
		public ClassOrInterfaceTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceTypeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).enterClassOrInterfaceTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).exitClassOrInterfaceTypeList(this);
		}
	}

	public final ClassOrInterfaceTypeListContext classOrInterfaceTypeList() throws RecognitionException {
		ClassOrInterfaceTypeListContext _localctx = new ClassOrInterfaceTypeListContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_classOrInterfaceTypeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(650);
			typeReference();
			setState(655);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(651);
				match(Comma);
				setState(652);
				typeReference();
				}
				}
				setState(657);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassHeritageContext extends ParserRuleContext {
		public ExtendsClauseContext extendsClause() {
			return getRuleContext(ExtendsClauseContext.class,0);
		}
		public ImplementsClauseContext implementsClause() {
			return getRuleContext(ImplementsClauseContext.class,0);
		}
		public ClassHeritageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classHeritage; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).enterClassHeritage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).exitClassHeritage(this);
		}
	}

	public final ClassHeritageContext classHeritage() throws RecognitionException {
		ClassHeritageContext _localctx = new ClassHeritageContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_classHeritage);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(659);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Extends) {
				{
				setState(658);
				extendsClause();
				}
			}

			setState(662);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Implements) {
				{
				setState(661);
				implementsClause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImplementsClauseContext extends ParserRuleContext {
		public ClassOrInterfaceTypeListContext classOrInterfaceTypeList() {
			return getRuleContext(ClassOrInterfaceTypeListContext.class,0);
		}
		public ImplementsClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_implementsClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).enterImplementsClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).exitImplementsClause(this);
		}
	}

	public final ImplementsClauseContext implementsClause() throws RecognitionException {
		ImplementsClauseContext _localctx = new ImplementsClauseContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_implementsClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(664);
			match(Implements);
			setState(665);
			classOrInterfaceTypeList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumDeclarationContext extends ParserRuleContext {
		public BindingIdentifierContext bindingIdentifier() {
			return getRuleContext(BindingIdentifierContext.class,0);
		}
		public EnumBodyContext enumBody() {
			return getRuleContext(EnumBodyContext.class,0);
		}
		public EnumDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).enterEnumDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).exitEnumDeclaration(this);
		}
	}

	public final EnumDeclarationContext enumDeclaration() throws RecognitionException {
		EnumDeclarationContext _localctx = new EnumDeclarationContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_enumDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(668);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Const) {
				{
				setState(667);
				match(Const);
				}
			}

			setState(670);
			match(Enum);
			setState(671);
			bindingIdentifier();
			setState(672);
			match(OpenBrace);
			setState(674);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << As) | (1L << From) | (1L << Import) | (1L << Module) | (1L << In) | (1L << Is) | (1L << Typeof) | (1L << Type) | (1L << Number) | (1L << String))) != 0) || _la==Identifier || _la==StringLiteral) {
				{
				setState(673);
				enumBody();
				}
			}

			setState(676);
			match(CloseBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumBodyContext extends ParserRuleContext {
		public EnumMemberListContext enumMemberList() {
			return getRuleContext(EnumMemberListContext.class,0);
		}
		public EnumBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).enterEnumBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).exitEnumBody(this);
		}
	}

	public final EnumBodyContext enumBody() throws RecognitionException {
		EnumBodyContext _localctx = new EnumBodyContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_enumBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(678);
			enumMemberList();
			setState(680);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(679);
				match(Comma);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumMemberListContext extends ParserRuleContext {
		public List<EnumMemberContext> enumMember() {
			return getRuleContexts(EnumMemberContext.class);
		}
		public EnumMemberContext enumMember(int i) {
			return getRuleContext(EnumMemberContext.class,i);
		}
		public EnumMemberListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumMemberList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).enterEnumMemberList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).exitEnumMemberList(this);
		}
	}

	public final EnumMemberListContext enumMemberList() throws RecognitionException {
		EnumMemberListContext _localctx = new EnumMemberListContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_enumMemberList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(682);
			enumMember();
			setState(687);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(683);
					match(Comma);
					setState(684);
					enumMember();
					}
					} 
				}
				setState(689);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumMemberContext extends ParserRuleContext {
		public BindingIdentifierContext bindingIdentifier() {
			return getRuleContext(BindingIdentifierContext.class,0);
		}
		public EnumValueContext enumValue() {
			return getRuleContext(EnumValueContext.class,0);
		}
		public EnumMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumMember; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).enterEnumMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).exitEnumMember(this);
		}
	}

	public final EnumMemberContext enumMember() throws RecognitionException {
		EnumMemberContext _localctx = new EnumMemberContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_enumMember);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(690);
			bindingIdentifier();
			setState(693);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Assign) {
				{
				setState(691);
				match(Assign);
				setState(692);
				enumValue();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumValueContext extends ParserRuleContext {
		public ConstExpressionContext constExpression() {
			return getRuleContext(ConstExpressionContext.class,0);
		}
		public EnumValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).enterEnumValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).exitEnumValue(this);
		}
	}

	public final EnumValueContext enumValue() throws RecognitionException {
		EnumValueContext _localctx = new EnumValueContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_enumValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(695);
			constExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierPathContext extends ParserRuleContext {
		public List<BindingIdentifierContext> bindingIdentifier() {
			return getRuleContexts(BindingIdentifierContext.class);
		}
		public BindingIdentifierContext bindingIdentifier(int i) {
			return getRuleContext(BindingIdentifierContext.class,i);
		}
		public IdentifierPathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierPath; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).enterIdentifierPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).exitIdentifierPath(this);
		}
	}

	public final IdentifierPathContext identifierPath() throws RecognitionException {
		IdentifierPathContext _localctx = new IdentifierPathContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_identifierPath);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(697);
			bindingIdentifier();
			setState(702);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(698);
					match(Dot);
					setState(699);
					bindingIdentifier();
					}
					} 
				}
				setState(704);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BindingIdentifierContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode StringLiteral() { return getToken(GenScalaFacadesFromTypescriptParser.StringLiteral, 0); }
		public BindingIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bindingIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).enterBindingIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).exitBindingIdentifier(this);
		}
	}

	public final BindingIdentifierContext bindingIdentifier() throws RecognitionException {
		BindingIdentifierContext _localctx = new BindingIdentifierContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_bindingIdentifier);
		try {
			setState(707);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case As:
			case From:
			case Import:
			case Module:
			case In:
			case Is:
			case Typeof:
			case Type:
			case Number:
			case String:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(705);
				identifier();
				}
				break;
			case StringLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(706);
				match(StringLiteral);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(GenScalaFacadesFromTypescriptParser.Identifier, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).exitIdentifier(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(709);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << As) | (1L << From) | (1L << Import) | (1L << Module) | (1L << In) | (1L << Is) | (1L << Typeof) | (1L << Type) | (1L << Number) | (1L << String))) != 0) || _la==Identifier) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LineEndContext extends ParserRuleContext {
		public TerminalNode LineTerminator() { return getToken(GenScalaFacadesFromTypescriptParser.LineTerminator, 0); }
		public LineEndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lineEnd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).enterLineEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).exitLineEnd(this);
		}
	}

	public final LineEndContext lineEnd() throws RecognitionException {
		LineEndContext _localctx = new LineEndContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_lineEnd);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(711);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LineTerminator) | (1L << SemiColon) | (1L << Comma))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 29:
			return unionOrIntersectionOrPrimaryType_sempred((UnionOrIntersectionOrPrimaryTypeContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean unionOrIntersectionOrPrimaryType_sempred(UnionOrIntersectionOrPrimaryTypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\\\u02cc\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\3\2\7\2\u009a\n\2\f\2\16\2\u009d\13\2\3\2\3\2\3"+
		"\3\3\3\3\3\3\3\3\3\5\3\u00a6\n\3\3\3\3\3\3\3\5\3\u00ab\n\3\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u00b9\n\4\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\6\3\6\5\6\u00c5\n\6\3\7\5\7\u00c8\n\7\3\7\3\7\3\7\7\7\u00cd"+
		"\n\7\f\7\16\7\u00d0\13\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00d8\n\7\3\b\3\b"+
		"\3\b\5\b\u00dd\n\b\5\b\u00df\n\b\3\t\3\t\3\t\5\t\u00e4\n\t\3\n\3\n\3\n"+
		"\3\n\3\n\5\n\u00eb\n\n\3\13\3\13\3\13\3\f\3\f\3\f\7\f\u00f3\n\f\f\f\16"+
		"\f\u00f6\13\f\3\r\3\r\5\r\u00fa\n\r\3\16\3\16\3\16\3\16\3\17\5\17\u0101"+
		"\n\17\3\17\3\17\3\17\5\17\u0106\n\17\3\17\3\17\3\17\3\17\3\17\7\17\u010d"+
		"\n\17\f\17\16\17\u0110\13\17\3\17\3\17\3\20\3\20\3\20\5\20\u0117\n\20"+
		"\3\21\3\21\3\21\5\21\u011c\n\21\3\21\3\21\3\22\5\22\u0121\n\22\3\22\5"+
		"\22\u0124\n\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\25\3\25"+
		"\3\25\3\25\3\25\5\25\u0134\n\25\3\26\3\26\5\26\u0138\n\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\5\26\u0141\n\26\3\26\3\26\5\26\u0145\n\26\3\26"+
		"\3\26\3\26\3\26\5\26\u014b\n\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\7\30"+
		"\u0154\n\30\f\30\16\30\u0157\13\30\3\31\3\31\5\31\u015b\n\31\3\32\3\32"+
		"\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\7\34\u0167\n\34\f\34\16\34\u016a"+
		"\13\34\3\35\3\35\3\35\5\35\u016f\n\35\3\36\3\36\5\36\u0173\n\36\3\36\3"+
		"\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u017e\n\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\7\37\u0186\n\37\f\37\16\37\u0189\13\37\3 \5 \u018c\n "+
		"\3 \3 \3 \5 \u0191\n \3 \7 \u0194\n \f \16 \u0197\13 \5 \u0199\n \3!\3"+
		"!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u01ae\n#\3"+
		"$\3$\3$\3%\3%\3%\3%\3&\3&\5&\u01b9\n&\3\'\3\'\5\'\u01bd\n\'\3\'\3\'\3"+
		"\'\3(\3(\3)\3)\3)\7)\u01c7\n)\f)\16)\u01ca\13)\3*\3*\3*\3*\3*\3*\3*\3"+
		"*\5*\u01d4\n*\3+\3+\3+\3+\3,\3,\3,\7,\u01dd\n,\f,\16,\u01e0\13,\3-\5-"+
		"\u01e3\n-\3-\3-\5-\u01e7\n-\3-\3-\3-\3-\3.\3.\5.\u01ef\n.\3.\3.\5.\u01f3"+
		"\n.\3.\3.\3.\3.\3/\3/\3/\3\60\3\60\3\61\3\61\5\61\u0200\n\61\3\61\5\61"+
		"\u0203\n\61\3\62\3\62\3\62\3\63\5\63\u0209\n\63\3\63\3\63\5\63\u020d\n"+
		"\63\3\63\3\63\5\63\u0211\n\63\3\64\3\64\3\64\3\64\3\64\5\64\u0218\n\64"+
		"\3\64\5\64\u021b\n\64\5\64\u021d\n\64\3\64\3\64\3\64\5\64\u0222\n\64\3"+
		"\64\5\64\u0225\n\64\3\65\3\65\3\65\7\65\u022a\n\65\f\65\16\65\u022d\13"+
		"\65\3\66\5\66\u0230\n\66\3\66\3\66\5\66\u0234\n\66\3\66\3\66\3\66\3\66"+
		"\5\66\u023a\n\66\3\67\3\67\38\38\38\78\u0241\n8\f8\168\u0244\138\39\5"+
		"9\u0247\n9\39\39\59\u024b\n9\39\59\u024e\n9\39\39\39\39\39\59\u0255\n"+
		"9\3:\3:\3:\5:\u025a\n:\3;\3;\5;\u025e\n;\3;\3;\5;\u0262\n;\3;\3;\5;\u0266"+
		"\n;\3<\3<\3<\3<\3<\3<\3<\3=\3=\5=\u0271\n=\3=\3=\3>\3>\3?\3?\3?\5?\u027a"+
		"\n?\3?\5?\u027d\n?\3?\3?\3?\3?\7?\u0283\n?\f?\16?\u0286\13?\3?\3?\3@\3"+
		"@\3@\3A\3A\3A\7A\u0290\nA\fA\16A\u0293\13A\3B\5B\u0296\nB\3B\5B\u0299"+
		"\nB\3C\3C\3C\3D\5D\u029f\nD\3D\3D\3D\3D\5D\u02a5\nD\3D\3D\3E\3E\5E\u02ab"+
		"\nE\3F\3F\3F\7F\u02b0\nF\fF\16F\u02b3\13F\3G\3G\3G\5G\u02b8\nG\3H\3H\3"+
		"I\3I\3I\7I\u02bf\nI\fI\16I\u02c2\13I\3J\3J\5J\u02c6\nJ\3K\3K\3L\3L\3L"+
		"\2\3<M\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<"+
		">@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a"+
		"\u008c\u008e\u0090\u0092\u0094\u0096\2\13\4\2\3\3\25\25\5\2\b\b\24\24"+
		"\26\26\3\2TV\4\2\r\r\27\27\3\2,-\3\2\31\33\3\2\"#\13\2\3\3\6\6\16\16\21"+
		"\21\25\25\27\30\37\37!#WW\4\2\4\4,-\u02ec\2\u009b\3\2\2\2\4\u00aa\3\2"+
		"\2\2\6\u00b8\3\2\2\2\b\u00ba\3\2\2\2\n\u00c4\3\2\2\2\f\u00d7\3\2\2\2\16"+
		"\u00de\3\2\2\2\20\u00e3\3\2\2\2\22\u00ea\3\2\2\2\24\u00ec\3\2\2\2\26\u00ef"+
		"\3\2\2\2\30\u00f7\3\2\2\2\32\u00fb\3\2\2\2\34\u0100\3\2\2\2\36\u0116\3"+
		"\2\2\2 \u0118\3\2\2\2\"\u0120\3\2\2\2$\u0127\3\2\2\2&\u012c\3\2\2\2(\u012e"+
		"\3\2\2\2*\u014a\3\2\2\2,\u014c\3\2\2\2.\u0150\3\2\2\2\60\u0158\3\2\2\2"+
		"\62\u015c\3\2\2\2\64\u015f\3\2\2\2\66\u0163\3\2\2\28\u016e\3\2\2\2:\u0170"+
		"\3\2\2\2<\u017d\3\2\2\2>\u0198\3\2\2\2@\u019a\3\2\2\2B\u019e\3\2\2\2D"+
		"\u01ad\3\2\2\2F\u01af\3\2\2\2H\u01b2\3\2\2\2J\u01b6\3\2\2\2L\u01ba\3\2"+
		"\2\2N\u01c1\3\2\2\2P\u01c3\3\2\2\2R\u01d3\3\2\2\2T\u01d5\3\2\2\2V\u01d9"+
		"\3\2\2\2X\u01e2\3\2\2\2Z\u01ec\3\2\2\2\\\u01f8\3\2\2\2^\u01fb\3\2\2\2"+
		"`\u01fd\3\2\2\2b\u0204\3\2\2\2d\u0208\3\2\2\2f\u0224\3\2\2\2h\u0226\3"+
		"\2\2\2j\u0239\3\2\2\2l\u023b\3\2\2\2n\u023d\3\2\2\2p\u0254\3\2\2\2r\u0256"+
		"\3\2\2\2t\u025b\3\2\2\2v\u0267\3\2\2\2x\u026e\3\2\2\2z\u0274\3\2\2\2|"+
		"\u0276\3\2\2\2~\u0289\3\2\2\2\u0080\u028c\3\2\2\2\u0082\u0295\3\2\2\2"+
		"\u0084\u029a\3\2\2\2\u0086\u029e\3\2\2\2\u0088\u02a8\3\2\2\2\u008a\u02ac"+
		"\3\2\2\2\u008c\u02b4\3\2\2\2\u008e\u02b9\3\2\2\2\u0090\u02bb\3\2\2\2\u0092"+
		"\u02c5\3\2\2\2\u0094\u02c7\3\2\2\2\u0096\u02c9\3\2\2\2\u0098\u009a\5\4"+
		"\3\2\u0099\u0098\3\2\2\2\u009a\u009d\3\2\2\2\u009b\u0099\3\2\2\2\u009b"+
		"\u009c\3\2\2\2\u009c\u009e\3\2\2\2\u009d\u009b\3\2\2\2\u009e\u009f\7\2"+
		"\2\3\u009f\3\3\2\2\2\u00a0\u00a5\7\n\2\2\u00a1\u00a6\5\f\7\2\u00a2\u00a3"+
		"\5\22\n\2\u00a3\u00a4\5\u0096L\2\u00a4\u00a6\3\2\2\2\u00a5\u00a1\3\2\2"+
		"\2\u00a5\u00a2\3\2\2\2\u00a6\u00ab\3\2\2\2\u00a7\u00ab\5|?\2\u00a8\u00ab"+
		"\5\6\4\2\u00a9\u00ab\5\b\5\2\u00aa\u00a0\3\2\2\2\u00aa\u00a7\3\2\2\2\u00aa"+
		"\u00a8\3\2\2\2\u00aa\u00a9\3\2\2\2\u00ab\5\3\2\2\2\u00ac\u00ad\7\f\2\2"+
		"\u00ad\u00ae\7\n\2\2\u00ae\u00af\5\22\n\2\u00af\u00b0\5\u0096L\2\u00b0"+
		"\u00b9\3\2\2\2\u00b1\u00b2\7\f\2\2\u00b2\u00b3\7\6\2\2\u00b3\u00b4\7\3"+
		"\2\2\u00b4\u00b5\5\u0092J\2\u00b5\u00b6\5\u0096L\2\u00b6\u00b9\3\2\2\2"+
		"\u00b7\u00b9\5$\23\2\u00b8\u00ac\3\2\2\2\u00b8\u00b1\3\2\2\2\u00b8\u00b7"+
		"\3\2\2\2\u00b9\7\3\2\2\2\u00ba\u00bb\7\21\2\2\u00bb\u00bc\5\n\6\2\u00bc"+
		"\u00bd\7\6\2\2\u00bd\u00be\5\u0092J\2\u00be\u00bf\7\16\2\2\u00bf\u00c0"+
		"\5\u0092J\2\u00c0\u00c1\5\u0096L\2\u00c1\t\3\2\2\2\u00c2\u00c5\5\u0092"+
		"J\2\u00c3\u00c5\78\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c3\3\2\2\2\u00c5\13"+
		"\3\2\2\2\u00c6\u00c8\t\2\2\2\u00c7\u00c6\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8"+
		"\u00c9\3\2\2\2\u00c9\u00ca\5\u0090I\2\u00ca\u00ce\7*\2\2\u00cb\u00cd\5"+
		"\16\b\2\u00cc\u00cb\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce"+
		"\u00cf\3\2\2\2\u00cf\u00d1\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1\u00d2\7+"+
		"\2\2\u00d2\u00d8\3\2\2\2\u00d3\u00d4\7*\2\2\u00d4\u00d5\5\f\7\2\u00d5"+
		"\u00d6\7+\2\2\u00d6\u00d8\3\2\2\2\u00d7\u00c7\3\2\2\2\u00d7\u00d3\3\2"+
		"\2\2\u00d8\r\3\2\2\2\u00d9\u00df\5\20\t\2\u00da\u00dc\5\22\n\2\u00db\u00dd"+
		"\5\u0096L\2\u00dc\u00db\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00df\3\2\2"+
		"\2\u00de\u00d9\3\2\2\2\u00de\u00da\3\2\2\2\u00df\17\3\2\2\2\u00e0\u00e4"+
		"\5|?\2\u00e1\u00e4\5\34\17\2\u00e2\u00e4\5\f\7\2\u00e3\u00e0\3\2\2\2\u00e3"+
		"\u00e1\3\2\2\2\u00e3\u00e2\3\2\2\2\u00e4\21\3\2\2\2\u00e5\u00eb\5\24\13"+
		"\2\u00e6\u00eb\5(\25\2\u00e7\u00eb\5\32\16\2\u00e8\u00eb\5\u0086D\2\u00e9"+
		"\u00eb\5$\23\2\u00ea\u00e5\3\2\2\2\u00ea\u00e6\3\2\2\2\u00ea\u00e7\3\2"+
		"\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00e9\3\2\2\2\u00eb\23\3\2\2\2\u00ec\u00ed"+
		"\t\3\2\2\u00ed\u00ee\5\26\f\2\u00ee\25\3\2\2\2\u00ef\u00f4\5\30\r\2\u00f0"+
		"\u00f1\7-\2\2\u00f1\u00f3\5\30\r\2\u00f2\u00f0\3\2\2\2\u00f3\u00f6\3\2"+
		"\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\27\3\2\2\2\u00f6\u00f4"+
		"\3\2\2\2\u00f7\u00f9\5\u0092J\2\u00f8\u00fa\5b\62\2\u00f9\u00f8\3\2\2"+
		"\2\u00f9\u00fa\3\2\2\2\u00fa\31\3\2\2\2\u00fb\u00fc\7\17\2\2\u00fc\u00fd"+
		"\5\u0092J\2\u00fd\u00fe\5d\63\2\u00fe\33\3\2\2\2\u00ff\u0101\7\5\2\2\u0100"+
		"\u00ff\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0103\7\7"+
		"\2\2\u0103\u0105\5\u0092J\2\u0104\u0106\5,\27\2\u0105\u0104\3\2\2\2\u0105"+
		"\u0106\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0108\5\u0082B\2\u0108\u010e"+
		"\7*\2\2\u0109\u010a\5\36\20\2\u010a\u010b\5\u0096L\2\u010b\u010d\3\2\2"+
		"\2\u010c\u0109\3\2\2\2\u010d\u0110\3\2\2\2\u010e\u010c\3\2\2\2\u010e\u010f"+
		"\3\2\2\2\u010f\u0111\3\2\2\2\u0110\u010e\3\2\2\2\u0111\u0112\7+\2\2\u0112"+
		"\35\3\2\2\2\u0113\u0117\5 \21\2\u0114\u0117\5\"\22\2\u0115\u0117\5v<\2"+
		"\u0116\u0113\3\2\2\2\u0116\u0114\3\2\2\2\u0116\u0115\3\2\2\2\u0117\37"+
		"\3\2\2\2\u0118\u0119\7\t\2\2\u0119\u011b\7(\2\2\u011a\u011c\5f\64\2\u011b"+
		"\u011a\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u011e\7)"+
		"\2\2\u011e!\3\2\2\2\u011f\u0121\5l\67\2\u0120\u011f\3\2\2\2\u0120\u0121"+
		"\3\2\2\2\u0121\u0123\3\2\2\2\u0122\u0124\7\34\2\2\u0123\u0122\3\2\2\2"+
		"\u0123\u0124\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0126\5R*\2\u0126#\3\2"+
		"\2\2\u0127\u0128\7\f\2\2\u0128\u0129\7.\2\2\u0129\u012a\5\u0092J\2\u012a"+
		"\u012b\5\u0096L\2\u012b%\3\2\2\2\u012c\u012d\t\4\2\2\u012d\'\3\2\2\2\u012e"+
		"\u012f\7!\2\2\u012f\u0130\5*\26\2\u0130\u0133\7.\2\2\u0131\u0134\58\35"+
		"\2\u0132\u0134\5*\26\2\u0133\u0131\3\2\2\2\u0133\u0132\3\2\2\2\u0134)"+
		"\3\2\2\2\u0135\u0137\5\u0092J\2\u0136\u0138\5,\27\2\u0137\u0136\3\2\2"+
		"\2\u0137\u0138\3\2\2\2\u0138\u014b\3\2\2\2\u0139\u013a\7*\2\2\u013a\u013b"+
		"\7&\2\2\u013b\u013c\5\u0092J\2\u013c\u013d\7\27\2\2\u013d\u013e\7\23\2"+
		"\2\u013e\u0140\5\u0092J\2\u013f\u0141\5,\27\2\u0140\u013f\3\2\2\2\u0140"+
		"\u0141\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0144\7\'\2\2\u0143\u0145\7/"+
		"\2\2\u0144\u0143\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u0146\3\2\2\2\u0146"+
		"\u0147\7\60\2\2\u0147\u0148\5*\26\2\u0148\u0149\7+\2\2\u0149\u014b\3\2"+
		"\2\2\u014a\u0135\3\2\2\2\u014a\u0139\3\2\2\2\u014b+\3\2\2\2\u014c\u014d"+
		"\7;\2\2\u014d\u014e\5.\30\2\u014e\u014f\7<\2\2\u014f-\3\2\2\2\u0150\u0155"+
		"\5\60\31\2\u0151\u0152\7-\2\2\u0152\u0154\5\60\31\2\u0153\u0151\3\2\2"+
		"\2\u0154\u0157\3\2\2\2\u0155\u0153\3\2\2\2\u0155\u0156\3\2\2\2\u0156/"+
		"\3\2\2\2\u0157\u0155\3\2\2\2\u0158\u015a\5\u0092J\2\u0159\u015b\5\62\32"+
		"\2\u015a\u0159\3\2\2\2\u015a\u015b\3\2\2\2\u015b\61\3\2\2\2\u015c\u015d"+
		"\t\5\2\2\u015d\u015e\58\35\2\u015e\63\3\2\2\2\u015f\u0160\7;\2\2\u0160"+
		"\u0161\5\66\34\2\u0161\u0162\7<\2\2\u0162\65\3\2\2\2\u0163\u0168\58\35"+
		"\2\u0164\u0165\7-\2\2\u0165\u0167\58\35\2\u0166\u0164\3\2\2\2\u0167\u016a"+
		"\3\2\2\2\u0168\u0166\3\2\2\2\u0168\u0169\3\2\2\2\u0169\67\3\2\2\2\u016a"+
		"\u0168\3\2\2\2\u016b\u016f\5<\37\2\u016c\u016f\5X-\2\u016d\u016f\5Z.\2"+
		"\u016e\u016b\3\2\2\2\u016e\u016c\3\2\2\2\u016e\u016d\3\2\2\2\u016f9\3"+
		"\2\2\2\u0170\u0172\7*\2\2\u0171\u0173\5N(\2\u0172\u0171\3\2\2\2\u0172"+
		"\u0173\3\2\2\2\u0173\u0174\3\2\2\2\u0174\u0175\7+\2\2\u0175;\3\2\2\2\u0176"+
		"\u0177\b\37\1\2\u0177\u0178\7(\2\2\u0178\u0179\5<\37\2\u0179\u017a\7)"+
		"\2\2\u017a\u017e\3\2\2\2\u017b\u017e\5> \2\u017c\u017e\5:\36\2\u017d\u0176"+
		"\3\2\2\2\u017d\u017b\3\2\2\2\u017d\u017c\3\2\2\2\u017e\u0187\3\2\2\2\u017f"+
		"\u0180\f\7\2\2\u0180\u0181\7E\2\2\u0181\u0186\5<\37\b\u0182\u0183\f\6"+
		"\2\2\u0183\u0184\7C\2\2\u0184\u0186\5<\37\7\u0185\u017f\3\2\2\2\u0185"+
		"\u0182\3\2\2\2\u0186\u0189\3\2\2\2\u0187\u0185\3\2\2\2\u0187\u0188\3\2"+
		"\2\2\u0188=\3\2\2\2\u0189\u0187\3\2\2\2\u018a\u018c\7\23\2\2\u018b\u018a"+
		"\3\2\2\2\u018b\u018c\3\2\2\2\u018c\u018d\3\2\2\2\u018d\u0199\5D#\2\u018e"+
		"\u0190\5D#\2\u018f\u0191\5\64\33\2\u0190\u018f\3\2\2\2\u0190\u0191\3\2"+
		"\2\2\u0191\u0195\3\2\2\2\u0192\u0194\5B\"\2\u0193\u0192\3\2\2\2\u0194"+
		"\u0197\3\2\2\2\u0195\u0193\3\2\2\2\u0195\u0196\3\2\2\2\u0196\u0199\3\2"+
		"\2\2\u0197\u0195\3\2\2\2\u0198\u018b\3\2\2\2\u0198\u018e\3\2\2\2\u0199"+
		"?\3\2\2\2\u019a\u019b\7;\2\2\u019b\u019c\58\35\2\u019c\u019d\7<\2\2\u019d"+
		"A\3\2\2\2\u019e\u019f\7&\2\2\u019f\u01a0\7\'\2\2\u01a0C\3\2\2\2\u01a1"+
		"\u01ae\5H%\2\u01a2\u01ae\5\u0092J\2\u01a3\u01a4\5\u0094K\2\u01a4\u01a5"+
		"\5F$\2\u01a5\u01ae\3\2\2\2\u01a6\u01ae\5J&\2\u01a7\u01ae\5L\'\2\u01a8"+
		"\u01ae\5T+\2\u01a9\u01ae\5\\/\2\u01aa\u01ae\5^\60\2\u01ab\u01ae\5&\24"+
		"\2\u01ac\u01ae\5*\26\2\u01ad\u01a1\3\2\2\2\u01ad\u01a2\3\2\2\2\u01ad\u01a3"+
		"\3\2\2\2\u01ad\u01a6\3\2\2\2\u01ad\u01a7\3\2\2\2\u01ad\u01a8\3\2\2\2\u01ad"+
		"\u01a9\3\2\2\2\u01ad\u01aa\3\2\2\2\u01ad\u01ab\3\2\2\2\u01ad\u01ac\3\2"+
		"\2\2\u01aeE\3\2\2\2\u01af\u01b0\7\30\2\2\u01b0\u01b1\58\35\2\u01b1G\3"+
		"\2\2\2\u01b2\u01b3\7(\2\2\u01b3\u01b4\58\35\2\u01b4\u01b5\7)\2\2\u01b5"+
		"I\3\2\2\2\u01b6\u01b8\5\u0090I\2\u01b7\u01b9\5\64\33\2\u01b8\u01b7\3\2"+
		"\2\2\u01b8\u01b9\3\2\2\2\u01b9K\3\2\2\2\u01ba\u01bc\7*\2\2\u01bb\u01bd"+
		"\5N(\2\u01bc\u01bb\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd\u01be\3\2\2\2\u01be"+
		"\u01bf\5\u0096L\2\u01bf\u01c0\7+\2\2\u01c0M\3\2\2\2\u01c1\u01c2\5P)\2"+
		"\u01c2O\3\2\2\2\u01c3\u01c8\5R*\2\u01c4\u01c5\t\6\2\2\u01c5\u01c7\5R*"+
		"\2\u01c6\u01c4\3\2\2\2\u01c7\u01ca\3\2\2\2\u01c8\u01c6\3\2\2\2\u01c8\u01c9"+
		"\3\2\2\2\u01c9Q\3\2\2\2\u01ca\u01c8\3\2\2\2\u01cb\u01d4\5`\61\2\u01cc"+
		"\u01d4\5d\63\2\u01cd\u01d4\5t;\2\u01ce\u01d4\5v<\2\u01cf\u01d4\5x=\2\u01d0"+
		"\u01d1\5\u0092J\2\u01d1\u01d2\5d\63\2\u01d2\u01d4\3\2\2\2\u01d3\u01cb"+
		"\3\2\2\2\u01d3\u01cc\3\2\2\2\u01d3\u01cd\3\2\2\2\u01d3\u01ce\3\2\2\2\u01d3"+
		"\u01cf\3\2\2\2\u01d3\u01d0\3\2\2\2\u01d4S\3\2\2\2\u01d5\u01d6\7&\2\2\u01d6"+
		"\u01d7\5V,\2\u01d7\u01d8\7\'\2\2\u01d8U\3\2\2\2\u01d9\u01de\58\35\2\u01da"+
		"\u01db\7-\2\2\u01db\u01dd\58\35\2\u01dc\u01da\3\2\2\2\u01dd\u01e0\3\2"+
		"\2\2\u01de\u01dc\3\2\2\2\u01de\u01df\3\2\2\2\u01dfW\3\2\2\2\u01e0\u01de"+
		"\3\2\2\2\u01e1\u01e3\5,\27\2\u01e2\u01e1\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3"+
		"\u01e4\3\2\2\2\u01e4\u01e6\7(\2\2\u01e5\u01e7\5f\64\2\u01e6\u01e5\3\2"+
		"\2\2\u01e6\u01e7\3\2\2\2\u01e7\u01e8\3\2\2\2\u01e8\u01e9\7)\2\2\u01e9"+
		"\u01ea\7$\2\2\u01ea\u01eb\58\35\2\u01ebY\3\2\2\2\u01ec\u01ee\7\36\2\2"+
		"\u01ed\u01ef\5,\27\2\u01ee\u01ed\3\2\2\2\u01ee\u01ef\3\2\2\2\u01ef\u01f0"+
		"\3\2\2\2\u01f0\u01f2\7(\2\2\u01f1\u01f3\5f\64\2\u01f2\u01f1\3\2\2\2\u01f2"+
		"\u01f3\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4\u01f5\7)\2\2\u01f5\u01f6\7$\2"+
		"\2\u01f6\u01f7\58\35\2\u01f7[\3\2\2\2\u01f8\u01f9\7\37\2\2\u01f9\u01fa"+
		"\5\u0090I\2\u01fa]\3\2\2\2\u01fb\u01fc\7 \2\2\u01fc_\3\2\2\2\u01fd\u01ff"+
		"\5\u0092J\2\u01fe\u0200\7/\2\2\u01ff\u01fe\3\2\2\2\u01ff\u0200\3\2\2\2"+
		"\u0200\u0202\3\2\2\2\u0201\u0203\5b\62\2\u0202\u0201\3\2\2\2\u0202\u0203"+
		"\3\2\2\2\u0203a\3\2\2\2\u0204\u0205\7\60\2\2\u0205\u0206\58\35\2\u0206"+
		"c\3\2\2\2\u0207\u0209\5,\27\2\u0208\u0207\3\2\2\2\u0208\u0209\3\2\2\2"+
		"\u0209\u020a\3\2\2\2\u020a\u020c\7(\2\2\u020b\u020d\5f\64\2\u020c\u020b"+
		"\3\2\2\2\u020c\u020d\3\2\2\2\u020d\u020e\3\2\2\2\u020e\u0210\7)\2\2\u020f"+
		"\u0211\5b\62\2\u0210\u020f\3\2\2\2\u0210\u0211\3\2\2\2\u0211e\3\2\2\2"+
		"\u0212\u021c\5h\65\2\u0213\u021a\7-\2\2\u0214\u0217\5n8\2\u0215\u0216"+
		"\7-\2\2\u0216\u0218\5r:\2\u0217\u0215\3\2\2\2\u0217\u0218\3\2\2\2\u0218"+
		"\u021b\3\2\2\2\u0219\u021b\5r:\2\u021a\u0214\3\2\2\2\u021a\u0219\3\2\2"+
		"\2\u021b\u021d\3\2\2\2\u021c\u0213\3\2\2\2\u021c\u021d\3\2\2\2\u021d\u0225"+
		"\3\2\2\2\u021e\u0221\5n8\2\u021f\u0220\7-\2\2\u0220\u0222\5r:\2\u0221"+
		"\u021f\3\2\2\2\u0221\u0222\3\2\2\2\u0222\u0225\3\2\2\2\u0223\u0225\5r"+
		":\2\u0224\u0212\3\2\2\2\u0224\u021e\3\2\2\2\u0224\u0223\3\2\2\2\u0225"+
		"g\3\2\2\2\u0226\u022b\5j\66\2\u0227\u0228\7-\2\2\u0228\u022a\5j\66\2\u0229"+
		"\u0227\3\2\2\2\u022a\u022d\3\2\2\2\u022b\u0229\3\2\2\2\u022b\u022c\3\2"+
		"\2\2\u022ci\3\2\2\2\u022d\u022b\3\2\2\2\u022e\u0230\5l\67\2\u022f\u022e"+
		"\3\2\2\2\u022f\u0230\3\2\2\2\u0230\u0231\3\2\2\2\u0231\u0233\5\u0092J"+
		"\2\u0232\u0234\5b\62\2\u0233\u0232\3\2\2\2\u0233\u0234\3\2\2\2\u0234\u023a"+
		"\3\2\2\2\u0235\u0236\5\u0092J\2\u0236\u0237\7\60\2\2\u0237\u0238\7X\2"+
		"\2\u0238\u023a\3\2\2\2\u0239\u022f\3\2\2\2\u0239\u0235\3\2\2\2\u023ak"+
		"\3\2\2\2\u023b\u023c\t\7\2\2\u023cm\3\2\2\2\u023d\u0242\5p9\2\u023e\u023f"+
		"\7-\2\2\u023f\u0241\5p9\2\u0240\u023e\3\2\2\2\u0241\u0244\3\2\2\2\u0242"+
		"\u0240\3\2\2\2\u0242\u0243\3\2\2\2\u0243o\3\2\2\2\u0244\u0242\3\2\2\2"+
		"\u0245\u0247\5l\67\2\u0246\u0245\3\2\2\2\u0246\u0247\3\2\2\2\u0247\u0248"+
		"\3\2\2\2\u0248\u024a\5\u0092J\2\u0249\u024b\7/\2\2\u024a\u0249\3\2\2\2"+
		"\u024a\u024b\3\2\2\2\u024b\u024d\3\2\2\2\u024c\u024e\5b\62\2\u024d\u024c"+
		"\3\2\2\2\u024d\u024e\3\2\2\2\u024e\u0255\3\2\2\2\u024f\u0250\5\u0092J"+
		"\2\u0250\u0251\7/\2\2\u0251\u0252\7\60\2\2\u0252\u0253\7X\2\2\u0253\u0255"+
		"\3\2\2\2\u0254\u0246\3\2\2\2\u0254\u024f\3\2\2\2\u0255q\3\2\2\2\u0256"+
		"\u0257\7%\2\2\u0257\u0259\5\u0092J\2\u0258\u025a\5b\62\2\u0259\u0258\3"+
		"\2\2\2\u0259\u025a\3\2\2\2\u025as\3\2\2\2\u025b\u025d\7\36\2\2\u025c\u025e"+
		"\5,\27\2\u025d\u025c\3\2\2\2\u025d\u025e\3\2\2\2\u025e\u025f\3\2\2\2\u025f"+
		"\u0261\7(\2\2\u0260\u0262\5f\64\2\u0261\u0260\3\2\2\2\u0261\u0262\3\2"+
		"\2\2\u0262\u0263\3\2\2\2\u0263\u0265\7)\2\2\u0264\u0266\5b\62\2\u0265"+
		"\u0264\3\2\2\2\u0265\u0266\3\2\2\2\u0266u\3\2\2\2\u0267\u0268\7&\2\2\u0268"+
		"\u0269\5\u0092J\2\u0269\u026a\7\60\2\2\u026a\u026b\t\b\2\2\u026b\u026c"+
		"\7\'\2\2\u026c\u026d\5b\62\2\u026dw\3\2\2\2\u026e\u0270\5\u0092J\2\u026f"+
		"\u0271\7/\2\2\u0270\u026f\3\2\2\2\u0270\u0271\3\2\2\2\u0271\u0272\3\2"+
		"\2\2\u0272\u0273\5d\63\2\u0273y\3\2\2\2\u0274\u0275\5&\24\2\u0275{\3\2"+
		"\2\2\u0276\u0277\7\22\2\2\u0277\u0279\5\u0092J\2\u0278\u027a\5,\27\2\u0279"+
		"\u0278\3\2\2\2\u0279\u027a\3\2\2\2\u027a\u027c\3\2\2\2\u027b\u027d\5~"+
		"@\2\u027c\u027b\3\2\2\2\u027c\u027d\3\2\2\2\u027d\u027e\3\2\2\2\u027e"+
		"\u0284\7*\2\2\u027f\u0280\5R*\2\u0280\u0281\5\u0096L\2\u0281\u0283\3\2"+
		"\2\2\u0282\u027f\3\2\2\2\u0283\u0286\3\2\2\2\u0284\u0282\3\2\2\2\u0284"+
		"\u0285\3\2\2\2\u0285\u0287\3\2\2\2\u0286\u0284\3\2\2\2\u0287\u0288\7+"+
		"\2\2\u0288}\3\2\2\2\u0289\u028a\7\r\2\2\u028a\u028b\5\u0080A\2\u028b\177"+
		"\3\2\2\2\u028c\u0291\5J&\2\u028d\u028e\7-\2\2\u028e\u0290\5J&\2\u028f"+
		"\u028d\3\2\2\2\u0290\u0293\3\2\2\2\u0291\u028f\3\2\2\2\u0291\u0292\3\2"+
		"\2\2\u0292\u0081\3\2\2\2\u0293\u0291\3\2\2\2\u0294\u0296\5~@\2\u0295\u0294"+
		"\3\2\2\2\u0295\u0296\3\2\2\2\u0296\u0298\3\2\2\2\u0297\u0299\5\u0084C"+
		"\2\u0298\u0297\3\2\2\2\u0298\u0299\3\2\2\2\u0299\u0083\3\2\2\2\u029a\u029b"+
		"\7\20\2\2\u029b\u029c\5\u0080A\2\u029c\u0085\3\2\2\2\u029d\u029f\7\b\2"+
		"\2\u029e\u029d\3\2\2\2\u029e\u029f\3\2\2\2\u029f\u02a0\3\2\2\2\u02a0\u02a1"+
		"\7\13\2\2\u02a1\u02a2\5\u0092J\2\u02a2\u02a4\7*\2\2\u02a3\u02a5\5\u0088"+
		"E\2\u02a4\u02a3\3\2\2\2\u02a4\u02a5\3\2\2\2\u02a5\u02a6\3\2\2\2\u02a6"+
		"\u02a7\7+\2\2\u02a7\u0087\3\2\2\2\u02a8\u02aa\5\u008aF\2\u02a9\u02ab\7"+
		"-\2\2\u02aa\u02a9\3\2\2\2\u02aa\u02ab\3\2\2\2\u02ab\u0089\3\2\2\2\u02ac"+
		"\u02b1\5\u008cG\2\u02ad\u02ae\7-\2\2\u02ae\u02b0\5\u008cG\2\u02af\u02ad"+
		"\3\2\2\2\u02b0\u02b3\3\2\2\2\u02b1\u02af\3\2\2\2\u02b1\u02b2\3\2\2\2\u02b2"+
		"\u008b\3\2\2\2\u02b3\u02b1\3\2\2\2\u02b4\u02b7\5\u0092J\2\u02b5\u02b6"+
		"\7.\2\2\u02b6\u02b8\5\u008eH\2\u02b7\u02b5\3\2\2\2\u02b7\u02b8\3\2\2\2"+
		"\u02b8\u008d\3\2\2\2\u02b9\u02ba\5z>\2\u02ba\u008f\3\2\2\2\u02bb\u02c0"+
		"\5\u0092J\2\u02bc\u02bd\7\61\2\2\u02bd\u02bf\5\u0092J\2\u02be\u02bc\3"+
		"\2\2\2\u02bf\u02c2\3\2\2\2\u02c0\u02be\3\2\2\2\u02c0\u02c1\3\2\2\2\u02c1"+
		"\u0091\3\2\2\2\u02c2\u02c0\3\2\2\2\u02c3\u02c6\5\u0094K\2\u02c4\u02c6"+
		"\7X\2\2\u02c5\u02c3\3\2\2\2\u02c5\u02c4\3\2\2\2\u02c6\u0093\3\2\2\2\u02c7"+
		"\u02c8\t\t\2\2\u02c8\u0095\3\2\2\2\u02c9\u02ca\t\n\2\2\u02ca\u0097\3\2"+
		"\2\2W\u009b\u00a5\u00aa\u00b8\u00c4\u00c7\u00ce\u00d7\u00dc\u00de\u00e3"+
		"\u00ea\u00f4\u00f9\u0100\u0105\u010e\u0116\u011b\u0120\u0123\u0133\u0137"+
		"\u0140\u0144\u014a\u0155\u015a\u0168\u016e\u0172\u017d\u0185\u0187\u018b"+
		"\u0190\u0195\u0198\u01ad\u01b8\u01bc\u01c8\u01d3\u01de\u01e2\u01e6\u01ee"+
		"\u01f2\u01ff\u0202\u0208\u020c\u0210\u0217\u021a\u021c\u0221\u0224\u022b"+
		"\u022f\u0233\u0239\u0242\u0246\u024a\u024d\u0254\u0259\u025d\u0261\u0265"+
		"\u0270\u0279\u027c\u0284\u0291\u0295\u0298\u029e\u02a4\u02aa\u02b1\u02b7"+
		"\u02c0\u02c5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}