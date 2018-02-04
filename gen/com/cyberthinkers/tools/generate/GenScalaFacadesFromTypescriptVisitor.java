// Generated from C:/cyberthinkers-dev/typescript-to-scala-js-facade/src/main/java/com/cyberthinkers/tools/generate\GenScalaFacadesFromTypescript.g4 by ANTLR 4.7
package com.cyberthinkers.tools.generate;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GenScalaFacadesFromTypescriptParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GenScalaFacadesFromTypescriptVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#typescriptAmbientDeclarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypescriptAmbientDeclarations(GenScalaFacadesFromTypescriptParser.TypescriptAmbientDeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declareModuleOrNamespace}
	 * labeled alternative in {@link GenScalaFacadesFromTypescriptParser#declarationScriptElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclareModuleOrNamespace(GenScalaFacadesFromTypescriptParser.DeclareModuleOrNamespaceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declareGlobalModuleOrNamespace}
	 * labeled alternative in {@link GenScalaFacadesFromTypescriptParser#declarationScriptElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclareGlobalModuleOrNamespace(GenScalaFacadesFromTypescriptParser.DeclareGlobalModuleOrNamespaceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declareInterface}
	 * labeled alternative in {@link GenScalaFacadesFromTypescriptParser#declarationScriptElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclareInterface(GenScalaFacadesFromTypescriptParser.DeclareInterfaceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declareExport}
	 * labeled alternative in {@link GenScalaFacadesFromTypescriptParser#declarationScriptElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclareExport(GenScalaFacadesFromTypescriptParser.DeclareExportContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declareImport}
	 * labeled alternative in {@link GenScalaFacadesFromTypescriptParser#declarationScriptElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclareImport(GenScalaFacadesFromTypescriptParser.DeclareImportContext ctx);
	/**
	 * Visit a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#exportDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExportDef(GenScalaFacadesFromTypescriptParser.ExportDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#importDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportDef(GenScalaFacadesFromTypescriptParser.ImportDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#importName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportName(GenScalaFacadesFromTypescriptParser.ImportNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#ambientModuleOrNamespace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAmbientModuleOrNamespace(GenScalaFacadesFromTypescriptParser.AmbientModuleOrNamespaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#ambientModuleName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAmbientModuleName(GenScalaFacadesFromTypescriptParser.AmbientModuleNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#ambientItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAmbientItem(GenScalaFacadesFromTypescriptParser.AmbientItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#ambientBracesItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAmbientBracesItem(GenScalaFacadesFromTypescriptParser.AmbientBracesItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#ambientStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAmbientStatement(GenScalaFacadesFromTypescriptParser.AmbientStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(GenScalaFacadesFromTypescriptParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#variableList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableList(GenScalaFacadesFromTypescriptParser.VariableListContext ctx);
	/**
	 * Visit a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#variableName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableName(GenScalaFacadesFromTypescriptParser.VariableNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(GenScalaFacadesFromTypescriptParser.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(GenScalaFacadesFromTypescriptParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#className}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassName(GenScalaFacadesFromTypescriptParser.ClassNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ambientClassBodyElementConstructor}
	 * labeled alternative in {@link GenScalaFacadesFromTypescriptParser#ambientClassBodyElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAmbientClassBodyElementConstructor(GenScalaFacadesFromTypescriptParser.AmbientClassBodyElementConstructorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ambientClassBodyElementProperty}
	 * labeled alternative in {@link GenScalaFacadesFromTypescriptParser#ambientClassBodyElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAmbientClassBodyElementProperty(GenScalaFacadesFromTypescriptParser.AmbientClassBodyElementPropertyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ambientClassBodyElementIndex}
	 * labeled alternative in {@link GenScalaFacadesFromTypescriptParser#ambientClassBodyElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAmbientClassBodyElementIndex(GenScalaFacadesFromTypescriptParser.AmbientClassBodyElementIndexContext ctx);
	/**
	 * Visit a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#ambientConstructorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAmbientConstructorDeclaration(GenScalaFacadesFromTypescriptParser.AmbientConstructorDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#ambientPropertyMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAmbientPropertyMemberDeclaration(GenScalaFacadesFromTypescriptParser.AmbientPropertyMemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code optStaticDef}
	 * labeled alternative in {@link GenScalaFacadesFromTypescriptParser#optStatic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptStaticDef(GenScalaFacadesFromTypescriptParser.OptStaticDefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code optStaticNotDef}
	 * labeled alternative in {@link GenScalaFacadesFromTypescriptParser#optStatic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptStaticNotDef(GenScalaFacadesFromTypescriptParser.OptStaticNotDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#exportIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExportIdentifier(GenScalaFacadesFromTypescriptParser.ExportIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#numericLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericLiteral(GenScalaFacadesFromTypescriptParser.NumericLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#typeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDeclaration(GenScalaFacadesFromTypescriptParser.TypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#typeDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDef(GenScalaFacadesFromTypescriptParser.TypeDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#typeParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameters(GenScalaFacadesFromTypescriptParser.TypeParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#typeParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameterList(GenScalaFacadesFromTypescriptParser.TypeParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#typeParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameter(GenScalaFacadesFromTypescriptParser.TypeParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraint(GenScalaFacadesFromTypescriptParser.ConstraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#typeArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArguments(GenScalaFacadesFromTypescriptParser.TypeArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#typeArgumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgumentList(GenScalaFacadesFromTypescriptParser.TypeArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(GenScalaFacadesFromTypescriptParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#unnamedInterface}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnnamedInterface(GenScalaFacadesFromTypescriptParser.UnnamedInterfaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#unionOrIntersectionOrPrimaryType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnionOrIntersectionOrPrimaryType(GenScalaFacadesFromTypescriptParser.UnionOrIntersectionOrPrimaryTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#primaryOrArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryOrArray(GenScalaFacadesFromTypescriptParser.PrimaryOrArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#nestedType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNestedType(GenScalaFacadesFromTypescriptParser.NestedTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#arrayDim}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayDim(GenScalaFacadesFromTypescriptParser.ArrayDimContext ctx);
	/**
	 * Visit a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#primaryType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryType(GenScalaFacadesFromTypescriptParser.PrimaryTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#typeGuard}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeGuard(GenScalaFacadesFromTypescriptParser.TypeGuardContext ctx);
	/**
	 * Visit a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#parenthesizedType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesizedType(GenScalaFacadesFromTypescriptParser.ParenthesizedTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#typeReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeReference(GenScalaFacadesFromTypescriptParser.TypeReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#objectType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectType(GenScalaFacadesFromTypescriptParser.ObjectTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#typeBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeBody(GenScalaFacadesFromTypescriptParser.TypeBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#typeMemberList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeMemberList(GenScalaFacadesFromTypescriptParser.TypeMemberListContext ctx);
	/**
	 * Visit a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#typeMember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeMember(GenScalaFacadesFromTypescriptParser.TypeMemberContext ctx);
	/**
	 * Visit a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#tupleType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTupleType(GenScalaFacadesFromTypescriptParser.TupleTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#tupleTypeElements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTupleTypeElements(GenScalaFacadesFromTypescriptParser.TupleTypeElementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#functionType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionType(GenScalaFacadesFromTypescriptParser.FunctionTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#constructorType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorType(GenScalaFacadesFromTypescriptParser.ConstructorTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#typeQuery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeQuery(GenScalaFacadesFromTypescriptParser.TypeQueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#thisType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThisType(GenScalaFacadesFromTypescriptParser.ThisTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#propertySignature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertySignature(GenScalaFacadesFromTypescriptParser.PropertySignatureContext ctx);
	/**
	 * Visit a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#typeAnnotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeAnnotation(GenScalaFacadesFromTypescriptParser.TypeAnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#callSignature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallSignature(GenScalaFacadesFromTypescriptParser.CallSignatureContext ctx);
	/**
	 * Visit a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(GenScalaFacadesFromTypescriptParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#requiredParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRequiredParameterList(GenScalaFacadesFromTypescriptParser.RequiredParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#requiredParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRequiredParameter(GenScalaFacadesFromTypescriptParser.RequiredParameterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code publicModifier}
	 * labeled alternative in {@link GenScalaFacadesFromTypescriptParser#accessibilityModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPublicModifier(GenScalaFacadesFromTypescriptParser.PublicModifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code privateModifier}
	 * labeled alternative in {@link GenScalaFacadesFromTypescriptParser#accessibilityModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrivateModifier(GenScalaFacadesFromTypescriptParser.PrivateModifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code protectedModifier}
	 * labeled alternative in {@link GenScalaFacadesFromTypescriptParser#accessibilityModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtectedModifier(GenScalaFacadesFromTypescriptParser.ProtectedModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#optionalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionalParameterList(GenScalaFacadesFromTypescriptParser.OptionalParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#optionalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionalParameter(GenScalaFacadesFromTypescriptParser.OptionalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#restParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRestParameter(GenScalaFacadesFromTypescriptParser.RestParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#constructSignature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructSignature(GenScalaFacadesFromTypescriptParser.ConstructSignatureContext ctx);
	/**
	 * Visit a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#indexSignature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexSignature(GenScalaFacadesFromTypescriptParser.IndexSignatureContext ctx);
	/**
	 * Visit a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#methodSignature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodSignature(GenScalaFacadesFromTypescriptParser.MethodSignatureContext ctx);
	/**
	 * Visit a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#constExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstExpression(GenScalaFacadesFromTypescriptParser.ConstExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceDeclaration(GenScalaFacadesFromTypescriptParser.InterfaceDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#interfaceName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceName(GenScalaFacadesFromTypescriptParser.InterfaceNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#extendsClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtendsClause(GenScalaFacadesFromTypescriptParser.ExtendsClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#classOrInterfaceTypeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassOrInterfaceTypeList(GenScalaFacadesFromTypescriptParser.ClassOrInterfaceTypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#classHeritage}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassHeritage(GenScalaFacadesFromTypescriptParser.ClassHeritageContext ctx);
	/**
	 * Visit a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#implementsClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImplementsClause(GenScalaFacadesFromTypescriptParser.ImplementsClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#enumDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumDeclaration(GenScalaFacadesFromTypescriptParser.EnumDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#enumBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumBody(GenScalaFacadesFromTypescriptParser.EnumBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#enumMemberList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumMemberList(GenScalaFacadesFromTypescriptParser.EnumMemberListContext ctx);
	/**
	 * Visit a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#enumMember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumMember(GenScalaFacadesFromTypescriptParser.EnumMemberContext ctx);
	/**
	 * Visit a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#enumValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumValue(GenScalaFacadesFromTypescriptParser.EnumValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#identifierPath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierPath(GenScalaFacadesFromTypescriptParser.IdentifierPathContext ctx);
	/**
	 * Visit a parse tree produced by the {@code optionalModifier}
	 * labeled alternative in {@link GenScalaFacadesFromTypescriptParser#optionalParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionalModifier(GenScalaFacadesFromTypescriptParser.OptionalModifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code requiredParam}
	 * labeled alternative in {@link GenScalaFacadesFromTypescriptParser#optionalParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRequiredParam(GenScalaFacadesFromTypescriptParser.RequiredParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#optionalBindingIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionalBindingIdentifier(GenScalaFacadesFromTypescriptParser.OptionalBindingIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code basicIdentifier}
	 * labeled alternative in {@link GenScalaFacadesFromTypescriptParser#bindingIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasicIdentifier(GenScalaFacadesFromTypescriptParser.BasicIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringLiteralIdentifier}
	 * labeled alternative in {@link GenScalaFacadesFromTypescriptParser#bindingIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteralIdentifier(GenScalaFacadesFromTypescriptParser.StringLiteralIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(GenScalaFacadesFromTypescriptParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#lineEnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLineEnd(GenScalaFacadesFromTypescriptParser.LineEndContext ctx);
}