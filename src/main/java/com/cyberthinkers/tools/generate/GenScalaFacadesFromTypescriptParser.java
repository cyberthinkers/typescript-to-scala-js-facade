// Generated from C:/cyberthinkers-dev/typescript-to-scala-js-facade/src/main/java/com/cyberthinkers/tools/generate\GenScalaFacadesFromTypescript.g4 by ANTLR 4.7
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
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

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
		RULE_abstractOpt = 15, RULE_className = 16, RULE_ambientClassBodyElement = 17, 
		RULE_ambientConstructorDeclaration = 18, RULE_ambientPropertyMemberDeclaration = 19, 
		RULE_optStatic = 20, RULE_exportIdentifier = 21, RULE_numericLiteral = 22, 
		RULE_typeDeclaration = 23, RULE_typeDef = 24, RULE_typeParameters = 25, 
		RULE_typeParameterList = 26, RULE_typeParameter = 27, RULE_constraint = 28, 
		RULE_typeArguments = 29, RULE_typeArgumentList = 30, RULE_type = 31, RULE_unnamedInterface = 32, 
		RULE_unionOrIntersectionOrPrimaryType = 33, RULE_primaryOrArray = 34, 
		RULE_nestedType = 35, RULE_arrayDim = 36, RULE_primaryType = 37, RULE_typeGuard = 38, 
		RULE_parenthesizedType = 39, RULE_typeReference = 40, RULE_objectType = 41, 
		RULE_typeBody = 42, RULE_typeMemberList = 43, RULE_typeMember = 44, RULE_tupleType = 45, 
		RULE_tupleTypeElements = 46, RULE_functionType = 47, RULE_constructorType = 48, 
		RULE_typeQuery = 49, RULE_thisType = 50, RULE_propertySignature = 51, 
		RULE_typeAnnotation = 52, RULE_callSignature = 53, RULE_parameterList = 54, 
		RULE_requiredParameterList = 55, RULE_requiredParameter = 56, RULE_accessibilityModifier = 57, 
		RULE_optionalParameterList = 58, RULE_optionalParameter = 59, RULE_restParameter = 60, 
		RULE_constructSignature = 61, RULE_indexSignature = 62, RULE_methodSignature = 63, 
		RULE_constExpression = 64, RULE_interfaceDeclaration = 65, RULE_interfaceName = 66, 
		RULE_extendsClause = 67, RULE_classOrInterfaceTypeList = 68, RULE_classHeritage = 69, 
		RULE_implementsClause = 70, RULE_enumDeclaration = 71, RULE_enumBody = 72, 
		RULE_enumMemberList = 73, RULE_enumMember = 74, RULE_enumValue = 75, RULE_identifierPath = 76, 
		RULE_optionalParam = 77, RULE_optionalBindingIdentifier = 78, RULE_bindingIdentifier = 79, 
		RULE_identifier = 80, RULE_lineEnd = 81;
	public static final String[] ruleNames = {
		"typescriptAmbientDeclarations", "declarationScriptElement", "exportDef", 
		"importDef", "importName", "ambientModuleOrNamespace", "ambientModuleName", 
		"ambientItem", "ambientBracesItem", "ambientStatement", "variableDeclaration", 
		"variableList", "variableName", "functionDeclaration", "classDeclaration", 
		"abstractOpt", "className", "ambientClassBodyElement", "ambientConstructorDeclaration", 
		"ambientPropertyMemberDeclaration", "optStatic", "exportIdentifier", "numericLiteral", 
		"typeDeclaration", "typeDef", "typeParameters", "typeParameterList", "typeParameter", 
		"constraint", "typeArguments", "typeArgumentList", "type", "unnamedInterface", 
		"unionOrIntersectionOrPrimaryType", "primaryOrArray", "nestedType", "arrayDim", 
		"primaryType", "typeGuard", "parenthesizedType", "typeReference", "objectType", 
		"typeBody", "typeMemberList", "typeMember", "tupleType", "tupleTypeElements", 
		"functionType", "constructorType", "typeQuery", "thisType", "propertySignature", 
		"typeAnnotation", "callSignature", "parameterList", "requiredParameterList", 
		"requiredParameter", "accessibilityModifier", "optionalParameterList", 
		"optionalParameter", "restParameter", "constructSignature", "indexSignature", 
		"methodSignature", "constExpression", "interfaceDeclaration", "interfaceName", 
		"extendsClause", "classOrInterfaceTypeList", "classHeritage", "implementsClause", 
		"enumDeclaration", "enumBody", "enumMemberList", "enumMember", "enumValue", 
		"identifierPath", "optionalParam", "optionalBindingIdentifier", "bindingIdentifier", 
		"identifier", "lineEnd"
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GenScalaFacadesFromTypescriptVisitor ) return ((GenScalaFacadesFromTypescriptVisitor<? extends T>)visitor).visitTypescriptAmbientDeclarations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypescriptAmbientDeclarationsContext typescriptAmbientDeclarations() throws RecognitionException {
		TypescriptAmbientDeclarationsContext _localctx = new TypescriptAmbientDeclarationsContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_typescriptAmbientDeclarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Declare) | (1L << Export) | (1L << Import) | (1L << Interface))) != 0)) {
				{
				{
				setState(164);
				declarationScriptElement();
				}
				}
				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(170);
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
		public DeclarationScriptElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationScriptElement; }
	 
		public DeclarationScriptElementContext() { }
		public void copyFrom(DeclarationScriptElementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DeclareInterfaceContext extends DeclarationScriptElementContext {
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public DeclareInterfaceContext(DeclarationScriptElementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GenScalaFacadesFromTypescriptVisitor ) return ((GenScalaFacadesFromTypescriptVisitor<? extends T>)visitor).visitDeclareInterface(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeclareStatementContext extends DeclarationScriptElementContext {
		public AmbientStatementContext ambientStatement() {
			return getRuleContext(AmbientStatementContext.class,0);
		}
		public LineEndContext lineEnd() {
			return getRuleContext(LineEndContext.class,0);
		}
		public DeclareStatementContext(DeclarationScriptElementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GenScalaFacadesFromTypescriptVisitor ) return ((GenScalaFacadesFromTypescriptVisitor<? extends T>)visitor).visitDeclareStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeclareGlobalModuleOrNamespaceContext extends DeclarationScriptElementContext {
		public AmbientModuleOrNamespaceContext ambientModuleOrNamespace() {
			return getRuleContext(AmbientModuleOrNamespaceContext.class,0);
		}
		public DeclareGlobalModuleOrNamespaceContext(DeclarationScriptElementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GenScalaFacadesFromTypescriptVisitor ) return ((GenScalaFacadesFromTypescriptVisitor<? extends T>)visitor).visitDeclareGlobalModuleOrNamespace(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeclareExportContext extends DeclarationScriptElementContext {
		public ExportDefContext exportDef() {
			return getRuleContext(ExportDefContext.class,0);
		}
		public DeclareExportContext(DeclarationScriptElementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GenScalaFacadesFromTypescriptVisitor ) return ((GenScalaFacadesFromTypescriptVisitor<? extends T>)visitor).visitDeclareExport(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeclareModuleOrNamespaceContext extends DeclarationScriptElementContext {
		public AmbientModuleOrNamespaceContext ambientModuleOrNamespace() {
			return getRuleContext(AmbientModuleOrNamespaceContext.class,0);
		}
		public DeclareModuleOrNamespaceContext(DeclarationScriptElementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GenScalaFacadesFromTypescriptVisitor ) return ((GenScalaFacadesFromTypescriptVisitor<? extends T>)visitor).visitDeclareModuleOrNamespace(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeclareImportContext extends DeclarationScriptElementContext {
		public ImportDefContext importDef() {
			return getRuleContext(ImportDefContext.class,0);
		}
		public DeclareImportContext(DeclarationScriptElementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GenScalaFacadesFromTypescriptVisitor ) return ((GenScalaFacadesFromTypescriptVisitor<? extends T>)visitor).visitDeclareImport(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationScriptElementContext declarationScriptElement() throws RecognitionException {
		DeclarationScriptElementContext _localctx = new DeclarationScriptElementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declarationScriptElement);
		try {
			setState(187);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new DeclareModuleOrNamespaceContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				match(Declare);
				setState(173);
				ambientModuleOrNamespace();
				}
				break;
			case 2:
				_localctx = new DeclareStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(174);
				match(Declare);
				setState(175);
				ambientStatement();
				setState(176);
				lineEnd();
				}
				break;
			case 3:
				_localctx = new DeclareGlobalModuleOrNamespaceContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(178);
				match(Declare);
				setState(179);
				match(Global);
				setState(180);
				match(OpenBrace);
				setState(181);
				ambientModuleOrNamespace();
				setState(182);
				match(CloseBrace);
				}
				break;
			case 4:
				_localctx = new DeclareInterfaceContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(184);
				interfaceDeclaration();
				}
				break;
			case 5:
				_localctx = new DeclareExportContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(185);
				exportDef();
				}
				break;
			case 6:
				_localctx = new DeclareImportContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(186);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GenScalaFacadesFromTypescriptVisitor ) return ((GenScalaFacadesFromTypescriptVisitor<? extends T>)visitor).visitExportDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExportDefContext exportDef() throws RecognitionException {
		ExportDefContext _localctx = new ExportDefContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_exportDef);
		try {
			setState(201);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(189);
				match(Export);
				setState(190);
				match(Declare);
				setState(191);
				ambientStatement();
				setState(192);
				lineEnd();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(194);
				match(Export);
				setState(195);
				match(As);
				setState(196);
				match(T__0);
				setState(197);
				bindingIdentifier();
				setState(198);
				lineEnd();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(200);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GenScalaFacadesFromTypescriptVisitor ) return ((GenScalaFacadesFromTypescriptVisitor<? extends T>)visitor).visitImportDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportDefContext importDef() throws RecognitionException {
		ImportDefContext _localctx = new ImportDefContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_importDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			match(Import);
			setState(204);
			importName();
			setState(205);
			match(As);
			setState(206);
			bindingIdentifier();
			setState(207);
			match(From);
			setState(208);
			bindingIdentifier();
			setState(209);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GenScalaFacadesFromTypescriptVisitor ) return ((GenScalaFacadesFromTypescriptVisitor<? extends T>)visitor).visitImportName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportNameContext importName() throws RecognitionException {
		ImportNameContext _localctx = new ImportNameContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_importName);
		try {
			setState(213);
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
				setState(211);
				bindingIdentifier();
				}
				break;
			case Multiply:
				enterOuterAlt(_localctx, 2);
				{
				setState(212);
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
		public AmbientItemContext ambientItem;
		public List<AmbientItemContext> el = new ArrayList<AmbientItemContext>();
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GenScalaFacadesFromTypescriptVisitor ) return ((GenScalaFacadesFromTypescriptVisitor<? extends T>)visitor).visitAmbientModuleOrNamespace(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AmbientModuleOrNamespaceContext ambientModuleOrNamespace() throws RecognitionException {
		AmbientModuleOrNamespaceContext _localctx = new AmbientModuleOrNamespaceContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ambientModuleOrNamespace);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(215);
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
			setState(218);
			ambientModuleName();
			setState(219);
			match(OpenBrace);
			setState(223);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << Abstract) | (1L << As) | (1L << Class) | (1L << Const) | (1L << Enum) | (1L << Export) | (1L << From) | (1L << Function) | (1L << Global) | (1L << Import) | (1L << Interface) | (1L << Let) | (1L << Module) | (1L << Var) | (1L << In) | (1L << Is) | (1L << Typeof) | (1L << Type) | (1L << Number) | (1L << String))) != 0) || _la==Identifier || _la==StringLiteral) {
				{
				{
				setState(220);
				((AmbientModuleOrNamespaceContext)_localctx).ambientItem = ambientItem();
				((AmbientModuleOrNamespaceContext)_localctx).el.add(((AmbientModuleOrNamespaceContext)_localctx).ambientItem);
				}
				}
				setState(225);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(226);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GenScalaFacadesFromTypescriptVisitor ) return ((GenScalaFacadesFromTypescriptVisitor<? extends T>)visitor).visitAmbientModuleName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AmbientModuleNameContext ambientModuleName() throws RecognitionException {
		AmbientModuleNameContext _localctx = new AmbientModuleNameContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_ambientModuleName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GenScalaFacadesFromTypescriptVisitor ) return ((GenScalaFacadesFromTypescriptVisitor<? extends T>)visitor).visitAmbientItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AmbientItemContext ambientItem() throws RecognitionException {
		AmbientItemContext _localctx = new AmbientItemContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_ambientItem);
		int _la;
		try {
			setState(235);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(230);
				ambientBracesItem();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(231);
				ambientStatement();
				setState(233);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LineTerminator) | (1L << SemiColon) | (1L << Comma))) != 0)) {
					{
					setState(232);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GenScalaFacadesFromTypescriptVisitor ) return ((GenScalaFacadesFromTypescriptVisitor<? extends T>)visitor).visitAmbientBracesItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AmbientBracesItemContext ambientBracesItem() throws RecognitionException {
		AmbientBracesItemContext _localctx = new AmbientBracesItemContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_ambientBracesItem);
		try {
			setState(240);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Interface:
				enterOuterAlt(_localctx, 1);
				{
				setState(237);
				interfaceDeclaration();
				}
				break;
			case Abstract:
			case Class:
				enterOuterAlt(_localctx, 2);
				{
				setState(238);
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
				setState(239);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GenScalaFacadesFromTypescriptVisitor ) return ((GenScalaFacadesFromTypescriptVisitor<? extends T>)visitor).visitAmbientStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AmbientStatementContext ambientStatement() throws RecognitionException {
		AmbientStatementContext _localctx = new AmbientStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_ambientStatement);
		try {
			setState(247);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(242);
				variableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(243);
				typeDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(244);
				functionDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(245);
				enumDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(246);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GenScalaFacadesFromTypescriptVisitor ) return ((GenScalaFacadesFromTypescriptVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Let) | (1L << Var))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(250);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GenScalaFacadesFromTypescriptVisitor ) return ((GenScalaFacadesFromTypescriptVisitor<? extends T>)visitor).visitVariableList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableListContext variableList() throws RecognitionException {
		VariableListContext _localctx = new VariableListContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_variableList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			variableName();
			setState(257);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(253);
					match(Comma);
					setState(254);
					variableName();
					}
					} 
				}
				setState(259);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GenScalaFacadesFromTypescriptVisitor ) return ((GenScalaFacadesFromTypescriptVisitor<? extends T>)visitor).visitVariableName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableNameContext variableName() throws RecognitionException {
		VariableNameContext _localctx = new VariableNameContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_variableName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			bindingIdentifier();
			setState(262);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(261);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GenScalaFacadesFromTypescriptVisitor ) return ((GenScalaFacadesFromTypescriptVisitor<? extends T>)visitor).visitFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_functionDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			match(Function);
			setState(265);
			bindingIdentifier();
			setState(266);
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
		public AbstractOptContext abstractOpt() {
			return getRuleContext(AbstractOptContext.class,0);
		}
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GenScalaFacadesFromTypescriptVisitor ) return ((GenScalaFacadesFromTypescriptVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			abstractOpt();
			setState(269);
			match(Class);
			setState(270);
			className();
			setState(271);
			match(OpenBrace);
			setState(277);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << As) | (1L << Constructor) | (1L << From) | (1L << Global) | (1L << Import) | (1L << Module) | (1L << In) | (1L << Is) | (1L << Public) | (1L << Protected) | (1L << Private) | (1L << Static) | (1L << New) | (1L << Typeof) | (1L << Type) | (1L << Number) | (1L << String) | (1L << OpenBracket) | (1L << OpenParen) | (1L << LessThan))) != 0) || _la==Identifier || _la==StringLiteral) {
				{
				{
				setState(272);
				ambientClassBodyElement();
				setState(273);
				lineEnd();
				}
				}
				setState(279);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(280);
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

	public static class AbstractOptContext extends ParserRuleContext {
		public AbstractOptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abstractOpt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GenScalaFacadesFromTypescriptVisitor ) return ((GenScalaFacadesFromTypescriptVisitor<? extends T>)visitor).visitAbstractOpt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AbstractOptContext abstractOpt() throws RecognitionException {
		AbstractOptContext _localctx = new AbstractOptContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_abstractOpt);
		try {
			setState(284);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Abstract:
				enterOuterAlt(_localctx, 1);
				{
				setState(282);
				match(Abstract);
				}
				break;
			case Class:
				enterOuterAlt(_localctx, 2);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GenScalaFacadesFromTypescriptVisitor ) return ((GenScalaFacadesFromTypescriptVisitor<? extends T>)visitor).visitClassName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassNameContext className() throws RecognitionException {
		ClassNameContext _localctx = new ClassNameContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_className);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			bindingIdentifier();
			setState(288);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LessThan) {
				{
				setState(287);
				typeParameters();
				}
			}

			setState(290);
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
		public AmbientClassBodyElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ambientClassBodyElement; }
	 
		public AmbientClassBodyElementContext() { }
		public void copyFrom(AmbientClassBodyElementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AmbientClassBodyElementPropertyContext extends AmbientClassBodyElementContext {
		public AmbientPropertyMemberDeclarationContext ambientPropertyMemberDeclaration() {
			return getRuleContext(AmbientPropertyMemberDeclarationContext.class,0);
		}
		public AmbientClassBodyElementPropertyContext(AmbientClassBodyElementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GenScalaFacadesFromTypescriptVisitor ) return ((GenScalaFacadesFromTypescriptVisitor<? extends T>)visitor).visitAmbientClassBodyElementProperty(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AmbientClassBodyElementIndexContext extends AmbientClassBodyElementContext {
		public IndexSignatureContext indexSignature() {
			return getRuleContext(IndexSignatureContext.class,0);
		}
		public AmbientClassBodyElementIndexContext(AmbientClassBodyElementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GenScalaFacadesFromTypescriptVisitor ) return ((GenScalaFacadesFromTypescriptVisitor<? extends T>)visitor).visitAmbientClassBodyElementIndex(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AmbientClassBodyElementConstructorContext extends AmbientClassBodyElementContext {
		public AmbientConstructorDeclarationContext ambientConstructorDeclaration() {
			return getRuleContext(AmbientConstructorDeclarationContext.class,0);
		}
		public AmbientClassBodyElementConstructorContext(AmbientClassBodyElementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GenScalaFacadesFromTypescriptVisitor ) return ((GenScalaFacadesFromTypescriptVisitor<? extends T>)visitor).visitAmbientClassBodyElementConstructor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AmbientClassBodyElementContext ambientClassBodyElement() throws RecognitionException {
		AmbientClassBodyElementContext _localctx = new AmbientClassBodyElementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_ambientClassBodyElement);
		try {
			setState(295);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				_localctx = new AmbientClassBodyElementConstructorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(292);
				ambientConstructorDeclaration();
				}
				break;
			case 2:
				_localctx = new AmbientClassBodyElementPropertyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(293);
				ambientPropertyMemberDeclaration();
				}
				break;
			case 3:
				_localctx = new AmbientClassBodyElementIndexContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(294);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GenScalaFacadesFromTypescriptVisitor ) return ((GenScalaFacadesFromTypescriptVisitor<? extends T>)visitor).visitAmbientConstructorDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AmbientConstructorDeclarationContext ambientConstructorDeclaration() throws RecognitionException {
		AmbientConstructorDeclarationContext _localctx = new AmbientConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_ambientConstructorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			match(Constructor);
			setState(298);
			match(OpenParen);
			setState(300);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << As) | (1L << From) | (1L << Global) | (1L << Import) | (1L << Module) | (1L << In) | (1L << Is) | (1L << Public) | (1L << Protected) | (1L << Private) | (1L << Typeof) | (1L << Type) | (1L << Number) | (1L << String) | (1L << DotDotDot))) != 0) || _la==Identifier || _la==StringLiteral) {
				{
				setState(299);
				parameterList();
				}
			}

			setState(302);
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
		public OptStaticContext optStatic() {
			return getRuleContext(OptStaticContext.class,0);
		}
		public TypeMemberContext typeMember() {
			return getRuleContext(TypeMemberContext.class,0);
		}
		public AmbientPropertyMemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ambientPropertyMemberDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GenScalaFacadesFromTypescriptVisitor ) return ((GenScalaFacadesFromTypescriptVisitor<? extends T>)visitor).visitAmbientPropertyMemberDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AmbientPropertyMemberDeclarationContext ambientPropertyMemberDeclaration() throws RecognitionException {
		AmbientPropertyMemberDeclarationContext _localctx = new AmbientPropertyMemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_ambientPropertyMemberDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			accessibilityModifier();
			setState(305);
			optStatic();
			setState(306);
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

	public static class OptStaticContext extends ParserRuleContext {
		public OptStaticContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optStatic; }
	 
		public OptStaticContext() { }
		public void copyFrom(OptStaticContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class OptStaticNotDefContext extends OptStaticContext {
		public OptStaticNotDefContext(OptStaticContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GenScalaFacadesFromTypescriptVisitor ) return ((GenScalaFacadesFromTypescriptVisitor<? extends T>)visitor).visitOptStaticNotDef(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OptStaticDefContext extends OptStaticContext {
		public OptStaticDefContext(OptStaticContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GenScalaFacadesFromTypescriptVisitor ) return ((GenScalaFacadesFromTypescriptVisitor<? extends T>)visitor).visitOptStaticDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptStaticContext optStatic() throws RecognitionException {
		OptStaticContext _localctx = new OptStaticContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_optStatic);
		try {
			setState(310);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Static:
				_localctx = new OptStaticDefContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(308);
				match(Static);
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
				_localctx = new OptStaticNotDefContext(_localctx);
				enterOuterAlt(_localctx, 2);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GenScalaFacadesFromTypescriptVisitor ) return ((GenScalaFacadesFromTypescriptVisitor<? extends T>)visitor).visitExportIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExportIdentifierContext exportIdentifier() throws RecognitionException {
		ExportIdentifierContext _localctx = new ExportIdentifierContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_exportIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			match(Export);
			setState(313);
			match(Assign);
			setState(314);
			bindingIdentifier();
			setState(315);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GenScalaFacadesFromTypescriptVisitor ) return ((GenScalaFacadesFromTypescriptVisitor<? extends T>)visitor).visitNumericLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumericLiteralContext numericLiteral() throws RecognitionException {
		NumericLiteralContext _localctx = new NumericLiteralContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_numericLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GenScalaFacadesFromTypescriptVisitor ) return ((GenScalaFacadesFromTypescriptVisitor<? extends T>)visitor).visitTypeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeDeclarationContext typeDeclaration() throws RecognitionException {
		TypeDeclarationContext _localctx = new TypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_typeDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			match(Type);
			setState(320);
			typeDef();
			setState(321);
			match(Assign);
			setState(324);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(322);
				type();
				}
				break;
			case 2:
				{
				setState(323);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GenScalaFacadesFromTypescriptVisitor ) return ((GenScalaFacadesFromTypescriptVisitor<? extends T>)visitor).visitTypeDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeDefContext typeDef() throws RecognitionException {
		TypeDefContext _localctx = new TypeDefContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_typeDef);
		int _la;
		try {
			setState(347);
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
				setState(326);
				bindingIdentifier();
				setState(328);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(327);
					typeParameters();
					}
					break;
				}
				}
				break;
			case OpenBrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(330);
				match(OpenBrace);
				setState(331);
				match(OpenBracket);
				setState(332);
				bindingIdentifier();
				setState(333);
				match(In);
				setState(334);
				match(Keyof);
				setState(335);
				bindingIdentifier();
				setState(337);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LessThan) {
					{
					setState(336);
					typeParameters();
					}
				}

				setState(339);
				match(CloseBracket);
				setState(341);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==QuestionMark) {
					{
					setState(340);
					match(QuestionMark);
					}
				}

				setState(343);
				match(Colon);
				setState(344);
				typeDef();
				setState(345);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GenScalaFacadesFromTypescriptVisitor ) return ((GenScalaFacadesFromTypescriptVisitor<? extends T>)visitor).visitTypeParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParametersContext typeParameters() throws RecognitionException {
		TypeParametersContext _localctx = new TypeParametersContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_typeParameters);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			match(LessThan);
			setState(350);
			typeParameterList();
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GenScalaFacadesFromTypescriptVisitor ) return ((GenScalaFacadesFromTypescriptVisitor<? extends T>)visitor).visitTypeParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParameterListContext typeParameterList() throws RecognitionException {
		TypeParameterListContext _localctx = new TypeParameterListContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_typeParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			typeParameter();
			setState(358);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(354);
				match(Comma);
				setState(355);
				typeParameter();
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GenScalaFacadesFromTypescriptVisitor ) return ((GenScalaFacadesFromTypescriptVisitor<? extends T>)visitor).visitTypeParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParameterContext typeParameter() throws RecognitionException {
		TypeParameterContext _localctx = new TypeParameterContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_typeParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			bindingIdentifier();
			setState(363);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Extends || _la==In) {
				{
				setState(362);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GenScalaFacadesFromTypescriptVisitor ) return ((GenScalaFacadesFromTypescriptVisitor<? extends T>)visitor).visitConstraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstraintContext constraint() throws RecognitionException {
		ConstraintContext _localctx = new ConstraintContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
			_la = _input.LA(1);
			if ( !(_la==Extends || _la==In) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(366);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GenScalaFacadesFromTypescriptVisitor ) return ((GenScalaFacadesFromTypescriptVisitor<? extends T>)visitor).visitTypeArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentsContext typeArguments() throws RecognitionException {
		TypeArgumentsContext _localctx = new TypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_typeArguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			match(LessThan);
			setState(369);
			typeArgumentList();
			setState(370);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GenScalaFacadesFromTypescriptVisitor ) return ((GenScalaFacadesFromTypescriptVisitor<? extends T>)visitor).visitTypeArgumentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentListContext typeArgumentList() throws RecognitionException {
		TypeArgumentListContext _localctx = new TypeArgumentListContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_typeArgumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			type();
			setState(377);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(373);
				match(Comma);
				setState(374);
				type();
				}
				}
				setState(379);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GenScalaFacadesFromTypescriptVisitor ) return ((GenScalaFacadesFromTypescriptVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_type);
		try {
			setState(383);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(380);
				unionOrIntersectionOrPrimaryType(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(381);
				functionType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(382);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GenScalaFacadesFromTypescriptVisitor ) return ((GenScalaFacadesFromTypescriptVisitor<? extends T>)visitor).visitUnnamedInterface(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnnamedInterfaceContext unnamedInterface() throws RecognitionException {
		UnnamedInterfaceContext _localctx = new UnnamedInterfaceContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_unnamedInterface);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385);
			match(OpenBrace);
			setState(387);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << As) | (1L << From) | (1L << Global) | (1L << Import) | (1L << Module) | (1L << In) | (1L << Is) | (1L << New) | (1L << Typeof) | (1L << Type) | (1L << Number) | (1L << String) | (1L << OpenBracket) | (1L << OpenParen) | (1L << LessThan))) != 0) || _la==Identifier || _la==StringLiteral) {
				{
				setState(386);
				typeBody();
				}
			}

			setState(389);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GenScalaFacadesFromTypescriptVisitor ) return ((GenScalaFacadesFromTypescriptVisitor<? extends T>)visitor).visitUnionOrIntersectionOrPrimaryType(this);
			else return visitor.visitChildren(this);
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
		int _startState = 66;
		enterRecursionRule(_localctx, 66, RULE_unionOrIntersectionOrPrimaryType, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(398);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(392);
				match(OpenParen);
				setState(393);
				unionOrIntersectionOrPrimaryType(0);
				setState(394);
				match(CloseParen);
				}
				break;
			case 2:
				{
				setState(396);
				primaryOrArray();
				}
				break;
			case 3:
				{
				setState(397);
				unnamedInterface();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(408);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(406);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
					case 1:
						{
						_localctx = new UnionOrIntersectionOrPrimaryTypeContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_unionOrIntersectionOrPrimaryType);
						setState(400);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(401);
						match(BitOr);
						setState(402);
						unionOrIntersectionOrPrimaryType(6);
						}
						break;
					case 2:
						{
						_localctx = new UnionOrIntersectionOrPrimaryTypeContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_unionOrIntersectionOrPrimaryType);
						setState(403);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(404);
						match(BitAnd);
						setState(405);
						unionOrIntersectionOrPrimaryType(5);
						}
						break;
					}
					} 
				}
				setState(410);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GenScalaFacadesFromTypescriptVisitor ) return ((GenScalaFacadesFromTypescriptVisitor<? extends T>)visitor).visitPrimaryOrArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryOrArrayContext primaryOrArray() throws RecognitionException {
		PrimaryOrArrayContext _localctx = new PrimaryOrArrayContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_primaryOrArray);
		int _la;
		try {
			int _alt;
			setState(425);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(412);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Keyof) {
					{
					setState(411);
					match(Keyof);
					}
				}

				setState(414);
				primaryType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(415);
				primaryType();
				setState(417);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
				case 1:
					{
					setState(416);
					typeArguments();
					}
					break;
				}
				setState(422);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(419);
						arrayDim();
						}
						} 
					}
					setState(424);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GenScalaFacadesFromTypescriptVisitor ) return ((GenScalaFacadesFromTypescriptVisitor<? extends T>)visitor).visitNestedType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NestedTypeContext nestedType() throws RecognitionException {
		NestedTypeContext _localctx = new NestedTypeContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_nestedType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(427);
			match(LessThan);
			setState(428);
			type();
			setState(429);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GenScalaFacadesFromTypescriptVisitor ) return ((GenScalaFacadesFromTypescriptVisitor<? extends T>)visitor).visitArrayDim(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayDimContext arrayDim() throws RecognitionException {
		ArrayDimContext _localctx = new ArrayDimContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_arrayDim);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(431);
			match(OpenBracket);
			setState(432);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GenScalaFacadesFromTypescriptVisitor ) return ((GenScalaFacadesFromTypescriptVisitor<? extends T>)visitor).visitPrimaryType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryTypeContext primaryType() throws RecognitionException {
		PrimaryTypeContext _localctx = new PrimaryTypeContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_primaryType);
		try {
			setState(446);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(434);
				parenthesizedType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(435);
				bindingIdentifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(436);
				identifier();
				setState(437);
				typeGuard();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(439);
				typeReference();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(440);
				objectType();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(441);
				tupleType();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(442);
				typeQuery();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(443);
				thisType();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(444);
				numericLiteral();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(445);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GenScalaFacadesFromTypescriptVisitor ) return ((GenScalaFacadesFromTypescriptVisitor<? extends T>)visitor).visitTypeGuard(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeGuardContext typeGuard() throws RecognitionException {
		TypeGuardContext _localctx = new TypeGuardContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_typeGuard);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(448);
			match(Is);
			setState(449);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GenScalaFacadesFromTypescriptVisitor ) return ((GenScalaFacadesFromTypescriptVisitor<? extends T>)visitor).visitParenthesizedType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParenthesizedTypeContext parenthesizedType() throws RecognitionException {
		ParenthesizedTypeContext _localctx = new ParenthesizedTypeContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_parenthesizedType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(451);
			match(OpenParen);
			setState(452);
			type();
			setState(453);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GenScalaFacadesFromTypescriptVisitor ) return ((GenScalaFacadesFromTypescriptVisitor<? extends T>)visitor).visitTypeReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeReferenceContext typeReference() throws RecognitionException {
		TypeReferenceContext _localctx = new TypeReferenceContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_typeReference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(455);
			identifierPath();
			setState(457);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(456);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GenScalaFacadesFromTypescriptVisitor ) return ((GenScalaFacadesFromTypescriptVisitor<? extends T>)visitor).visitObjectType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectTypeContext objectType() throws RecognitionException {
		ObjectTypeContext _localctx = new ObjectTypeContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_objectType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(459);
			match(OpenBrace);
			setState(461);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << As) | (1L << From) | (1L << Global) | (1L << Import) | (1L << Module) | (1L << In) | (1L << Is) | (1L << New) | (1L << Typeof) | (1L << Type) | (1L << Number) | (1L << String) | (1L << OpenBracket) | (1L << OpenParen) | (1L << LessThan))) != 0) || _la==Identifier || _la==StringLiteral) {
				{
				setState(460);
				typeBody();
				}
			}

			setState(463);
			lineEnd();
			setState(464);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GenScalaFacadesFromTypescriptVisitor ) return ((GenScalaFacadesFromTypescriptVisitor<? extends T>)visitor).visitTypeBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeBodyContext typeBody() throws RecognitionException {
		TypeBodyContext _localctx = new TypeBodyContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_typeBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(466);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GenScalaFacadesFromTypescriptVisitor ) return ((GenScalaFacadesFromTypescriptVisitor<? extends T>)visitor).visitTypeMemberList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeMemberListContext typeMemberList() throws RecognitionException {
		TypeMemberListContext _localctx = new TypeMemberListContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_typeMemberList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(468);
			typeMember();
			setState(473);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(469);
					_la = _input.LA(1);
					if ( !(_la==SemiColon || _la==Comma) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(470);
					typeMember();
					}
					} 
				}
				setState(475);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GenScalaFacadesFromTypescriptVisitor ) return ((GenScalaFacadesFromTypescriptVisitor<? extends T>)visitor).visitTypeMember(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeMemberContext typeMember() throws RecognitionException {
		TypeMemberContext _localctx = new TypeMemberContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_typeMember);
		try {
			setState(484);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(476);
				propertySignature();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(477);
				callSignature();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(478);
				constructSignature();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(479);
				indexSignature();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(480);
				methodSignature();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(481);
				bindingIdentifier();
				setState(482);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GenScalaFacadesFromTypescriptVisitor ) return ((GenScalaFacadesFromTypescriptVisitor<? extends T>)visitor).visitTupleType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TupleTypeContext tupleType() throws RecognitionException {
		TupleTypeContext _localctx = new TupleTypeContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_tupleType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(486);
			match(OpenBracket);
			setState(487);
			tupleTypeElements();
			setState(488);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GenScalaFacadesFromTypescriptVisitor ) return ((GenScalaFacadesFromTypescriptVisitor<? extends T>)visitor).visitTupleTypeElements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TupleTypeElementsContext tupleTypeElements() throws RecognitionException {
		TupleTypeElementsContext _localctx = new TupleTypeElementsContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_tupleTypeElements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(490);
			type();
			setState(495);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(491);
				match(Comma);
				setState(492);
				type();
				}
				}
				setState(497);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GenScalaFacadesFromTypescriptVisitor ) return ((GenScalaFacadesFromTypescriptVisitor<? extends T>)visitor).visitFunctionType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionTypeContext functionType() throws RecognitionException {
		FunctionTypeContext _localctx = new FunctionTypeContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_functionType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(499);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LessThan) {
				{
				setState(498);
				typeParameters();
				}
			}

			setState(501);
			match(OpenParen);
			setState(503);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << As) | (1L << From) | (1L << Global) | (1L << Import) | (1L << Module) | (1L << In) | (1L << Is) | (1L << Public) | (1L << Protected) | (1L << Private) | (1L << Typeof) | (1L << Type) | (1L << Number) | (1L << String) | (1L << DotDotDot))) != 0) || _la==Identifier || _la==StringLiteral) {
				{
				setState(502);
				parameterList();
				}
			}

			setState(505);
			match(CloseParen);
			setState(506);
			match(ThickArrow);
			setState(507);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GenScalaFacadesFromTypescriptVisitor ) return ((GenScalaFacadesFromTypescriptVisitor<? extends T>)visitor).visitConstructorType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorTypeContext constructorType() throws RecognitionException {
		ConstructorTypeContext _localctx = new ConstructorTypeContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_constructorType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(509);
			match(New);
			setState(511);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LessThan) {
				{
				setState(510);
				typeParameters();
				}
			}

			setState(513);
			match(OpenParen);
			setState(515);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << As) | (1L << From) | (1L << Global) | (1L << Import) | (1L << Module) | (1L << In) | (1L << Is) | (1L << Public) | (1L << Protected) | (1L << Private) | (1L << Typeof) | (1L << Type) | (1L << Number) | (1L << String) | (1L << DotDotDot))) != 0) || _la==Identifier || _la==StringLiteral) {
				{
				setState(514);
				parameterList();
				}
			}

			setState(517);
			match(CloseParen);
			setState(518);
			match(ThickArrow);
			setState(519);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GenScalaFacadesFromTypescriptVisitor ) return ((GenScalaFacadesFromTypescriptVisitor<? extends T>)visitor).visitTypeQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeQueryContext typeQuery() throws RecognitionException {
		TypeQueryContext _localctx = new TypeQueryContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_typeQuery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(521);
			match(Typeof);
			setState(522);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GenScalaFacadesFromTypescriptVisitor ) return ((GenScalaFacadesFromTypescriptVisitor<? extends T>)visitor).visitThisType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThisTypeContext thisType() throws RecognitionException {
		ThisTypeContext _localctx = new ThisTypeContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_thisType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(524);
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
		public OptionalBindingIdentifierContext optionalBindingIdentifier() {
			return getRuleContext(OptionalBindingIdentifierContext.class,0);
		}
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public PropertySignatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertySignature; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GenScalaFacadesFromTypescriptVisitor ) return ((GenScalaFacadesFromTypescriptVisitor<? extends T>)visitor).visitPropertySignature(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertySignatureContext propertySignature() throws RecognitionException {
		PropertySignatureContext _localctx = new PropertySignatureContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_propertySignature);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(526);
			optionalBindingIdentifier();
			setState(528);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(527);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GenScalaFacadesFromTypescriptVisitor ) return ((GenScalaFacadesFromTypescriptVisitor<? extends T>)visitor).visitTypeAnnotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeAnnotationContext typeAnnotation() throws RecognitionException {
		TypeAnnotationContext _localctx = new TypeAnnotationContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_typeAnnotation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(530);
			match(Colon);
			setState(531);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GenScalaFacadesFromTypescriptVisitor ) return ((GenScalaFacadesFromTypescriptVisitor<? extends T>)visitor).visitCallSignature(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallSignatureContext callSignature() throws RecognitionException {
		CallSignatureContext _localctx = new CallSignatureContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_callSignature);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(534);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LessThan) {
				{
				setState(533);
				typeParameters();
				}
			}

			setState(536);
			match(OpenParen);
			setState(538);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << As) | (1L << From) | (1L << Global) | (1L << Import) | (1L << Module) | (1L << In) | (1L << Is) | (1L << Public) | (1L << Protected) | (1L << Private) | (1L << Typeof) | (1L << Type) | (1L << Number) | (1L << String) | (1L << DotDotDot))) != 0) || _la==Identifier || _la==StringLiteral) {
				{
				setState(537);
				parameterList();
				}
			}

			setState(540);
			match(CloseParen);
			setState(542);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(541);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GenScalaFacadesFromTypescriptVisitor ) return ((GenScalaFacadesFromTypescriptVisitor<? extends T>)visitor).visitParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_parameterList);
		int _la;
		try {
			setState(562);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(544);
				requiredParameterList();
				setState(554);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(545);
					match(Comma);
					{
					setState(552);
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
						setState(546);
						optionalParameterList();
						setState(549);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==Comma) {
							{
							setState(547);
							match(Comma);
							setState(548);
							restParameter();
							}
						}

						}
						break;
					case DotDotDot:
						{
						setState(551);
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
				setState(556);
				optionalParameterList();
				setState(559);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(557);
					match(Comma);
					setState(558);
					restParameter();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(561);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GenScalaFacadesFromTypescriptVisitor ) return ((GenScalaFacadesFromTypescriptVisitor<? extends T>)visitor).visitRequiredParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RequiredParameterListContext requiredParameterList() throws RecognitionException {
		RequiredParameterListContext _localctx = new RequiredParameterListContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_requiredParameterList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(564);
			requiredParameter();
			setState(569);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(565);
					match(Comma);
					setState(566);
					requiredParameter();
					}
					} 
				}
				setState(571);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GenScalaFacadesFromTypescriptVisitor ) return ((GenScalaFacadesFromTypescriptVisitor<? extends T>)visitor).visitRequiredParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RequiredParameterContext requiredParameter() throws RecognitionException {
		RequiredParameterContext _localctx = new RequiredParameterContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_requiredParameter);
		int _la;
		try {
			setState(581);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(572);
				accessibilityModifier();
				setState(573);
				bindingIdentifier();
				setState(575);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(574);
					typeAnnotation();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(577);
				bindingIdentifier();
				setState(578);
				match(Colon);
				setState(579);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GenScalaFacadesFromTypescriptVisitor ) return ((GenScalaFacadesFromTypescriptVisitor<? extends T>)visitor).visitPrivateModifier(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PublicModifierContext extends AccessibilityModifierContext {
		public PublicModifierContext(AccessibilityModifierContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GenScalaFacadesFromTypescriptVisitor ) return ((GenScalaFacadesFromTypescriptVisitor<? extends T>)visitor).visitPublicModifier(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ProtectedModifierContext extends AccessibilityModifierContext {
		public ProtectedModifierContext(AccessibilityModifierContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GenScalaFacadesFromTypescriptVisitor ) return ((GenScalaFacadesFromTypescriptVisitor<? extends T>)visitor).visitProtectedModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AccessibilityModifierContext accessibilityModifier() throws RecognitionException {
		AccessibilityModifierContext _localctx = new AccessibilityModifierContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_accessibilityModifier);
		try {
			setState(587);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Public:
				_localctx = new PublicModifierContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(583);
				match(Public);
				}
				break;
			case Private:
				_localctx = new PrivateModifierContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(584);
				match(Private);
				}
				break;
			case Protected:
				_localctx = new ProtectedModifierContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(585);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GenScalaFacadesFromTypescriptVisitor ) return ((GenScalaFacadesFromTypescriptVisitor<? extends T>)visitor).visitOptionalParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptionalParameterListContext optionalParameterList() throws RecognitionException {
		OptionalParameterListContext _localctx = new OptionalParameterListContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_optionalParameterList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(589);
			optionalParameter();
			setState(594);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(590);
					match(Comma);
					setState(591);
					optionalParameter();
					}
					} 
				}
				setState(596);
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

	public static class OptionalParameterContext extends ParserRuleContext {
		public AccessibilityModifierContext accessibilityModifier() {
			return getRuleContext(AccessibilityModifierContext.class,0);
		}
		public OptionalBindingIdentifierContext optionalBindingIdentifier() {
			return getRuleContext(OptionalBindingIdentifierContext.class,0);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GenScalaFacadesFromTypescriptVisitor ) return ((GenScalaFacadesFromTypescriptVisitor<? extends T>)visitor).visitOptionalParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptionalParameterContext optionalParameter() throws RecognitionException {
		OptionalParameterContext _localctx = new OptionalParameterContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_optionalParameter);
		int _la;
		try {
			setState(606);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(597);
				accessibilityModifier();
				setState(598);
				optionalBindingIdentifier();
				setState(600);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(599);
					typeAnnotation();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(602);
				optionalBindingIdentifier();
				setState(603);
				match(Colon);
				setState(604);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GenScalaFacadesFromTypescriptVisitor ) return ((GenScalaFacadesFromTypescriptVisitor<? extends T>)visitor).visitRestParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RestParameterContext restParameter() throws RecognitionException {
		RestParameterContext _localctx = new RestParameterContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_restParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(608);
			match(DotDotDot);
			setState(609);
			bindingIdentifier();
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GenScalaFacadesFromTypescriptVisitor ) return ((GenScalaFacadesFromTypescriptVisitor<? extends T>)visitor).visitConstructSignature(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructSignatureContext constructSignature() throws RecognitionException {
		ConstructSignatureContext _localctx = new ConstructSignatureContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_constructSignature);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(613);
			match(New);
			setState(615);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LessThan) {
				{
				setState(614);
				typeParameters();
				}
			}

			setState(617);
			match(OpenParen);
			setState(619);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << As) | (1L << From) | (1L << Global) | (1L << Import) | (1L << Module) | (1L << In) | (1L << Is) | (1L << Public) | (1L << Protected) | (1L << Private) | (1L << Typeof) | (1L << Type) | (1L << Number) | (1L << String) | (1L << DotDotDot))) != 0) || _la==Identifier || _la==StringLiteral) {
				{
				setState(618);
				parameterList();
				}
			}

			setState(621);
			match(CloseParen);
			setState(623);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(622);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GenScalaFacadesFromTypescriptVisitor ) return ((GenScalaFacadesFromTypescriptVisitor<? extends T>)visitor).visitIndexSignature(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexSignatureContext indexSignature() throws RecognitionException {
		IndexSignatureContext _localctx = new IndexSignatureContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_indexSignature);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(625);
			match(OpenBracket);
			setState(626);
			bindingIdentifier();
			setState(627);
			match(Colon);
			setState(628);
			_la = _input.LA(1);
			if ( !(_la==Number || _la==String) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(629);
			match(CloseBracket);
			setState(630);
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
		public OptionalBindingIdentifierContext optionalBindingIdentifier() {
			return getRuleContext(OptionalBindingIdentifierContext.class,0);
		}
		public CallSignatureContext callSignature() {
			return getRuleContext(CallSignatureContext.class,0);
		}
		public MethodSignatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodSignature; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GenScalaFacadesFromTypescriptVisitor ) return ((GenScalaFacadesFromTypescriptVisitor<? extends T>)visitor).visitMethodSignature(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodSignatureContext methodSignature() throws RecognitionException {
		MethodSignatureContext _localctx = new MethodSignatureContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_methodSignature);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(632);
			optionalBindingIdentifier();
			setState(633);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GenScalaFacadesFromTypescriptVisitor ) return ((GenScalaFacadesFromTypescriptVisitor<? extends T>)visitor).visitConstExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstExpressionContext constExpression() throws RecognitionException {
		ConstExpressionContext _localctx = new ConstExpressionContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_constExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(635);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GenScalaFacadesFromTypescriptVisitor ) return ((GenScalaFacadesFromTypescriptVisitor<? extends T>)visitor).visitInterfaceDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceDeclarationContext interfaceDeclaration() throws RecognitionException {
		InterfaceDeclarationContext _localctx = new InterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_interfaceDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(637);
			match(Interface);
			setState(638);
			interfaceName();
			setState(639);
			match(OpenBrace);
			setState(645);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << As) | (1L << From) | (1L << Global) | (1L << Import) | (1L << Module) | (1L << In) | (1L << Is) | (1L << New) | (1L << Typeof) | (1L << Type) | (1L << Number) | (1L << String) | (1L << OpenBracket) | (1L << OpenParen) | (1L << LessThan))) != 0) || _la==Identifier || _la==StringLiteral) {
				{
				{
				setState(640);
				typeMember();
				setState(641);
				lineEnd();
				}
				}
				setState(647);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(648);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GenScalaFacadesFromTypescriptVisitor ) return ((GenScalaFacadesFromTypescriptVisitor<? extends T>)visitor).visitInterfaceName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceNameContext interfaceName() throws RecognitionException {
		InterfaceNameContext _localctx = new InterfaceNameContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_interfaceName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(650);
			bindingIdentifier();
			setState(652);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LessThan) {
				{
				setState(651);
				typeParameters();
				}
			}

			setState(655);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Extends) {
				{
				setState(654);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GenScalaFacadesFromTypescriptVisitor ) return ((GenScalaFacadesFromTypescriptVisitor<? extends T>)visitor).visitExtendsClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExtendsClauseContext extendsClause() throws RecognitionException {
		ExtendsClauseContext _localctx = new ExtendsClauseContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_extendsClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(657);
			match(Extends);
			setState(658);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GenScalaFacadesFromTypescriptVisitor ) return ((GenScalaFacadesFromTypescriptVisitor<? extends T>)visitor).visitClassOrInterfaceTypeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassOrInterfaceTypeListContext classOrInterfaceTypeList() throws RecognitionException {
		ClassOrInterfaceTypeListContext _localctx = new ClassOrInterfaceTypeListContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_classOrInterfaceTypeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(660);
			typeReference();
			setState(665);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(661);
				match(Comma);
				setState(662);
				typeReference();
				}
				}
				setState(667);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GenScalaFacadesFromTypescriptVisitor ) return ((GenScalaFacadesFromTypescriptVisitor<? extends T>)visitor).visitClassHeritage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassHeritageContext classHeritage() throws RecognitionException {
		ClassHeritageContext _localctx = new ClassHeritageContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_classHeritage);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(669);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Extends) {
				{
				setState(668);
				extendsClause();
				}
			}

			setState(672);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Implements) {
				{
				setState(671);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GenScalaFacadesFromTypescriptVisitor ) return ((GenScalaFacadesFromTypescriptVisitor<? extends T>)visitor).visitImplementsClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImplementsClauseContext implementsClause() throws RecognitionException {
		ImplementsClauseContext _localctx = new ImplementsClauseContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_implementsClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(674);
			match(Implements);
			setState(675);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GenScalaFacadesFromTypescriptVisitor ) return ((GenScalaFacadesFromTypescriptVisitor<? extends T>)visitor).visitEnumDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumDeclarationContext enumDeclaration() throws RecognitionException {
		EnumDeclarationContext _localctx = new EnumDeclarationContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_enumDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(678);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Const) {
				{
				setState(677);
				match(Const);
				}
			}

			setState(680);
			match(Enum);
			setState(681);
			bindingIdentifier();
			setState(682);
			match(OpenBrace);
			setState(684);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << As) | (1L << From) | (1L << Global) | (1L << Import) | (1L << Module) | (1L << In) | (1L << Is) | (1L << Typeof) | (1L << Type) | (1L << Number) | (1L << String))) != 0) || _la==Identifier || _la==StringLiteral) {
				{
				setState(683);
				enumBody();
				}
			}

			setState(686);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GenScalaFacadesFromTypescriptVisitor ) return ((GenScalaFacadesFromTypescriptVisitor<? extends T>)visitor).visitEnumBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumBodyContext enumBody() throws RecognitionException {
		EnumBodyContext _localctx = new EnumBodyContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_enumBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(688);
			enumMemberList();
			setState(690);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(689);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GenScalaFacadesFromTypescriptVisitor ) return ((GenScalaFacadesFromTypescriptVisitor<? extends T>)visitor).visitEnumMemberList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumMemberListContext enumMemberList() throws RecognitionException {
		EnumMemberListContext _localctx = new EnumMemberListContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_enumMemberList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(692);
			enumMember();
			setState(697);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(693);
					match(Comma);
					setState(694);
					enumMember();
					}
					} 
				}
				setState(699);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GenScalaFacadesFromTypescriptVisitor ) return ((GenScalaFacadesFromTypescriptVisitor<? extends T>)visitor).visitEnumMember(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumMemberContext enumMember() throws RecognitionException {
		EnumMemberContext _localctx = new EnumMemberContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_enumMember);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(700);
			bindingIdentifier();
			setState(703);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Assign) {
				{
				setState(701);
				match(Assign);
				setState(702);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GenScalaFacadesFromTypescriptVisitor ) return ((GenScalaFacadesFromTypescriptVisitor<? extends T>)visitor).visitEnumValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumValueContext enumValue() throws RecognitionException {
		EnumValueContext _localctx = new EnumValueContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_enumValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(705);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GenScalaFacadesFromTypescriptVisitor ) return ((GenScalaFacadesFromTypescriptVisitor<? extends T>)visitor).visitIdentifierPath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierPathContext identifierPath() throws RecognitionException {
		IdentifierPathContext _localctx = new IdentifierPathContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_identifierPath);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(707);
			((IdentifierPathContext)_localctx).bindingIdentifier = bindingIdentifier();
			((IdentifierPathContext)_localctx).ident.add(((IdentifierPathContext)_localctx).bindingIdentifier);
			setState(712);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(708);
					match(Dot);
					setState(709);
					((IdentifierPathContext)_localctx).bindingIdentifier = bindingIdentifier();
					((IdentifierPathContext)_localctx).ident.add(((IdentifierPathContext)_localctx).bindingIdentifier);
					}
					} 
				}
				setState(714);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
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

	public static class OptionalParamContext extends ParserRuleContext {
		public OptionalParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionalParam; }
	 
		public OptionalParamContext() { }
		public void copyFrom(OptionalParamContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class OptionalModifierContext extends OptionalParamContext {
		public OptionalModifierContext(OptionalParamContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GenScalaFacadesFromTypescriptVisitor ) return ((GenScalaFacadesFromTypescriptVisitor<? extends T>)visitor).visitOptionalModifier(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RequiredParamContext extends OptionalParamContext {
		public RequiredParamContext(OptionalParamContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GenScalaFacadesFromTypescriptVisitor ) return ((GenScalaFacadesFromTypescriptVisitor<? extends T>)visitor).visitRequiredParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptionalParamContext optionalParam() throws RecognitionException {
		OptionalParamContext _localctx = new OptionalParamContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_optionalParam);
		try {
			setState(717);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case QuestionMark:
				_localctx = new OptionalModifierContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(715);
				match(QuestionMark);
				}
				break;
			case LineTerminator:
			case OpenParen:
			case CloseParen:
			case CloseBrace:
			case SemiColon:
			case Comma:
			case Colon:
			case LessThan:
				_localctx = new RequiredParamContext(_localctx);
				enterOuterAlt(_localctx, 2);
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

	public static class OptionalBindingIdentifierContext extends ParserRuleContext {
		public BindingIdentifierContext bindingIdentifier() {
			return getRuleContext(BindingIdentifierContext.class,0);
		}
		public OptionalParamContext optionalParam() {
			return getRuleContext(OptionalParamContext.class,0);
		}
		public OptionalBindingIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionalBindingIdentifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GenScalaFacadesFromTypescriptVisitor ) return ((GenScalaFacadesFromTypescriptVisitor<? extends T>)visitor).visitOptionalBindingIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptionalBindingIdentifierContext optionalBindingIdentifier() throws RecognitionException {
		OptionalBindingIdentifierContext _localctx = new OptionalBindingIdentifierContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_optionalBindingIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(719);
			bindingIdentifier();
			setState(720);
			optionalParam();
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GenScalaFacadesFromTypescriptVisitor ) return ((GenScalaFacadesFromTypescriptVisitor<? extends T>)visitor).visitStringLiteralIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BasicIdentifierContext extends BindingIdentifierContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public BasicIdentifierContext(BindingIdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GenScalaFacadesFromTypescriptVisitor ) return ((GenScalaFacadesFromTypescriptVisitor<? extends T>)visitor).visitBasicIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BindingIdentifierContext bindingIdentifier() throws RecognitionException {
		BindingIdentifierContext _localctx = new BindingIdentifierContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_bindingIdentifier);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GenScalaFacadesFromTypescriptVisitor ) return ((GenScalaFacadesFromTypescriptVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_identifier);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GenScalaFacadesFromTypescriptVisitor ) return ((GenScalaFacadesFromTypescriptVisitor<? extends T>)visitor).visitLineEnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineEndContext lineEnd() throws RecognitionException {
		LineEndContext _localctx = new LineEndContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_lineEnd);
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
		case 33:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3]\u02dd\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\3\2\7"+
		"\2\u00a8\n\2\f\2\16\2\u00ab\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u00be\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\5\4\u00cc\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\6\3\6\5\6\u00d8\n\6\3\7\5\7\u00db\n\7\3\7\3\7\3\7\7\7\u00e0\n\7\f\7\16"+
		"\7\u00e3\13\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\5\t\u00ec\n\t\5\t\u00ee\n\t"+
		"\3\n\3\n\3\n\5\n\u00f3\n\n\3\13\3\13\3\13\3\13\3\13\5\13\u00fa\n\13\3"+
		"\f\3\f\3\f\3\r\3\r\3\r\7\r\u0102\n\r\f\r\16\r\u0105\13\r\3\16\3\16\5\16"+
		"\u0109\n\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20"+
		"\u0116\n\20\f\20\16\20\u0119\13\20\3\20\3\20\3\21\3\21\5\21\u011f\n\21"+
		"\3\22\3\22\5\22\u0123\n\22\3\22\3\22\3\23\3\23\3\23\5\23\u012a\n\23\3"+
		"\24\3\24\3\24\5\24\u012f\n\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26"+
		"\5\26\u0139\n\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\31"+
		"\3\31\5\31\u0147\n\31\3\32\3\32\5\32\u014b\n\32\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\5\32\u0154\n\32\3\32\3\32\5\32\u0158\n\32\3\32\3\32\3\32"+
		"\3\32\5\32\u015e\n\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\7\34\u0167\n"+
		"\34\f\34\16\34\u016a\13\34\3\35\3\35\5\35\u016e\n\35\3\36\3\36\3\36\3"+
		"\37\3\37\3\37\3\37\3 \3 \3 \7 \u017a\n \f \16 \u017d\13 \3!\3!\3!\5!\u0182"+
		"\n!\3\"\3\"\5\"\u0186\n\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\5#\u0191\n#\3#"+
		"\3#\3#\3#\3#\3#\7#\u0199\n#\f#\16#\u019c\13#\3$\5$\u019f\n$\3$\3$\3$\5"+
		"$\u01a4\n$\3$\7$\u01a7\n$\f$\16$\u01aa\13$\5$\u01ac\n$\3%\3%\3%\3%\3&"+
		"\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u01c1\n\'\3"+
		"(\3(\3(\3)\3)\3)\3)\3*\3*\5*\u01cc\n*\3+\3+\5+\u01d0\n+\3+\3+\3+\3,\3"+
		",\3-\3-\3-\7-\u01da\n-\f-\16-\u01dd\13-\3.\3.\3.\3.\3.\3.\3.\3.\5.\u01e7"+
		"\n.\3/\3/\3/\3/\3\60\3\60\3\60\7\60\u01f0\n\60\f\60\16\60\u01f3\13\60"+
		"\3\61\5\61\u01f6\n\61\3\61\3\61\5\61\u01fa\n\61\3\61\3\61\3\61\3\61\3"+
		"\62\3\62\5\62\u0202\n\62\3\62\3\62\5\62\u0206\n\62\3\62\3\62\3\62\3\62"+
		"\3\63\3\63\3\63\3\64\3\64\3\65\3\65\5\65\u0213\n\65\3\66\3\66\3\66\3\67"+
		"\5\67\u0219\n\67\3\67\3\67\5\67\u021d\n\67\3\67\3\67\5\67\u0221\n\67\3"+
		"8\38\38\38\38\58\u0228\n8\38\58\u022b\n8\58\u022d\n8\38\38\38\58\u0232"+
		"\n8\38\58\u0235\n8\39\39\39\79\u023a\n9\f9\169\u023d\139\3:\3:\3:\5:\u0242"+
		"\n:\3:\3:\3:\3:\5:\u0248\n:\3;\3;\3;\3;\5;\u024e\n;\3<\3<\3<\7<\u0253"+
		"\n<\f<\16<\u0256\13<\3=\3=\3=\5=\u025b\n=\3=\3=\3=\3=\5=\u0261\n=\3>\3"+
		">\3>\5>\u0266\n>\3?\3?\5?\u026a\n?\3?\3?\5?\u026e\n?\3?\3?\5?\u0272\n"+
		"?\3@\3@\3@\3@\3@\3@\3@\3A\3A\3A\3B\3B\3C\3C\3C\3C\3C\3C\7C\u0286\nC\f"+
		"C\16C\u0289\13C\3C\3C\3D\3D\5D\u028f\nD\3D\5D\u0292\nD\3E\3E\3E\3F\3F"+
		"\3F\7F\u029a\nF\fF\16F\u029d\13F\3G\5G\u02a0\nG\3G\5G\u02a3\nG\3H\3H\3"+
		"H\3I\5I\u02a9\nI\3I\3I\3I\3I\5I\u02af\nI\3I\3I\3J\3J\5J\u02b5\nJ\3K\3"+
		"K\3K\7K\u02ba\nK\fK\16K\u02bd\13K\3L\3L\3L\5L\u02c2\nL\3M\3M\3N\3N\3N"+
		"\7N\u02c9\nN\fN\16N\u02cc\13N\3O\3O\5O\u02d0\nO\3P\3P\3P\3Q\3Q\5Q\u02d7"+
		"\nQ\3R\3R\3S\3S\3S\2\3DT\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&("+
		"*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084"+
		"\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c"+
		"\u009e\u00a0\u00a2\u00a4\2\n\4\2\3\3\26\26\5\2\b\b\25\25\27\27\3\2UW\4"+
		"\2\r\r\30\30\3\2-.\3\2#$\f\2\3\3\6\6\16\16\20\20\22\22\26\26\30\31  \""+
		"$XX\4\2\4\4-.\2\u02f4\2\u00a9\3\2\2\2\4\u00bd\3\2\2\2\6\u00cb\3\2\2\2"+
		"\b\u00cd\3\2\2\2\n\u00d7\3\2\2\2\f\u00da\3\2\2\2\16\u00e6\3\2\2\2\20\u00ed"+
		"\3\2\2\2\22\u00f2\3\2\2\2\24\u00f9\3\2\2\2\26\u00fb\3\2\2\2\30\u00fe\3"+
		"\2\2\2\32\u0106\3\2\2\2\34\u010a\3\2\2\2\36\u010e\3\2\2\2 \u011e\3\2\2"+
		"\2\"\u0120\3\2\2\2$\u0129\3\2\2\2&\u012b\3\2\2\2(\u0132\3\2\2\2*\u0138"+
		"\3\2\2\2,\u013a\3\2\2\2.\u013f\3\2\2\2\60\u0141\3\2\2\2\62\u015d\3\2\2"+
		"\2\64\u015f\3\2\2\2\66\u0163\3\2\2\28\u016b\3\2\2\2:\u016f\3\2\2\2<\u0172"+
		"\3\2\2\2>\u0176\3\2\2\2@\u0181\3\2\2\2B\u0183\3\2\2\2D\u0190\3\2\2\2F"+
		"\u01ab\3\2\2\2H\u01ad\3\2\2\2J\u01b1\3\2\2\2L\u01c0\3\2\2\2N\u01c2\3\2"+
		"\2\2P\u01c5\3\2\2\2R\u01c9\3\2\2\2T\u01cd\3\2\2\2V\u01d4\3\2\2\2X\u01d6"+
		"\3\2\2\2Z\u01e6\3\2\2\2\\\u01e8\3\2\2\2^\u01ec\3\2\2\2`\u01f5\3\2\2\2"+
		"b\u01ff\3\2\2\2d\u020b\3\2\2\2f\u020e\3\2\2\2h\u0210\3\2\2\2j\u0214\3"+
		"\2\2\2l\u0218\3\2\2\2n\u0234\3\2\2\2p\u0236\3\2\2\2r\u0247\3\2\2\2t\u024d"+
		"\3\2\2\2v\u024f\3\2\2\2x\u0260\3\2\2\2z\u0262\3\2\2\2|\u0267\3\2\2\2~"+
		"\u0273\3\2\2\2\u0080\u027a\3\2\2\2\u0082\u027d\3\2\2\2\u0084\u027f\3\2"+
		"\2\2\u0086\u028c\3\2\2\2\u0088\u0293\3\2\2\2\u008a\u0296\3\2\2\2\u008c"+
		"\u029f\3\2\2\2\u008e\u02a4\3\2\2\2\u0090\u02a8\3\2\2\2\u0092\u02b2\3\2"+
		"\2\2\u0094\u02b6\3\2\2\2\u0096\u02be\3\2\2\2\u0098\u02c3\3\2\2\2\u009a"+
		"\u02c5\3\2\2\2\u009c\u02cf\3\2\2\2\u009e\u02d1\3\2\2\2\u00a0\u02d6\3\2"+
		"\2\2\u00a2\u02d8\3\2\2\2\u00a4\u02da\3\2\2\2\u00a6\u00a8\5\4\3\2\u00a7"+
		"\u00a6\3\2\2\2\u00a8\u00ab\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2"+
		"\2\2\u00aa\u00ac\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac\u00ad\7\2\2\3\u00ad"+
		"\3\3\2\2\2\u00ae\u00af\7\n\2\2\u00af\u00be\5\f\7\2\u00b0\u00b1\7\n\2\2"+
		"\u00b1\u00b2\5\24\13\2\u00b2\u00b3\5\u00a4S\2\u00b3\u00be\3\2\2\2\u00b4"+
		"\u00b5\7\n\2\2\u00b5\u00b6\7\20\2\2\u00b6\u00b7\7+\2\2\u00b7\u00b8\5\f"+
		"\7\2\u00b8\u00b9\7,\2\2\u00b9\u00be\3\2\2\2\u00ba\u00be\5\u0084C\2\u00bb"+
		"\u00be\5\6\4\2\u00bc\u00be\5\b\5\2\u00bd\u00ae\3\2\2\2\u00bd\u00b0\3\2"+
		"\2\2\u00bd\u00b4\3\2\2\2\u00bd\u00ba\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd"+
		"\u00bc\3\2\2\2\u00be\5\3\2\2\2\u00bf\u00c0\7\f\2\2\u00c0\u00c1\7\n\2\2"+
		"\u00c1\u00c2\5\24\13\2\u00c2\u00c3\5\u00a4S\2\u00c3\u00cc\3\2\2\2\u00c4"+
		"\u00c5\7\f\2\2\u00c5\u00c6\7\6\2\2\u00c6\u00c7\7\3\2\2\u00c7\u00c8\5\u00a0"+
		"Q\2\u00c8\u00c9\5\u00a4S\2\u00c9\u00cc\3\2\2\2\u00ca\u00cc\5,\27\2\u00cb"+
		"\u00bf\3\2\2\2\u00cb\u00c4\3\2\2\2\u00cb\u00ca\3\2\2\2\u00cc\7\3\2\2\2"+
		"\u00cd\u00ce\7\22\2\2\u00ce\u00cf\5\n\6\2\u00cf\u00d0\7\6\2\2\u00d0\u00d1"+
		"\5\u00a0Q\2\u00d1\u00d2\7\16\2\2\u00d2\u00d3\5\u00a0Q\2\u00d3\u00d4\5"+
		"\u00a4S\2\u00d4\t\3\2\2\2\u00d5\u00d8\5\u00a0Q\2\u00d6\u00d8\79\2\2\u00d7"+
		"\u00d5\3\2\2\2\u00d7\u00d6\3\2\2\2\u00d8\13\3\2\2\2\u00d9\u00db\t\2\2"+
		"\2\u00da\u00d9\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00dd"+
		"\5\16\b\2\u00dd\u00e1\7+\2\2\u00de\u00e0\5\20\t\2\u00df\u00de\3\2\2\2"+
		"\u00e0\u00e3\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e4"+
		"\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e4\u00e5\7,\2\2\u00e5\r\3\2\2\2\u00e6"+
		"\u00e7\5\u009aN\2\u00e7\17\3\2\2\2\u00e8\u00ee\5\22\n\2\u00e9\u00eb\5"+
		"\24\13\2\u00ea\u00ec\5\u00a4S\2\u00eb\u00ea\3\2\2\2\u00eb\u00ec\3\2\2"+
		"\2\u00ec\u00ee\3\2\2\2\u00ed\u00e8\3\2\2\2\u00ed\u00e9\3\2\2\2\u00ee\21"+
		"\3\2\2\2\u00ef\u00f3\5\u0084C\2\u00f0\u00f3\5\36\20\2\u00f1\u00f3\5\f"+
		"\7\2\u00f2\u00ef\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f1\3\2\2\2\u00f3"+
		"\23\3\2\2\2\u00f4\u00fa\5\26\f\2\u00f5\u00fa\5\60\31\2\u00f6\u00fa\5\34"+
		"\17\2\u00f7\u00fa\5\u0090I\2\u00f8\u00fa\5,\27\2\u00f9\u00f4\3\2\2\2\u00f9"+
		"\u00f5\3\2\2\2\u00f9\u00f6\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00f8\3\2"+
		"\2\2\u00fa\25\3\2\2\2\u00fb\u00fc\t\3\2\2\u00fc\u00fd\5\30\r\2\u00fd\27"+
		"\3\2\2\2\u00fe\u0103\5\32\16\2\u00ff\u0100\7.\2\2\u0100\u0102\5\32\16"+
		"\2\u0101\u00ff\3\2\2\2\u0102\u0105\3\2\2\2\u0103\u0101\3\2\2\2\u0103\u0104"+
		"\3\2\2\2\u0104\31\3\2\2\2\u0105\u0103\3\2\2\2\u0106\u0108\5\u00a0Q\2\u0107"+
		"\u0109\5j\66\2\u0108\u0107\3\2\2\2\u0108\u0109\3\2\2\2\u0109\33\3\2\2"+
		"\2\u010a\u010b\7\17\2\2\u010b\u010c\5\u00a0Q\2\u010c\u010d\5l\67\2\u010d"+
		"\35\3\2\2\2\u010e\u010f\5 \21\2\u010f\u0110\7\7\2\2\u0110\u0111\5\"\22"+
		"\2\u0111\u0117\7+\2\2\u0112\u0113\5$\23\2\u0113\u0114\5\u00a4S\2\u0114"+
		"\u0116\3\2\2\2\u0115\u0112\3\2\2\2\u0116\u0119\3\2\2\2\u0117\u0115\3\2"+
		"\2\2\u0117\u0118\3\2\2\2\u0118\u011a\3\2\2\2\u0119\u0117\3\2\2\2\u011a"+
		"\u011b\7,\2\2\u011b\37\3\2\2\2\u011c\u011f\7\5\2\2\u011d\u011f\3\2\2\2"+
		"\u011e\u011c\3\2\2\2\u011e\u011d\3\2\2\2\u011f!\3\2\2\2\u0120\u0122\5"+
		"\u00a0Q\2\u0121\u0123\5\64\33\2\u0122\u0121\3\2\2\2\u0122\u0123\3\2\2"+
		"\2\u0123\u0124\3\2\2\2\u0124\u0125\5\u008cG\2\u0125#\3\2\2\2\u0126\u012a"+
		"\5&\24\2\u0127\u012a\5(\25\2\u0128\u012a\5~@\2\u0129\u0126\3\2\2\2\u0129"+
		"\u0127\3\2\2\2\u0129\u0128\3\2\2\2\u012a%\3\2\2\2\u012b\u012c\7\t\2\2"+
		"\u012c\u012e\7)\2\2\u012d\u012f\5n8\2\u012e\u012d\3\2\2\2\u012e\u012f"+
		"\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0131\7*\2\2\u0131\'\3\2\2\2\u0132"+
		"\u0133\5t;\2\u0133\u0134\5*\26\2\u0134\u0135\5Z.\2\u0135)\3\2\2\2\u0136"+
		"\u0139\7\35\2\2\u0137\u0139\3\2\2\2\u0138\u0136\3\2\2\2\u0138\u0137\3"+
		"\2\2\2\u0139+\3\2\2\2\u013a\u013b\7\f\2\2\u013b\u013c\7/\2\2\u013c\u013d"+
		"\5\u00a0Q\2\u013d\u013e\5\u00a4S\2\u013e-\3\2\2\2\u013f\u0140\t\4\2\2"+
		"\u0140/\3\2\2\2\u0141\u0142\7\"\2\2\u0142\u0143\5\62\32\2\u0143\u0146"+
		"\7/\2\2\u0144\u0147\5@!\2\u0145\u0147\5\62\32\2\u0146\u0144\3\2\2\2\u0146"+
		"\u0145\3\2\2\2\u0147\61\3\2\2\2\u0148\u014a\5\u00a0Q\2\u0149\u014b\5\64"+
		"\33\2\u014a\u0149\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u015e\3\2\2\2\u014c"+
		"\u014d\7+\2\2\u014d\u014e\7\'\2\2\u014e\u014f\5\u00a0Q\2\u014f\u0150\7"+
		"\30\2\2\u0150\u0151\7\24\2\2\u0151\u0153\5\u00a0Q\2\u0152\u0154\5\64\33"+
		"\2\u0153\u0152\3\2\2\2\u0153\u0154\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0157"+
		"\7(\2\2\u0156\u0158\7\60\2\2\u0157\u0156\3\2\2\2\u0157\u0158\3\2\2\2\u0158"+
		"\u0159\3\2\2\2\u0159\u015a\7\61\2\2\u015a\u015b\5\62\32\2\u015b\u015c"+
		"\7,\2\2\u015c\u015e\3\2\2\2\u015d\u0148\3\2\2\2\u015d\u014c\3\2\2\2\u015e"+
		"\63\3\2\2\2\u015f\u0160\7<\2\2\u0160\u0161\5\66\34\2\u0161\u0162\7=\2"+
		"\2\u0162\65\3\2\2\2\u0163\u0168\58\35\2\u0164\u0165\7.\2\2\u0165\u0167"+
		"\58\35\2\u0166\u0164\3\2\2\2\u0167\u016a\3\2\2\2\u0168\u0166\3\2\2\2\u0168"+
		"\u0169\3\2\2\2\u0169\67\3\2\2\2\u016a\u0168\3\2\2\2\u016b\u016d\5\u00a0"+
		"Q\2\u016c\u016e\5:\36\2\u016d\u016c\3\2\2\2\u016d\u016e\3\2\2\2\u016e"+
		"9\3\2\2\2\u016f\u0170\t\5\2\2\u0170\u0171\5@!\2\u0171;\3\2\2\2\u0172\u0173"+
		"\7<\2\2\u0173\u0174\5> \2\u0174\u0175\7=\2\2\u0175=\3\2\2\2\u0176\u017b"+
		"\5@!\2\u0177\u0178\7.\2\2\u0178\u017a\5@!\2\u0179\u0177\3\2\2\2\u017a"+
		"\u017d\3\2\2\2\u017b\u0179\3\2\2\2\u017b\u017c\3\2\2\2\u017c?\3\2\2\2"+
		"\u017d\u017b\3\2\2\2\u017e\u0182\5D#\2\u017f\u0182\5`\61\2\u0180\u0182"+
		"\5b\62\2\u0181\u017e\3\2\2\2\u0181\u017f\3\2\2\2\u0181\u0180\3\2\2\2\u0182"+
		"A\3\2\2\2\u0183\u0185\7+\2\2\u0184\u0186\5V,\2\u0185\u0184\3\2\2\2\u0185"+
		"\u0186\3\2\2\2\u0186\u0187\3\2\2\2\u0187\u0188\7,\2\2\u0188C\3\2\2\2\u0189"+
		"\u018a\b#\1\2\u018a\u018b\7)\2\2\u018b\u018c\5D#\2\u018c\u018d\7*\2\2"+
		"\u018d\u0191\3\2\2\2\u018e\u0191\5F$\2\u018f\u0191\5B\"\2\u0190\u0189"+
		"\3\2\2\2\u0190\u018e\3\2\2\2\u0190\u018f\3\2\2\2\u0191\u019a\3\2\2\2\u0192"+
		"\u0193\f\7\2\2\u0193\u0194\7F\2\2\u0194\u0199\5D#\b\u0195\u0196\f\6\2"+
		"\2\u0196\u0197\7D\2\2\u0197\u0199\5D#\7\u0198\u0192\3\2\2\2\u0198\u0195"+
		"\3\2\2\2\u0199\u019c\3\2\2\2\u019a\u0198\3\2\2\2\u019a\u019b\3\2\2\2\u019b"+
		"E\3\2\2\2\u019c\u019a\3\2\2\2\u019d\u019f\7\24\2\2\u019e\u019d\3\2\2\2"+
		"\u019e\u019f\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0\u01ac\5L\'\2\u01a1\u01a3"+
		"\5L\'\2\u01a2\u01a4\5<\37\2\u01a3\u01a2\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4"+
		"\u01a8\3\2\2\2\u01a5\u01a7\5J&\2\u01a6\u01a5\3\2\2\2\u01a7\u01aa\3\2\2"+
		"\2\u01a8\u01a6\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9\u01ac\3\2\2\2\u01aa\u01a8"+
		"\3\2\2\2\u01ab\u019e\3\2\2\2\u01ab\u01a1\3\2\2\2\u01acG\3\2\2\2\u01ad"+
		"\u01ae\7<\2\2\u01ae\u01af\5@!\2\u01af\u01b0\7=\2\2\u01b0I\3\2\2\2\u01b1"+
		"\u01b2\7\'\2\2\u01b2\u01b3\7(\2\2\u01b3K\3\2\2\2\u01b4\u01c1\5P)\2\u01b5"+
		"\u01c1\5\u00a0Q\2\u01b6\u01b7\5\u00a2R\2\u01b7\u01b8\5N(\2\u01b8\u01c1"+
		"\3\2\2\2\u01b9\u01c1\5R*\2\u01ba\u01c1\5T+\2\u01bb\u01c1\5\\/\2\u01bc"+
		"\u01c1\5d\63\2\u01bd\u01c1\5f\64\2\u01be\u01c1\5.\30\2\u01bf\u01c1\5\62"+
		"\32\2\u01c0\u01b4\3\2\2\2\u01c0\u01b5\3\2\2\2\u01c0\u01b6\3\2\2\2\u01c0"+
		"\u01b9\3\2\2\2\u01c0\u01ba\3\2\2\2\u01c0\u01bb\3\2\2\2\u01c0\u01bc\3\2"+
		"\2\2\u01c0\u01bd\3\2\2\2\u01c0\u01be\3\2\2\2\u01c0\u01bf\3\2\2\2\u01c1"+
		"M\3\2\2\2\u01c2\u01c3\7\31\2\2\u01c3\u01c4\5@!\2\u01c4O\3\2\2\2\u01c5"+
		"\u01c6\7)\2\2\u01c6\u01c7\5@!\2\u01c7\u01c8\7*\2\2\u01c8Q\3\2\2\2\u01c9"+
		"\u01cb\5\u009aN\2\u01ca\u01cc\5<\37\2\u01cb\u01ca\3\2\2\2\u01cb\u01cc"+
		"\3\2\2\2\u01ccS\3\2\2\2\u01cd\u01cf\7+\2\2\u01ce\u01d0\5V,\2\u01cf\u01ce"+
		"\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0\u01d1\3\2\2\2\u01d1\u01d2\5\u00a4S"+
		"\2\u01d2\u01d3\7,\2\2\u01d3U\3\2\2\2\u01d4\u01d5\5X-\2\u01d5W\3\2\2\2"+
		"\u01d6\u01db\5Z.\2\u01d7\u01d8\t\6\2\2\u01d8\u01da\5Z.\2\u01d9\u01d7\3"+
		"\2\2\2\u01da\u01dd\3\2\2\2\u01db\u01d9\3\2\2\2\u01db\u01dc\3\2\2\2\u01dc"+
		"Y\3\2\2\2\u01dd\u01db\3\2\2\2\u01de\u01e7\5h\65\2\u01df\u01e7\5l\67\2"+
		"\u01e0\u01e7\5|?\2\u01e1\u01e7\5~@\2\u01e2\u01e7\5\u0080A\2\u01e3\u01e4"+
		"\5\u00a0Q\2\u01e4\u01e5\5l\67\2\u01e5\u01e7\3\2\2\2\u01e6\u01de\3\2\2"+
		"\2\u01e6\u01df\3\2\2\2\u01e6\u01e0\3\2\2\2\u01e6\u01e1\3\2\2\2\u01e6\u01e2"+
		"\3\2\2\2\u01e6\u01e3\3\2\2\2\u01e7[\3\2\2\2\u01e8\u01e9\7\'\2\2\u01e9"+
		"\u01ea\5^\60\2\u01ea\u01eb\7(\2\2\u01eb]\3\2\2\2\u01ec\u01f1\5@!\2\u01ed"+
		"\u01ee\7.\2\2\u01ee\u01f0\5@!\2\u01ef\u01ed\3\2\2\2\u01f0\u01f3\3\2\2"+
		"\2\u01f1\u01ef\3\2\2\2\u01f1\u01f2\3\2\2\2\u01f2_\3\2\2\2\u01f3\u01f1"+
		"\3\2\2\2\u01f4\u01f6\5\64\33\2\u01f5\u01f4\3\2\2\2\u01f5\u01f6\3\2\2\2"+
		"\u01f6\u01f7\3\2\2\2\u01f7\u01f9\7)\2\2\u01f8\u01fa\5n8\2\u01f9\u01f8"+
		"\3\2\2\2\u01f9\u01fa\3\2\2\2\u01fa\u01fb\3\2\2\2\u01fb\u01fc\7*\2\2\u01fc"+
		"\u01fd\7%\2\2\u01fd\u01fe\5@!\2\u01fea\3\2\2\2\u01ff\u0201\7\37\2\2\u0200"+
		"\u0202\5\64\33\2\u0201\u0200\3\2\2\2\u0201\u0202\3\2\2\2\u0202\u0203\3"+
		"\2\2\2\u0203\u0205\7)\2\2\u0204\u0206\5n8\2\u0205\u0204\3\2\2\2\u0205"+
		"\u0206\3\2\2\2\u0206\u0207\3\2\2\2\u0207\u0208\7*\2\2\u0208\u0209\7%\2"+
		"\2\u0209\u020a\5@!\2\u020ac\3\2\2\2\u020b\u020c\7 \2\2\u020c\u020d\5\u009a"+
		"N\2\u020de\3\2\2\2\u020e\u020f\7!\2\2\u020fg\3\2\2\2\u0210\u0212\5\u009e"+
		"P\2\u0211\u0213\5j\66\2\u0212\u0211\3\2\2\2\u0212\u0213\3\2\2\2\u0213"+
		"i\3\2\2\2\u0214\u0215\7\61\2\2\u0215\u0216\5@!\2\u0216k\3\2\2\2\u0217"+
		"\u0219\5\64\33\2\u0218\u0217\3\2\2\2\u0218\u0219\3\2\2\2\u0219\u021a\3"+
		"\2\2\2\u021a\u021c\7)\2\2\u021b\u021d\5n8\2\u021c\u021b\3\2\2\2\u021c"+
		"\u021d\3\2\2\2\u021d\u021e\3\2\2\2\u021e\u0220\7*\2\2\u021f\u0221\5j\66"+
		"\2\u0220\u021f\3\2\2\2\u0220\u0221\3\2\2\2\u0221m\3\2\2\2\u0222\u022c"+
		"\5p9\2\u0223\u022a\7.\2\2\u0224\u0227\5v<\2\u0225\u0226\7.\2\2\u0226\u0228"+
		"\5z>\2\u0227\u0225\3\2\2\2\u0227\u0228\3\2\2\2\u0228\u022b\3\2\2\2\u0229"+
		"\u022b\5z>\2\u022a\u0224\3\2\2\2\u022a\u0229\3\2\2\2\u022b\u022d\3\2\2"+
		"\2\u022c\u0223\3\2\2\2\u022c\u022d\3\2\2\2\u022d\u0235\3\2\2\2\u022e\u0231"+
		"\5v<\2\u022f\u0230\7.\2\2\u0230\u0232\5z>\2\u0231\u022f\3\2\2\2\u0231"+
		"\u0232\3\2\2\2\u0232\u0235\3\2\2\2\u0233\u0235\5z>\2\u0234\u0222\3\2\2"+
		"\2\u0234\u022e\3\2\2\2\u0234\u0233\3\2\2\2\u0235o\3\2\2\2\u0236\u023b"+
		"\5r:\2\u0237\u0238\7.\2\2\u0238\u023a\5r:\2\u0239\u0237\3\2\2\2\u023a"+
		"\u023d\3\2\2\2\u023b\u0239\3\2\2\2\u023b\u023c\3\2\2\2\u023cq\3\2\2\2"+
		"\u023d\u023b\3\2\2\2\u023e\u023f\5t;\2\u023f\u0241\5\u00a0Q\2\u0240\u0242"+
		"\5j\66\2\u0241\u0240\3\2\2\2\u0241\u0242\3\2\2\2\u0242\u0248\3\2\2\2\u0243"+
		"\u0244\5\u00a0Q\2\u0244\u0245\7\61\2\2\u0245\u0246\7Y\2\2\u0246\u0248"+
		"\3\2\2\2\u0247\u023e\3\2\2\2\u0247\u0243\3\2\2\2\u0248s\3\2\2\2\u0249"+
		"\u024e\7\32\2\2\u024a\u024e\7\34\2\2\u024b\u024e\7\33\2\2\u024c\u024e"+
		"\3\2\2\2\u024d\u0249\3\2\2\2\u024d\u024a\3\2\2\2\u024d\u024b\3\2\2\2\u024d"+
		"\u024c\3\2\2\2\u024eu\3\2\2\2\u024f\u0254\5x=\2\u0250\u0251\7.\2\2\u0251"+
		"\u0253\5x=\2\u0252\u0250\3\2\2\2\u0253\u0256\3\2\2\2\u0254\u0252\3\2\2"+
		"\2\u0254\u0255\3\2\2\2\u0255w\3\2\2\2\u0256\u0254\3\2\2\2\u0257\u0258"+
		"\5t;\2\u0258\u025a\5\u009eP\2\u0259\u025b\5j\66\2\u025a\u0259\3\2\2\2"+
		"\u025a\u025b\3\2\2\2\u025b\u0261\3\2\2\2\u025c\u025d\5\u009eP\2\u025d"+
		"\u025e\7\61\2\2\u025e\u025f\7Y\2\2\u025f\u0261\3\2\2\2\u0260\u0257\3\2"+
		"\2\2\u0260\u025c\3\2\2\2\u0261y\3\2\2\2\u0262\u0263\7&\2\2\u0263\u0265"+
		"\5\u00a0Q\2\u0264\u0266\5j\66\2\u0265\u0264\3\2\2\2\u0265\u0266\3\2\2"+
		"\2\u0266{\3\2\2\2\u0267\u0269\7\37\2\2\u0268\u026a\5\64\33\2\u0269\u0268"+
		"\3\2\2\2\u0269\u026a\3\2\2\2\u026a\u026b\3\2\2\2\u026b\u026d\7)\2\2\u026c"+
		"\u026e\5n8\2\u026d\u026c\3\2\2\2\u026d\u026e\3\2\2\2\u026e\u026f\3\2\2"+
		"\2\u026f\u0271\7*\2\2\u0270\u0272\5j\66\2\u0271\u0270\3\2\2\2\u0271\u0272"+
		"\3\2\2\2\u0272}\3\2\2\2\u0273\u0274\7\'\2\2\u0274\u0275\5\u00a0Q\2\u0275"+
		"\u0276\7\61\2\2\u0276\u0277\t\7\2\2\u0277\u0278\7(\2\2\u0278\u0279\5j"+
		"\66\2\u0279\177\3\2\2\2\u027a\u027b\5\u009eP\2\u027b\u027c\5l\67\2\u027c"+
		"\u0081\3\2\2\2\u027d\u027e\5.\30\2\u027e\u0083\3\2\2\2\u027f\u0280\7\23"+
		"\2\2\u0280\u0281\5\u0086D\2\u0281\u0287\7+\2\2\u0282\u0283\5Z.\2\u0283"+
		"\u0284\5\u00a4S\2\u0284\u0286\3\2\2\2\u0285\u0282\3\2\2\2\u0286\u0289"+
		"\3\2\2\2\u0287\u0285\3\2\2\2\u0287\u0288\3\2\2\2\u0288\u028a\3\2\2\2\u0289"+
		"\u0287\3\2\2\2\u028a\u028b\7,\2\2\u028b\u0085\3\2\2\2\u028c\u028e\5\u00a0"+
		"Q\2\u028d\u028f\5\64\33\2\u028e\u028d\3\2\2\2\u028e\u028f\3\2\2\2\u028f"+
		"\u0291\3\2\2\2\u0290\u0292\5\u0088E\2\u0291\u0290\3\2\2\2\u0291\u0292"+
		"\3\2\2\2\u0292\u0087\3\2\2\2\u0293\u0294\7\r\2\2\u0294\u0295\5\u008aF"+
		"\2\u0295\u0089\3\2\2\2\u0296\u029b\5R*\2\u0297\u0298\7.\2\2\u0298\u029a"+
		"\5R*\2\u0299\u0297\3\2\2\2\u029a\u029d\3\2\2\2\u029b\u0299\3\2\2\2\u029b"+
		"\u029c\3\2\2\2\u029c\u008b\3\2\2\2\u029d\u029b\3\2\2\2\u029e\u02a0\5\u0088"+
		"E\2\u029f\u029e\3\2\2\2\u029f\u02a0\3\2\2\2\u02a0\u02a2\3\2\2\2\u02a1"+
		"\u02a3\5\u008eH\2\u02a2\u02a1\3\2\2\2\u02a2\u02a3\3\2\2\2\u02a3\u008d"+
		"\3\2\2\2\u02a4\u02a5\7\21\2\2\u02a5\u02a6\5\u008aF\2\u02a6\u008f\3\2\2"+
		"\2\u02a7\u02a9\7\b\2\2\u02a8\u02a7\3\2\2\2\u02a8\u02a9\3\2\2\2\u02a9\u02aa"+
		"\3\2\2\2\u02aa\u02ab\7\13\2\2\u02ab\u02ac\5\u00a0Q\2\u02ac\u02ae\7+\2"+
		"\2\u02ad\u02af\5\u0092J\2\u02ae\u02ad\3\2\2\2\u02ae\u02af\3\2\2\2\u02af"+
		"\u02b0\3\2\2\2\u02b0\u02b1\7,\2\2\u02b1\u0091\3\2\2\2\u02b2\u02b4\5\u0094"+
		"K\2\u02b3\u02b5\7.\2\2\u02b4\u02b3\3\2\2\2\u02b4\u02b5\3\2\2\2\u02b5\u0093"+
		"\3\2\2\2\u02b6\u02bb\5\u0096L\2\u02b7\u02b8\7.\2\2\u02b8\u02ba\5\u0096"+
		"L\2\u02b9\u02b7\3\2\2\2\u02ba\u02bd\3\2\2\2\u02bb\u02b9\3\2\2\2\u02bb"+
		"\u02bc\3\2\2\2\u02bc\u0095\3\2\2\2\u02bd\u02bb\3\2\2\2\u02be\u02c1\5\u00a0"+
		"Q\2\u02bf\u02c0\7/\2\2\u02c0\u02c2\5\u0098M\2\u02c1\u02bf\3\2\2\2\u02c1"+
		"\u02c2\3\2\2\2\u02c2\u0097\3\2\2\2\u02c3\u02c4\5\u0082B\2\u02c4\u0099"+
		"\3\2\2\2\u02c5\u02ca\5\u00a0Q\2\u02c6\u02c7\7\62\2\2\u02c7\u02c9\5\u00a0"+
		"Q\2\u02c8\u02c6\3\2\2\2\u02c9\u02cc\3\2\2\2\u02ca\u02c8\3\2\2\2\u02ca"+
		"\u02cb\3\2\2\2\u02cb\u009b\3\2\2\2\u02cc\u02ca\3\2\2\2\u02cd\u02d0\7\60"+
		"\2\2\u02ce\u02d0\3\2\2\2\u02cf\u02cd\3\2\2\2\u02cf\u02ce\3\2\2\2\u02d0"+
		"\u009d\3\2\2\2\u02d1\u02d2\5\u00a0Q\2\u02d2\u02d3\5\u009cO\2\u02d3\u009f"+
		"\3\2\2\2\u02d4\u02d7\5\u00a2R\2\u02d5\u02d7\7Y\2\2\u02d6\u02d4\3\2\2\2"+
		"\u02d6\u02d5\3\2\2\2\u02d7\u00a1\3\2\2\2\u02d8\u02d9\t\b\2\2\u02d9\u00a3"+
		"\3\2\2\2\u02da\u02db\t\t\2\2\u02db\u00a5\3\2\2\2Q\u00a9\u00bd\u00cb\u00d7"+
		"\u00da\u00e1\u00eb\u00ed\u00f2\u00f9\u0103\u0108\u0117\u011e\u0122\u0129"+
		"\u012e\u0138\u0146\u014a\u0153\u0157\u015d\u0168\u016d\u017b\u0181\u0185"+
		"\u0190\u0198\u019a\u019e\u01a3\u01a8\u01ab\u01c0\u01cb\u01cf\u01db\u01e6"+
		"\u01f1\u01f5\u01f9\u0201\u0205\u0212\u0218\u021c\u0220\u0227\u022a\u022c"+
		"\u0231\u0234\u023b\u0241\u0247\u024d\u0254\u025a\u0260\u0265\u0269\u026d"+
		"\u0271\u0287\u028e\u0291\u029b\u029f\u02a2\u02a8\u02ae\u02b4\u02bb\u02c1"+
		"\u02ca\u02cf\u02d6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}