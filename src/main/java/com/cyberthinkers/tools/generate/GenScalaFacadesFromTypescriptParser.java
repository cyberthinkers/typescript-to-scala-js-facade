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
		T__0=1, LineTerminator=2, Abstract=3, Class=4, Const=5, Constructor=6, 
		Declare=7, Enum=8, Export=9, Extends=10, Function=11, Implements=12, Interface=13, 
		Let=14, Module=15, Var=16, Is=17, Public=18, Protected=19, Private=20, 
		Static=21, Readonly=22, New=23, Typeof=24, This=25, Type=26, Number=27, 
		String=28, ThickArrow=29, DotDotDot=30, OpenBracket=31, CloseBracket=32, 
		OpenParen=33, CloseParen=34, OpenBrace=35, CloseBrace=36, SemiColon=37, 
		Comma=38, Assign=39, QuestionMark=40, Colon=41, Dot=42, PlusPlus=43, MinusMinus=44, 
		Plus=45, Minus=46, BitNot=47, Not=48, Multiply=49, Divide=50, Modulus=51, 
		LessThan=52, MoreThan=53, LessThanEquals=54, GreaterThanEquals=55, Equals=56, 
		NotEquals=57, IdentityEquals=58, IdentityNotEquals=59, BitAnd=60, BitXOr=61, 
		BitOr=62, And=63, Or=64, MultiplyAssign=65, DivideAssign=66, ModulusAssign=67, 
		PlusAssign=68, MinusAssign=69, LeftShiftArithmeticAssign=70, RightShiftArithmeticAssign=71, 
		RightShiftLogicalAssign=72, BitAndAssign=73, BitXorAssign=74, BitOrAssign=75, 
		BooleanLiteral=76, DecimalLiteral=77, HexIntegerLiteral=78, OctalIntegerLiteral=79, 
		Identifier=80, StringLiteral=81, WS=82, Documentation=83, Comment=84, 
		LineComment=85;
	public static final int
		RULE_typescriptAmbientDeclarations = 0, RULE_declarationScriptElement = 1, 
		RULE_ambientModuleOrNamespace = 2, RULE_ambientStatement = 3, RULE_variableDeclaration = 4, 
		RULE_variableList = 5, RULE_variableName = 6, RULE_functionDeclaration = 7, 
		RULE_classDeclaration = 8, RULE_ambientClassElements = 9, RULE_ambientClassBodyElement = 10, 
		RULE_ambientConstructorDeclaration = 11, RULE_ambientPropertyMemberDeclaration = 12, 
		RULE_ambientProperty = 13, RULE_propertyName = 14, RULE_exportIdentifier = 15, 
		RULE_numericLiteral = 16, RULE_typeDeclaration = 17, RULE_typeParameters = 18, 
		RULE_typeParameterList = 19, RULE_typeParameter = 20, RULE_constraint = 21, 
		RULE_typeArguments = 22, RULE_typeArgumentList = 23, RULE_type = 24, RULE_unionOrIntersectionOrPrimaryType = 25, 
		RULE_primaryOrArray = 26, RULE_nestedType = 27, RULE_arrayDim = 28, RULE_primaryType = 29, 
		RULE_typeGuard = 30, RULE_parenthesizedType = 31, RULE_typeReference = 32, 
		RULE_objectType = 33, RULE_typeBody = 34, RULE_typeMemberList = 35, RULE_typeMember = 36, 
		RULE_tupleType = 37, RULE_typeElementTypes = 38, RULE_functionType = 39, 
		RULE_constructorType = 40, RULE_typeQuery = 41, RULE_thisType = 42, RULE_propertySignature = 43, 
		RULE_typeAnnotation = 44, RULE_callSignature = 45, RULE_parameterList = 46, 
		RULE_requiredParameterList = 47, RULE_requiredParameter = 48, RULE_accessibilityModifier = 49, 
		RULE_optionalParameterList = 50, RULE_optionalParameter = 51, RULE_restParameter = 52, 
		RULE_constructSignature = 53, RULE_indexSignature = 54, RULE_methodSignature = 55, 
		RULE_typeAliasDeclaration = 56, RULE_constExpression = 57, RULE_interfaceDeclaration = 58, 
		RULE_extendsClause = 59, RULE_classOrInterfaceTypeList = 60, RULE_classHeritage = 61, 
		RULE_implementsClause = 62, RULE_enumDeclaration = 63, RULE_enumBody = 64, 
		RULE_enumMemberList = 65, RULE_enumMember = 66, RULE_enumValue = 67, RULE_identifierPath = 68, 
		RULE_bindingIdentifier = 69, RULE_identifier = 70;
	public static final String[] ruleNames = {
		"typescriptAmbientDeclarations", "declarationScriptElement", "ambientModuleOrNamespace", 
		"ambientStatement", "variableDeclaration", "variableList", "variableName", 
		"functionDeclaration", "classDeclaration", "ambientClassElements", "ambientClassBodyElement", 
		"ambientConstructorDeclaration", "ambientPropertyMemberDeclaration", "ambientProperty", 
		"propertyName", "exportIdentifier", "numericLiteral", "typeDeclaration", 
		"typeParameters", "typeParameterList", "typeParameter", "constraint", 
		"typeArguments", "typeArgumentList", "type", "unionOrIntersectionOrPrimaryType", 
		"primaryOrArray", "nestedType", "arrayDim", "primaryType", "typeGuard", 
		"parenthesizedType", "typeReference", "objectType", "typeBody", "typeMemberList", 
		"typeMember", "tupleType", "typeElementTypes", "functionType", "constructorType", 
		"typeQuery", "thisType", "propertySignature", "typeAnnotation", "callSignature", 
		"parameterList", "requiredParameterList", "requiredParameter", "accessibilityModifier", 
		"optionalParameterList", "optionalParameter", "restParameter", "constructSignature", 
		"indexSignature", "methodSignature", "typeAliasDeclaration", "constExpression", 
		"interfaceDeclaration", "extendsClause", "classOrInterfaceTypeList", "classHeritage", 
		"implementsClause", "enumDeclaration", "enumBody", "enumMemberList", "enumMember", 
		"enumValue", "identifierPath", "bindingIdentifier", "identifier"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'namespace'", null, "'abstract'", "'class'", "'const'", "'constructor'", 
		"'declare'", "'enum'", "'export'", "'extends'", "'function'", "'implements'", 
		"'interface'", "'let'", "'module'", "'var'", "'is'", "'public'", "'protected'", 
		"'private'", "'static'", "'readonly'", "'new'", "'typeof'", "'this'", 
		"'type'", "'number'", "'string'", "'=>'", "'...'", "'['", "']'", "'('", 
		"')'", "'{'", "'}'", "';'", "','", "'='", "'?'", "':'", "'.'", "'++'", 
		"'--'", "'+'", "'-'", "'~'", "'!'", "'*'", "'/'", "'%'", "'<'", "'>'", 
		"'<='", "'>='", "'=='", "'!='", "'==='", "'!=='", "'&'", "'^'", "'|'", 
		"'&&'", "'||'", "'*='", "'/='", "'%='", "'+='", "'-='", "'<<='", "'>>='", 
		"'>>>='", "'&='", "'^='", "'|='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "LineTerminator", "Abstract", "Class", "Const", "Constructor", 
		"Declare", "Enum", "Export", "Extends", "Function", "Implements", "Interface", 
		"Let", "Module", "Var", "Is", "Public", "Protected", "Private", "Static", 
		"Readonly", "New", "Typeof", "This", "Type", "Number", "String", "ThickArrow", 
		"DotDotDot", "OpenBracket", "CloseBracket", "OpenParen", "CloseParen", 
		"OpenBrace", "CloseBrace", "SemiColon", "Comma", "Assign", "QuestionMark", 
		"Colon", "Dot", "PlusPlus", "MinusMinus", "Plus", "Minus", "BitNot", "Not", 
		"Multiply", "Divide", "Modulus", "LessThan", "MoreThan", "LessThanEquals", 
		"GreaterThanEquals", "Equals", "NotEquals", "IdentityEquals", "IdentityNotEquals", 
		"BitAnd", "BitXOr", "BitOr", "And", "Or", "MultiplyAssign", "DivideAssign", 
		"ModulusAssign", "PlusAssign", "MinusAssign", "LeftShiftArithmeticAssign", 
		"RightShiftArithmeticAssign", "RightShiftLogicalAssign", "BitAndAssign", 
		"BitXorAssign", "BitOrAssign", "BooleanLiteral", "DecimalLiteral", "HexIntegerLiteral", 
		"OctalIntegerLiteral", "Identifier", "StringLiteral", "WS", "Documentation", 
		"Comment", "LineComment"
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
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Declare || _la==Interface) {
				{
				{
				setState(142);
				declarationScriptElement();
				}
				}
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(148);
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
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
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
			setState(156);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Declare:
				enterOuterAlt(_localctx, 1);
				{
				setState(150);
				match(Declare);
				setState(153);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(151);
					ambientModuleOrNamespace();
					}
					break;
				case 2:
					{
					setState(152);
					ambientStatement();
					}
					break;
				}
				}
				break;
			case Interface:
				enterOuterAlt(_localctx, 2);
				{
				setState(155);
				interfaceDeclaration();
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
		public List<AmbientStatementContext> ambientStatement() {
			return getRuleContexts(AmbientStatementContext.class);
		}
		public AmbientStatementContext ambientStatement(int i) {
			return getRuleContext(AmbientStatementContext.class,i);
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
		enterRule(_localctx, 4, RULE_ambientModuleOrNamespace);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			_la = _input.LA(1);
			if ( !(_la==T__0 || _la==Module) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(159);
			identifierPath();
			setState(160);
			match(OpenBrace);
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << Abstract) | (1L << Class) | (1L << Const) | (1L << Enum) | (1L << Export) | (1L << Function) | (1L << Interface) | (1L << Let) | (1L << Module) | (1L << Var) | (1L << Type))) != 0)) {
				{
				{
				setState(161);
				ambientStatement();
				}
				}
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(167);
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

	public static class AmbientStatementContext extends ParserRuleContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public TypeAliasDeclarationContext typeAliasDeclaration() {
			return getRuleContext(TypeAliasDeclarationContext.class,0);
		}
		public TypeDeclarationContext typeDeclaration() {
			return getRuleContext(TypeDeclarationContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public ExportIdentifierContext exportIdentifier() {
			return getRuleContext(ExportIdentifierContext.class,0);
		}
		public AmbientModuleOrNamespaceContext ambientModuleOrNamespace() {
			return getRuleContext(AmbientModuleOrNamespaceContext.class,0);
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
		enterRule(_localctx, 6, RULE_ambientStatement);
		try {
			setState(178);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(169);
				variableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(170);
				typeAliasDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(171);
				typeDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(172);
				functionDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(173);
				interfaceDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(174);
				classDeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(175);
				enumDeclaration();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(176);
				exportIdentifier();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(177);
				ambientModuleOrNamespace();
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
		enterRule(_localctx, 8, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Let) | (1L << Var))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(181);
			variableList();
			setState(182);
			match(SemiColon);
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
		enterRule(_localctx, 10, RULE_variableList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			variableName();
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(185);
				match(Comma);
				setState(186);
				variableName();
				}
				}
				setState(191);
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
		enterRule(_localctx, 12, RULE_variableName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			bindingIdentifier();
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(193);
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
		enterRule(_localctx, 14, RULE_functionDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(Function);
			setState(197);
			bindingIdentifier();
			setState(198);
			callSignature();
			setState(199);
			match(SemiColon);
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
		public AmbientClassElementsContext ambientClassElements() {
			return getRuleContext(AmbientClassElementsContext.class,0);
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
		enterRule(_localctx, 16, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Abstract) {
				{
				setState(201);
				match(Abstract);
				}
			}

			setState(204);
			match(Class);
			setState(205);
			bindingIdentifier();
			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LessThan) {
				{
				setState(206);
				typeParameters();
				}
			}

			setState(209);
			classHeritage();
			setState(210);
			match(OpenBrace);
			setState(212);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << Constructor) | (1L << Module) | (1L << Is) | (1L << Public) | (1L << Protected) | (1L << Private) | (1L << Static) | (1L << Type) | (1L << Number) | (1L << String) | (1L << OpenBracket))) != 0) || _la==Identifier || _la==StringLiteral) {
				{
				setState(211);
				ambientClassElements();
				}
			}

			setState(214);
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

	public static class AmbientClassElementsContext extends ParserRuleContext {
		public List<AmbientClassBodyElementContext> ambientClassBodyElement() {
			return getRuleContexts(AmbientClassBodyElementContext.class);
		}
		public AmbientClassBodyElementContext ambientClassBodyElement(int i) {
			return getRuleContext(AmbientClassBodyElementContext.class,i);
		}
		public AmbientClassElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ambientClassElements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).enterAmbientClassElements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).exitAmbientClassElements(this);
		}
	}

	public final AmbientClassElementsContext ambientClassElements() throws RecognitionException {
		AmbientClassElementsContext _localctx = new AmbientClassElementsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_ambientClassElements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			ambientClassBodyElement();
			setState(220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << Constructor) | (1L << Module) | (1L << Is) | (1L << Public) | (1L << Protected) | (1L << Private) | (1L << Static) | (1L << Type) | (1L << Number) | (1L << String) | (1L << OpenBracket))) != 0) || _la==Identifier || _la==StringLiteral) {
				{
				{
				setState(217);
				ambientClassBodyElement();
				}
				}
				setState(222);
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
		enterRule(_localctx, 20, RULE_ambientClassBodyElement);
		try {
			setState(226);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Constructor:
				enterOuterAlt(_localctx, 1);
				{
				setState(223);
				ambientConstructorDeclaration();
				}
				break;
			case T__0:
			case Module:
			case Is:
			case Public:
			case Protected:
			case Private:
			case Static:
			case Type:
			case Number:
			case String:
			case Identifier:
			case StringLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(224);
				ambientPropertyMemberDeclaration();
				}
				break;
			case OpenBracket:
				enterOuterAlt(_localctx, 3);
				{
				setState(225);
				indexSignature();
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
		enterRule(_localctx, 22, RULE_ambientConstructorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			match(Constructor);
			setState(229);
			match(OpenParen);
			setState(231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << Module) | (1L << Is) | (1L << Public) | (1L << Protected) | (1L << Private) | (1L << Type) | (1L << Number) | (1L << String) | (1L << DotDotDot))) != 0) || _la==Identifier || _la==StringLiteral) {
				{
				setState(230);
				parameterList();
				}
			}

			setState(233);
			match(CloseParen);
			setState(234);
			match(SemiColon);
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
		public PropertyNameContext propertyName() {
			return getRuleContext(PropertyNameContext.class,0);
		}
		public AmbientPropertyContext ambientProperty() {
			return getRuleContext(AmbientPropertyContext.class,0);
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
		enterRule(_localctx, 24, RULE_ambientPropertyMemberDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Public) | (1L << Protected) | (1L << Private))) != 0)) {
				{
				setState(236);
				accessibilityModifier();
				}
			}

			setState(240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Static) {
				{
				setState(239);
				match(Static);
				}
			}

			setState(242);
			propertyName();
			setState(243);
			ambientProperty();
			setState(244);
			match(SemiColon);
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

	public static class AmbientPropertyContext extends ParserRuleContext {
		public AmbientPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ambientProperty; }
	 
		public AmbientPropertyContext() { }
		public void copyFrom(AmbientPropertyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PropertyTypeAnnotationContext extends AmbientPropertyContext {
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public PropertyTypeAnnotationContext(AmbientPropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).enterPropertyTypeAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).exitPropertyTypeAnnotation(this);
		}
	}
	public static class PropertyWithoutTypeAnnotationContext extends AmbientPropertyContext {
		public PropertyWithoutTypeAnnotationContext(AmbientPropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).enterPropertyWithoutTypeAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).exitPropertyWithoutTypeAnnotation(this);
		}
	}
	public static class PropertyCallSignatureContext extends AmbientPropertyContext {
		public CallSignatureContext callSignature() {
			return getRuleContext(CallSignatureContext.class,0);
		}
		public PropertyCallSignatureContext(AmbientPropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).enterPropertyCallSignature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).exitPropertyCallSignature(this);
		}
	}

	public final AmbientPropertyContext ambientProperty() throws RecognitionException {
		AmbientPropertyContext _localctx = new AmbientPropertyContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_ambientProperty);
		try {
			setState(249);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Colon:
				_localctx = new PropertyTypeAnnotationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(246);
				typeAnnotation();
				}
				break;
			case OpenParen:
			case LessThan:
				_localctx = new PropertyCallSignatureContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(247);
				callSignature();
				}
				break;
			case SemiColon:
				_localctx = new PropertyWithoutTypeAnnotationContext(_localctx);
				enterOuterAlt(_localctx, 3);
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

	public static class PropertyNameContext extends ParserRuleContext {
		public BindingIdentifierContext bindingIdentifier() {
			return getRuleContext(BindingIdentifierContext.class,0);
		}
		public PropertyNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).enterPropertyName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).exitPropertyName(this);
		}
	}

	public final PropertyNameContext propertyName() throws RecognitionException {
		PropertyNameContext _localctx = new PropertyNameContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_propertyName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
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

	public static class ExportIdentifierContext extends ParserRuleContext {
		public BindingIdentifierContext bindingIdentifier() {
			return getRuleContext(BindingIdentifierContext.class,0);
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
		enterRule(_localctx, 30, RULE_exportIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			match(Export);
			setState(254);
			match(Assign);
			setState(255);
			bindingIdentifier();
			setState(256);
			match(SemiColon);
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
		enterRule(_localctx, 32, RULE_numericLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			_la = _input.LA(1);
			if ( !(((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (DecimalLiteral - 77)) | (1L << (HexIntegerLiteral - 77)) | (1L << (OctalIntegerLiteral - 77)))) != 0)) ) {
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
		public BindingIdentifierContext bindingIdentifier() {
			return getRuleContext(BindingIdentifierContext.class,0);
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
		enterRule(_localctx, 34, RULE_typeDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			match(Type);
			setState(261);
			bindingIdentifier();
			setState(262);
			match(Assign);
			setState(263);
			type();
			setState(264);
			match(SemiColon);
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
		enterRule(_localctx, 36, RULE_typeParameters);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			match(LessThan);
			setState(267);
			typeParameterList();
			setState(268);
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
		enterRule(_localctx, 38, RULE_typeParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			typeParameter();
			setState(275);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(271);
				match(Comma);
				setState(272);
				typeParameter();
				}
				}
				setState(277);
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
		enterRule(_localctx, 40, RULE_typeParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			bindingIdentifier();
			setState(280);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Extends) {
				{
				setState(279);
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
		enterRule(_localctx, 42, RULE_constraint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			match(Extends);
			setState(283);
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
		enterRule(_localctx, 44, RULE_typeArguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			match(LessThan);
			setState(286);
			typeArgumentList();
			setState(287);
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
		enterRule(_localctx, 46, RULE_typeArgumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			type();
			setState(294);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(290);
				match(Comma);
				setState(291);
				type();
				}
				}
				setState(296);
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
		enterRule(_localctx, 48, RULE_type);
		try {
			setState(300);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(297);
				unionOrIntersectionOrPrimaryType(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(298);
				functionType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(299);
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

	public static class UnionOrIntersectionOrPrimaryTypeContext extends ParserRuleContext {
		public UnionOrIntersectionOrPrimaryTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unionOrIntersectionOrPrimaryType; }
	 
		public UnionOrIntersectionOrPrimaryTypeContext() { }
		public void copyFrom(UnionOrIntersectionOrPrimaryTypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IntersectionTypeContext extends UnionOrIntersectionOrPrimaryTypeContext {
		public List<UnionOrIntersectionOrPrimaryTypeContext> unionOrIntersectionOrPrimaryType() {
			return getRuleContexts(UnionOrIntersectionOrPrimaryTypeContext.class);
		}
		public UnionOrIntersectionOrPrimaryTypeContext unionOrIntersectionOrPrimaryType(int i) {
			return getRuleContext(UnionOrIntersectionOrPrimaryTypeContext.class,i);
		}
		public IntersectionTypeContext(UnionOrIntersectionOrPrimaryTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).enterIntersectionType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).exitIntersectionType(this);
		}
	}
	public static class IgnoreContext extends UnionOrIntersectionOrPrimaryTypeContext {
		public UnionOrIntersectionOrPrimaryTypeContext unionOrIntersectionOrPrimaryType() {
			return getRuleContext(UnionOrIntersectionOrPrimaryTypeContext.class,0);
		}
		public IgnoreContext(UnionOrIntersectionOrPrimaryTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).enterIgnore(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).exitIgnore(this);
		}
	}
	public static class PrimaryOrOptArrayContext extends UnionOrIntersectionOrPrimaryTypeContext {
		public PrimaryOrArrayContext primaryOrArray() {
			return getRuleContext(PrimaryOrArrayContext.class,0);
		}
		public PrimaryOrOptArrayContext(UnionOrIntersectionOrPrimaryTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).enterPrimaryOrOptArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).exitPrimaryOrOptArray(this);
		}
	}
	public static class UnionTypeContext extends UnionOrIntersectionOrPrimaryTypeContext {
		public List<UnionOrIntersectionOrPrimaryTypeContext> unionOrIntersectionOrPrimaryType() {
			return getRuleContexts(UnionOrIntersectionOrPrimaryTypeContext.class);
		}
		public UnionOrIntersectionOrPrimaryTypeContext unionOrIntersectionOrPrimaryType(int i) {
			return getRuleContext(UnionOrIntersectionOrPrimaryTypeContext.class,i);
		}
		public UnionTypeContext(UnionOrIntersectionOrPrimaryTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).enterUnionType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).exitUnionType(this);
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
		int _startState = 50;
		enterRecursionRule(_localctx, 50, RULE_unionOrIntersectionOrPrimaryType, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				_localctx = new IgnoreContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(303);
				match(OpenParen);
				setState(304);
				unionOrIntersectionOrPrimaryType(0);
				setState(305);
				match(CloseParen);
				}
				break;
			case 2:
				{
				_localctx = new PrimaryOrOptArrayContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(307);
				primaryOrArray();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(318);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(316);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
					case 1:
						{
						_localctx = new UnionTypeContext(new UnionOrIntersectionOrPrimaryTypeContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_unionOrIntersectionOrPrimaryType);
						setState(310);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(311);
						match(BitOr);
						setState(312);
						unionOrIntersectionOrPrimaryType(5);
						}
						break;
					case 2:
						{
						_localctx = new IntersectionTypeContext(new UnionOrIntersectionOrPrimaryTypeContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_unionOrIntersectionOrPrimaryType);
						setState(313);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(314);
						match(BitAnd);
						setState(315);
						unionOrIntersectionOrPrimaryType(4);
						}
						break;
					}
					} 
				}
				setState(320);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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
		enterRule(_localctx, 52, RULE_primaryOrArray);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			primaryType();
			setState(325);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(322);
					arrayDim();
					}
					} 
				}
				setState(327);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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
		enterRule(_localctx, 54, RULE_nestedType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			match(LessThan);
			setState(329);
			type();
			setState(330);
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
		enterRule(_localctx, 56, RULE_arrayDim);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(332);
			match(OpenBracket);
			setState(333);
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
		enterRule(_localctx, 58, RULE_primaryType);
		try {
			setState(345);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(335);
				parenthesizedType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(336);
				identifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(337);
				identifier();
				setState(338);
				typeGuard();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(340);
				typeReference();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(341);
				objectType();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(342);
				tupleType();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(343);
				typeQuery();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(344);
				thisType();
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
		enterRule(_localctx, 60, RULE_typeGuard);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			match(Is);
			setState(348);
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
		enterRule(_localctx, 62, RULE_parenthesizedType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			match(OpenParen);
			setState(351);
			type();
			setState(352);
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
		enterRule(_localctx, 64, RULE_typeReference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			identifierPath();
			setState(356);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(355);
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
		enterRule(_localctx, 66, RULE_objectType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			match(OpenBrace);
			setState(360);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << Module) | (1L << Is) | (1L << New) | (1L << Type) | (1L << Number) | (1L << String) | (1L << OpenBracket) | (1L << OpenParen) | (1L << LessThan))) != 0) || _la==Identifier || _la==StringLiteral) {
				{
				setState(359);
				typeBody();
				}
			}

			setState(362);
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
		enterRule(_localctx, 68, RULE_typeBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			typeMemberList();
			setState(366);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SemiColon || _la==Comma) {
				{
				setState(365);
				_la = _input.LA(1);
				if ( !(_la==SemiColon || _la==Comma) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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
		enterRule(_localctx, 70, RULE_typeMemberList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			typeMember();
			setState(373);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(369);
					_la = _input.LA(1);
					if ( !(_la==SemiColon || _la==Comma) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(370);
					typeMember();
					}
					} 
				}
				setState(375);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
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
		enterRule(_localctx, 72, RULE_typeMember);
		try {
			setState(381);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(376);
				propertySignature();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(377);
				callSignature();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(378);
				constructSignature();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(379);
				indexSignature();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(380);
				methodSignature();
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
		public TypeElementTypesContext typeElementTypes() {
			return getRuleContext(TypeElementTypesContext.class,0);
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
		enterRule(_localctx, 74, RULE_tupleType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			match(OpenBracket);
			setState(384);
			typeElementTypes();
			setState(385);
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

	public static class TypeElementTypesContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public TypeElementTypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeElementTypes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).enterTypeElementTypes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).exitTypeElementTypes(this);
		}
	}

	public final TypeElementTypesContext typeElementTypes() throws RecognitionException {
		TypeElementTypesContext _localctx = new TypeElementTypesContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_typeElementTypes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
			type();
			setState(392);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(388);
				match(Comma);
				setState(389);
				type();
				}
				}
				setState(394);
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
		enterRule(_localctx, 78, RULE_functionType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LessThan) {
				{
				setState(395);
				typeParameters();
				}
			}

			setState(398);
			match(OpenParen);
			setState(400);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << Module) | (1L << Is) | (1L << Public) | (1L << Protected) | (1L << Private) | (1L << Type) | (1L << Number) | (1L << String) | (1L << DotDotDot))) != 0) || _la==Identifier || _la==StringLiteral) {
				{
				setState(399);
				parameterList();
				}
			}

			setState(402);
			match(CloseParen);
			setState(403);
			match(ThickArrow);
			setState(404);
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
		enterRule(_localctx, 80, RULE_constructorType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(406);
			match(New);
			setState(408);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LessThan) {
				{
				setState(407);
				typeParameters();
				}
			}

			setState(410);
			match(OpenParen);
			setState(412);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << Module) | (1L << Is) | (1L << Public) | (1L << Protected) | (1L << Private) | (1L << Type) | (1L << Number) | (1L << String) | (1L << DotDotDot))) != 0) || _la==Identifier || _la==StringLiteral) {
				{
				setState(411);
				parameterList();
				}
			}

			setState(414);
			match(CloseParen);
			setState(415);
			match(ThickArrow);
			setState(416);
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
		enterRule(_localctx, 82, RULE_typeQuery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(418);
			match(Typeof);
			setState(419);
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
		enterRule(_localctx, 84, RULE_thisType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(421);
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
		public PropertyNameContext propertyName() {
			return getRuleContext(PropertyNameContext.class,0);
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
		enterRule(_localctx, 86, RULE_propertySignature);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(423);
			propertyName();
			setState(425);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==QuestionMark) {
				{
				setState(424);
				match(QuestionMark);
				}
			}

			setState(428);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(427);
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
		enterRule(_localctx, 88, RULE_typeAnnotation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(430);
			match(Colon);
			setState(431);
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
		enterRule(_localctx, 90, RULE_callSignature);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(434);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LessThan) {
				{
				setState(433);
				typeParameters();
				}
			}

			setState(436);
			match(OpenParen);
			setState(438);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << Module) | (1L << Is) | (1L << Public) | (1L << Protected) | (1L << Private) | (1L << Type) | (1L << Number) | (1L << String) | (1L << DotDotDot))) != 0) || _la==Identifier || _la==StringLiteral) {
				{
				setState(437);
				parameterList();
				}
			}

			setState(440);
			match(CloseParen);
			setState(442);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(441);
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
		enterRule(_localctx, 92, RULE_parameterList);
		int _la;
		try {
			setState(462);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(444);
				requiredParameterList();
				setState(454);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(445);
					match(Comma);
					{
					setState(452);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__0:
					case Module:
					case Is:
					case Public:
					case Protected:
					case Private:
					case Type:
					case Number:
					case String:
					case Identifier:
					case StringLiteral:
						{
						setState(446);
						optionalParameterList();
						setState(449);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==Comma) {
							{
							setState(447);
							match(Comma);
							setState(448);
							restParameter();
							}
						}

						}
						break;
					case DotDotDot:
						{
						setState(451);
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
				setState(456);
				optionalParameterList();
				setState(459);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(457);
					match(Comma);
					setState(458);
					restParameter();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(461);
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
		enterRule(_localctx, 94, RULE_requiredParameterList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(464);
			requiredParameter();
			setState(469);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(465);
					match(Comma);
					setState(466);
					requiredParameter();
					}
					} 
				}
				setState(471);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
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
		enterRule(_localctx, 96, RULE_requiredParameter);
		int _la;
		try {
			setState(483);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(473);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Public) | (1L << Protected) | (1L << Private))) != 0)) {
					{
					setState(472);
					accessibilityModifier();
					}
				}

				setState(475);
				bindingIdentifier();
				setState(477);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(476);
					typeAnnotation();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(479);
				bindingIdentifier();
				setState(480);
				match(Colon);
				setState(481);
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
		enterRule(_localctx, 98, RULE_accessibilityModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(485);
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
		enterRule(_localctx, 100, RULE_optionalParameterList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(487);
			optionalParameter();
			setState(492);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(488);
					match(Comma);
					setState(489);
					optionalParameter();
					}
					} 
				}
				setState(494);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
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
		enterRule(_localctx, 102, RULE_optionalParameter);
		int _la;
		try {
			setState(510);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(496);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Public) | (1L << Protected) | (1L << Private))) != 0)) {
					{
					setState(495);
					accessibilityModifier();
					}
				}

				setState(498);
				bindingIdentifier();
				setState(500);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==QuestionMark) {
					{
					setState(499);
					match(QuestionMark);
					}
				}

				setState(503);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(502);
					typeAnnotation();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(505);
				bindingIdentifier();
				setState(506);
				match(QuestionMark);
				setState(507);
				match(Colon);
				setState(508);
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
		enterRule(_localctx, 104, RULE_restParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(512);
			match(DotDotDot);
			setState(513);
			bindingIdentifier();
			setState(515);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(514);
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
		enterRule(_localctx, 106, RULE_constructSignature);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(517);
			match(New);
			setState(519);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LessThan) {
				{
				setState(518);
				typeParameters();
				}
			}

			setState(521);
			match(OpenParen);
			setState(523);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << Module) | (1L << Is) | (1L << Public) | (1L << Protected) | (1L << Private) | (1L << Type) | (1L << Number) | (1L << String) | (1L << DotDotDot))) != 0) || _la==Identifier || _la==StringLiteral) {
				{
				setState(522);
				parameterList();
				}
			}

			setState(525);
			match(CloseParen);
			setState(527);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(526);
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
		enterRule(_localctx, 108, RULE_indexSignature);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(529);
			match(OpenBracket);
			setState(530);
			bindingIdentifier();
			setState(531);
			match(Colon);
			setState(532);
			_la = _input.LA(1);
			if ( !(_la==Number || _la==String) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(533);
			match(CloseBracket);
			setState(534);
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
		public PropertyNameContext propertyName() {
			return getRuleContext(PropertyNameContext.class,0);
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
		enterRule(_localctx, 110, RULE_methodSignature);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(536);
			propertyName();
			setState(538);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==QuestionMark) {
				{
				setState(537);
				match(QuestionMark);
				}
			}

			setState(540);
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

	public static class TypeAliasDeclarationContext extends ParserRuleContext {
		public BindingIdentifierContext bindingIdentifier() {
			return getRuleContext(BindingIdentifierContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public TypeAliasDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeAliasDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).enterTypeAliasDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GenScalaFacadesFromTypescriptListener ) ((GenScalaFacadesFromTypescriptListener)listener).exitTypeAliasDeclaration(this);
		}
	}

	public final TypeAliasDeclarationContext typeAliasDeclaration() throws RecognitionException {
		TypeAliasDeclarationContext _localctx = new TypeAliasDeclarationContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_typeAliasDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(542);
			match(Type);
			setState(543);
			bindingIdentifier();
			setState(545);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LessThan) {
				{
				setState(544);
				typeParameters();
				}
			}

			setState(547);
			match(Assign);
			setState(548);
			type();
			setState(549);
			match(SemiColon);
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
		enterRule(_localctx, 114, RULE_constExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(551);
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
		public ObjectTypeContext objectType() {
			return getRuleContext(ObjectTypeContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public ExtendsClauseContext extendsClause() {
			return getRuleContext(ExtendsClauseContext.class,0);
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
		enterRule(_localctx, 116, RULE_interfaceDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(553);
			match(Interface);
			setState(554);
			bindingIdentifier();
			setState(556);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LessThan) {
				{
				setState(555);
				typeParameters();
				}
			}

			setState(559);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Extends) {
				{
				setState(558);
				extendsClause();
				}
			}

			setState(561);
			objectType();
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
		enterRule(_localctx, 118, RULE_extendsClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(563);
			match(Extends);
			setState(564);
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
		enterRule(_localctx, 120, RULE_classOrInterfaceTypeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(566);
			typeReference();
			setState(571);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(567);
				match(Comma);
				setState(568);
				typeReference();
				}
				}
				setState(573);
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
		enterRule(_localctx, 122, RULE_classHeritage);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(575);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Extends) {
				{
				setState(574);
				extendsClause();
				}
			}

			setState(578);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Implements) {
				{
				setState(577);
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
		enterRule(_localctx, 124, RULE_implementsClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(580);
			match(Implements);
			setState(581);
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
		enterRule(_localctx, 126, RULE_enumDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(584);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Const) {
				{
				setState(583);
				match(Const);
				}
			}

			setState(586);
			match(Enum);
			setState(587);
			bindingIdentifier();
			setState(588);
			match(OpenBrace);
			setState(590);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << Module) | (1L << Is) | (1L << Type) | (1L << Number) | (1L << String))) != 0) || _la==Identifier || _la==StringLiteral) {
				{
				setState(589);
				enumBody();
				}
			}

			setState(592);
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
		enterRule(_localctx, 128, RULE_enumBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(594);
			enumMemberList();
			setState(596);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(595);
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
		enterRule(_localctx, 130, RULE_enumMemberList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(598);
			enumMember();
			setState(603);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(599);
					match(Comma);
					setState(600);
					enumMember();
					}
					} 
				}
				setState(605);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
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
		public PropertyNameContext propertyName() {
			return getRuleContext(PropertyNameContext.class,0);
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
		enterRule(_localctx, 132, RULE_enumMember);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(606);
			propertyName();
			setState(609);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Assign) {
				{
				setState(607);
				match(Assign);
				setState(608);
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
		enterRule(_localctx, 134, RULE_enumValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(611);
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
		enterRule(_localctx, 136, RULE_identifierPath);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(613);
			bindingIdentifier();
			setState(618);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(614);
					match(Dot);
					setState(615);
					bindingIdentifier();
					}
					} 
				}
				setState(620);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
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
		enterRule(_localctx, 138, RULE_bindingIdentifier);
		try {
			setState(623);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case Module:
			case Is:
			case Type:
			case Number:
			case String:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(621);
				identifier();
				}
				break;
			case StringLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(622);
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
		enterRule(_localctx, 140, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(625);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << Module) | (1L << Is) | (1L << Type) | (1L << Number) | (1L << String))) != 0) || _la==Identifier) ) {
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
		case 25:
			return unionOrIntersectionOrPrimaryType_sempred((UnionOrIntersectionOrPrimaryTypeContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean unionOrIntersectionOrPrimaryType_sempred(UnionOrIntersectionOrPrimaryTypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3W\u0276\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\3\2"+
		"\7\2\u0092\n\2\f\2\16\2\u0095\13\2\3\2\3\2\3\3\3\3\3\3\5\3\u009c\n\3\3"+
		"\3\5\3\u009f\n\3\3\4\3\4\3\4\3\4\7\4\u00a5\n\4\f\4\16\4\u00a8\13\4\3\4"+
		"\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u00b5\n\5\3\6\3\6\3\6\3\6"+
		"\3\7\3\7\3\7\7\7\u00be\n\7\f\7\16\7\u00c1\13\7\3\b\3\b\5\b\u00c5\n\b\3"+
		"\t\3\t\3\t\3\t\3\t\3\n\5\n\u00cd\n\n\3\n\3\n\3\n\5\n\u00d2\n\n\3\n\3\n"+
		"\3\n\5\n\u00d7\n\n\3\n\3\n\3\13\3\13\7\13\u00dd\n\13\f\13\16\13\u00e0"+
		"\13\13\3\f\3\f\3\f\5\f\u00e5\n\f\3\r\3\r\3\r\5\r\u00ea\n\r\3\r\3\r\3\r"+
		"\3\16\5\16\u00f0\n\16\3\16\5\16\u00f3\n\16\3\16\3\16\3\16\3\16\3\17\3"+
		"\17\3\17\5\17\u00fc\n\17\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\7\25"+
		"\u0114\n\25\f\25\16\25\u0117\13\25\3\26\3\26\5\26\u011b\n\26\3\27\3\27"+
		"\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\7\31\u0127\n\31\f\31\16\31\u012a"+
		"\13\31\3\32\3\32\3\32\5\32\u012f\n\32\3\33\3\33\3\33\3\33\3\33\3\33\5"+
		"\33\u0137\n\33\3\33\3\33\3\33\3\33\3\33\3\33\7\33\u013f\n\33\f\33\16\33"+
		"\u0142\13\33\3\34\3\34\7\34\u0146\n\34\f\34\16\34\u0149\13\34\3\35\3\35"+
		"\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\5\37\u015c\n\37\3 \3 \3 \3!\3!\3!\3!\3\"\3\"\5\"\u0167\n\"\3#\3"+
		"#\5#\u016b\n#\3#\3#\3$\3$\5$\u0171\n$\3%\3%\3%\7%\u0176\n%\f%\16%\u0179"+
		"\13%\3&\3&\3&\3&\3&\5&\u0180\n&\3\'\3\'\3\'\3\'\3(\3(\3(\7(\u0189\n(\f"+
		"(\16(\u018c\13(\3)\5)\u018f\n)\3)\3)\5)\u0193\n)\3)\3)\3)\3)\3*\3*\5*"+
		"\u019b\n*\3*\3*\5*\u019f\n*\3*\3*\3*\3*\3+\3+\3+\3,\3,\3-\3-\5-\u01ac"+
		"\n-\3-\5-\u01af\n-\3.\3.\3.\3/\5/\u01b5\n/\3/\3/\5/\u01b9\n/\3/\3/\5/"+
		"\u01bd\n/\3\60\3\60\3\60\3\60\3\60\5\60\u01c4\n\60\3\60\5\60\u01c7\n\60"+
		"\5\60\u01c9\n\60\3\60\3\60\3\60\5\60\u01ce\n\60\3\60\5\60\u01d1\n\60\3"+
		"\61\3\61\3\61\7\61\u01d6\n\61\f\61\16\61\u01d9\13\61\3\62\5\62\u01dc\n"+
		"\62\3\62\3\62\5\62\u01e0\n\62\3\62\3\62\3\62\3\62\5\62\u01e6\n\62\3\63"+
		"\3\63\3\64\3\64\3\64\7\64\u01ed\n\64\f\64\16\64\u01f0\13\64\3\65\5\65"+
		"\u01f3\n\65\3\65\3\65\5\65\u01f7\n\65\3\65\5\65\u01fa\n\65\3\65\3\65\3"+
		"\65\3\65\3\65\5\65\u0201\n\65\3\66\3\66\3\66\5\66\u0206\n\66\3\67\3\67"+
		"\5\67\u020a\n\67\3\67\3\67\5\67\u020e\n\67\3\67\3\67\5\67\u0212\n\67\3"+
		"8\38\38\38\38\38\38\39\39\59\u021d\n9\39\39\3:\3:\3:\5:\u0224\n:\3:\3"+
		":\3:\3:\3;\3;\3<\3<\3<\5<\u022f\n<\3<\5<\u0232\n<\3<\3<\3=\3=\3=\3>\3"+
		">\3>\7>\u023c\n>\f>\16>\u023f\13>\3?\5?\u0242\n?\3?\5?\u0245\n?\3@\3@"+
		"\3@\3A\5A\u024b\nA\3A\3A\3A\3A\5A\u0251\nA\3A\3A\3B\3B\5B\u0257\nB\3C"+
		"\3C\3C\7C\u025c\nC\fC\16C\u025f\13C\3D\3D\3D\5D\u0264\nD\3E\3E\3F\3F\3"+
		"F\7F\u026b\nF\fF\16F\u026e\13F\3G\3G\5G\u0272\nG\3H\3H\3H\2\3\64I\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNP"+
		"RTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e"+
		"\2\t\4\2\3\3\21\21\5\2\7\7\20\20\22\22\3\2OQ\3\2\'(\3\2\24\26\3\2\35\36"+
		"\7\2\3\3\21\21\23\23\34\36RR\u028a\2\u0093\3\2\2\2\4\u009e\3\2\2\2\6\u00a0"+
		"\3\2\2\2\b\u00b4\3\2\2\2\n\u00b6\3\2\2\2\f\u00ba\3\2\2\2\16\u00c2\3\2"+
		"\2\2\20\u00c6\3\2\2\2\22\u00cc\3\2\2\2\24\u00da\3\2\2\2\26\u00e4\3\2\2"+
		"\2\30\u00e6\3\2\2\2\32\u00ef\3\2\2\2\34\u00fb\3\2\2\2\36\u00fd\3\2\2\2"+
		" \u00ff\3\2\2\2\"\u0104\3\2\2\2$\u0106\3\2\2\2&\u010c\3\2\2\2(\u0110\3"+
		"\2\2\2*\u0118\3\2\2\2,\u011c\3\2\2\2.\u011f\3\2\2\2\60\u0123\3\2\2\2\62"+
		"\u012e\3\2\2\2\64\u0136\3\2\2\2\66\u0143\3\2\2\28\u014a\3\2\2\2:\u014e"+
		"\3\2\2\2<\u015b\3\2\2\2>\u015d\3\2\2\2@\u0160\3\2\2\2B\u0164\3\2\2\2D"+
		"\u0168\3\2\2\2F\u016e\3\2\2\2H\u0172\3\2\2\2J\u017f\3\2\2\2L\u0181\3\2"+
		"\2\2N\u0185\3\2\2\2P\u018e\3\2\2\2R\u0198\3\2\2\2T\u01a4\3\2\2\2V\u01a7"+
		"\3\2\2\2X\u01a9\3\2\2\2Z\u01b0\3\2\2\2\\\u01b4\3\2\2\2^\u01d0\3\2\2\2"+
		"`\u01d2\3\2\2\2b\u01e5\3\2\2\2d\u01e7\3\2\2\2f\u01e9\3\2\2\2h\u0200\3"+
		"\2\2\2j\u0202\3\2\2\2l\u0207\3\2\2\2n\u0213\3\2\2\2p\u021a\3\2\2\2r\u0220"+
		"\3\2\2\2t\u0229\3\2\2\2v\u022b\3\2\2\2x\u0235\3\2\2\2z\u0238\3\2\2\2|"+
		"\u0241\3\2\2\2~\u0246\3\2\2\2\u0080\u024a\3\2\2\2\u0082\u0254\3\2\2\2"+
		"\u0084\u0258\3\2\2\2\u0086\u0260\3\2\2\2\u0088\u0265\3\2\2\2\u008a\u0267"+
		"\3\2\2\2\u008c\u0271\3\2\2\2\u008e\u0273\3\2\2\2\u0090\u0092\5\4\3\2\u0091"+
		"\u0090\3\2\2\2\u0092\u0095\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2"+
		"\2\2\u0094\u0096\3\2\2\2\u0095\u0093\3\2\2\2\u0096\u0097\7\2\2\3\u0097"+
		"\3\3\2\2\2\u0098\u009b\7\t\2\2\u0099\u009c\5\6\4\2\u009a\u009c\5\b\5\2"+
		"\u009b\u0099\3\2\2\2\u009b\u009a\3\2\2\2\u009c\u009f\3\2\2\2\u009d\u009f"+
		"\5v<\2\u009e\u0098\3\2\2\2\u009e\u009d\3\2\2\2\u009f\5\3\2\2\2\u00a0\u00a1"+
		"\t\2\2\2\u00a1\u00a2\5\u008aF\2\u00a2\u00a6\7%\2\2\u00a3\u00a5\5\b\5\2"+
		"\u00a4\u00a3\3\2\2\2\u00a5\u00a8\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7"+
		"\3\2\2\2\u00a7\u00a9\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a9\u00aa\7&\2\2\u00aa"+
		"\7\3\2\2\2\u00ab\u00b5\5\n\6\2\u00ac\u00b5\5r:\2\u00ad\u00b5\5$\23\2\u00ae"+
		"\u00b5\5\20\t\2\u00af\u00b5\5v<\2\u00b0\u00b5\5\22\n\2\u00b1\u00b5\5\u0080"+
		"A\2\u00b2\u00b5\5 \21\2\u00b3\u00b5\5\6\4\2\u00b4\u00ab\3\2\2\2\u00b4"+
		"\u00ac\3\2\2\2\u00b4\u00ad\3\2\2\2\u00b4\u00ae\3\2\2\2\u00b4\u00af\3\2"+
		"\2\2\u00b4\u00b0\3\2\2\2\u00b4\u00b1\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4"+
		"\u00b3\3\2\2\2\u00b5\t\3\2\2\2\u00b6\u00b7\t\3\2\2\u00b7\u00b8\5\f\7\2"+
		"\u00b8\u00b9\7\'\2\2\u00b9\13\3\2\2\2\u00ba\u00bf\5\16\b\2\u00bb\u00bc"+
		"\7(\2\2\u00bc\u00be\5\16\b\2\u00bd\u00bb\3\2\2\2\u00be\u00c1\3\2\2\2\u00bf"+
		"\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\r\3\2\2\2\u00c1\u00bf\3\2\2\2"+
		"\u00c2\u00c4\5\u008cG\2\u00c3\u00c5\5Z.\2\u00c4\u00c3\3\2\2\2\u00c4\u00c5"+
		"\3\2\2\2\u00c5\17\3\2\2\2\u00c6\u00c7\7\r\2\2\u00c7\u00c8\5\u008cG\2\u00c8"+
		"\u00c9\5\\/\2\u00c9\u00ca\7\'\2\2\u00ca\21\3\2\2\2\u00cb\u00cd\7\5\2\2"+
		"\u00cc\u00cb\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cf"+
		"\7\6\2\2\u00cf\u00d1\5\u008cG\2\u00d0\u00d2\5&\24\2\u00d1\u00d0\3\2\2"+
		"\2\u00d1\u00d2\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d4\5|?\2\u00d4\u00d6"+
		"\7%\2\2\u00d5\u00d7\5\24\13\2\u00d6\u00d5\3\2\2\2\u00d6\u00d7\3\2\2\2"+
		"\u00d7\u00d8\3\2\2\2\u00d8\u00d9\7&\2\2\u00d9\23\3\2\2\2\u00da\u00de\5"+
		"\26\f\2\u00db\u00dd\5\26\f\2\u00dc\u00db\3\2\2\2\u00dd\u00e0\3\2\2\2\u00de"+
		"\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df\25\3\2\2\2\u00e0\u00de\3\2\2"+
		"\2\u00e1\u00e5\5\30\r\2\u00e2\u00e5\5\32\16\2\u00e3\u00e5\5n8\2\u00e4"+
		"\u00e1\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e3\3\2\2\2\u00e5\27\3\2\2"+
		"\2\u00e6\u00e7\7\b\2\2\u00e7\u00e9\7#\2\2\u00e8\u00ea\5^\60\2\u00e9\u00e8"+
		"\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ec\7$\2\2\u00ec"+
		"\u00ed\7\'\2\2\u00ed\31\3\2\2\2\u00ee\u00f0\5d\63\2\u00ef\u00ee\3\2\2"+
		"\2\u00ef\u00f0\3\2\2\2\u00f0\u00f2\3\2\2\2\u00f1\u00f3\7\27\2\2\u00f2"+
		"\u00f1\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f5\5\36"+
		"\20\2\u00f5\u00f6\5\34\17\2\u00f6\u00f7\7\'\2\2\u00f7\33\3\2\2\2\u00f8"+
		"\u00fc\5Z.\2\u00f9\u00fc\5\\/\2\u00fa\u00fc\3\2\2\2\u00fb\u00f8\3\2\2"+
		"\2\u00fb\u00f9\3\2\2\2\u00fb\u00fa\3\2\2\2\u00fc\35\3\2\2\2\u00fd\u00fe"+
		"\5\u008cG\2\u00fe\37\3\2\2\2\u00ff\u0100\7\13\2\2\u0100\u0101\7)\2\2\u0101"+
		"\u0102\5\u008cG\2\u0102\u0103\7\'\2\2\u0103!\3\2\2\2\u0104\u0105\t\4\2"+
		"\2\u0105#\3\2\2\2\u0106\u0107\7\34\2\2\u0107\u0108\5\u008cG\2\u0108\u0109"+
		"\7)\2\2\u0109\u010a\5\62\32\2\u010a\u010b\7\'\2\2\u010b%\3\2\2\2\u010c"+
		"\u010d\7\66\2\2\u010d\u010e\5(\25\2\u010e\u010f\7\67\2\2\u010f\'\3\2\2"+
		"\2\u0110\u0115\5*\26\2\u0111\u0112\7(\2\2\u0112\u0114\5*\26\2\u0113\u0111"+
		"\3\2\2\2\u0114\u0117\3\2\2\2\u0115\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116"+
		")\3\2\2\2\u0117\u0115\3\2\2\2\u0118\u011a\5\u008cG\2\u0119\u011b\5,\27"+
		"\2\u011a\u0119\3\2\2\2\u011a\u011b\3\2\2\2\u011b+\3\2\2\2\u011c\u011d"+
		"\7\f\2\2\u011d\u011e\5\62\32\2\u011e-\3\2\2\2\u011f\u0120\7\66\2\2\u0120"+
		"\u0121\5\60\31\2\u0121\u0122\7\67\2\2\u0122/\3\2\2\2\u0123\u0128\5\62"+
		"\32\2\u0124\u0125\7(\2\2\u0125\u0127\5\62\32\2\u0126\u0124\3\2\2\2\u0127"+
		"\u012a\3\2\2\2\u0128\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129\61\3\2\2"+
		"\2\u012a\u0128\3\2\2\2\u012b\u012f\5\64\33\2\u012c\u012f\5P)\2\u012d\u012f"+
		"\5R*\2\u012e\u012b\3\2\2\2\u012e\u012c\3\2\2\2\u012e\u012d\3\2\2\2\u012f"+
		"\63\3\2\2\2\u0130\u0131\b\33\1\2\u0131\u0132\7#\2\2\u0132\u0133\5\64\33"+
		"\2\u0133\u0134\7$\2\2\u0134\u0137\3\2\2\2\u0135\u0137\5\66\34\2\u0136"+
		"\u0130\3\2\2\2\u0136\u0135\3\2\2\2\u0137\u0140\3\2\2\2\u0138\u0139\f\6"+
		"\2\2\u0139\u013a\7@\2\2\u013a\u013f\5\64\33\7\u013b\u013c\f\5\2\2\u013c"+
		"\u013d\7>\2\2\u013d\u013f\5\64\33\6\u013e\u0138\3\2\2\2\u013e\u013b\3"+
		"\2\2\2\u013f\u0142\3\2\2\2\u0140\u013e\3\2\2\2\u0140\u0141\3\2\2\2\u0141"+
		"\65\3\2\2\2\u0142\u0140\3\2\2\2\u0143\u0147\5<\37\2\u0144\u0146\5:\36"+
		"\2\u0145\u0144\3\2\2\2\u0146\u0149\3\2\2\2\u0147\u0145\3\2\2\2\u0147\u0148"+
		"\3\2\2\2\u0148\67\3\2\2\2\u0149\u0147\3\2\2\2\u014a\u014b\7\66\2\2\u014b"+
		"\u014c\5\62\32\2\u014c\u014d\7\67\2\2\u014d9\3\2\2\2\u014e\u014f\7!\2"+
		"\2\u014f\u0150\7\"\2\2\u0150;\3\2\2\2\u0151\u015c\5@!\2\u0152\u015c\5"+
		"\u008eH\2\u0153\u0154\5\u008eH\2\u0154\u0155\5> \2\u0155\u015c\3\2\2\2"+
		"\u0156\u015c\5B\"\2\u0157\u015c\5D#\2\u0158\u015c\5L\'\2\u0159\u015c\5"+
		"T+\2\u015a\u015c\5V,\2\u015b\u0151\3\2\2\2\u015b\u0152\3\2\2\2\u015b\u0153"+
		"\3\2\2\2\u015b\u0156\3\2\2\2\u015b\u0157\3\2\2\2\u015b\u0158\3\2\2\2\u015b"+
		"\u0159\3\2\2\2\u015b\u015a\3\2\2\2\u015c=\3\2\2\2\u015d\u015e\7\23\2\2"+
		"\u015e\u015f\5\62\32\2\u015f?\3\2\2\2\u0160\u0161\7#\2\2\u0161\u0162\5"+
		"\62\32\2\u0162\u0163\7$\2\2\u0163A\3\2\2\2\u0164\u0166\5\u008aF\2\u0165"+
		"\u0167\5.\30\2\u0166\u0165\3\2\2\2\u0166\u0167\3\2\2\2\u0167C\3\2\2\2"+
		"\u0168\u016a\7%\2\2\u0169\u016b\5F$\2\u016a\u0169\3\2\2\2\u016a\u016b"+
		"\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u016d\7&\2\2\u016dE\3\2\2\2\u016e\u0170"+
		"\5H%\2\u016f\u0171\t\5\2\2\u0170\u016f\3\2\2\2\u0170\u0171\3\2\2\2\u0171"+
		"G\3\2\2\2\u0172\u0177\5J&\2\u0173\u0174\t\5\2\2\u0174\u0176\5J&\2\u0175"+
		"\u0173\3\2\2\2\u0176\u0179\3\2\2\2\u0177\u0175\3\2\2\2\u0177\u0178\3\2"+
		"\2\2\u0178I\3\2\2\2\u0179\u0177\3\2\2\2\u017a\u0180\5X-\2\u017b\u0180"+
		"\5\\/\2\u017c\u0180\5l\67\2\u017d\u0180\5n8\2\u017e\u0180\5p9\2\u017f"+
		"\u017a\3\2\2\2\u017f\u017b\3\2\2\2\u017f\u017c\3\2\2\2\u017f\u017d\3\2"+
		"\2\2\u017f\u017e\3\2\2\2\u0180K\3\2\2\2\u0181\u0182\7!\2\2\u0182\u0183"+
		"\5N(\2\u0183\u0184\7\"\2\2\u0184M\3\2\2\2\u0185\u018a\5\62\32\2\u0186"+
		"\u0187\7(\2\2\u0187\u0189\5\62\32\2\u0188\u0186\3\2\2\2\u0189\u018c\3"+
		"\2\2\2\u018a\u0188\3\2\2\2\u018a\u018b\3\2\2\2\u018bO\3\2\2\2\u018c\u018a"+
		"\3\2\2\2\u018d\u018f\5&\24\2\u018e\u018d\3\2\2\2\u018e\u018f\3\2\2\2\u018f"+
		"\u0190\3\2\2\2\u0190\u0192\7#\2\2\u0191\u0193\5^\60\2\u0192\u0191\3\2"+
		"\2\2\u0192\u0193\3\2\2\2\u0193\u0194\3\2\2\2\u0194\u0195\7$\2\2\u0195"+
		"\u0196\7\37\2\2\u0196\u0197\5\62\32\2\u0197Q\3\2\2\2\u0198\u019a\7\31"+
		"\2\2\u0199\u019b\5&\24\2\u019a\u0199\3\2\2\2\u019a\u019b\3\2\2\2\u019b"+
		"\u019c\3\2\2\2\u019c\u019e\7#\2\2\u019d\u019f\5^\60\2\u019e\u019d\3\2"+
		"\2\2\u019e\u019f\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0\u01a1\7$\2\2\u01a1"+
		"\u01a2\7\37\2\2\u01a2\u01a3\5\62\32\2\u01a3S\3\2\2\2\u01a4\u01a5\7\32"+
		"\2\2\u01a5\u01a6\5\u008aF\2\u01a6U\3\2\2\2\u01a7\u01a8\7\33\2\2\u01a8"+
		"W\3\2\2\2\u01a9\u01ab\5\36\20\2\u01aa\u01ac\7*\2\2\u01ab\u01aa\3\2\2\2"+
		"\u01ab\u01ac\3\2\2\2\u01ac\u01ae\3\2\2\2\u01ad\u01af\5Z.\2\u01ae\u01ad"+
		"\3\2\2\2\u01ae\u01af\3\2\2\2\u01afY\3\2\2\2\u01b0\u01b1\7+\2\2\u01b1\u01b2"+
		"\5\62\32\2\u01b2[\3\2\2\2\u01b3\u01b5\5&\24\2\u01b4\u01b3\3\2\2\2\u01b4"+
		"\u01b5\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6\u01b8\7#\2\2\u01b7\u01b9\5^\60"+
		"\2\u01b8\u01b7\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba\u01bc"+
		"\7$\2\2\u01bb\u01bd\5Z.\2\u01bc\u01bb\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd"+
		"]\3\2\2\2\u01be\u01c8\5`\61\2\u01bf\u01c6\7(\2\2\u01c0\u01c3\5f\64\2\u01c1"+
		"\u01c2\7(\2\2\u01c2\u01c4\5j\66\2\u01c3\u01c1\3\2\2\2\u01c3\u01c4\3\2"+
		"\2\2\u01c4\u01c7\3\2\2\2\u01c5\u01c7\5j\66\2\u01c6\u01c0\3\2\2\2\u01c6"+
		"\u01c5\3\2\2\2\u01c7\u01c9\3\2\2\2\u01c8\u01bf\3\2\2\2\u01c8\u01c9\3\2"+
		"\2\2\u01c9\u01d1\3\2\2\2\u01ca\u01cd\5f\64\2\u01cb\u01cc\7(\2\2\u01cc"+
		"\u01ce\5j\66\2\u01cd\u01cb\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ce\u01d1\3\2"+
		"\2\2\u01cf\u01d1\5j\66\2\u01d0\u01be\3\2\2\2\u01d0\u01ca\3\2\2\2\u01d0"+
		"\u01cf\3\2\2\2\u01d1_\3\2\2\2\u01d2\u01d7\5b\62\2\u01d3\u01d4\7(\2\2\u01d4"+
		"\u01d6\5b\62\2\u01d5\u01d3\3\2\2\2\u01d6\u01d9\3\2\2\2\u01d7\u01d5\3\2"+
		"\2\2\u01d7\u01d8\3\2\2\2\u01d8a\3\2\2\2\u01d9\u01d7\3\2\2\2\u01da\u01dc"+
		"\5d\63\2\u01db\u01da\3\2\2\2\u01db\u01dc\3\2\2\2\u01dc\u01dd\3\2\2\2\u01dd"+
		"\u01df\5\u008cG\2\u01de\u01e0\5Z.\2\u01df\u01de\3\2\2\2\u01df\u01e0\3"+
		"\2\2\2\u01e0\u01e6\3\2\2\2\u01e1\u01e2\5\u008cG\2\u01e2\u01e3\7+\2\2\u01e3"+
		"\u01e4\7S\2\2\u01e4\u01e6\3\2\2\2\u01e5\u01db\3\2\2\2\u01e5\u01e1\3\2"+
		"\2\2\u01e6c\3\2\2\2\u01e7\u01e8\t\6\2\2\u01e8e\3\2\2\2\u01e9\u01ee\5h"+
		"\65\2\u01ea\u01eb\7(\2\2\u01eb\u01ed\5h\65\2\u01ec\u01ea\3\2\2\2\u01ed"+
		"\u01f0\3\2\2\2\u01ee\u01ec\3\2\2\2\u01ee\u01ef\3\2\2\2\u01efg\3\2\2\2"+
		"\u01f0\u01ee\3\2\2\2\u01f1\u01f3\5d\63\2\u01f2\u01f1\3\2\2\2\u01f2\u01f3"+
		"\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4\u01f6\5\u008cG\2\u01f5\u01f7\7*\2\2"+
		"\u01f6\u01f5\3\2\2\2\u01f6\u01f7\3\2\2\2\u01f7\u01f9\3\2\2\2\u01f8\u01fa"+
		"\5Z.\2\u01f9\u01f8\3\2\2\2\u01f9\u01fa\3\2\2\2\u01fa\u0201\3\2\2\2\u01fb"+
		"\u01fc\5\u008cG\2\u01fc\u01fd\7*\2\2\u01fd\u01fe\7+\2\2\u01fe\u01ff\7"+
		"S\2\2\u01ff\u0201\3\2\2\2\u0200\u01f2\3\2\2\2\u0200\u01fb\3\2\2\2\u0201"+
		"i\3\2\2\2\u0202\u0203\7 \2\2\u0203\u0205\5\u008cG\2\u0204\u0206\5Z.\2"+
		"\u0205\u0204\3\2\2\2\u0205\u0206\3\2\2\2\u0206k\3\2\2\2\u0207\u0209\7"+
		"\31\2\2\u0208\u020a\5&\24\2\u0209\u0208\3\2\2\2\u0209\u020a\3\2\2\2\u020a"+
		"\u020b\3\2\2\2\u020b\u020d\7#\2\2\u020c\u020e\5^\60\2\u020d\u020c\3\2"+
		"\2\2\u020d\u020e\3\2\2\2\u020e\u020f\3\2\2\2\u020f\u0211\7$\2\2\u0210"+
		"\u0212\5Z.\2\u0211\u0210\3\2\2\2\u0211\u0212\3\2\2\2\u0212m\3\2\2\2\u0213"+
		"\u0214\7!\2\2\u0214\u0215\5\u008cG\2\u0215\u0216\7+\2\2\u0216\u0217\t"+
		"\7\2\2\u0217\u0218\7\"\2\2\u0218\u0219\5Z.\2\u0219o\3\2\2\2\u021a\u021c"+
		"\5\36\20\2\u021b\u021d\7*\2\2\u021c\u021b\3\2\2\2\u021c\u021d\3\2\2\2"+
		"\u021d\u021e\3\2\2\2\u021e\u021f\5\\/\2\u021fq\3\2\2\2\u0220\u0221\7\34"+
		"\2\2\u0221\u0223\5\u008cG\2\u0222\u0224\5&\24\2\u0223\u0222\3\2\2\2\u0223"+
		"\u0224\3\2\2\2\u0224\u0225\3\2\2\2\u0225\u0226\7)\2\2\u0226\u0227\5\62"+
		"\32\2\u0227\u0228\7\'\2\2\u0228s\3\2\2\2\u0229\u022a\5\"\22\2\u022au\3"+
		"\2\2\2\u022b\u022c\7\17\2\2\u022c\u022e\5\u008cG\2\u022d\u022f\5&\24\2"+
		"\u022e\u022d\3\2\2\2\u022e\u022f\3\2\2\2\u022f\u0231\3\2\2\2\u0230\u0232"+
		"\5x=\2\u0231\u0230\3\2\2\2\u0231\u0232\3\2\2\2\u0232\u0233\3\2\2\2\u0233"+
		"\u0234\5D#\2\u0234w\3\2\2\2\u0235\u0236\7\f\2\2\u0236\u0237\5z>\2\u0237"+
		"y\3\2\2\2\u0238\u023d\5B\"\2\u0239\u023a\7(\2\2\u023a\u023c\5B\"\2\u023b"+
		"\u0239\3\2\2\2\u023c\u023f\3\2\2\2\u023d\u023b\3\2\2\2\u023d\u023e\3\2"+
		"\2\2\u023e{\3\2\2\2\u023f\u023d\3\2\2\2\u0240\u0242\5x=\2\u0241\u0240"+
		"\3\2\2\2\u0241\u0242\3\2\2\2\u0242\u0244\3\2\2\2\u0243\u0245\5~@\2\u0244"+
		"\u0243\3\2\2\2\u0244\u0245\3\2\2\2\u0245}\3\2\2\2\u0246\u0247\7\16\2\2"+
		"\u0247\u0248\5z>\2\u0248\177\3\2\2\2\u0249\u024b\7\7\2\2\u024a\u0249\3"+
		"\2\2\2\u024a\u024b\3\2\2\2\u024b\u024c\3\2\2\2\u024c\u024d\7\n\2\2\u024d"+
		"\u024e\5\u008cG\2\u024e\u0250\7%\2\2\u024f\u0251\5\u0082B\2\u0250\u024f"+
		"\3\2\2\2\u0250\u0251\3\2\2\2\u0251\u0252\3\2\2\2\u0252\u0253\7&\2\2\u0253"+
		"\u0081\3\2\2\2\u0254\u0256\5\u0084C\2\u0255\u0257\7(\2\2\u0256\u0255\3"+
		"\2\2\2\u0256\u0257\3\2\2\2\u0257\u0083\3\2\2\2\u0258\u025d\5\u0086D\2"+
		"\u0259\u025a\7(\2\2\u025a\u025c\5\u0086D\2\u025b\u0259\3\2\2\2\u025c\u025f"+
		"\3\2\2\2\u025d\u025b\3\2\2\2\u025d\u025e\3\2\2\2\u025e\u0085\3\2\2\2\u025f"+
		"\u025d\3\2\2\2\u0260\u0263\5\36\20\2\u0261\u0262\7)\2\2\u0262\u0264\5"+
		"\u0088E\2\u0263\u0261\3\2\2\2\u0263\u0264\3\2\2\2\u0264\u0087\3\2\2\2"+
		"\u0265\u0266\5t;\2\u0266\u0089\3\2\2\2\u0267\u026c\5\u008cG\2\u0268\u0269"+
		"\7,\2\2\u0269\u026b\5\u008cG\2\u026a\u0268\3\2\2\2\u026b\u026e\3\2\2\2"+
		"\u026c\u026a\3\2\2\2\u026c\u026d\3\2\2\2\u026d\u008b\3\2\2\2\u026e\u026c"+
		"\3\2\2\2\u026f\u0272\5\u008eH\2\u0270\u0272\7S\2\2\u0271\u026f\3\2\2\2"+
		"\u0271\u0270\3\2\2\2\u0272\u008d\3\2\2\2\u0273\u0274\t\b\2\2\u0274\u008f"+
		"\3\2\2\2J\u0093\u009b\u009e\u00a6\u00b4\u00bf\u00c4\u00cc\u00d1\u00d6"+
		"\u00de\u00e4\u00e9\u00ef\u00f2\u00fb\u0115\u011a\u0128\u012e\u0136\u013e"+
		"\u0140\u0147\u015b\u0166\u016a\u0170\u0177\u017f\u018a\u018e\u0192\u019a"+
		"\u019e\u01ab\u01ae\u01b4\u01b8\u01bc\u01c3\u01c6\u01c8\u01cd\u01d0\u01d7"+
		"\u01db\u01df\u01e5\u01ee\u01f2\u01f6\u01f9\u0200\u0205\u0209\u020d\u0211"+
		"\u021c\u0223\u022e\u0231\u023d\u0241\u0244\u024a\u0250\u0256\u025d\u0263"+
		"\u026c\u0271";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}