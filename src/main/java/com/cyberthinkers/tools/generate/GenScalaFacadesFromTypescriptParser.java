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
		Declare=8, Enum=9, Export=10, Extends=11, From=12, Function=13, Global=14, 
		Implements=15, Import=16, Interface=17, Keyof=18, Let=19, Module=20, Var=21, 
		In=22, Is=23, Public=24, Protected=25, Private=26, Static=27, Readonly=28, 
		New=29, Typeof=30, This=31, Type=32, Number=33, String=34, ThickArrow=35, 
		DotDotDot=36, OpenBracket=37, CloseBracket=38, OpenParen=39, CloseParen=40, 
		OpenBrace=41, CloseBrace=42, SemiColon=43, Comma=44, Assign=45, QuestionMark=46, 
		Colon=47, Dot=48, PlusPlus=49, MinusMinus=50, Plus=51, Minus=52, BitNot=53, 
		Not=54, Multiply=55, Divide=56, Modulus=57, LessThan=58, MoreThan=59, 
		LessThanEquals=60, GreaterThanEquals=61, Equals=62, NotEquals=63, IdentityEquals=64, 
		IdentityNotEquals=65, BitAnd=66, BitXOr=67, BitOr=68, And=69, Or=70, MultiplyAssign=71, 
		DivideAssign=72, ModulusAssign=73, PlusAssign=74, MinusAssign=75, LeftShiftArithmeticAssign=76, 
		RightShiftArithmeticAssign=77, RightShiftLogicalAssign=78, BitAndAssign=79, 
		BitXorAssign=80, BitOrAssign=81, BooleanLiteral=82, DecimalLiteral=83, 
		HexIntegerLiteral=84, OctalIntegerLiteral=85, Identifier=86, StringLiteral=87, 
		WS=88, Documentation=89, Comment=90, LineComment=91;
	public static final int
		RULE_typescriptAmbientDeclarations = 0, RULE_declarationScriptElement = 1, 
		RULE_exportDef = 2, RULE_importDef = 3, RULE_importName = 4, RULE_ambientModuleOrNamespace = 5, 
		RULE_ambientModuleName = 6, RULE_ambientItem = 7, RULE_ambientBracesItem = 8, 
		RULE_ambientStatement = 9, RULE_variableDeclaration = 10, RULE_variableList = 11, 
		RULE_variableName = 12, RULE_functionDeclaration = 13, RULE_classDeclaration = 14, 
		RULE_className = 15, RULE_ambientClassBodyElement = 16, RULE_ambientConstructorDeclaration = 17, 
		RULE_ambientPropertyMemberDeclaration = 18, RULE_exportIdentifier = 19, 
		RULE_numericLiteral = 20, RULE_typeDeclaration = 21, RULE_typeDef = 22, 
		RULE_typeParameters = 23, RULE_typeParameterList = 24, RULE_typeParameter = 25, 
		RULE_constraint = 26, RULE_typeArguments = 27, RULE_typeArgumentList = 28, 
		RULE_type = 29, RULE_unnamedInterface = 30, RULE_unionOrIntersectionOrPrimaryType = 31, 
		RULE_primaryOrArray = 32, RULE_nestedType = 33, RULE_arrayDim = 34, RULE_primaryType = 35, 
		RULE_typeGuard = 36, RULE_parenthesizedType = 37, RULE_typeReference = 38, 
		RULE_objectType = 39, RULE_typeBody = 40, RULE_typeMemberList = 41, RULE_typeMember = 42, 
		RULE_tupleType = 43, RULE_tupleTypeElements = 44, RULE_functionType = 45, 
		RULE_constructorType = 46, RULE_typeQuery = 47, RULE_thisType = 48, RULE_propertySignature = 49, 
		RULE_propertySignatureName = 50, RULE_typeAnnotation = 51, RULE_callSignature = 52, 
		RULE_parameterList = 53, RULE_requiredParameterList = 54, RULE_requiredParameter = 55, 
		RULE_accessibilityModifier = 56, RULE_optionalParameterList = 57, RULE_optionalParameter = 58, 
		RULE_restParameter = 59, RULE_constructSignature = 60, RULE_indexSignature = 61, 
		RULE_methodSignature = 62, RULE_constExpression = 63, RULE_interfaceDeclaration = 64, 
		RULE_interfaceName = 65, RULE_extendsClause = 66, RULE_classOrInterfaceTypeList = 67, 
		RULE_classHeritage = 68, RULE_implementsClause = 69, RULE_enumDeclaration = 70, 
		RULE_enumName = 71, RULE_enumBody = 72, RULE_enumMemberList = 73, RULE_enumMember = 74, 
		RULE_enumValue = 75, RULE_identifierPath = 76, RULE_bindingIdentifier = 77, 
		RULE_identifier = 78, RULE_lineEnd = 79;
	public static final String[] ruleNames = {
		"typescriptAmbientDeclarations", "declarationScriptElement", "exportDef", 
		"importDef", "importName", "ambientModuleOrNamespace", "ambientModuleName", 
		"ambientItem", "ambientBracesItem", "ambientStatement", "variableDeclaration", 
		"variableList", "variableName", "functionDeclaration", "classDeclaration", 
		"className", "ambientClassBodyElement", "ambientConstructorDeclaration", 
		"ambientPropertyMemberDeclaration", "exportIdentifier", "numericLiteral", 
		"typeDeclaration", "typeDef", "typeParameters", "typeParameterList", "typeParameter", 
		"constraint", "typeArguments", "typeArgumentList", "type", "unnamedInterface", 
		"unionOrIntersectionOrPrimaryType", "primaryOrArray", "nestedType", "arrayDim", 
		"primaryType", "typeGuard", "parenthesizedType", "typeReference", "objectType", 
		"typeBody", "typeMemberList", "typeMember", "tupleType", "tupleTypeElements", 
		"functionType", "constructorType", "typeQuery", "thisType", "propertySignature", 
		"propertySignatureName", "typeAnnotation", "callSignature", "parameterList", 
		"requiredParameterList", "requiredParameter", "accessibilityModifier", 
		"optionalParameterList", "optionalParameter", "restParameter", "constructSignature", 
		"indexSignature", "methodSignature", "constExpression", "interfaceDeclaration", 
		"interfaceName", "extendsClause", "classOrInterfaceTypeList", "classHeritage", 
		"implementsClause", "enumDeclaration", "enumName", "enumBody", "enumMemberList", 
		"enumMember", "enumValue", "identifierPath", "bindingIdentifier", "identifier", 
		"lineEnd"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'namespace'", null, "'abstract'", "'as'", "'class'", "'const'", 
		"'constructor'", "'declare'", "'enum'", "'export'", "'extends'", "'from'", 
		"'function'", "'global'", "'implements'", "'import'", "'interface'", "'keyof'", 
		"'let'", "'module'", "'var'", "'in'", "'is'", "'public'", "'protected'", 
		"'private'", "'static'", "'readonly'", "'new'", "'typeof'", "'this'", 
		"'type'", "'number'", "'string'", "'=>'", "'...'", "'['", "']'", "'('", 
		"')'", "'{'", "'}'", "';'", "','", "'='", "'?'", "':'", "'.'", "'++'", 
		"'--'", "'+'", "'-'", "'~'", "'!'", "'*'", "'/'", "'%'", "'<'", "'>'", 
		"'<='", "'>='", "'=='", "'!='", "'==='", "'!=='", "'&'", "'^'", "'|'", 
		"'&&'", "'||'", "'*='", "'/='", "'%='", "'+='", "'-='", "'<<='", "'>>='", 
		"'>>>='", "'&='", "'^='", "'|='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "LineTerminator", "Abstract", "As", "Class", "Const", "Constructor", 
		"Declare", "Enum", "Export", "Extends", "From", "Function", "Global", 
		"Implements", "Import", "Interface", "Keyof", "Let", "Module", "Var", 
		"In", "Is", "Public", "Protected", "Private", "Static", "Readonly", "New", 
		"Typeof", "This", "Type", "Number", "String", "ThickArrow", "DotDotDot", 
		"OpenBracket", "CloseBracket", "OpenParen", "CloseParen", "OpenBrace", 
		"CloseBrace", "SemiColon", "Comma", "Assign", "QuestionMark", "Colon", 
		"Dot", "PlusPlus", "MinusMinus", "Plus", "Minus", "BitNot", "Not", "Multiply", 
		"Divide", "Modulus", "LessThan", "MoreThan", "LessThanEquals", "GreaterThanEquals", 
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
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Declare) | (1L << Export) | (1L << Import) | (1L << Interface))) != 0)) {
				{
				{
				setState(160);
				declarationScriptElement();
				}
				}
				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(166);
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
			setState(184);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(168);
				match(Declare);
				setState(173);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(169);
					ambientModuleOrNamespace();
					}
					break;
				case 2:
					{
					{
					setState(170);
					ambientStatement();
					setState(171);
					lineEnd();
					}
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(175);
				match(Declare);
				setState(176);
				match(Global);
				setState(177);
				match(OpenBrace);
				setState(178);
				ambientModuleOrNamespace();
				setState(179);
				match(CloseBrace);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(181);
				interfaceDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(182);
				exportDef();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(183);
				importDef();
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
			setState(198);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(186);
				match(Export);
				setState(187);
				match(Declare);
				setState(188);
				ambientStatement();
				setState(189);
				lineEnd();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(191);
				match(Export);
				setState(192);
				match(As);
				setState(193);
				match(T__0);
				setState(194);
				bindingIdentifier();
				setState(195);
				lineEnd();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(197);
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
			setState(200);
			match(Import);
			setState(201);
			importName();
			setState(202);
			match(As);
			setState(203);
			bindingIdentifier();
			setState(204);
			match(From);
			setState(205);
			bindingIdentifier();
			setState(206);
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
			setState(210);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case As:
			case From:
			case Global:
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
				setState(208);
				bindingIdentifier();
				}
				break;
			case Multiply:
				enterOuterAlt(_localctx, 2);
				{
				setState(209);
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
		public AmbientModuleNameContext ambientModuleName() {
			return getRuleContext(AmbientModuleNameContext.class,0);
		}
		public List<AmbientItemContext> ambientItem() {
			return getRuleContexts(AmbientItemContext.class);
		}
		public AmbientItemContext ambientItem(int i) {
			return getRuleContext(AmbientItemContext.class,i);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(212);
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
			setState(215);
			ambientModuleName();
			setState(216);
			match(OpenBrace);
			setState(220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << Abstract) | (1L << As) | (1L << Class) | (1L << Const) | (1L << Enum) | (1L << Export) | (1L << From) | (1L << Function) | (1L << Global) | (1L << Import) | (1L << Interface) | (1L << Let) | (1L << Module) | (1L << Var) | (1L << In) | (1L << Is) | (1L << Typeof) | (1L << Type) | (1L << Number) | (1L << String))) != 0) || _la==Identifier || _la==StringLiteral) {
				{
				{
				setState(217);
				ambientItem();
				}
				}
				setState(222);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(223);
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

	public static class AmbientModuleNameContext extends ParserRuleContext {
		public IdentifierPathContext identifierPath() {
			return getRuleContext(IdentifierPathContext.class,0);
		}
		public AmbientModuleNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ambientModuleName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).enterAmbientModuleName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).exitAmbientModuleName(this);
		}
	}

	public final AmbientModuleNameContext ambientModuleName() throws RecognitionException {
		AmbientModuleNameContext _localctx = new AmbientModuleNameContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_ambientModuleName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
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
		enterRule(_localctx, 14, RULE_ambientItem);
		int _la;
		try {
			setState(232);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(227);
				ambientBracesItem();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(228);
				ambientStatement();
				setState(230);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LineTerminator) | (1L << SemiColon) | (1L << Comma))) != 0)) {
					{
					setState(229);
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
		enterRule(_localctx, 16, RULE_ambientBracesItem);
		try {
			setState(237);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Interface:
				enterOuterAlt(_localctx, 1);
				{
				setState(234);
				interfaceDeclaration();
				}
				break;
			case Abstract:
			case Class:
				enterOuterAlt(_localctx, 2);
				{
				setState(235);
				classDeclaration();
				}
				break;
			case T__0:
			case As:
			case From:
			case Global:
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
				enterOuterAlt(_localctx, 3);
				{
				setState(236);
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
		enterRule(_localctx, 18, RULE_ambientStatement);
		try {
			setState(244);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(239);
				variableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(240);
				typeDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(241);
				functionDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(242);
				enumDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(243);
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
		enterRule(_localctx, 20, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Let) | (1L << Var))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(247);
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
		enterRule(_localctx, 22, RULE_variableList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			variableName();
			setState(254);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(250);
					match(Comma);
					setState(251);
					variableName();
					}
					} 
				}
				setState(256);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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
		enterRule(_localctx, 24, RULE_variableName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			bindingIdentifier();
			setState(259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(258);
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
		enterRule(_localctx, 26, RULE_functionDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			match(Function);
			setState(262);
			bindingIdentifier();
			setState(263);
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
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
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
		enterRule(_localctx, 28, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Abstract) {
				{
				setState(265);
				match(Abstract);
				}
			}

			setState(268);
			match(Class);
			setState(269);
			className();
			setState(270);
			match(OpenBrace);
			setState(276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << As) | (1L << Constructor) | (1L << From) | (1L << Global) | (1L << Import) | (1L << Module) | (1L << In) | (1L << Is) | (1L << Public) | (1L << Protected) | (1L << Private) | (1L << Static) | (1L << New) | (1L << Typeof) | (1L << Type) | (1L << Number) | (1L << String) | (1L << OpenBracket) | (1L << OpenParen) | (1L << LessThan))) != 0) || _la==Identifier || _la==StringLiteral) {
				{
				{
				setState(271);
				ambientClassBodyElement();
				setState(272);
				lineEnd();
				}
				}
				setState(278);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(279);
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

	public static class ClassNameContext extends ParserRuleContext {
		public BindingIdentifierContext bindingIdentifier() {
			return getRuleContext(BindingIdentifierContext.class,0);
		}
		public ClassHeritageContext classHeritage() {
			return getRuleContext(ClassHeritageContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public ClassNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_className; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).enterClassName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).exitClassName(this);
		}
	}

	public final ClassNameContext className() throws RecognitionException {
		ClassNameContext _localctx = new ClassNameContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_className);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			bindingIdentifier();
			setState(283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LessThan) {
				{
				setState(282);
				typeParameters();
				}
			}

			setState(285);
			classHeritage();
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
		enterRule(_localctx, 32, RULE_ambientClassBodyElement);
		try {
			setState(290);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(287);
				ambientConstructorDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(288);
				ambientPropertyMemberDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(289);
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
		enterRule(_localctx, 34, RULE_ambientConstructorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			match(Constructor);
			setState(293);
			match(OpenParen);
			setState(295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << As) | (1L << From) | (1L << Global) | (1L << Import) | (1L << Module) | (1L << In) | (1L << Is) | (1L << Public) | (1L << Protected) | (1L << Private) | (1L << Typeof) | (1L << Type) | (1L << Number) | (1L << String) | (1L << DotDotDot))) != 0) || _la==Identifier || _la==StringLiteral) {
				{
				setState(294);
				parameterList();
				}
			}

			setState(297);
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
		public AccessibilityModifierContext accessibilityModifier() {
			return getRuleContext(AccessibilityModifierContext.class,0);
		}
		public TypeMemberContext typeMember() {
			return getRuleContext(TypeMemberContext.class,0);
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
		enterRule(_localctx, 36, RULE_ambientPropertyMemberDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			accessibilityModifier();
			setState(301);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Static) {
				{
				setState(300);
				match(Static);
				}
			}

			setState(303);
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
		enterRule(_localctx, 38, RULE_exportIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			match(Export);
			setState(306);
			match(Assign);
			setState(307);
			bindingIdentifier();
			setState(308);
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
		enterRule(_localctx, 40, RULE_numericLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			_la = _input.LA(1);
			if ( !(((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & ((1L << (DecimalLiteral - 83)) | (1L << (HexIntegerLiteral - 83)) | (1L << (OctalIntegerLiteral - 83)))) != 0)) ) {
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
		enterRule(_localctx, 42, RULE_typeDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			match(Type);
			setState(313);
			typeDef();
			setState(314);
			match(Assign);
			setState(317);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(315);
				type();
				}
				break;
			case 2:
				{
				setState(316);
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
		enterRule(_localctx, 44, RULE_typeDef);
		int _la;
		try {
			setState(340);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case As:
			case From:
			case Global:
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
				setState(319);
				bindingIdentifier();
				setState(321);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(320);
					typeParameters();
					}
					break;
				}
				}
				break;
			case OpenBrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(323);
				match(OpenBrace);
				setState(324);
				match(OpenBracket);
				setState(325);
				bindingIdentifier();
				setState(326);
				match(In);
				setState(327);
				match(Keyof);
				setState(328);
				bindingIdentifier();
				setState(330);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LessThan) {
					{
					setState(329);
					typeParameters();
					}
				}

				setState(332);
				match(CloseBracket);
				setState(334);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==QuestionMark) {
					{
					setState(333);
					match(QuestionMark);
					}
				}

				setState(336);
				match(Colon);
				setState(337);
				typeDef();
				setState(338);
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
		enterRule(_localctx, 46, RULE_typeParameters);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			match(LessThan);
			setState(343);
			typeParameterList();
			setState(344);
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
		enterRule(_localctx, 48, RULE_typeParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			typeParameter();
			setState(351);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(347);
				match(Comma);
				setState(348);
				typeParameter();
				}
				}
				setState(353);
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
		enterRule(_localctx, 50, RULE_typeParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			bindingIdentifier();
			setState(356);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Extends || _la==In) {
				{
				setState(355);
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
		enterRule(_localctx, 52, RULE_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			_la = _input.LA(1);
			if ( !(_la==Extends || _la==In) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(359);
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
		enterRule(_localctx, 54, RULE_typeArguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			match(LessThan);
			setState(362);
			typeArgumentList();
			setState(363);
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
		enterRule(_localctx, 56, RULE_typeArgumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
			type();
			setState(370);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(366);
				match(Comma);
				setState(367);
				type();
				}
				}
				setState(372);
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
		enterRule(_localctx, 58, RULE_type);
		try {
			setState(376);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(373);
				unionOrIntersectionOrPrimaryType(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(374);
				functionType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(375);
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
		enterRule(_localctx, 60, RULE_unnamedInterface);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
			match(OpenBrace);
			setState(380);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << As) | (1L << From) | (1L << Global) | (1L << Import) | (1L << Module) | (1L << In) | (1L << Is) | (1L << New) | (1L << Typeof) | (1L << Type) | (1L << Number) | (1L << String) | (1L << OpenBracket) | (1L << OpenParen) | (1L << LessThan))) != 0) || _la==Identifier || _la==StringLiteral) {
				{
				setState(379);
				typeBody();
				}
			}

			setState(382);
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
		int _startState = 62;
		enterRecursionRule(_localctx, 62, RULE_unionOrIntersectionOrPrimaryType, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(385);
				match(OpenParen);
				setState(386);
				unionOrIntersectionOrPrimaryType(0);
				setState(387);
				match(CloseParen);
				}
				break;
			case 2:
				{
				setState(389);
				primaryOrArray();
				}
				break;
			case 3:
				{
				setState(390);
				unnamedInterface();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(401);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(399);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
					case 1:
						{
						_localctx = new UnionOrIntersectionOrPrimaryTypeContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_unionOrIntersectionOrPrimaryType);
						setState(393);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(394);
						match(BitOr);
						setState(395);
						unionOrIntersectionOrPrimaryType(6);
						}
						break;
					case 2:
						{
						_localctx = new UnionOrIntersectionOrPrimaryTypeContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_unionOrIntersectionOrPrimaryType);
						setState(396);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(397);
						match(BitAnd);
						setState(398);
						unionOrIntersectionOrPrimaryType(5);
						}
						break;
					}
					} 
				}
				setState(403);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
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
		enterRule(_localctx, 64, RULE_primaryOrArray);
		int _la;
		try {
			int _alt;
			setState(418);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(405);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Keyof) {
					{
					setState(404);
					match(Keyof);
					}
				}

				setState(407);
				primaryType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(408);
				primaryType();
				setState(410);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
				case 1:
					{
					setState(409);
					typeArguments();
					}
					break;
				}
				setState(415);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(412);
						arrayDim();
						}
						} 
					}
					setState(417);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
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
		enterRule(_localctx, 66, RULE_nestedType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(420);
			match(LessThan);
			setState(421);
			type();
			setState(422);
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
		enterRule(_localctx, 68, RULE_arrayDim);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(424);
			match(OpenBracket);
			setState(425);
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
		enterRule(_localctx, 70, RULE_primaryType);
		try {
			setState(439);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(427);
				parenthesizedType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(428);
				bindingIdentifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(429);
				identifier();
				setState(430);
				typeGuard();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(432);
				typeReference();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(433);
				objectType();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(434);
				tupleType();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(435);
				typeQuery();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(436);
				thisType();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(437);
				numericLiteral();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(438);
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
		enterRule(_localctx, 72, RULE_typeGuard);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(441);
			match(Is);
			setState(442);
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
		enterRule(_localctx, 74, RULE_parenthesizedType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(444);
			match(OpenParen);
			setState(445);
			type();
			setState(446);
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
		enterRule(_localctx, 76, RULE_typeReference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(448);
			identifierPath();
			setState(450);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(449);
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
		enterRule(_localctx, 78, RULE_objectType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(452);
			match(OpenBrace);
			setState(454);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << As) | (1L << From) | (1L << Global) | (1L << Import) | (1L << Module) | (1L << In) | (1L << Is) | (1L << New) | (1L << Typeof) | (1L << Type) | (1L << Number) | (1L << String) | (1L << OpenBracket) | (1L << OpenParen) | (1L << LessThan))) != 0) || _la==Identifier || _la==StringLiteral) {
				{
				setState(453);
				typeBody();
				}
			}

			setState(456);
			lineEnd();
			setState(457);
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
		enterRule(_localctx, 80, RULE_typeBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(459);
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
		enterRule(_localctx, 82, RULE_typeMemberList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(461);
			typeMember();
			setState(466);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(462);
					_la = _input.LA(1);
					if ( !(_la==SemiColon || _la==Comma) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(463);
					typeMember();
					}
					} 
				}
				setState(468);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
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
		enterRule(_localctx, 84, RULE_typeMember);
		try {
			setState(477);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(469);
				propertySignature();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(470);
				callSignature();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(471);
				constructSignature();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(472);
				indexSignature();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(473);
				methodSignature();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(474);
				bindingIdentifier();
				setState(475);
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
		enterRule(_localctx, 86, RULE_tupleType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(479);
			match(OpenBracket);
			setState(480);
			tupleTypeElements();
			setState(481);
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
		enterRule(_localctx, 88, RULE_tupleTypeElements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(483);
			type();
			setState(488);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(484);
				match(Comma);
				setState(485);
				type();
				}
				}
				setState(490);
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
		enterRule(_localctx, 90, RULE_functionType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
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
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << As) | (1L << From) | (1L << Global) | (1L << Import) | (1L << Module) | (1L << In) | (1L << Is) | (1L << Public) | (1L << Protected) | (1L << Private) | (1L << Typeof) | (1L << Type) | (1L << Number) | (1L << String) | (1L << DotDotDot))) != 0) || _la==Identifier || _la==StringLiteral) {
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
		enterRule(_localctx, 92, RULE_constructorType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(502);
			match(New);
			setState(504);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LessThan) {
				{
				setState(503);
				typeParameters();
				}
			}

			setState(506);
			match(OpenParen);
			setState(508);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << As) | (1L << From) | (1L << Global) | (1L << Import) | (1L << Module) | (1L << In) | (1L << Is) | (1L << Public) | (1L << Protected) | (1L << Private) | (1L << Typeof) | (1L << Type) | (1L << Number) | (1L << String) | (1L << DotDotDot))) != 0) || _la==Identifier || _la==StringLiteral) {
				{
				setState(507);
				parameterList();
				}
			}

			setState(510);
			match(CloseParen);
			setState(511);
			match(ThickArrow);
			setState(512);
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
		enterRule(_localctx, 94, RULE_typeQuery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(514);
			match(Typeof);
			setState(515);
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
		enterRule(_localctx, 96, RULE_thisType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(517);
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
		public PropertySignatureNameContext propertySignatureName() {
			return getRuleContext(PropertySignatureNameContext.class,0);
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
		enterRule(_localctx, 98, RULE_propertySignature);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(519);
			propertySignatureName();
			setState(521);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==QuestionMark) {
				{
				setState(520);
				match(QuestionMark);
				}
			}

			setState(524);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(523);
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

	public static class PropertySignatureNameContext extends ParserRuleContext {
		public BindingIdentifierContext bindingIdentifier() {
			return getRuleContext(BindingIdentifierContext.class,0);
		}
		public PropertySignatureNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertySignatureName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).enterPropertySignatureName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).exitPropertySignatureName(this);
		}
	}

	public final PropertySignatureNameContext propertySignatureName() throws RecognitionException {
		PropertySignatureNameContext _localctx = new PropertySignatureNameContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_propertySignatureName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(526);
			bindingIdentifier();
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
		enterRule(_localctx, 102, RULE_typeAnnotation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(528);
			match(Colon);
			setState(529);
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
		enterRule(_localctx, 104, RULE_callSignature);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(532);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LessThan) {
				{
				setState(531);
				typeParameters();
				}
			}

			setState(534);
			match(OpenParen);
			setState(536);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << As) | (1L << From) | (1L << Global) | (1L << Import) | (1L << Module) | (1L << In) | (1L << Is) | (1L << Public) | (1L << Protected) | (1L << Private) | (1L << Typeof) | (1L << Type) | (1L << Number) | (1L << String) | (1L << DotDotDot))) != 0) || _la==Identifier || _la==StringLiteral) {
				{
				setState(535);
				parameterList();
				}
			}

			setState(538);
			match(CloseParen);
			setState(540);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(539);
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
		enterRule(_localctx, 106, RULE_parameterList);
		int _la;
		try {
			setState(560);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(542);
				requiredParameterList();
				setState(552);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(543);
					match(Comma);
					{
					setState(550);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__0:
					case As:
					case From:
					case Global:
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
						setState(544);
						optionalParameterList();
						setState(547);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==Comma) {
							{
							setState(545);
							match(Comma);
							setState(546);
							restParameter();
							}
						}

						}
						break;
					case DotDotDot:
						{
						setState(549);
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
				setState(554);
				optionalParameterList();
				setState(557);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(555);
					match(Comma);
					setState(556);
					restParameter();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(559);
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
		enterRule(_localctx, 108, RULE_requiredParameterList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(562);
			requiredParameter();
			setState(567);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(563);
					match(Comma);
					setState(564);
					requiredParameter();
					}
					} 
				}
				setState(569);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
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
		public AccessibilityModifierContext accessibilityModifier() {
			return getRuleContext(AccessibilityModifierContext.class,0);
		}
		public BindingIdentifierContext bindingIdentifier() {
			return getRuleContext(BindingIdentifierContext.class,0);
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
		enterRule(_localctx, 110, RULE_requiredParameter);
		int _la;
		try {
			setState(579);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(570);
				accessibilityModifier();
				setState(571);
				bindingIdentifier();
				setState(573);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(572);
					typeAnnotation();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(575);
				bindingIdentifier();
				setState(576);
				match(Colon);
				setState(577);
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
	 
		public AccessibilityModifierContext() { }
		public void copyFrom(AccessibilityModifierContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PrivateModifierContext extends AccessibilityModifierContext {
		public PrivateModifierContext(AccessibilityModifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).enterPrivateModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).exitPrivateModifier(this);
		}
	}
	public static class PublicModifierContext extends AccessibilityModifierContext {
		public PublicModifierContext(AccessibilityModifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).enterPublicModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).exitPublicModifier(this);
		}
	}
	public static class ProtectedModifierContext extends AccessibilityModifierContext {
		public ProtectedModifierContext(AccessibilityModifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).enterProtectedModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).exitProtectedModifier(this);
		}
	}

	public final AccessibilityModifierContext accessibilityModifier() throws RecognitionException {
		AccessibilityModifierContext _localctx = new AccessibilityModifierContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_accessibilityModifier);
		try {
			setState(585);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Public:
				_localctx = new PublicModifierContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(581);
				match(Public);
				}
				break;
			case Private:
				_localctx = new PrivateModifierContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(582);
				match(Private);
				}
				break;
			case Protected:
				_localctx = new ProtectedModifierContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(583);
				match(Protected);
				}
				break;
			case T__0:
			case As:
			case From:
			case Global:
			case Import:
			case Module:
			case In:
			case Is:
			case Static:
			case New:
			case Typeof:
			case Type:
			case Number:
			case String:
			case OpenBracket:
			case OpenParen:
			case LessThan:
			case Identifier:
			case StringLiteral:
				_localctx = new PublicModifierContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
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
		enterRule(_localctx, 114, RULE_optionalParameterList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(587);
			optionalParameter();
			setState(592);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(588);
					match(Comma);
					setState(589);
					optionalParameter();
					}
					} 
				}
				setState(594);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
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
		public AccessibilityModifierContext accessibilityModifier() {
			return getRuleContext(AccessibilityModifierContext.class,0);
		}
		public BindingIdentifierContext bindingIdentifier() {
			return getRuleContext(BindingIdentifierContext.class,0);
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
		enterRule(_localctx, 116, RULE_optionalParameter);
		int _la;
		try {
			setState(608);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(595);
				accessibilityModifier();
				setState(596);
				bindingIdentifier();
				setState(598);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==QuestionMark) {
					{
					setState(597);
					match(QuestionMark);
					}
				}

				setState(601);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(600);
					typeAnnotation();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(603);
				bindingIdentifier();
				setState(604);
				match(QuestionMark);
				setState(605);
				match(Colon);
				setState(606);
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
		enterRule(_localctx, 118, RULE_restParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(610);
			match(DotDotDot);
			setState(611);
			bindingIdentifier();
			setState(613);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(612);
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
		enterRule(_localctx, 120, RULE_constructSignature);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(615);
			match(New);
			setState(617);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LessThan) {
				{
				setState(616);
				typeParameters();
				}
			}

			setState(619);
			match(OpenParen);
			setState(621);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << As) | (1L << From) | (1L << Global) | (1L << Import) | (1L << Module) | (1L << In) | (1L << Is) | (1L << Public) | (1L << Protected) | (1L << Private) | (1L << Typeof) | (1L << Type) | (1L << Number) | (1L << String) | (1L << DotDotDot))) != 0) || _la==Identifier || _la==StringLiteral) {
				{
				setState(620);
				parameterList();
				}
			}

			setState(623);
			match(CloseParen);
			setState(625);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(624);
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
		enterRule(_localctx, 122, RULE_indexSignature);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(627);
			match(OpenBracket);
			setState(628);
			bindingIdentifier();
			setState(629);
			match(Colon);
			setState(630);
			_la = _input.LA(1);
			if ( !(_la==Number || _la==String) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(631);
			match(CloseBracket);
			setState(632);
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
		enterRule(_localctx, 124, RULE_methodSignature);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(634);
			bindingIdentifier();
			setState(636);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==QuestionMark) {
				{
				setState(635);
				match(QuestionMark);
				}
			}

			setState(638);
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
		enterRule(_localctx, 126, RULE_constExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(640);
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
		public InterfaceNameContext interfaceName() {
			return getRuleContext(InterfaceNameContext.class,0);
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
		enterRule(_localctx, 128, RULE_interfaceDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(642);
			match(Interface);
			setState(643);
			interfaceName();
			setState(644);
			match(OpenBrace);
			setState(650);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << As) | (1L << From) | (1L << Global) | (1L << Import) | (1L << Module) | (1L << In) | (1L << Is) | (1L << New) | (1L << Typeof) | (1L << Type) | (1L << Number) | (1L << String) | (1L << OpenBracket) | (1L << OpenParen) | (1L << LessThan))) != 0) || _la==Identifier || _la==StringLiteral) {
				{
				{
				setState(645);
				typeMember();
				setState(646);
				lineEnd();
				}
				}
				setState(652);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(653);
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

	public static class InterfaceNameContext extends ParserRuleContext {
		public BindingIdentifierContext bindingIdentifier() {
			return getRuleContext(BindingIdentifierContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public ExtendsClauseContext extendsClause() {
			return getRuleContext(ExtendsClauseContext.class,0);
		}
		public InterfaceNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).enterInterfaceName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).exitInterfaceName(this);
		}
	}

	public final InterfaceNameContext interfaceName() throws RecognitionException {
		InterfaceNameContext _localctx = new InterfaceNameContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_interfaceName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(655);
			bindingIdentifier();
			setState(657);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LessThan) {
				{
				setState(656);
				typeParameters();
				}
			}

			setState(660);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Extends) {
				{
				setState(659);
				extendsClause();
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
		enterRule(_localctx, 132, RULE_extendsClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(662);
			match(Extends);
			setState(663);
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
		enterRule(_localctx, 134, RULE_classOrInterfaceTypeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(665);
			typeReference();
			setState(670);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(666);
				match(Comma);
				setState(667);
				typeReference();
				}
				}
				setState(672);
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
		enterRule(_localctx, 136, RULE_classHeritage);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(674);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Extends) {
				{
				setState(673);
				extendsClause();
				}
			}

			setState(677);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Implements) {
				{
				setState(676);
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
		enterRule(_localctx, 138, RULE_implementsClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(679);
			match(Implements);
			setState(680);
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
		public EnumNameContext enumName() {
			return getRuleContext(EnumNameContext.class,0);
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
		enterRule(_localctx, 140, RULE_enumDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(683);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Const) {
				{
				setState(682);
				match(Const);
				}
			}

			setState(685);
			match(Enum);
			setState(686);
			enumName();
			setState(687);
			match(OpenBrace);
			setState(689);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << As) | (1L << From) | (1L << Global) | (1L << Import) | (1L << Module) | (1L << In) | (1L << Is) | (1L << Typeof) | (1L << Type) | (1L << Number) | (1L << String))) != 0) || _la==Identifier || _la==StringLiteral) {
				{
				setState(688);
				enumBody();
				}
			}

			setState(691);
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

	public static class EnumNameContext extends ParserRuleContext {
		public BindingIdentifierContext bindingIdentifier() {
			return getRuleContext(BindingIdentifierContext.class,0);
		}
		public EnumNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).enterEnumName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).exitEnumName(this);
		}
	}

	public final EnumNameContext enumName() throws RecognitionException {
		EnumNameContext _localctx = new EnumNameContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_enumName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(693);
			bindingIdentifier();
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
		enterRule(_localctx, 144, RULE_enumBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(695);
			enumMemberList();
			setState(697);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(696);
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
		enterRule(_localctx, 146, RULE_enumMemberList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(699);
			enumMember();
			setState(704);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(700);
					match(Comma);
					setState(701);
					enumMember();
					}
					} 
				}
				setState(706);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
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
		enterRule(_localctx, 148, RULE_enumMember);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(707);
			bindingIdentifier();
			setState(710);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Assign) {
				{
				setState(708);
				match(Assign);
				setState(709);
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
		enterRule(_localctx, 150, RULE_enumValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(712);
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
		public BindingIdentifierContext bindingIdentifier;
		public List<BindingIdentifierContext> ident = new ArrayList<BindingIdentifierContext>();
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
		enterRule(_localctx, 152, RULE_identifierPath);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(714);
			((IdentifierPathContext)_localctx).bindingIdentifier = bindingIdentifier();
			((IdentifierPathContext)_localctx).ident.add(((IdentifierPathContext)_localctx).bindingIdentifier);
			setState(719);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(715);
					match(Dot);
					setState(716);
					((IdentifierPathContext)_localctx).bindingIdentifier = bindingIdentifier();
					((IdentifierPathContext)_localctx).ident.add(((IdentifierPathContext)_localctx).bindingIdentifier);
					}
					} 
				}
				setState(721);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
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
		public BindingIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bindingIdentifier; }
	 
		public BindingIdentifierContext() { }
		public void copyFrom(BindingIdentifierContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StringLiteralIdentifierContext extends BindingIdentifierContext {
		public TerminalNode StringLiteral() { return getToken(GenScalaFacadesFromTypescriptParser.StringLiteral, 0); }
		public StringLiteralIdentifierContext(BindingIdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).enterStringLiteralIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).exitStringLiteralIdentifier(this);
		}
	}
	public static class BasicIdentifierContext extends BindingIdentifierContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public BasicIdentifierContext(BindingIdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).enterBasicIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).exitBasicIdentifier(this);
		}
	}

	public final BindingIdentifierContext bindingIdentifier() throws RecognitionException {
		BindingIdentifierContext _localctx = new BindingIdentifierContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_bindingIdentifier);
		try {
			setState(724);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case As:
			case From:
			case Global:
			case Import:
			case Module:
			case In:
			case Is:
			case Typeof:
			case Type:
			case Number:
			case String:
			case Identifier:
				_localctx = new BasicIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(722);
				identifier();
				}
				break;
			case StringLiteral:
				_localctx = new StringLiteralIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(723);
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
		enterRule(_localctx, 156, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(726);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << As) | (1L << From) | (1L << Global) | (1L << Import) | (1L << Module) | (1L << In) | (1L << Is) | (1L << Typeof) | (1L << Type) | (1L << Number) | (1L << String))) != 0) || _la==Identifier) ) {
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
		enterRule(_localctx, 158, RULE_lineEnd);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(728);
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
		case 31:
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3]\u02dd\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\3\2\7\2\u00a4\n\2"+
		"\f\2\16\2\u00a7\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\5\3\u00b0\n\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u00bb\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\5\4\u00c9\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6"+
		"\3\6\5\6\u00d5\n\6\3\7\5\7\u00d8\n\7\3\7\3\7\3\7\7\7\u00dd\n\7\f\7\16"+
		"\7\u00e0\13\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\5\t\u00e9\n\t\5\t\u00eb\n\t"+
		"\3\n\3\n\3\n\5\n\u00f0\n\n\3\13\3\13\3\13\3\13\3\13\5\13\u00f7\n\13\3"+
		"\f\3\f\3\f\3\r\3\r\3\r\7\r\u00ff\n\r\f\r\16\r\u0102\13\r\3\16\3\16\5\16"+
		"\u0106\n\16\3\17\3\17\3\17\3\17\3\20\5\20\u010d\n\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\7\20\u0115\n\20\f\20\16\20\u0118\13\20\3\20\3\20\3\21\3"+
		"\21\5\21\u011e\n\21\3\21\3\21\3\22\3\22\3\22\5\22\u0125\n\22\3\23\3\23"+
		"\3\23\5\23\u012a\n\23\3\23\3\23\3\24\3\24\5\24\u0130\n\24\3\24\3\24\3"+
		"\25\3\25\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\27\3\27\5\27\u0140"+
		"\n\27\3\30\3\30\5\30\u0144\n\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30"+
		"\u014d\n\30\3\30\3\30\5\30\u0151\n\30\3\30\3\30\3\30\3\30\5\30\u0157\n"+
		"\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\7\32\u0160\n\32\f\32\16\32\u0163"+
		"\13\32\3\33\3\33\5\33\u0167\n\33\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3"+
		"\36\3\36\3\36\7\36\u0173\n\36\f\36\16\36\u0176\13\36\3\37\3\37\3\37\5"+
		"\37\u017b\n\37\3 \3 \5 \u017f\n \3 \3 \3!\3!\3!\3!\3!\3!\3!\5!\u018a\n"+
		"!\3!\3!\3!\3!\3!\3!\7!\u0192\n!\f!\16!\u0195\13!\3\"\5\"\u0198\n\"\3\""+
		"\3\"\3\"\5\"\u019d\n\"\3\"\7\"\u01a0\n\"\f\"\16\"\u01a3\13\"\5\"\u01a5"+
		"\n\"\3#\3#\3#\3#\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\5%\u01ba"+
		"\n%\3&\3&\3&\3\'\3\'\3\'\3\'\3(\3(\5(\u01c5\n(\3)\3)\5)\u01c9\n)\3)\3"+
		")\3)\3*\3*\3+\3+\3+\7+\u01d3\n+\f+\16+\u01d6\13+\3,\3,\3,\3,\3,\3,\3,"+
		"\3,\5,\u01e0\n,\3-\3-\3-\3-\3.\3.\3.\7.\u01e9\n.\f.\16.\u01ec\13.\3/\5"+
		"/\u01ef\n/\3/\3/\5/\u01f3\n/\3/\3/\3/\3/\3\60\3\60\5\60\u01fb\n\60\3\60"+
		"\3\60\5\60\u01ff\n\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\62\3\62\3\63"+
		"\3\63\5\63\u020c\n\63\3\63\5\63\u020f\n\63\3\64\3\64\3\65\3\65\3\65\3"+
		"\66\5\66\u0217\n\66\3\66\3\66\5\66\u021b\n\66\3\66\3\66\5\66\u021f\n\66"+
		"\3\67\3\67\3\67\3\67\3\67\5\67\u0226\n\67\3\67\5\67\u0229\n\67\5\67\u022b"+
		"\n\67\3\67\3\67\3\67\5\67\u0230\n\67\3\67\5\67\u0233\n\67\38\38\38\78"+
		"\u0238\n8\f8\168\u023b\138\39\39\39\59\u0240\n9\39\39\39\39\59\u0246\n"+
		"9\3:\3:\3:\3:\5:\u024c\n:\3;\3;\3;\7;\u0251\n;\f;\16;\u0254\13;\3<\3<"+
		"\3<\5<\u0259\n<\3<\5<\u025c\n<\3<\3<\3<\3<\3<\5<\u0263\n<\3=\3=\3=\5="+
		"\u0268\n=\3>\3>\5>\u026c\n>\3>\3>\5>\u0270\n>\3>\3>\5>\u0274\n>\3?\3?"+
		"\3?\3?\3?\3?\3?\3@\3@\5@\u027f\n@\3@\3@\3A\3A\3B\3B\3B\3B\3B\3B\7B\u028b"+
		"\nB\fB\16B\u028e\13B\3B\3B\3C\3C\5C\u0294\nC\3C\5C\u0297\nC\3D\3D\3D\3"+
		"E\3E\3E\7E\u029f\nE\fE\16E\u02a2\13E\3F\5F\u02a5\nF\3F\5F\u02a8\nF\3G"+
		"\3G\3G\3H\5H\u02ae\nH\3H\3H\3H\3H\5H\u02b4\nH\3H\3H\3I\3I\3J\3J\5J\u02bc"+
		"\nJ\3K\3K\3K\7K\u02c1\nK\fK\16K\u02c4\13K\3L\3L\3L\5L\u02c9\nL\3M\3M\3"+
		"N\3N\3N\7N\u02d0\nN\fN\16N\u02d3\13N\3O\3O\5O\u02d7\nO\3P\3P\3Q\3Q\3Q"+
		"\2\3@R\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<"+
		">@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a"+
		"\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\2\n"+
		"\4\2\3\3\26\26\5\2\b\b\25\25\27\27\3\2UW\4\2\r\r\30\30\3\2-.\3\2#$\f\2"+
		"\3\3\6\6\16\16\20\20\22\22\26\26\30\31  \"$XX\4\2\4\4-.\u02f8\2\u00a5"+
		"\3\2\2\2\4\u00ba\3\2\2\2\6\u00c8\3\2\2\2\b\u00ca\3\2\2\2\n\u00d4\3\2\2"+
		"\2\f\u00d7\3\2\2\2\16\u00e3\3\2\2\2\20\u00ea\3\2\2\2\22\u00ef\3\2\2\2"+
		"\24\u00f6\3\2\2\2\26\u00f8\3\2\2\2\30\u00fb\3\2\2\2\32\u0103\3\2\2\2\34"+
		"\u0107\3\2\2\2\36\u010c\3\2\2\2 \u011b\3\2\2\2\"\u0124\3\2\2\2$\u0126"+
		"\3\2\2\2&\u012d\3\2\2\2(\u0133\3\2\2\2*\u0138\3\2\2\2,\u013a\3\2\2\2."+
		"\u0156\3\2\2\2\60\u0158\3\2\2\2\62\u015c\3\2\2\2\64\u0164\3\2\2\2\66\u0168"+
		"\3\2\2\28\u016b\3\2\2\2:\u016f\3\2\2\2<\u017a\3\2\2\2>\u017c\3\2\2\2@"+
		"\u0189\3\2\2\2B\u01a4\3\2\2\2D\u01a6\3\2\2\2F\u01aa\3\2\2\2H\u01b9\3\2"+
		"\2\2J\u01bb\3\2\2\2L\u01be\3\2\2\2N\u01c2\3\2\2\2P\u01c6\3\2\2\2R\u01cd"+
		"\3\2\2\2T\u01cf\3\2\2\2V\u01df\3\2\2\2X\u01e1\3\2\2\2Z\u01e5\3\2\2\2\\"+
		"\u01ee\3\2\2\2^\u01f8\3\2\2\2`\u0204\3\2\2\2b\u0207\3\2\2\2d\u0209\3\2"+
		"\2\2f\u0210\3\2\2\2h\u0212\3\2\2\2j\u0216\3\2\2\2l\u0232\3\2\2\2n\u0234"+
		"\3\2\2\2p\u0245\3\2\2\2r\u024b\3\2\2\2t\u024d\3\2\2\2v\u0262\3\2\2\2x"+
		"\u0264\3\2\2\2z\u0269\3\2\2\2|\u0275\3\2\2\2~\u027c\3\2\2\2\u0080\u0282"+
		"\3\2\2\2\u0082\u0284\3\2\2\2\u0084\u0291\3\2\2\2\u0086\u0298\3\2\2\2\u0088"+
		"\u029b\3\2\2\2\u008a\u02a4\3\2\2\2\u008c\u02a9\3\2\2\2\u008e\u02ad\3\2"+
		"\2\2\u0090\u02b7\3\2\2\2\u0092\u02b9\3\2\2\2\u0094\u02bd\3\2\2\2\u0096"+
		"\u02c5\3\2\2\2\u0098\u02ca\3\2\2\2\u009a\u02cc\3\2\2\2\u009c\u02d6\3\2"+
		"\2\2\u009e\u02d8\3\2\2\2\u00a0\u02da\3\2\2\2\u00a2\u00a4\5\4\3\2\u00a3"+
		"\u00a2\3\2\2\2\u00a4\u00a7\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2"+
		"\2\2\u00a6\u00a8\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8\u00a9\7\2\2\3\u00a9"+
		"\3\3\2\2\2\u00aa\u00af\7\n\2\2\u00ab\u00b0\5\f\7\2\u00ac\u00ad\5\24\13"+
		"\2\u00ad\u00ae\5\u00a0Q\2\u00ae\u00b0\3\2\2\2\u00af\u00ab\3\2\2\2\u00af"+
		"\u00ac\3\2\2\2\u00b0\u00bb\3\2\2\2\u00b1\u00b2\7\n\2\2\u00b2\u00b3\7\20"+
		"\2\2\u00b3\u00b4\7+\2\2\u00b4\u00b5\5\f\7\2\u00b5\u00b6\7,\2\2\u00b6\u00bb"+
		"\3\2\2\2\u00b7\u00bb\5\u0082B\2\u00b8\u00bb\5\6\4\2\u00b9\u00bb\5\b\5"+
		"\2\u00ba\u00aa\3\2\2\2\u00ba\u00b1\3\2\2\2\u00ba\u00b7\3\2\2\2\u00ba\u00b8"+
		"\3\2\2\2\u00ba\u00b9\3\2\2\2\u00bb\5\3\2\2\2\u00bc\u00bd\7\f\2\2\u00bd"+
		"\u00be\7\n\2\2\u00be\u00bf\5\24\13\2\u00bf\u00c0\5\u00a0Q\2\u00c0\u00c9"+
		"\3\2\2\2\u00c1\u00c2\7\f\2\2\u00c2\u00c3\7\6\2\2\u00c3\u00c4\7\3\2\2\u00c4"+
		"\u00c5\5\u009cO\2\u00c5\u00c6\5\u00a0Q\2\u00c6\u00c9\3\2\2\2\u00c7\u00c9"+
		"\5(\25\2\u00c8\u00bc\3\2\2\2\u00c8\u00c1\3\2\2\2\u00c8\u00c7\3\2\2\2\u00c9"+
		"\7\3\2\2\2\u00ca\u00cb\7\22\2\2\u00cb\u00cc\5\n\6\2\u00cc\u00cd\7\6\2"+
		"\2\u00cd\u00ce\5\u009cO\2\u00ce\u00cf\7\16\2\2\u00cf\u00d0\5\u009cO\2"+
		"\u00d0\u00d1\5\u00a0Q\2\u00d1\t\3\2\2\2\u00d2\u00d5\5\u009cO\2\u00d3\u00d5"+
		"\79\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d3\3\2\2\2\u00d5\13\3\2\2\2\u00d6"+
		"\u00d8\t\2\2\2\u00d7\u00d6\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d9\3\2"+
		"\2\2\u00d9\u00da\5\16\b\2\u00da\u00de\7+\2\2\u00db\u00dd\5\20\t\2\u00dc"+
		"\u00db\3\2\2\2\u00dd\u00e0\3\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00df\3\2"+
		"\2\2\u00df\u00e1\3\2\2\2\u00e0\u00de\3\2\2\2\u00e1\u00e2\7,\2\2\u00e2"+
		"\r\3\2\2\2\u00e3\u00e4\5\u009aN\2\u00e4\17\3\2\2\2\u00e5\u00eb\5\22\n"+
		"\2\u00e6\u00e8\5\24\13\2\u00e7\u00e9\5\u00a0Q\2\u00e8\u00e7\3\2\2\2\u00e8"+
		"\u00e9\3\2\2\2\u00e9\u00eb\3\2\2\2\u00ea\u00e5\3\2\2\2\u00ea\u00e6\3\2"+
		"\2\2\u00eb\21\3\2\2\2\u00ec\u00f0\5\u0082B\2\u00ed\u00f0\5\36\20\2\u00ee"+
		"\u00f0\5\f\7\2\u00ef\u00ec\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00ee\3\2"+
		"\2\2\u00f0\23\3\2\2\2\u00f1\u00f7\5\26\f\2\u00f2\u00f7\5,\27\2\u00f3\u00f7"+
		"\5\34\17\2\u00f4\u00f7\5\u008eH\2\u00f5\u00f7\5(\25\2\u00f6\u00f1\3\2"+
		"\2\2\u00f6\u00f2\3\2\2\2\u00f6\u00f3\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6"+
		"\u00f5\3\2\2\2\u00f7\25\3\2\2\2\u00f8\u00f9\t\3\2\2\u00f9\u00fa\5\30\r"+
		"\2\u00fa\27\3\2\2\2\u00fb\u0100\5\32\16\2\u00fc\u00fd\7.\2\2\u00fd\u00ff"+
		"\5\32\16\2\u00fe\u00fc\3\2\2\2\u00ff\u0102\3\2\2\2\u0100\u00fe\3\2\2\2"+
		"\u0100\u0101\3\2\2\2\u0101\31\3\2\2\2\u0102\u0100\3\2\2\2\u0103\u0105"+
		"\5\u009cO\2\u0104\u0106\5h\65\2\u0105\u0104\3\2\2\2\u0105\u0106\3\2\2"+
		"\2\u0106\33\3\2\2\2\u0107\u0108\7\17\2\2\u0108\u0109\5\u009cO\2\u0109"+
		"\u010a\5j\66\2\u010a\35\3\2\2\2\u010b\u010d\7\5\2\2\u010c\u010b\3\2\2"+
		"\2\u010c\u010d\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u010f\7\7\2\2\u010f\u0110"+
		"\5 \21\2\u0110\u0116\7+\2\2\u0111\u0112\5\"\22\2\u0112\u0113\5\u00a0Q"+
		"\2\u0113\u0115\3\2\2\2\u0114\u0111\3\2\2\2\u0115\u0118\3\2\2\2\u0116\u0114"+
		"\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0119\3\2\2\2\u0118\u0116\3\2\2\2\u0119"+
		"\u011a\7,\2\2\u011a\37\3\2\2\2\u011b\u011d\5\u009cO\2\u011c\u011e\5\60"+
		"\31\2\u011d\u011c\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u011f\3\2\2\2\u011f"+
		"\u0120\5\u008aF\2\u0120!\3\2\2\2\u0121\u0125\5$\23\2\u0122\u0125\5&\24"+
		"\2\u0123\u0125\5|?\2\u0124\u0121\3\2\2\2\u0124\u0122\3\2\2\2\u0124\u0123"+
		"\3\2\2\2\u0125#\3\2\2\2\u0126\u0127\7\t\2\2\u0127\u0129\7)\2\2\u0128\u012a"+
		"\5l\67\2\u0129\u0128\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u012b\3\2\2\2\u012b"+
		"\u012c\7*\2\2\u012c%\3\2\2\2\u012d\u012f\5r:\2\u012e\u0130\7\35\2\2\u012f"+
		"\u012e\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u0132\5V"+
		",\2\u0132\'\3\2\2\2\u0133\u0134\7\f\2\2\u0134\u0135\7/\2\2\u0135\u0136"+
		"\5\u009cO\2\u0136\u0137\5\u00a0Q\2\u0137)\3\2\2\2\u0138\u0139\t\4\2\2"+
		"\u0139+\3\2\2\2\u013a\u013b\7\"\2\2\u013b\u013c\5.\30\2\u013c\u013f\7"+
		"/\2\2\u013d\u0140\5<\37\2\u013e\u0140\5.\30\2\u013f\u013d\3\2\2\2\u013f"+
		"\u013e\3\2\2\2\u0140-\3\2\2\2\u0141\u0143\5\u009cO\2\u0142\u0144\5\60"+
		"\31\2\u0143\u0142\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0157\3\2\2\2\u0145"+
		"\u0146\7+\2\2\u0146\u0147\7\'\2\2\u0147\u0148\5\u009cO\2\u0148\u0149\7"+
		"\30\2\2\u0149\u014a\7\24\2\2\u014a\u014c\5\u009cO\2\u014b\u014d\5\60\31"+
		"\2\u014c\u014b\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u0150"+
		"\7(\2\2\u014f\u0151\7\60\2\2\u0150\u014f\3\2\2\2\u0150\u0151\3\2\2\2\u0151"+
		"\u0152\3\2\2\2\u0152\u0153\7\61\2\2\u0153\u0154\5.\30\2\u0154\u0155\7"+
		",\2\2\u0155\u0157\3\2\2\2\u0156\u0141\3\2\2\2\u0156\u0145\3\2\2\2\u0157"+
		"/\3\2\2\2\u0158\u0159\7<\2\2\u0159\u015a\5\62\32\2\u015a\u015b\7=\2\2"+
		"\u015b\61\3\2\2\2\u015c\u0161\5\64\33\2\u015d\u015e\7.\2\2\u015e\u0160"+
		"\5\64\33\2\u015f\u015d\3\2\2\2\u0160\u0163\3\2\2\2\u0161\u015f\3\2\2\2"+
		"\u0161\u0162\3\2\2\2\u0162\63\3\2\2\2\u0163\u0161\3\2\2\2\u0164\u0166"+
		"\5\u009cO\2\u0165\u0167\5\66\34\2\u0166\u0165\3\2\2\2\u0166\u0167\3\2"+
		"\2\2\u0167\65\3\2\2\2\u0168\u0169\t\5\2\2\u0169\u016a\5<\37\2\u016a\67"+
		"\3\2\2\2\u016b\u016c\7<\2\2\u016c\u016d\5:\36\2\u016d\u016e\7=\2\2\u016e"+
		"9\3\2\2\2\u016f\u0174\5<\37\2\u0170\u0171\7.\2\2\u0171\u0173\5<\37\2\u0172"+
		"\u0170\3\2\2\2\u0173\u0176\3\2\2\2\u0174\u0172\3\2\2\2\u0174\u0175\3\2"+
		"\2\2\u0175;\3\2\2\2\u0176\u0174\3\2\2\2\u0177\u017b\5@!\2\u0178\u017b"+
		"\5\\/\2\u0179\u017b\5^\60\2\u017a\u0177\3\2\2\2\u017a\u0178\3\2\2\2\u017a"+
		"\u0179\3\2\2\2\u017b=\3\2\2\2\u017c\u017e\7+\2\2\u017d\u017f\5R*\2\u017e"+
		"\u017d\3\2\2\2\u017e\u017f\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u0181\7,"+
		"\2\2\u0181?\3\2\2\2\u0182\u0183\b!\1\2\u0183\u0184\7)\2\2\u0184\u0185"+
		"\5@!\2\u0185\u0186\7*\2\2\u0186\u018a\3\2\2\2\u0187\u018a\5B\"\2\u0188"+
		"\u018a\5> \2\u0189\u0182\3\2\2\2\u0189\u0187\3\2\2\2\u0189\u0188\3\2\2"+
		"\2\u018a\u0193\3\2\2\2\u018b\u018c\f\7\2\2\u018c\u018d\7F\2\2\u018d\u0192"+
		"\5@!\b\u018e\u018f\f\6\2\2\u018f\u0190\7D\2\2\u0190\u0192\5@!\7\u0191"+
		"\u018b\3\2\2\2\u0191\u018e\3\2\2\2\u0192\u0195\3\2\2\2\u0193\u0191\3\2"+
		"\2\2\u0193\u0194\3\2\2\2\u0194A\3\2\2\2\u0195\u0193\3\2\2\2\u0196\u0198"+
		"\7\24\2\2\u0197\u0196\3\2\2\2\u0197\u0198\3\2\2\2\u0198\u0199\3\2\2\2"+
		"\u0199\u01a5\5H%\2\u019a\u019c\5H%\2\u019b\u019d\58\35\2\u019c\u019b\3"+
		"\2\2\2\u019c\u019d\3\2\2\2\u019d\u01a1\3\2\2\2\u019e\u01a0\5F$\2\u019f"+
		"\u019e\3\2\2\2\u01a0\u01a3\3\2\2\2\u01a1\u019f\3\2\2\2\u01a1\u01a2\3\2"+
		"\2\2\u01a2\u01a5\3\2\2\2\u01a3\u01a1\3\2\2\2\u01a4\u0197\3\2\2\2\u01a4"+
		"\u019a\3\2\2\2\u01a5C\3\2\2\2\u01a6\u01a7\7<\2\2\u01a7\u01a8\5<\37\2\u01a8"+
		"\u01a9\7=\2\2\u01a9E\3\2\2\2\u01aa\u01ab\7\'\2\2\u01ab\u01ac\7(\2\2\u01ac"+
		"G\3\2\2\2\u01ad\u01ba\5L\'\2\u01ae\u01ba\5\u009cO\2\u01af\u01b0\5\u009e"+
		"P\2\u01b0\u01b1\5J&\2\u01b1\u01ba\3\2\2\2\u01b2\u01ba\5N(\2\u01b3\u01ba"+
		"\5P)\2\u01b4\u01ba\5X-\2\u01b5\u01ba\5`\61\2\u01b6\u01ba\5b\62\2\u01b7"+
		"\u01ba\5*\26\2\u01b8\u01ba\5.\30\2\u01b9\u01ad\3\2\2\2\u01b9\u01ae\3\2"+
		"\2\2\u01b9\u01af\3\2\2\2\u01b9\u01b2\3\2\2\2\u01b9\u01b3\3\2\2\2\u01b9"+
		"\u01b4\3\2\2\2\u01b9\u01b5\3\2\2\2\u01b9\u01b6\3\2\2\2\u01b9\u01b7\3\2"+
		"\2\2\u01b9\u01b8\3\2\2\2\u01baI\3\2\2\2\u01bb\u01bc\7\31\2\2\u01bc\u01bd"+
		"\5<\37\2\u01bdK\3\2\2\2\u01be\u01bf\7)\2\2\u01bf\u01c0\5<\37\2\u01c0\u01c1"+
		"\7*\2\2\u01c1M\3\2\2\2\u01c2\u01c4\5\u009aN\2\u01c3\u01c5\58\35\2\u01c4"+
		"\u01c3\3\2\2\2\u01c4\u01c5\3\2\2\2\u01c5O\3\2\2\2\u01c6\u01c8\7+\2\2\u01c7"+
		"\u01c9\5R*\2\u01c8\u01c7\3\2\2\2\u01c8\u01c9\3\2\2\2\u01c9\u01ca\3\2\2"+
		"\2\u01ca\u01cb\5\u00a0Q\2\u01cb\u01cc\7,\2\2\u01ccQ\3\2\2\2\u01cd\u01ce"+
		"\5T+\2\u01ceS\3\2\2\2\u01cf\u01d4\5V,\2\u01d0\u01d1\t\6\2\2\u01d1\u01d3"+
		"\5V,\2\u01d2\u01d0\3\2\2\2\u01d3\u01d6\3\2\2\2\u01d4\u01d2\3\2\2\2\u01d4"+
		"\u01d5\3\2\2\2\u01d5U\3\2\2\2\u01d6\u01d4\3\2\2\2\u01d7\u01e0\5d\63\2"+
		"\u01d8\u01e0\5j\66\2\u01d9\u01e0\5z>\2\u01da\u01e0\5|?\2\u01db\u01e0\5"+
		"~@\2\u01dc\u01dd\5\u009cO\2\u01dd\u01de\5j\66\2\u01de\u01e0\3\2\2\2\u01df"+
		"\u01d7\3\2\2\2\u01df\u01d8\3\2\2\2\u01df\u01d9\3\2\2\2\u01df\u01da\3\2"+
		"\2\2\u01df\u01db\3\2\2\2\u01df\u01dc\3\2\2\2\u01e0W\3\2\2\2\u01e1\u01e2"+
		"\7\'\2\2\u01e2\u01e3\5Z.\2\u01e3\u01e4\7(\2\2\u01e4Y\3\2\2\2\u01e5\u01ea"+
		"\5<\37\2\u01e6\u01e7\7.\2\2\u01e7\u01e9\5<\37\2\u01e8\u01e6\3\2\2\2\u01e9"+
		"\u01ec\3\2\2\2\u01ea\u01e8\3\2\2\2\u01ea\u01eb\3\2\2\2\u01eb[\3\2\2\2"+
		"\u01ec\u01ea\3\2\2\2\u01ed\u01ef\5\60\31\2\u01ee\u01ed\3\2\2\2\u01ee\u01ef"+
		"\3\2\2\2\u01ef\u01f0\3\2\2\2\u01f0\u01f2\7)\2\2\u01f1\u01f3\5l\67\2\u01f2"+
		"\u01f1\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4\u01f5\7*"+
		"\2\2\u01f5\u01f6\7%\2\2\u01f6\u01f7\5<\37\2\u01f7]\3\2\2\2\u01f8\u01fa"+
		"\7\37\2\2\u01f9\u01fb\5\60\31\2\u01fa\u01f9\3\2\2\2\u01fa\u01fb\3\2\2"+
		"\2\u01fb\u01fc\3\2\2\2\u01fc\u01fe\7)\2\2\u01fd\u01ff\5l\67\2\u01fe\u01fd"+
		"\3\2\2\2\u01fe\u01ff\3\2\2\2\u01ff\u0200\3\2\2\2\u0200\u0201\7*\2\2\u0201"+
		"\u0202\7%\2\2\u0202\u0203\5<\37\2\u0203_\3\2\2\2\u0204\u0205\7 \2\2\u0205"+
		"\u0206\5\u009aN\2\u0206a\3\2\2\2\u0207\u0208\7!\2\2\u0208c\3\2\2\2\u0209"+
		"\u020b\5f\64\2\u020a\u020c\7\60\2\2\u020b\u020a\3\2\2\2\u020b\u020c\3"+
		"\2\2\2\u020c\u020e\3\2\2\2\u020d\u020f\5h\65\2\u020e\u020d\3\2\2\2\u020e"+
		"\u020f\3\2\2\2\u020fe\3\2\2\2\u0210\u0211\5\u009cO\2\u0211g\3\2\2\2\u0212"+
		"\u0213\7\61\2\2\u0213\u0214\5<\37\2\u0214i\3\2\2\2\u0215\u0217\5\60\31"+
		"\2\u0216\u0215\3\2\2\2\u0216\u0217\3\2\2\2\u0217\u0218\3\2\2\2\u0218\u021a"+
		"\7)\2\2\u0219\u021b\5l\67\2\u021a\u0219\3\2\2\2\u021a\u021b\3\2\2\2\u021b"+
		"\u021c\3\2\2\2\u021c\u021e\7*\2\2\u021d\u021f\5h\65\2\u021e\u021d\3\2"+
		"\2\2\u021e\u021f\3\2\2\2\u021fk\3\2\2\2\u0220\u022a\5n8\2\u0221\u0228"+
		"\7.\2\2\u0222\u0225\5t;\2\u0223\u0224\7.\2\2\u0224\u0226\5x=\2\u0225\u0223"+
		"\3\2\2\2\u0225\u0226\3\2\2\2\u0226\u0229\3\2\2\2\u0227\u0229\5x=\2\u0228"+
		"\u0222\3\2\2\2\u0228\u0227\3\2\2\2\u0229\u022b\3\2\2\2\u022a\u0221\3\2"+
		"\2\2\u022a\u022b\3\2\2\2\u022b\u0233\3\2\2\2\u022c\u022f\5t;\2\u022d\u022e"+
		"\7.\2\2\u022e\u0230\5x=\2\u022f\u022d\3\2\2\2\u022f\u0230\3\2\2\2\u0230"+
		"\u0233\3\2\2\2\u0231\u0233\5x=\2\u0232\u0220\3\2\2\2\u0232\u022c\3\2\2"+
		"\2\u0232\u0231\3\2\2\2\u0233m\3\2\2\2\u0234\u0239\5p9\2\u0235\u0236\7"+
		".\2\2\u0236\u0238\5p9\2\u0237\u0235\3\2\2\2\u0238\u023b\3\2\2\2\u0239"+
		"\u0237\3\2\2\2\u0239\u023a\3\2\2\2\u023ao\3\2\2\2\u023b\u0239\3\2\2\2"+
		"\u023c\u023d\5r:\2\u023d\u023f\5\u009cO\2\u023e\u0240\5h\65\2\u023f\u023e"+
		"\3\2\2\2\u023f\u0240\3\2\2\2\u0240\u0246\3\2\2\2\u0241\u0242\5\u009cO"+
		"\2\u0242\u0243\7\61\2\2\u0243\u0244\7Y\2\2\u0244\u0246\3\2\2\2\u0245\u023c"+
		"\3\2\2\2\u0245\u0241\3\2\2\2\u0246q\3\2\2\2\u0247\u024c\7\32\2\2\u0248"+
		"\u024c\7\34\2\2\u0249\u024c\7\33\2\2\u024a\u024c\3\2\2\2\u024b\u0247\3"+
		"\2\2\2\u024b\u0248\3\2\2\2\u024b\u0249\3\2\2\2\u024b\u024a\3\2\2\2\u024c"+
		"s\3\2\2\2\u024d\u0252\5v<\2\u024e\u024f\7.\2\2\u024f\u0251\5v<\2\u0250"+
		"\u024e\3\2\2\2\u0251\u0254\3\2\2\2\u0252\u0250\3\2\2\2\u0252\u0253\3\2"+
		"\2\2\u0253u\3\2\2\2\u0254\u0252\3\2\2\2\u0255\u0256\5r:\2\u0256\u0258"+
		"\5\u009cO\2\u0257\u0259\7\60\2\2\u0258\u0257\3\2\2\2\u0258\u0259\3\2\2"+
		"\2\u0259\u025b\3\2\2\2\u025a\u025c\5h\65\2\u025b\u025a\3\2\2\2\u025b\u025c"+
		"\3\2\2\2\u025c\u0263\3\2\2\2\u025d\u025e\5\u009cO\2\u025e\u025f\7\60\2"+
		"\2\u025f\u0260\7\61\2\2\u0260\u0261\7Y\2\2\u0261\u0263\3\2\2\2\u0262\u0255"+
		"\3\2\2\2\u0262\u025d\3\2\2\2\u0263w\3\2\2\2\u0264\u0265\7&\2\2\u0265\u0267"+
		"\5\u009cO\2\u0266\u0268\5h\65\2\u0267\u0266\3\2\2\2\u0267\u0268\3\2\2"+
		"\2\u0268y\3\2\2\2\u0269\u026b\7\37\2\2\u026a\u026c\5\60\31\2\u026b\u026a"+
		"\3\2\2\2\u026b\u026c\3\2\2\2\u026c\u026d\3\2\2\2\u026d\u026f\7)\2\2\u026e"+
		"\u0270\5l\67\2\u026f\u026e\3\2\2\2\u026f\u0270\3\2\2\2\u0270\u0271\3\2"+
		"\2\2\u0271\u0273\7*\2\2\u0272\u0274\5h\65\2\u0273\u0272\3\2\2\2\u0273"+
		"\u0274\3\2\2\2\u0274{\3\2\2\2\u0275\u0276\7\'\2\2\u0276\u0277\5\u009c"+
		"O\2\u0277\u0278\7\61\2\2\u0278\u0279\t\7\2\2\u0279\u027a\7(\2\2\u027a"+
		"\u027b\5h\65\2\u027b}\3\2\2\2\u027c\u027e\5\u009cO\2\u027d\u027f\7\60"+
		"\2\2\u027e\u027d\3\2\2\2\u027e\u027f\3\2\2\2\u027f\u0280\3\2\2\2\u0280"+
		"\u0281\5j\66\2\u0281\177\3\2\2\2\u0282\u0283\5*\26\2\u0283\u0081\3\2\2"+
		"\2\u0284\u0285\7\23\2\2\u0285\u0286\5\u0084C\2\u0286\u028c\7+\2\2\u0287"+
		"\u0288\5V,\2\u0288\u0289\5\u00a0Q\2\u0289\u028b\3\2\2\2\u028a\u0287\3"+
		"\2\2\2\u028b\u028e\3\2\2\2\u028c\u028a\3\2\2\2\u028c\u028d\3\2\2\2\u028d"+
		"\u028f\3\2\2\2\u028e\u028c\3\2\2\2\u028f\u0290\7,\2\2\u0290\u0083\3\2"+
		"\2\2\u0291\u0293\5\u009cO\2\u0292\u0294\5\60\31\2\u0293\u0292\3\2\2\2"+
		"\u0293\u0294\3\2\2\2\u0294\u0296\3\2\2\2\u0295\u0297\5\u0086D\2\u0296"+
		"\u0295\3\2\2\2\u0296\u0297\3\2\2\2\u0297\u0085\3\2\2\2\u0298\u0299\7\r"+
		"\2\2\u0299\u029a\5\u0088E\2\u029a\u0087\3\2\2\2\u029b\u02a0\5N(\2\u029c"+
		"\u029d\7.\2\2\u029d\u029f\5N(\2\u029e\u029c\3\2\2\2\u029f\u02a2\3\2\2"+
		"\2\u02a0\u029e\3\2\2\2\u02a0\u02a1\3\2\2\2\u02a1\u0089\3\2\2\2\u02a2\u02a0"+
		"\3\2\2\2\u02a3\u02a5\5\u0086D\2\u02a4\u02a3\3\2\2\2\u02a4\u02a5\3\2\2"+
		"\2\u02a5\u02a7\3\2\2\2\u02a6\u02a8\5\u008cG\2\u02a7\u02a6\3\2\2\2\u02a7"+
		"\u02a8\3\2\2\2\u02a8\u008b\3\2\2\2\u02a9\u02aa\7\21\2\2\u02aa\u02ab\5"+
		"\u0088E\2\u02ab\u008d\3\2\2\2\u02ac\u02ae\7\b\2\2\u02ad\u02ac\3\2\2\2"+
		"\u02ad\u02ae\3\2\2\2\u02ae\u02af\3\2\2\2\u02af\u02b0\7\13\2\2\u02b0\u02b1"+
		"\5\u0090I\2\u02b1\u02b3\7+\2\2\u02b2\u02b4\5\u0092J\2\u02b3\u02b2\3\2"+
		"\2\2\u02b3\u02b4\3\2\2\2\u02b4\u02b5\3\2\2\2\u02b5\u02b6\7,\2\2\u02b6"+
		"\u008f\3\2\2\2\u02b7\u02b8\5\u009cO\2\u02b8\u0091\3\2\2\2\u02b9\u02bb"+
		"\5\u0094K\2\u02ba\u02bc\7.\2\2\u02bb\u02ba\3\2\2\2\u02bb\u02bc\3\2\2\2"+
		"\u02bc\u0093\3\2\2\2\u02bd\u02c2\5\u0096L\2\u02be\u02bf\7.\2\2\u02bf\u02c1"+
		"\5\u0096L\2\u02c0\u02be\3\2\2\2\u02c1\u02c4\3\2\2\2\u02c2\u02c0\3\2\2"+
		"\2\u02c2\u02c3\3\2\2\2\u02c3\u0095\3\2\2\2\u02c4\u02c2\3\2\2\2\u02c5\u02c8"+
		"\5\u009cO\2\u02c6\u02c7\7/\2\2\u02c7\u02c9\5\u0098M\2\u02c8\u02c6\3\2"+
		"\2\2\u02c8\u02c9\3\2\2\2\u02c9\u0097\3\2\2\2\u02ca\u02cb\5\u0080A\2\u02cb"+
		"\u0099\3\2\2\2\u02cc\u02d1\5\u009cO\2\u02cd\u02ce\7\62\2\2\u02ce\u02d0"+
		"\5\u009cO\2\u02cf\u02cd\3\2\2\2\u02d0\u02d3\3\2\2\2\u02d1\u02cf\3\2\2"+
		"\2\u02d1\u02d2\3\2\2\2\u02d2\u009b\3\2\2\2\u02d3\u02d1\3\2\2\2\u02d4\u02d7"+
		"\5\u009eP\2\u02d5\u02d7\7Y\2\2\u02d6\u02d4\3\2\2\2\u02d6\u02d5\3\2\2\2"+
		"\u02d7\u009d\3\2\2\2\u02d8\u02d9\t\b\2\2\u02d9\u009f\3\2\2\2\u02da\u02db"+
		"\t\t\2\2\u02db\u00a1\3\2\2\2T\u00a5\u00af\u00ba\u00c8\u00d4\u00d7\u00de"+
		"\u00e8\u00ea\u00ef\u00f6\u0100\u0105\u010c\u0116\u011d\u0124\u0129\u012f"+
		"\u013f\u0143\u014c\u0150\u0156\u0161\u0166\u0174\u017a\u017e\u0189\u0191"+
		"\u0193\u0197\u019c\u01a1\u01a4\u01b9\u01c4\u01c8\u01d4\u01df\u01ea\u01ee"+
		"\u01f2\u01fa\u01fe\u020b\u020e\u0216\u021a\u021e\u0225\u0228\u022a\u022f"+
		"\u0232\u0239\u023f\u0245\u024b\u0252\u0258\u025b\u0262\u0267\u026b\u026f"+
		"\u0273\u027e\u028c\u0293\u0296\u02a0\u02a4\u02a7\u02ad\u02b3\u02bb\u02c2"+
		"\u02c8\u02d1\u02d6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}