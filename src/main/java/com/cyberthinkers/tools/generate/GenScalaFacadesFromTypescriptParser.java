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
		RULE_className = 15, RULE_ambientClassBodyElement = 16, RULE_ambientConstructorDeclaration = 17, 
		RULE_ambientPropertyMemberDeclaration = 18, RULE_optStatic = 19, RULE_exportIdentifier = 20, 
		RULE_numericLiteral = 21, RULE_typeDeclaration = 22, RULE_typeDef = 23, 
		RULE_typeParameters = 24, RULE_typeParameterList = 25, RULE_typeParameter = 26, 
		RULE_constraint = 27, RULE_typeArguments = 28, RULE_typeArgumentList = 29, 
		RULE_type = 30, RULE_unnamedInterface = 31, RULE_unionOrIntersectionOrPrimaryType = 32, 
		RULE_primaryOrArray = 33, RULE_nestedType = 34, RULE_arrayDim = 35, RULE_primaryType = 36, 
		RULE_typeGuard = 37, RULE_parenthesizedType = 38, RULE_typeReference = 39, 
		RULE_objectType = 40, RULE_typeBody = 41, RULE_typeMemberList = 42, RULE_typeMember = 43, 
		RULE_tupleType = 44, RULE_tupleTypeElements = 45, RULE_functionType = 46, 
		RULE_constructorType = 47, RULE_typeQuery = 48, RULE_thisType = 49, RULE_propertySignature = 50, 
		RULE_typeAnnotation = 51, RULE_callSignature = 52, RULE_parameterList = 53, 
		RULE_requiredParameterList = 54, RULE_requiredParameter = 55, RULE_accessibilityModifier = 56, 
		RULE_optionalParameterList = 57, RULE_optionalParameter = 58, RULE_restParameter = 59, 
		RULE_constructSignature = 60, RULE_indexSignature = 61, RULE_methodSignature = 62, 
		RULE_constExpression = 63, RULE_interfaceDeclaration = 64, RULE_interfaceName = 65, 
		RULE_extendsClause = 66, RULE_classOrInterfaceTypeList = 67, RULE_classHeritage = 68, 
		RULE_implementsClause = 69, RULE_enumDeclaration = 70, RULE_enumBody = 71, 
		RULE_enumMemberList = 72, RULE_enumMember = 73, RULE_enumValue = 74, RULE_identifierPath = 75, 
		RULE_optionalParam = 76, RULE_optionalBindingIdentifier = 77, RULE_bindingIdentifier = 78, 
		RULE_identifier = 79, RULE_lineEnd = 80;
	public static final String[] ruleNames = {
		"typescriptAmbientDeclarations", "declarationScriptElement", "exportDef", 
		"importDef", "importName", "ambientModuleOrNamespace", "ambientModuleName", 
		"ambientItem", "ambientBracesItem", "ambientStatement", "variableDeclaration", 
		"variableList", "variableName", "functionDeclaration", "classDeclaration", 
		"className", "ambientClassBodyElement", "ambientConstructorDeclaration", 
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
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Declare) | (1L << Export) | (1L << Import) | (1L << Interface))) != 0)) {
				{
				{
				setState(162);
				declarationScriptElement();
				}
				}
				setState(167);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(168);
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
			setState(185);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new DeclareModuleOrNamespaceContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(170);
				match(Declare);
				setState(171);
				ambientModuleOrNamespace();
				}
				break;
			case 2:
				_localctx = new DeclareStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(172);
				match(Declare);
				setState(173);
				ambientStatement();
				setState(174);
				lineEnd();
				}
				break;
			case 3:
				_localctx = new DeclareGlobalModuleOrNamespaceContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(176);
				match(Declare);
				setState(177);
				match(Global);
				setState(178);
				match(OpenBrace);
				setState(179);
				ambientModuleOrNamespace();
				setState(180);
				match(CloseBrace);
				}
				break;
			case 4:
				_localctx = new DeclareInterfaceContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(182);
				interfaceDeclaration();
				}
				break;
			case 5:
				_localctx = new DeclareExportContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(183);
				exportDef();
				}
				break;
			case 6:
				_localctx = new DeclareImportContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(184);
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
			setState(199);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(187);
				match(Export);
				setState(188);
				match(Declare);
				setState(189);
				ambientStatement();
				setState(190);
				lineEnd();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(192);
				match(Export);
				setState(193);
				match(As);
				setState(194);
				match(T__0);
				setState(195);
				bindingIdentifier();
				setState(196);
				lineEnd();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(198);
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
			setState(201);
			match(Import);
			setState(202);
			importName();
			setState(203);
			match(As);
			setState(204);
			bindingIdentifier();
			setState(205);
			match(From);
			setState(206);
			bindingIdentifier();
			setState(207);
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
			setState(211);
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
				setState(209);
				bindingIdentifier();
				}
				break;
			case Multiply:
				enterOuterAlt(_localctx, 2);
				{
				setState(210);
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
			setState(214);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(213);
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
			setState(216);
			ambientModuleName();
			setState(217);
			match(OpenBrace);
			setState(221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << Abstract) | (1L << As) | (1L << Class) | (1L << Const) | (1L << Enum) | (1L << Export) | (1L << From) | (1L << Function) | (1L << Global) | (1L << Import) | (1L << Interface) | (1L << Let) | (1L << Module) | (1L << Var) | (1L << In) | (1L << Is) | (1L << Typeof) | (1L << Type) | (1L << Number) | (1L << String))) != 0) || _la==Identifier || _la==StringLiteral) {
				{
				{
				setState(218);
				((AmbientModuleOrNamespaceContext)_localctx).ambientItem = ambientItem();
				((AmbientModuleOrNamespaceContext)_localctx).el.add(((AmbientModuleOrNamespaceContext)_localctx).ambientItem);
				}
				}
				setState(223);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(224);
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
			setState(226);
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
			setState(233);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(228);
				ambientBracesItem();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(229);
				ambientStatement();
				setState(231);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LineTerminator) | (1L << SemiColon) | (1L << Comma))) != 0)) {
					{
					setState(230);
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
			setState(238);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Interface:
				enterOuterAlt(_localctx, 1);
				{
				setState(235);
				interfaceDeclaration();
				}
				break;
			case Abstract:
			case Class:
				enterOuterAlt(_localctx, 2);
				{
				setState(236);
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
				setState(237);
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
			setState(245);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(240);
				variableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(241);
				typeDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(242);
				functionDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(243);
				enumDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(244);
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
			setState(247);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Let) | (1L << Var))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(248);
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
			setState(250);
			variableName();
			setState(255);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(251);
					match(Comma);
					setState(252);
					variableName();
					}
					} 
				}
				setState(257);
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
			setState(258);
			bindingIdentifier();
			setState(260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(259);
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
			setState(262);
			match(Function);
			setState(263);
			bindingIdentifier();
			setState(264);
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
			setState(267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Abstract) {
				{
				setState(266);
				match(Abstract);
				}
			}

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
		enterRule(_localctx, 30, RULE_className);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			bindingIdentifier();
			setState(284);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LessThan) {
				{
				setState(283);
				typeParameters();
				}
			}

			setState(286);
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
		enterRule(_localctx, 32, RULE_ambientClassBodyElement);
		try {
			setState(291);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				_localctx = new AmbientClassBodyElementConstructorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(288);
				ambientConstructorDeclaration();
				}
				break;
			case 2:
				_localctx = new AmbientClassBodyElementPropertyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(289);
				ambientPropertyMemberDeclaration();
				}
				break;
			case 3:
				_localctx = new AmbientClassBodyElementIndexContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(290);
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
		enterRule(_localctx, 34, RULE_ambientConstructorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			match(Constructor);
			setState(294);
			match(OpenParen);
			setState(296);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << As) | (1L << From) | (1L << Global) | (1L << Import) | (1L << Module) | (1L << In) | (1L << Is) | (1L << Public) | (1L << Protected) | (1L << Private) | (1L << Typeof) | (1L << Type) | (1L << Number) | (1L << String) | (1L << DotDotDot))) != 0) || _la==Identifier || _la==StringLiteral) {
				{
				setState(295);
				parameterList();
				}
			}

			setState(298);
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
		enterRule(_localctx, 36, RULE_ambientPropertyMemberDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			accessibilityModifier();
			setState(301);
			optStatic();
			setState(302);
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
		enterRule(_localctx, 38, RULE_optStatic);
		try {
			setState(306);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Static:
				_localctx = new OptStaticDefContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(304);
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
		enterRule(_localctx, 40, RULE_exportIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			match(Export);
			setState(309);
			match(Assign);
			setState(310);
			bindingIdentifier();
			setState(311);
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
		enterRule(_localctx, 42, RULE_numericLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
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
		enterRule(_localctx, 44, RULE_typeDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			match(Type);
			setState(316);
			typeDef();
			setState(317);
			match(Assign);
			setState(320);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(318);
				type();
				}
				break;
			case 2:
				{
				setState(319);
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
		enterRule(_localctx, 46, RULE_typeDef);
		int _la;
		try {
			setState(343);
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
				setState(322);
				bindingIdentifier();
				setState(324);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(323);
					typeParameters();
					}
					break;
				}
				}
				break;
			case OpenBrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(326);
				match(OpenBrace);
				setState(327);
				match(OpenBracket);
				setState(328);
				bindingIdentifier();
				setState(329);
				match(In);
				setState(330);
				match(Keyof);
				setState(331);
				bindingIdentifier();
				setState(333);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LessThan) {
					{
					setState(332);
					typeParameters();
					}
				}

				setState(335);
				match(CloseBracket);
				setState(337);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==QuestionMark) {
					{
					setState(336);
					match(QuestionMark);
					}
				}

				setState(339);
				match(Colon);
				setState(340);
				typeDef();
				setState(341);
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
		enterRule(_localctx, 48, RULE_typeParameters);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			match(LessThan);
			setState(346);
			typeParameterList();
			setState(347);
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
		enterRule(_localctx, 50, RULE_typeParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			typeParameter();
			setState(354);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(350);
				match(Comma);
				setState(351);
				typeParameter();
				}
				}
				setState(356);
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
		enterRule(_localctx, 52, RULE_typeParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			bindingIdentifier();
			setState(359);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Extends || _la==In) {
				{
				setState(358);
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
		enterRule(_localctx, 54, RULE_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			_la = _input.LA(1);
			if ( !(_la==Extends || _la==In) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(362);
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
		enterRule(_localctx, 56, RULE_typeArguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			match(LessThan);
			setState(365);
			typeArgumentList();
			setState(366);
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
		enterRule(_localctx, 58, RULE_typeArgumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			type();
			setState(373);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(369);
				match(Comma);
				setState(370);
				type();
				}
				}
				setState(375);
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
		enterRule(_localctx, 60, RULE_type);
		try {
			setState(379);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(376);
				unionOrIntersectionOrPrimaryType(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(377);
				functionType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(378);
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
		enterRule(_localctx, 62, RULE_unnamedInterface);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			match(OpenBrace);
			setState(383);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << As) | (1L << From) | (1L << Global) | (1L << Import) | (1L << Module) | (1L << In) | (1L << Is) | (1L << New) | (1L << Typeof) | (1L << Type) | (1L << Number) | (1L << String) | (1L << OpenBracket) | (1L << OpenParen) | (1L << LessThan))) != 0) || _la==Identifier || _la==StringLiteral) {
				{
				setState(382);
				typeBody();
				}
			}

			setState(385);
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
		int _startState = 64;
		enterRecursionRule(_localctx, 64, RULE_unionOrIntersectionOrPrimaryType, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(388);
				match(OpenParen);
				setState(389);
				unionOrIntersectionOrPrimaryType(0);
				setState(390);
				match(CloseParen);
				}
				break;
			case 2:
				{
				setState(392);
				primaryOrArray();
				}
				break;
			case 3:
				{
				setState(393);
				unnamedInterface();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(404);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(402);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
					case 1:
						{
						_localctx = new UnionOrIntersectionOrPrimaryTypeContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_unionOrIntersectionOrPrimaryType);
						setState(396);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(397);
						match(BitOr);
						setState(398);
						unionOrIntersectionOrPrimaryType(6);
						}
						break;
					case 2:
						{
						_localctx = new UnionOrIntersectionOrPrimaryTypeContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_unionOrIntersectionOrPrimaryType);
						setState(399);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(400);
						match(BitAnd);
						setState(401);
						unionOrIntersectionOrPrimaryType(5);
						}
						break;
					}
					} 
				}
				setState(406);
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
		enterRule(_localctx, 66, RULE_primaryOrArray);
		int _la;
		try {
			int _alt;
			setState(421);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(408);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Keyof) {
					{
					setState(407);
					match(Keyof);
					}
				}

				setState(410);
				primaryType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(411);
				primaryType();
				setState(413);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
				case 1:
					{
					setState(412);
					typeArguments();
					}
					break;
				}
				setState(418);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(415);
						arrayDim();
						}
						} 
					}
					setState(420);
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
		enterRule(_localctx, 68, RULE_nestedType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(423);
			match(LessThan);
			setState(424);
			type();
			setState(425);
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
		enterRule(_localctx, 70, RULE_arrayDim);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(427);
			match(OpenBracket);
			setState(428);
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
		enterRule(_localctx, 72, RULE_primaryType);
		try {
			setState(442);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(430);
				parenthesizedType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(431);
				bindingIdentifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(432);
				identifier();
				setState(433);
				typeGuard();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(435);
				typeReference();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(436);
				objectType();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(437);
				tupleType();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(438);
				typeQuery();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(439);
				thisType();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(440);
				numericLiteral();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(441);
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
		enterRule(_localctx, 74, RULE_typeGuard);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(444);
			match(Is);
			setState(445);
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
		enterRule(_localctx, 76, RULE_parenthesizedType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(447);
			match(OpenParen);
			setState(448);
			type();
			setState(449);
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
		enterRule(_localctx, 78, RULE_typeReference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(451);
			identifierPath();
			setState(453);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(452);
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
		enterRule(_localctx, 80, RULE_objectType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(455);
			match(OpenBrace);
			setState(457);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << As) | (1L << From) | (1L << Global) | (1L << Import) | (1L << Module) | (1L << In) | (1L << Is) | (1L << New) | (1L << Typeof) | (1L << Type) | (1L << Number) | (1L << String) | (1L << OpenBracket) | (1L << OpenParen) | (1L << LessThan))) != 0) || _la==Identifier || _la==StringLiteral) {
				{
				setState(456);
				typeBody();
				}
			}

			setState(459);
			lineEnd();
			setState(460);
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
		enterRule(_localctx, 82, RULE_typeBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(462);
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
		enterRule(_localctx, 84, RULE_typeMemberList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(464);
			typeMember();
			setState(469);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(465);
					_la = _input.LA(1);
					if ( !(_la==SemiColon || _la==Comma) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(466);
					typeMember();
					}
					} 
				}
				setState(471);
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
		enterRule(_localctx, 86, RULE_typeMember);
		try {
			setState(480);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(472);
				propertySignature();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(473);
				callSignature();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(474);
				constructSignature();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(475);
				indexSignature();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(476);
				methodSignature();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(477);
				bindingIdentifier();
				setState(478);
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
		enterRule(_localctx, 88, RULE_tupleType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(482);
			match(OpenBracket);
			setState(483);
			tupleTypeElements();
			setState(484);
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
		enterRule(_localctx, 90, RULE_tupleTypeElements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(486);
			type();
			setState(491);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(487);
				match(Comma);
				setState(488);
				type();
				}
				}
				setState(493);
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
		enterRule(_localctx, 92, RULE_functionType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(495);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LessThan) {
				{
				setState(494);
				typeParameters();
				}
			}

			setState(497);
			match(OpenParen);
			setState(499);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << As) | (1L << From) | (1L << Global) | (1L << Import) | (1L << Module) | (1L << In) | (1L << Is) | (1L << Public) | (1L << Protected) | (1L << Private) | (1L << Typeof) | (1L << Type) | (1L << Number) | (1L << String) | (1L << DotDotDot))) != 0) || _la==Identifier || _la==StringLiteral) {
				{
				setState(498);
				parameterList();
				}
			}

			setState(501);
			match(CloseParen);
			setState(502);
			match(ThickArrow);
			setState(503);
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
		enterRule(_localctx, 94, RULE_constructorType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(505);
			match(New);
			setState(507);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LessThan) {
				{
				setState(506);
				typeParameters();
				}
			}

			setState(509);
			match(OpenParen);
			setState(511);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << As) | (1L << From) | (1L << Global) | (1L << Import) | (1L << Module) | (1L << In) | (1L << Is) | (1L << Public) | (1L << Protected) | (1L << Private) | (1L << Typeof) | (1L << Type) | (1L << Number) | (1L << String) | (1L << DotDotDot))) != 0) || _la==Identifier || _la==StringLiteral) {
				{
				setState(510);
				parameterList();
				}
			}

			setState(513);
			match(CloseParen);
			setState(514);
			match(ThickArrow);
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
		enterRule(_localctx, 96, RULE_typeQuery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(517);
			match(Typeof);
			setState(518);
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
		enterRule(_localctx, 98, RULE_thisType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(520);
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
		enterRule(_localctx, 100, RULE_propertySignature);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(522);
			optionalBindingIdentifier();
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
		enterRule(_localctx, 102, RULE_typeAnnotation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(526);
			match(Colon);
			setState(527);
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
		enterRule(_localctx, 104, RULE_callSignature);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(530);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LessThan) {
				{
				setState(529);
				typeParameters();
				}
			}

			setState(532);
			match(OpenParen);
			setState(534);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << As) | (1L << From) | (1L << Global) | (1L << Import) | (1L << Module) | (1L << In) | (1L << Is) | (1L << Public) | (1L << Protected) | (1L << Private) | (1L << Typeof) | (1L << Type) | (1L << Number) | (1L << String) | (1L << DotDotDot))) != 0) || _la==Identifier || _la==StringLiteral) {
				{
				setState(533);
				parameterList();
				}
			}

			setState(536);
			match(CloseParen);
			setState(538);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(537);
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
		enterRule(_localctx, 106, RULE_parameterList);
		int _la;
		try {
			setState(558);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(540);
				requiredParameterList();
				setState(550);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(541);
					match(Comma);
					{
					setState(548);
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
						setState(542);
						optionalParameterList();
						setState(545);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==Comma) {
							{
							setState(543);
							match(Comma);
							setState(544);
							restParameter();
							}
						}

						}
						break;
					case DotDotDot:
						{
						setState(547);
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
				setState(552);
				optionalParameterList();
				setState(555);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(553);
					match(Comma);
					setState(554);
					restParameter();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(557);
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
		enterRule(_localctx, 108, RULE_requiredParameterList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(560);
			requiredParameter();
			setState(565);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(561);
					match(Comma);
					setState(562);
					requiredParameter();
					}
					} 
				}
				setState(567);
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
		enterRule(_localctx, 110, RULE_requiredParameter);
		int _la;
		try {
			setState(577);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(568);
				accessibilityModifier();
				setState(569);
				bindingIdentifier();
				setState(571);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(570);
					typeAnnotation();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(573);
				bindingIdentifier();
				setState(574);
				match(Colon);
				setState(575);
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
		enterRule(_localctx, 112, RULE_accessibilityModifier);
		try {
			setState(583);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Public:
				_localctx = new PublicModifierContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(579);
				match(Public);
				}
				break;
			case Private:
				_localctx = new PrivateModifierContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(580);
				match(Private);
				}
				break;
			case Protected:
				_localctx = new ProtectedModifierContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(581);
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
		enterRule(_localctx, 114, RULE_optionalParameterList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(585);
			optionalParameter();
			setState(590);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(586);
					match(Comma);
					setState(587);
					optionalParameter();
					}
					} 
				}
				setState(592);
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
		enterRule(_localctx, 116, RULE_optionalParameter);
		int _la;
		try {
			setState(602);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(593);
				accessibilityModifier();
				setState(594);
				optionalBindingIdentifier();
				setState(596);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(595);
					typeAnnotation();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(598);
				optionalBindingIdentifier();
				setState(599);
				match(Colon);
				setState(600);
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
		enterRule(_localctx, 118, RULE_restParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(604);
			match(DotDotDot);
			setState(605);
			bindingIdentifier();
			setState(607);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(606);
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
		enterRule(_localctx, 120, RULE_constructSignature);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(609);
			match(New);
			setState(611);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LessThan) {
				{
				setState(610);
				typeParameters();
				}
			}

			setState(613);
			match(OpenParen);
			setState(615);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << As) | (1L << From) | (1L << Global) | (1L << Import) | (1L << Module) | (1L << In) | (1L << Is) | (1L << Public) | (1L << Protected) | (1L << Private) | (1L << Typeof) | (1L << Type) | (1L << Number) | (1L << String) | (1L << DotDotDot))) != 0) || _la==Identifier || _la==StringLiteral) {
				{
				setState(614);
				parameterList();
				}
			}

			setState(617);
			match(CloseParen);
			setState(619);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(618);
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
		enterRule(_localctx, 122, RULE_indexSignature);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(621);
			match(OpenBracket);
			setState(622);
			bindingIdentifier();
			setState(623);
			match(Colon);
			setState(624);
			_la = _input.LA(1);
			if ( !(_la==Number || _la==String) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(625);
			match(CloseBracket);
			setState(626);
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
		enterRule(_localctx, 124, RULE_methodSignature);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(628);
			optionalBindingIdentifier();
			setState(629);
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
		enterRule(_localctx, 126, RULE_constExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(631);
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
		enterRule(_localctx, 128, RULE_interfaceDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(633);
			match(Interface);
			setState(634);
			interfaceName();
			setState(635);
			match(OpenBrace);
			setState(641);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << As) | (1L << From) | (1L << Global) | (1L << Import) | (1L << Module) | (1L << In) | (1L << Is) | (1L << New) | (1L << Typeof) | (1L << Type) | (1L << Number) | (1L << String) | (1L << OpenBracket) | (1L << OpenParen) | (1L << LessThan))) != 0) || _la==Identifier || _la==StringLiteral) {
				{
				{
				setState(636);
				typeMember();
				setState(637);
				lineEnd();
				}
				}
				setState(643);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(644);
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
		enterRule(_localctx, 130, RULE_interfaceName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(646);
			bindingIdentifier();
			setState(648);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LessThan) {
				{
				setState(647);
				typeParameters();
				}
			}

			setState(651);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Extends) {
				{
				setState(650);
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
		enterRule(_localctx, 132, RULE_extendsClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(653);
			match(Extends);
			setState(654);
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
		enterRule(_localctx, 134, RULE_classOrInterfaceTypeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(656);
			typeReference();
			setState(661);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(657);
				match(Comma);
				setState(658);
				typeReference();
				}
				}
				setState(663);
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
		enterRule(_localctx, 136, RULE_classHeritage);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(665);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Extends) {
				{
				setState(664);
				extendsClause();
				}
			}

			setState(668);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Implements) {
				{
				setState(667);
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
		enterRule(_localctx, 138, RULE_implementsClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(670);
			match(Implements);
			setState(671);
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
		enterRule(_localctx, 140, RULE_enumDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(674);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Const) {
				{
				setState(673);
				match(Const);
				}
			}

			setState(676);
			match(Enum);
			setState(677);
			bindingIdentifier();
			setState(678);
			match(OpenBrace);
			setState(680);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << As) | (1L << From) | (1L << Global) | (1L << Import) | (1L << Module) | (1L << In) | (1L << Is) | (1L << Typeof) | (1L << Type) | (1L << Number) | (1L << String))) != 0) || _la==Identifier || _la==StringLiteral) {
				{
				setState(679);
				enumBody();
				}
			}

			setState(682);
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
		enterRule(_localctx, 142, RULE_enumBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(684);
			enumMemberList();
			setState(686);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(685);
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
		enterRule(_localctx, 144, RULE_enumMemberList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(688);
			enumMember();
			setState(693);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(689);
					match(Comma);
					setState(690);
					enumMember();
					}
					} 
				}
				setState(695);
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
		enterRule(_localctx, 146, RULE_enumMember);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(696);
			bindingIdentifier();
			setState(699);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Assign) {
				{
				setState(697);
				match(Assign);
				setState(698);
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
		enterRule(_localctx, 148, RULE_enumValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(701);
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
		enterRule(_localctx, 150, RULE_identifierPath);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(703);
			((IdentifierPathContext)_localctx).bindingIdentifier = bindingIdentifier();
			((IdentifierPathContext)_localctx).ident.add(((IdentifierPathContext)_localctx).bindingIdentifier);
			setState(708);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(704);
					match(Dot);
					setState(705);
					((IdentifierPathContext)_localctx).bindingIdentifier = bindingIdentifier();
					((IdentifierPathContext)_localctx).ident.add(((IdentifierPathContext)_localctx).bindingIdentifier);
					}
					} 
				}
				setState(710);
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
		enterRule(_localctx, 152, RULE_optionalParam);
		try {
			setState(713);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case QuestionMark:
				_localctx = new OptionalModifierContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(711);
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
		enterRule(_localctx, 154, RULE_optionalBindingIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(715);
			bindingIdentifier();
			setState(716);
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
		enterRule(_localctx, 156, RULE_bindingIdentifier);
		try {
			setState(720);
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
				setState(718);
				identifier();
				}
				break;
			case StringLiteral:
				_localctx = new StringLiteralIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(719);
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
		enterRule(_localctx, 158, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(722);
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
		enterRule(_localctx, 160, RULE_lineEnd);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(724);
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
		case 32:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3]\u02d9\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\3\2\7\2\u00a6"+
		"\n\2\f\2\16\2\u00a9\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\5\3\u00bc\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\5\4\u00ca\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\5"+
		"\6\u00d6\n\6\3\7\5\7\u00d9\n\7\3\7\3\7\3\7\7\7\u00de\n\7\f\7\16\7\u00e1"+
		"\13\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\5\t\u00ea\n\t\5\t\u00ec\n\t\3\n\3\n"+
		"\3\n\5\n\u00f1\n\n\3\13\3\13\3\13\3\13\3\13\5\13\u00f8\n\13\3\f\3\f\3"+
		"\f\3\r\3\r\3\r\7\r\u0100\n\r\f\r\16\r\u0103\13\r\3\16\3\16\5\16\u0107"+
		"\n\16\3\17\3\17\3\17\3\17\3\20\5\20\u010e\n\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\7\20\u0116\n\20\f\20\16\20\u0119\13\20\3\20\3\20\3\21\3\21\5\21"+
		"\u011f\n\21\3\21\3\21\3\22\3\22\3\22\5\22\u0126\n\22\3\23\3\23\3\23\5"+
		"\23\u012b\n\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\5\25\u0135\n\25"+
		"\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\30\3\30\5\30\u0143"+
		"\n\30\3\31\3\31\5\31\u0147\n\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31"+
		"\u0150\n\31\3\31\3\31\5\31\u0154\n\31\3\31\3\31\3\31\3\31\5\31\u015a\n"+
		"\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\7\33\u0163\n\33\f\33\16\33\u0166"+
		"\13\33\3\34\3\34\5\34\u016a\n\34\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3"+
		"\37\3\37\3\37\7\37\u0176\n\37\f\37\16\37\u0179\13\37\3 \3 \3 \5 \u017e"+
		"\n \3!\3!\5!\u0182\n!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u018d\n\""+
		"\3\"\3\"\3\"\3\"\3\"\3\"\7\"\u0195\n\"\f\"\16\"\u0198\13\"\3#\5#\u019b"+
		"\n#\3#\3#\3#\5#\u01a0\n#\3#\7#\u01a3\n#\f#\16#\u01a6\13#\5#\u01a8\n#\3"+
		"$\3$\3$\3$\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\5&\u01bd\n&\3"+
		"\'\3\'\3\'\3(\3(\3(\3(\3)\3)\5)\u01c8\n)\3*\3*\5*\u01cc\n*\3*\3*\3*\3"+
		"+\3+\3,\3,\3,\7,\u01d6\n,\f,\16,\u01d9\13,\3-\3-\3-\3-\3-\3-\3-\3-\5-"+
		"\u01e3\n-\3.\3.\3.\3.\3/\3/\3/\7/\u01ec\n/\f/\16/\u01ef\13/\3\60\5\60"+
		"\u01f2\n\60\3\60\3\60\5\60\u01f6\n\60\3\60\3\60\3\60\3\60\3\61\3\61\5"+
		"\61\u01fe\n\61\3\61\3\61\5\61\u0202\n\61\3\61\3\61\3\61\3\61\3\62\3\62"+
		"\3\62\3\63\3\63\3\64\3\64\5\64\u020f\n\64\3\65\3\65\3\65\3\66\5\66\u0215"+
		"\n\66\3\66\3\66\5\66\u0219\n\66\3\66\3\66\5\66\u021d\n\66\3\67\3\67\3"+
		"\67\3\67\3\67\5\67\u0224\n\67\3\67\5\67\u0227\n\67\5\67\u0229\n\67\3\67"+
		"\3\67\3\67\5\67\u022e\n\67\3\67\5\67\u0231\n\67\38\38\38\78\u0236\n8\f"+
		"8\168\u0239\138\39\39\39\59\u023e\n9\39\39\39\39\59\u0244\n9\3:\3:\3:"+
		"\3:\5:\u024a\n:\3;\3;\3;\7;\u024f\n;\f;\16;\u0252\13;\3<\3<\3<\5<\u0257"+
		"\n<\3<\3<\3<\3<\5<\u025d\n<\3=\3=\3=\5=\u0262\n=\3>\3>\5>\u0266\n>\3>"+
		"\3>\5>\u026a\n>\3>\3>\5>\u026e\n>\3?\3?\3?\3?\3?\3?\3?\3@\3@\3@\3A\3A"+
		"\3B\3B\3B\3B\3B\3B\7B\u0282\nB\fB\16B\u0285\13B\3B\3B\3C\3C\5C\u028b\n"+
		"C\3C\5C\u028e\nC\3D\3D\3D\3E\3E\3E\7E\u0296\nE\fE\16E\u0299\13E\3F\5F"+
		"\u029c\nF\3F\5F\u029f\nF\3G\3G\3G\3H\5H\u02a5\nH\3H\3H\3H\3H\5H\u02ab"+
		"\nH\3H\3H\3I\3I\5I\u02b1\nI\3J\3J\3J\7J\u02b6\nJ\fJ\16J\u02b9\13J\3K\3"+
		"K\3K\5K\u02be\nK\3L\3L\3M\3M\3M\7M\u02c5\nM\fM\16M\u02c8\13M\3N\3N\5N"+
		"\u02cc\nN\3O\3O\3O\3P\3P\5P\u02d3\nP\3Q\3Q\3R\3R\3R\2\3BS\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^"+
		"`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090"+
		"\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\2\n\4\2\3\3\26"+
		"\26\5\2\b\b\25\25\27\27\3\2UW\4\2\r\r\30\30\3\2-.\3\2#$\f\2\3\3\6\6\16"+
		"\16\20\20\22\22\26\26\30\31  \"$XX\4\2\4\4-.\2\u02f1\2\u00a7\3\2\2\2\4"+
		"\u00bb\3\2\2\2\6\u00c9\3\2\2\2\b\u00cb\3\2\2\2\n\u00d5\3\2\2\2\f\u00d8"+
		"\3\2\2\2\16\u00e4\3\2\2\2\20\u00eb\3\2\2\2\22\u00f0\3\2\2\2\24\u00f7\3"+
		"\2\2\2\26\u00f9\3\2\2\2\30\u00fc\3\2\2\2\32\u0104\3\2\2\2\34\u0108\3\2"+
		"\2\2\36\u010d\3\2\2\2 \u011c\3\2\2\2\"\u0125\3\2\2\2$\u0127\3\2\2\2&\u012e"+
		"\3\2\2\2(\u0134\3\2\2\2*\u0136\3\2\2\2,\u013b\3\2\2\2.\u013d\3\2\2\2\60"+
		"\u0159\3\2\2\2\62\u015b\3\2\2\2\64\u015f\3\2\2\2\66\u0167\3\2\2\28\u016b"+
		"\3\2\2\2:\u016e\3\2\2\2<\u0172\3\2\2\2>\u017d\3\2\2\2@\u017f\3\2\2\2B"+
		"\u018c\3\2\2\2D\u01a7\3\2\2\2F\u01a9\3\2\2\2H\u01ad\3\2\2\2J\u01bc\3\2"+
		"\2\2L\u01be\3\2\2\2N\u01c1\3\2\2\2P\u01c5\3\2\2\2R\u01c9\3\2\2\2T\u01d0"+
		"\3\2\2\2V\u01d2\3\2\2\2X\u01e2\3\2\2\2Z\u01e4\3\2\2\2\\\u01e8\3\2\2\2"+
		"^\u01f1\3\2\2\2`\u01fb\3\2\2\2b\u0207\3\2\2\2d\u020a\3\2\2\2f\u020c\3"+
		"\2\2\2h\u0210\3\2\2\2j\u0214\3\2\2\2l\u0230\3\2\2\2n\u0232\3\2\2\2p\u0243"+
		"\3\2\2\2r\u0249\3\2\2\2t\u024b\3\2\2\2v\u025c\3\2\2\2x\u025e\3\2\2\2z"+
		"\u0263\3\2\2\2|\u026f\3\2\2\2~\u0276\3\2\2\2\u0080\u0279\3\2\2\2\u0082"+
		"\u027b\3\2\2\2\u0084\u0288\3\2\2\2\u0086\u028f\3\2\2\2\u0088\u0292\3\2"+
		"\2\2\u008a\u029b\3\2\2\2\u008c\u02a0\3\2\2\2\u008e\u02a4\3\2\2\2\u0090"+
		"\u02ae\3\2\2\2\u0092\u02b2\3\2\2\2\u0094\u02ba\3\2\2\2\u0096\u02bf\3\2"+
		"\2\2\u0098\u02c1\3\2\2\2\u009a\u02cb\3\2\2\2\u009c\u02cd\3\2\2\2\u009e"+
		"\u02d2\3\2\2\2\u00a0\u02d4\3\2\2\2\u00a2\u02d6\3\2\2\2\u00a4\u00a6\5\4"+
		"\3\2\u00a5\u00a4\3\2\2\2\u00a6\u00a9\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7"+
		"\u00a8\3\2\2\2\u00a8\u00aa\3\2\2\2\u00a9\u00a7\3\2\2\2\u00aa\u00ab\7\2"+
		"\2\3\u00ab\3\3\2\2\2\u00ac\u00ad\7\n\2\2\u00ad\u00bc\5\f\7\2\u00ae\u00af"+
		"\7\n\2\2\u00af\u00b0\5\24\13\2\u00b0\u00b1\5\u00a2R\2\u00b1\u00bc\3\2"+
		"\2\2\u00b2\u00b3\7\n\2\2\u00b3\u00b4\7\20\2\2\u00b4\u00b5\7+\2\2\u00b5"+
		"\u00b6\5\f\7\2\u00b6\u00b7\7,\2\2\u00b7\u00bc\3\2\2\2\u00b8\u00bc\5\u0082"+
		"B\2\u00b9\u00bc\5\6\4\2\u00ba\u00bc\5\b\5\2\u00bb\u00ac\3\2\2\2\u00bb"+
		"\u00ae\3\2\2\2\u00bb\u00b2\3\2\2\2\u00bb\u00b8\3\2\2\2\u00bb\u00b9\3\2"+
		"\2\2\u00bb\u00ba\3\2\2\2\u00bc\5\3\2\2\2\u00bd\u00be\7\f\2\2\u00be\u00bf"+
		"\7\n\2\2\u00bf\u00c0\5\24\13\2\u00c0\u00c1\5\u00a2R\2\u00c1\u00ca\3\2"+
		"\2\2\u00c2\u00c3\7\f\2\2\u00c3\u00c4\7\6\2\2\u00c4\u00c5\7\3\2\2\u00c5"+
		"\u00c6\5\u009eP\2\u00c6\u00c7\5\u00a2R\2\u00c7\u00ca\3\2\2\2\u00c8\u00ca"+
		"\5*\26\2\u00c9\u00bd\3\2\2\2\u00c9\u00c2\3\2\2\2\u00c9\u00c8\3\2\2\2\u00ca"+
		"\7\3\2\2\2\u00cb\u00cc\7\22\2\2\u00cc\u00cd\5\n\6\2\u00cd\u00ce\7\6\2"+
		"\2\u00ce\u00cf\5\u009eP\2\u00cf\u00d0\7\16\2\2\u00d0\u00d1\5\u009eP\2"+
		"\u00d1\u00d2\5\u00a2R\2\u00d2\t\3\2\2\2\u00d3\u00d6\5\u009eP\2\u00d4\u00d6"+
		"\79\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d4\3\2\2\2\u00d6\13\3\2\2\2\u00d7"+
		"\u00d9\t\2\2\2\u00d8\u00d7\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00da\3\2"+
		"\2\2\u00da\u00db\5\16\b\2\u00db\u00df\7+\2\2\u00dc\u00de\5\20\t\2\u00dd"+
		"\u00dc\3\2\2\2\u00de\u00e1\3\2\2\2\u00df\u00dd\3\2\2\2\u00df\u00e0\3\2"+
		"\2\2\u00e0\u00e2\3\2\2\2\u00e1\u00df\3\2\2\2\u00e2\u00e3\7,\2\2\u00e3"+
		"\r\3\2\2\2\u00e4\u00e5\5\u0098M\2\u00e5\17\3\2\2\2\u00e6\u00ec\5\22\n"+
		"\2\u00e7\u00e9\5\24\13\2\u00e8\u00ea\5\u00a2R\2\u00e9\u00e8\3\2\2\2\u00e9"+
		"\u00ea\3\2\2\2\u00ea\u00ec\3\2\2\2\u00eb\u00e6\3\2\2\2\u00eb\u00e7\3\2"+
		"\2\2\u00ec\21\3\2\2\2\u00ed\u00f1\5\u0082B\2\u00ee\u00f1\5\36\20\2\u00ef"+
		"\u00f1\5\f\7\2\u00f0\u00ed\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00ef\3\2"+
		"\2\2\u00f1\23\3\2\2\2\u00f2\u00f8\5\26\f\2\u00f3\u00f8\5.\30\2\u00f4\u00f8"+
		"\5\34\17\2\u00f5\u00f8\5\u008eH\2\u00f6\u00f8\5*\26\2\u00f7\u00f2\3\2"+
		"\2\2\u00f7\u00f3\3\2\2\2\u00f7\u00f4\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7"+
		"\u00f6\3\2\2\2\u00f8\25\3\2\2\2\u00f9\u00fa\t\3\2\2\u00fa\u00fb\5\30\r"+
		"\2\u00fb\27\3\2\2\2\u00fc\u0101\5\32\16\2\u00fd\u00fe\7.\2\2\u00fe\u0100"+
		"\5\32\16\2\u00ff\u00fd\3\2\2\2\u0100\u0103\3\2\2\2\u0101\u00ff\3\2\2\2"+
		"\u0101\u0102\3\2\2\2\u0102\31\3\2\2\2\u0103\u0101\3\2\2\2\u0104\u0106"+
		"\5\u009eP\2\u0105\u0107\5h\65\2\u0106\u0105\3\2\2\2\u0106\u0107\3\2\2"+
		"\2\u0107\33\3\2\2\2\u0108\u0109\7\17\2\2\u0109\u010a\5\u009eP\2\u010a"+
		"\u010b\5j\66\2\u010b\35\3\2\2\2\u010c\u010e\7\5\2\2\u010d\u010c\3\2\2"+
		"\2\u010d\u010e\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0110\7\7\2\2\u0110\u0111"+
		"\5 \21\2\u0111\u0117\7+\2\2\u0112\u0113\5\"\22\2\u0113\u0114\5\u00a2R"+
		"\2\u0114\u0116\3\2\2\2\u0115\u0112\3\2\2\2\u0116\u0119\3\2\2\2\u0117\u0115"+
		"\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u011a\3\2\2\2\u0119\u0117\3\2\2\2\u011a"+
		"\u011b\7,\2\2\u011b\37\3\2\2\2\u011c\u011e\5\u009eP\2\u011d\u011f\5\62"+
		"\32\2\u011e\u011d\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0120\3\2\2\2\u0120"+
		"\u0121\5\u008aF\2\u0121!\3\2\2\2\u0122\u0126\5$\23\2\u0123\u0126\5&\24"+
		"\2\u0124\u0126\5|?\2\u0125\u0122\3\2\2\2\u0125\u0123\3\2\2\2\u0125\u0124"+
		"\3\2\2\2\u0126#\3\2\2\2\u0127\u0128\7\t\2\2\u0128\u012a\7)\2\2\u0129\u012b"+
		"\5l\67\2\u012a\u0129\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u012c\3\2\2\2\u012c"+
		"\u012d\7*\2\2\u012d%\3\2\2\2\u012e\u012f\5r:\2\u012f\u0130\5(\25\2\u0130"+
		"\u0131\5X-\2\u0131\'\3\2\2\2\u0132\u0135\7\35\2\2\u0133\u0135\3\2\2\2"+
		"\u0134\u0132\3\2\2\2\u0134\u0133\3\2\2\2\u0135)\3\2\2\2\u0136\u0137\7"+
		"\f\2\2\u0137\u0138\7/\2\2\u0138\u0139\5\u009eP\2\u0139\u013a\5\u00a2R"+
		"\2\u013a+\3\2\2\2\u013b\u013c\t\4\2\2\u013c-\3\2\2\2\u013d\u013e\7\"\2"+
		"\2\u013e\u013f\5\60\31\2\u013f\u0142\7/\2\2\u0140\u0143\5> \2\u0141\u0143"+
		"\5\60\31\2\u0142\u0140\3\2\2\2\u0142\u0141\3\2\2\2\u0143/\3\2\2\2\u0144"+
		"\u0146\5\u009eP\2\u0145\u0147\5\62\32\2\u0146\u0145\3\2\2\2\u0146\u0147"+
		"\3\2\2\2\u0147\u015a\3\2\2\2\u0148\u0149\7+\2\2\u0149\u014a\7\'\2\2\u014a"+
		"\u014b\5\u009eP\2\u014b\u014c\7\30\2\2\u014c\u014d\7\24\2\2\u014d\u014f"+
		"\5\u009eP\2\u014e\u0150\5\62\32\2\u014f\u014e\3\2\2\2\u014f\u0150\3\2"+
		"\2\2\u0150\u0151\3\2\2\2\u0151\u0153\7(\2\2\u0152\u0154\7\60\2\2\u0153"+
		"\u0152\3\2\2\2\u0153\u0154\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0156\7\61"+
		"\2\2\u0156\u0157\5\60\31\2\u0157\u0158\7,\2\2\u0158\u015a\3\2\2\2\u0159"+
		"\u0144\3\2\2\2\u0159\u0148\3\2\2\2\u015a\61\3\2\2\2\u015b\u015c\7<\2\2"+
		"\u015c\u015d\5\64\33\2\u015d\u015e\7=\2\2\u015e\63\3\2\2\2\u015f\u0164"+
		"\5\66\34\2\u0160\u0161\7.\2\2\u0161\u0163\5\66\34\2\u0162\u0160\3\2\2"+
		"\2\u0163\u0166\3\2\2\2\u0164\u0162\3\2\2\2\u0164\u0165\3\2\2\2\u0165\65"+
		"\3\2\2\2\u0166\u0164\3\2\2\2\u0167\u0169\5\u009eP\2\u0168\u016a\58\35"+
		"\2\u0169\u0168\3\2\2\2\u0169\u016a\3\2\2\2\u016a\67\3\2\2\2\u016b\u016c"+
		"\t\5\2\2\u016c\u016d\5> \2\u016d9\3\2\2\2\u016e\u016f\7<\2\2\u016f\u0170"+
		"\5<\37\2\u0170\u0171\7=\2\2\u0171;\3\2\2\2\u0172\u0177\5> \2\u0173\u0174"+
		"\7.\2\2\u0174\u0176\5> \2\u0175\u0173\3\2\2\2\u0176\u0179\3\2\2\2\u0177"+
		"\u0175\3\2\2\2\u0177\u0178\3\2\2\2\u0178=\3\2\2\2\u0179\u0177\3\2\2\2"+
		"\u017a\u017e\5B\"\2\u017b\u017e\5^\60\2\u017c\u017e\5`\61\2\u017d\u017a"+
		"\3\2\2\2\u017d\u017b\3\2\2\2\u017d\u017c\3\2\2\2\u017e?\3\2\2\2\u017f"+
		"\u0181\7+\2\2\u0180\u0182\5T+\2\u0181\u0180\3\2\2\2\u0181\u0182\3\2\2"+
		"\2\u0182\u0183\3\2\2\2\u0183\u0184\7,\2\2\u0184A\3\2\2\2\u0185\u0186\b"+
		"\"\1\2\u0186\u0187\7)\2\2\u0187\u0188\5B\"\2\u0188\u0189\7*\2\2\u0189"+
		"\u018d\3\2\2\2\u018a\u018d\5D#\2\u018b\u018d\5@!\2\u018c\u0185\3\2\2\2"+
		"\u018c\u018a\3\2\2\2\u018c\u018b\3\2\2\2\u018d\u0196\3\2\2\2\u018e\u018f"+
		"\f\7\2\2\u018f\u0190\7F\2\2\u0190\u0195\5B\"\b\u0191\u0192\f\6\2\2\u0192"+
		"\u0193\7D\2\2\u0193\u0195\5B\"\7\u0194\u018e\3\2\2\2\u0194\u0191\3\2\2"+
		"\2\u0195\u0198\3\2\2\2\u0196\u0194\3\2\2\2\u0196\u0197\3\2\2\2\u0197C"+
		"\3\2\2\2\u0198\u0196\3\2\2\2\u0199\u019b\7\24\2\2\u019a\u0199\3\2\2\2"+
		"\u019a\u019b\3\2\2\2\u019b\u019c\3\2\2\2\u019c\u01a8\5J&\2\u019d\u019f"+
		"\5J&\2\u019e\u01a0\5:\36\2\u019f\u019e\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0"+
		"\u01a4\3\2\2\2\u01a1\u01a3\5H%\2\u01a2\u01a1\3\2\2\2\u01a3\u01a6\3\2\2"+
		"\2\u01a4\u01a2\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01a8\3\2\2\2\u01a6\u01a4"+
		"\3\2\2\2\u01a7\u019a\3\2\2\2\u01a7\u019d\3\2\2\2\u01a8E\3\2\2\2\u01a9"+
		"\u01aa\7<\2\2\u01aa\u01ab\5> \2\u01ab\u01ac\7=\2\2\u01acG\3\2\2\2\u01ad"+
		"\u01ae\7\'\2\2\u01ae\u01af\7(\2\2\u01afI\3\2\2\2\u01b0\u01bd\5N(\2\u01b1"+
		"\u01bd\5\u009eP\2\u01b2\u01b3\5\u00a0Q\2\u01b3\u01b4\5L\'\2\u01b4\u01bd"+
		"\3\2\2\2\u01b5\u01bd\5P)\2\u01b6\u01bd\5R*\2\u01b7\u01bd\5Z.\2\u01b8\u01bd"+
		"\5b\62\2\u01b9\u01bd\5d\63\2\u01ba\u01bd\5,\27\2\u01bb\u01bd\5\60\31\2"+
		"\u01bc\u01b0\3\2\2\2\u01bc\u01b1\3\2\2\2\u01bc\u01b2\3\2\2\2\u01bc\u01b5"+
		"\3\2\2\2\u01bc\u01b6\3\2\2\2\u01bc\u01b7\3\2\2\2\u01bc\u01b8\3\2\2\2\u01bc"+
		"\u01b9\3\2\2\2\u01bc\u01ba\3\2\2\2\u01bc\u01bb\3\2\2\2\u01bdK\3\2\2\2"+
		"\u01be\u01bf\7\31\2\2\u01bf\u01c0\5> \2\u01c0M\3\2\2\2\u01c1\u01c2\7)"+
		"\2\2\u01c2\u01c3\5> \2\u01c3\u01c4\7*\2\2\u01c4O\3\2\2\2\u01c5\u01c7\5"+
		"\u0098M\2\u01c6\u01c8\5:\36\2\u01c7\u01c6\3\2\2\2\u01c7\u01c8\3\2\2\2"+
		"\u01c8Q\3\2\2\2\u01c9\u01cb\7+\2\2\u01ca\u01cc\5T+\2\u01cb\u01ca\3\2\2"+
		"\2\u01cb\u01cc\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd\u01ce\5\u00a2R\2\u01ce"+
		"\u01cf\7,\2\2\u01cfS\3\2\2\2\u01d0\u01d1\5V,\2\u01d1U\3\2\2\2\u01d2\u01d7"+
		"\5X-\2\u01d3\u01d4\t\6\2\2\u01d4\u01d6\5X-\2\u01d5\u01d3\3\2\2\2\u01d6"+
		"\u01d9\3\2\2\2\u01d7\u01d5\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8W\3\2\2\2"+
		"\u01d9\u01d7\3\2\2\2\u01da\u01e3\5f\64\2\u01db\u01e3\5j\66\2\u01dc\u01e3"+
		"\5z>\2\u01dd\u01e3\5|?\2\u01de\u01e3\5~@\2\u01df\u01e0\5\u009eP\2\u01e0"+
		"\u01e1\5j\66\2\u01e1\u01e3\3\2\2\2\u01e2\u01da\3\2\2\2\u01e2\u01db\3\2"+
		"\2\2\u01e2\u01dc\3\2\2\2\u01e2\u01dd\3\2\2\2\u01e2\u01de\3\2\2\2\u01e2"+
		"\u01df\3\2\2\2\u01e3Y\3\2\2\2\u01e4\u01e5\7\'\2\2\u01e5\u01e6\5\\/\2\u01e6"+
		"\u01e7\7(\2\2\u01e7[\3\2\2\2\u01e8\u01ed\5> \2\u01e9\u01ea\7.\2\2\u01ea"+
		"\u01ec\5> \2\u01eb\u01e9\3\2\2\2\u01ec\u01ef\3\2\2\2\u01ed\u01eb\3\2\2"+
		"\2\u01ed\u01ee\3\2\2\2\u01ee]\3\2\2\2\u01ef\u01ed\3\2\2\2\u01f0\u01f2"+
		"\5\62\32\2\u01f1\u01f0\3\2\2\2\u01f1\u01f2\3\2\2\2\u01f2\u01f3\3\2\2\2"+
		"\u01f3\u01f5\7)\2\2\u01f4\u01f6\5l\67\2\u01f5\u01f4\3\2\2\2\u01f5\u01f6"+
		"\3\2\2\2\u01f6\u01f7\3\2\2\2\u01f7\u01f8\7*\2\2\u01f8\u01f9\7%\2\2\u01f9"+
		"\u01fa\5> \2\u01fa_\3\2\2\2\u01fb\u01fd\7\37\2\2\u01fc\u01fe\5\62\32\2"+
		"\u01fd\u01fc\3\2\2\2\u01fd\u01fe\3\2\2\2\u01fe\u01ff\3\2\2\2\u01ff\u0201"+
		"\7)\2\2\u0200\u0202\5l\67\2\u0201\u0200\3\2\2\2\u0201\u0202\3\2\2\2\u0202"+
		"\u0203\3\2\2\2\u0203\u0204\7*\2\2\u0204\u0205\7%\2\2\u0205\u0206\5> \2"+
		"\u0206a\3\2\2\2\u0207\u0208\7 \2\2\u0208\u0209\5\u0098M\2\u0209c\3\2\2"+
		"\2\u020a\u020b\7!\2\2\u020be\3\2\2\2\u020c\u020e\5\u009cO\2\u020d\u020f"+
		"\5h\65\2\u020e\u020d\3\2\2\2\u020e\u020f\3\2\2\2\u020fg\3\2\2\2\u0210"+
		"\u0211\7\61\2\2\u0211\u0212\5> \2\u0212i\3\2\2\2\u0213\u0215\5\62\32\2"+
		"\u0214\u0213\3\2\2\2\u0214\u0215\3\2\2\2\u0215\u0216\3\2\2\2\u0216\u0218"+
		"\7)\2\2\u0217\u0219\5l\67\2\u0218\u0217\3\2\2\2\u0218\u0219\3\2\2\2\u0219"+
		"\u021a\3\2\2\2\u021a\u021c\7*\2\2\u021b\u021d\5h\65\2\u021c\u021b\3\2"+
		"\2\2\u021c\u021d\3\2\2\2\u021dk\3\2\2\2\u021e\u0228\5n8\2\u021f\u0226"+
		"\7.\2\2\u0220\u0223\5t;\2\u0221\u0222\7.\2\2\u0222\u0224\5x=\2\u0223\u0221"+
		"\3\2\2\2\u0223\u0224\3\2\2\2\u0224\u0227\3\2\2\2\u0225\u0227\5x=\2\u0226"+
		"\u0220\3\2\2\2\u0226\u0225\3\2\2\2\u0227\u0229\3\2\2\2\u0228\u021f\3\2"+
		"\2\2\u0228\u0229\3\2\2\2\u0229\u0231\3\2\2\2\u022a\u022d\5t;\2\u022b\u022c"+
		"\7.\2\2\u022c\u022e\5x=\2\u022d\u022b\3\2\2\2\u022d\u022e\3\2\2\2\u022e"+
		"\u0231\3\2\2\2\u022f\u0231\5x=\2\u0230\u021e\3\2\2\2\u0230\u022a\3\2\2"+
		"\2\u0230\u022f\3\2\2\2\u0231m\3\2\2\2\u0232\u0237\5p9\2\u0233\u0234\7"+
		".\2\2\u0234\u0236\5p9\2\u0235\u0233\3\2\2\2\u0236\u0239\3\2\2\2\u0237"+
		"\u0235\3\2\2\2\u0237\u0238\3\2\2\2\u0238o\3\2\2\2\u0239\u0237\3\2\2\2"+
		"\u023a\u023b\5r:\2\u023b\u023d\5\u009eP\2\u023c\u023e\5h\65\2\u023d\u023c"+
		"\3\2\2\2\u023d\u023e\3\2\2\2\u023e\u0244\3\2\2\2\u023f\u0240\5\u009eP"+
		"\2\u0240\u0241\7\61\2\2\u0241\u0242\7Y\2\2\u0242\u0244\3\2\2\2\u0243\u023a"+
		"\3\2\2\2\u0243\u023f\3\2\2\2\u0244q\3\2\2\2\u0245\u024a\7\32\2\2\u0246"+
		"\u024a\7\34\2\2\u0247\u024a\7\33\2\2\u0248\u024a\3\2\2\2\u0249\u0245\3"+
		"\2\2\2\u0249\u0246\3\2\2\2\u0249\u0247\3\2\2\2\u0249\u0248\3\2\2\2\u024a"+
		"s\3\2\2\2\u024b\u0250\5v<\2\u024c\u024d\7.\2\2\u024d\u024f\5v<\2\u024e"+
		"\u024c\3\2\2\2\u024f\u0252\3\2\2\2\u0250\u024e\3\2\2\2\u0250\u0251\3\2"+
		"\2\2\u0251u\3\2\2\2\u0252\u0250\3\2\2\2\u0253\u0254\5r:\2\u0254\u0256"+
		"\5\u009cO\2\u0255\u0257\5h\65\2\u0256\u0255\3\2\2\2\u0256\u0257\3\2\2"+
		"\2\u0257\u025d\3\2\2\2\u0258\u0259\5\u009cO\2\u0259\u025a\7\61\2\2\u025a"+
		"\u025b\7Y\2\2\u025b\u025d\3\2\2\2\u025c\u0253\3\2\2\2\u025c\u0258\3\2"+
		"\2\2\u025dw\3\2\2\2\u025e\u025f\7&\2\2\u025f\u0261\5\u009eP\2\u0260\u0262"+
		"\5h\65\2\u0261\u0260\3\2\2\2\u0261\u0262\3\2\2\2\u0262y\3\2\2\2\u0263"+
		"\u0265\7\37\2\2\u0264\u0266\5\62\32\2\u0265\u0264\3\2\2\2\u0265\u0266"+
		"\3\2\2\2\u0266\u0267\3\2\2\2\u0267\u0269\7)\2\2\u0268\u026a\5l\67\2\u0269"+
		"\u0268\3\2\2\2\u0269\u026a\3\2\2\2\u026a\u026b\3\2\2\2\u026b\u026d\7*"+
		"\2\2\u026c\u026e\5h\65\2\u026d\u026c\3\2\2\2\u026d\u026e\3\2\2\2\u026e"+
		"{\3\2\2\2\u026f\u0270\7\'\2\2\u0270\u0271\5\u009eP\2\u0271\u0272\7\61"+
		"\2\2\u0272\u0273\t\7\2\2\u0273\u0274\7(\2\2\u0274\u0275\5h\65\2\u0275"+
		"}\3\2\2\2\u0276\u0277\5\u009cO\2\u0277\u0278\5j\66\2\u0278\177\3\2\2\2"+
		"\u0279\u027a\5,\27\2\u027a\u0081\3\2\2\2\u027b\u027c\7\23\2\2\u027c\u027d"+
		"\5\u0084C\2\u027d\u0283\7+\2\2\u027e\u027f\5X-\2\u027f\u0280\5\u00a2R"+
		"\2\u0280\u0282\3\2\2\2\u0281\u027e\3\2\2\2\u0282\u0285\3\2\2\2\u0283\u0281"+
		"\3\2\2\2\u0283\u0284\3\2\2\2\u0284\u0286\3\2\2\2\u0285\u0283\3\2\2\2\u0286"+
		"\u0287\7,\2\2\u0287\u0083\3\2\2\2\u0288\u028a\5\u009eP\2\u0289\u028b\5"+
		"\62\32\2\u028a\u0289\3\2\2\2\u028a\u028b\3\2\2\2\u028b\u028d\3\2\2\2\u028c"+
		"\u028e\5\u0086D\2\u028d\u028c\3\2\2\2\u028d\u028e\3\2\2\2\u028e\u0085"+
		"\3\2\2\2\u028f\u0290\7\r\2\2\u0290\u0291\5\u0088E\2\u0291\u0087\3\2\2"+
		"\2\u0292\u0297\5P)\2\u0293\u0294\7.\2\2\u0294\u0296\5P)\2\u0295\u0293"+
		"\3\2\2\2\u0296\u0299\3\2\2\2\u0297\u0295\3\2\2\2\u0297\u0298\3\2\2\2\u0298"+
		"\u0089\3\2\2\2\u0299\u0297\3\2\2\2\u029a\u029c\5\u0086D\2\u029b\u029a"+
		"\3\2\2\2\u029b\u029c\3\2\2\2\u029c\u029e\3\2\2\2\u029d\u029f\5\u008cG"+
		"\2\u029e\u029d\3\2\2\2\u029e\u029f\3\2\2\2\u029f\u008b\3\2\2\2\u02a0\u02a1"+
		"\7\21\2\2\u02a1\u02a2\5\u0088E\2\u02a2\u008d\3\2\2\2\u02a3\u02a5\7\b\2"+
		"\2\u02a4\u02a3\3\2\2\2\u02a4\u02a5\3\2\2\2\u02a5\u02a6\3\2\2\2\u02a6\u02a7"+
		"\7\13\2\2\u02a7\u02a8\5\u009eP\2\u02a8\u02aa\7+\2\2\u02a9\u02ab\5\u0090"+
		"I\2\u02aa\u02a9\3\2\2\2\u02aa\u02ab\3\2\2\2\u02ab\u02ac\3\2\2\2\u02ac"+
		"\u02ad\7,\2\2\u02ad\u008f\3\2\2\2\u02ae\u02b0\5\u0092J\2\u02af\u02b1\7"+
		".\2\2\u02b0\u02af\3\2\2\2\u02b0\u02b1\3\2\2\2\u02b1\u0091\3\2\2\2\u02b2"+
		"\u02b7\5\u0094K\2\u02b3\u02b4\7.\2\2\u02b4\u02b6\5\u0094K\2\u02b5\u02b3"+
		"\3\2\2\2\u02b6\u02b9\3\2\2\2\u02b7\u02b5\3\2\2\2\u02b7\u02b8\3\2\2\2\u02b8"+
		"\u0093\3\2\2\2\u02b9\u02b7\3\2\2\2\u02ba\u02bd\5\u009eP\2\u02bb\u02bc"+
		"\7/\2\2\u02bc\u02be\5\u0096L\2\u02bd\u02bb\3\2\2\2\u02bd\u02be\3\2\2\2"+
		"\u02be\u0095\3\2\2\2\u02bf\u02c0\5\u0080A\2\u02c0\u0097\3\2\2\2\u02c1"+
		"\u02c6\5\u009eP\2\u02c2\u02c3\7\62\2\2\u02c3\u02c5\5\u009eP\2\u02c4\u02c2"+
		"\3\2\2\2\u02c5\u02c8\3\2\2\2\u02c6\u02c4\3\2\2\2\u02c6\u02c7\3\2\2\2\u02c7"+
		"\u0099\3\2\2\2\u02c8\u02c6\3\2\2\2\u02c9\u02cc\7\60\2\2\u02ca\u02cc\3"+
		"\2\2\2\u02cb\u02c9\3\2\2\2\u02cb\u02ca\3\2\2\2\u02cc\u009b\3\2\2\2\u02cd"+
		"\u02ce\5\u009eP\2\u02ce\u02cf\5\u009aN\2\u02cf\u009d\3\2\2\2\u02d0\u02d3"+
		"\5\u00a0Q\2\u02d1\u02d3\7Y\2\2\u02d2\u02d0\3\2\2\2\u02d2\u02d1\3\2\2\2"+
		"\u02d3\u009f\3\2\2\2\u02d4\u02d5\t\b\2\2\u02d5\u00a1\3\2\2\2\u02d6\u02d7"+
		"\t\t\2\2\u02d7\u00a3\3\2\2\2Q\u00a7\u00bb\u00c9\u00d5\u00d8\u00df\u00e9"+
		"\u00eb\u00f0\u00f7\u0101\u0106\u010d\u0117\u011e\u0125\u012a\u0134\u0142"+
		"\u0146\u014f\u0153\u0159\u0164\u0169\u0177\u017d\u0181\u018c\u0194\u0196"+
		"\u019a\u019f\u01a4\u01a7\u01bc\u01c7\u01cb\u01d7\u01e2\u01ed\u01f1\u01f5"+
		"\u01fd\u0201\u020e\u0214\u0218\u021c\u0223\u0226\u0228\u022d\u0230\u0237"+
		"\u023d\u0243\u0249\u0250\u0256\u025c\u0261\u0265\u0269\u026d\u0283\u028a"+
		"\u028d\u0297\u029b\u029e\u02a4\u02aa\u02b0\u02b7\u02bd\u02c6\u02cb\u02d2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}