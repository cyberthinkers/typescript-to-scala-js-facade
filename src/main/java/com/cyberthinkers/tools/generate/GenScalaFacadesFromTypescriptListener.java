// Generated from C:/cyberthinkers-dev/typescript-to-scala-js-facade/src/main/antlr4\GenScalaFacadesFromTypescript.g4 by ANTLR 4.6
package com.cyberthinkers.tools.generate;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GenScalaFacadesFromTypescriptParser}.
 */
public interface GenScalaFacadesFromTypescriptListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#typescriptAmbientDeclarations}.
	 * @param ctx the parse tree
	 */
	void enterTypescriptAmbientDeclarations(GenScalaFacadesFromTypescriptParser.TypescriptAmbientDeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#typescriptAmbientDeclarations}.
	 * @param ctx the parse tree
	 */
	void exitTypescriptAmbientDeclarations(GenScalaFacadesFromTypescriptParser.TypescriptAmbientDeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#declarationScriptElement}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationScriptElement(GenScalaFacadesFromTypescriptParser.DeclarationScriptElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#declarationScriptElement}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationScriptElement(GenScalaFacadesFromTypescriptParser.DeclarationScriptElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#exportDef}.
	 * @param ctx the parse tree
	 */
	void enterExportDef(GenScalaFacadesFromTypescriptParser.ExportDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#exportDef}.
	 * @param ctx the parse tree
	 */
	void exitExportDef(GenScalaFacadesFromTypescriptParser.ExportDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#importDef}.
	 * @param ctx the parse tree
	 */
	void enterImportDef(GenScalaFacadesFromTypescriptParser.ImportDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#importDef}.
	 * @param ctx the parse tree
	 */
	void exitImportDef(GenScalaFacadesFromTypescriptParser.ImportDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#importName}.
	 * @param ctx the parse tree
	 */
	void enterImportName(GenScalaFacadesFromTypescriptParser.ImportNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#importName}.
	 * @param ctx the parse tree
	 */
	void exitImportName(GenScalaFacadesFromTypescriptParser.ImportNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#ambientModuleOrNamespace}.
	 * @param ctx the parse tree
	 */
	void enterAmbientModuleOrNamespace(GenScalaFacadesFromTypescriptParser.AmbientModuleOrNamespaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#ambientModuleOrNamespace}.
	 * @param ctx the parse tree
	 */
	void exitAmbientModuleOrNamespace(GenScalaFacadesFromTypescriptParser.AmbientModuleOrNamespaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#ambientItem}.
	 * @param ctx the parse tree
	 */
	void enterAmbientItem(GenScalaFacadesFromTypescriptParser.AmbientItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#ambientItem}.
	 * @param ctx the parse tree
	 */
	void exitAmbientItem(GenScalaFacadesFromTypescriptParser.AmbientItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#ambientBracesItem}.
	 * @param ctx the parse tree
	 */
	void enterAmbientBracesItem(GenScalaFacadesFromTypescriptParser.AmbientBracesItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#ambientBracesItem}.
	 * @param ctx the parse tree
	 */
	void exitAmbientBracesItem(GenScalaFacadesFromTypescriptParser.AmbientBracesItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#ambientStatement}.
	 * @param ctx the parse tree
	 */
	void enterAmbientStatement(GenScalaFacadesFromTypescriptParser.AmbientStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#ambientStatement}.
	 * @param ctx the parse tree
	 */
	void exitAmbientStatement(GenScalaFacadesFromTypescriptParser.AmbientStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(GenScalaFacadesFromTypescriptParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(GenScalaFacadesFromTypescriptParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#variableList}.
	 * @param ctx the parse tree
	 */
	void enterVariableList(GenScalaFacadesFromTypescriptParser.VariableListContext ctx);
	/**
	 * Exit a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#variableList}.
	 * @param ctx the parse tree
	 */
	void exitVariableList(GenScalaFacadesFromTypescriptParser.VariableListContext ctx);
	/**
	 * Enter a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#variableName}.
	 * @param ctx the parse tree
	 */
	void enterVariableName(GenScalaFacadesFromTypescriptParser.VariableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#variableName}.
	 * @param ctx the parse tree
	 */
	void exitVariableName(GenScalaFacadesFromTypescriptParser.VariableNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(GenScalaFacadesFromTypescriptParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(GenScalaFacadesFromTypescriptParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(GenScalaFacadesFromTypescriptParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(GenScalaFacadesFromTypescriptParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#ambientClassBodyElement}.
	 * @param ctx the parse tree
	 */
	void enterAmbientClassBodyElement(GenScalaFacadesFromTypescriptParser.AmbientClassBodyElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#ambientClassBodyElement}.
	 * @param ctx the parse tree
	 */
	void exitAmbientClassBodyElement(GenScalaFacadesFromTypescriptParser.AmbientClassBodyElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#ambientConstructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAmbientConstructorDeclaration(GenScalaFacadesFromTypescriptParser.AmbientConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#ambientConstructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAmbientConstructorDeclaration(GenScalaFacadesFromTypescriptParser.AmbientConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#ambientPropertyMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAmbientPropertyMemberDeclaration(GenScalaFacadesFromTypescriptParser.AmbientPropertyMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#ambientPropertyMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAmbientPropertyMemberDeclaration(GenScalaFacadesFromTypescriptParser.AmbientPropertyMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#exportIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterExportIdentifier(GenScalaFacadesFromTypescriptParser.ExportIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#exportIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitExportIdentifier(GenScalaFacadesFromTypescriptParser.ExportIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#numericLiteral}.
	 * @param ctx the parse tree
	 */
	void enterNumericLiteral(GenScalaFacadesFromTypescriptParser.NumericLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#numericLiteral}.
	 * @param ctx the parse tree
	 */
	void exitNumericLiteral(GenScalaFacadesFromTypescriptParser.NumericLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclaration(GenScalaFacadesFromTypescriptParser.TypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclaration(GenScalaFacadesFromTypescriptParser.TypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#typeDef}.
	 * @param ctx the parse tree
	 */
	void enterTypeDef(GenScalaFacadesFromTypescriptParser.TypeDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#typeDef}.
	 * @param ctx the parse tree
	 */
	void exitTypeDef(GenScalaFacadesFromTypescriptParser.TypeDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameters(GenScalaFacadesFromTypescriptParser.TypeParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameters(GenScalaFacadesFromTypescriptParser.TypeParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#typeParameterList}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameterList(GenScalaFacadesFromTypescriptParser.TypeParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#typeParameterList}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameterList(GenScalaFacadesFromTypescriptParser.TypeParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameter(GenScalaFacadesFromTypescriptParser.TypeParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameter(GenScalaFacadesFromTypescriptParser.TypeParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#constraint}.
	 * @param ctx the parse tree
	 */
	void enterConstraint(GenScalaFacadesFromTypescriptParser.ConstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#constraint}.
	 * @param ctx the parse tree
	 */
	void exitConstraint(GenScalaFacadesFromTypescriptParser.ConstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void enterTypeArguments(GenScalaFacadesFromTypescriptParser.TypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void exitTypeArguments(GenScalaFacadesFromTypescriptParser.TypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#typeArgumentList}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgumentList(GenScalaFacadesFromTypescriptParser.TypeArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#typeArgumentList}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgumentList(GenScalaFacadesFromTypescriptParser.TypeArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(GenScalaFacadesFromTypescriptParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(GenScalaFacadesFromTypescriptParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#unnamedInterface}.
	 * @param ctx the parse tree
	 */
	void enterUnnamedInterface(GenScalaFacadesFromTypescriptParser.UnnamedInterfaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#unnamedInterface}.
	 * @param ctx the parse tree
	 */
	void exitUnnamedInterface(GenScalaFacadesFromTypescriptParser.UnnamedInterfaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#unionOrIntersectionOrPrimaryType}.
	 * @param ctx the parse tree
	 */
	void enterUnionOrIntersectionOrPrimaryType(GenScalaFacadesFromTypescriptParser.UnionOrIntersectionOrPrimaryTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#unionOrIntersectionOrPrimaryType}.
	 * @param ctx the parse tree
	 */
	void exitUnionOrIntersectionOrPrimaryType(GenScalaFacadesFromTypescriptParser.UnionOrIntersectionOrPrimaryTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#primaryOrArray}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryOrArray(GenScalaFacadesFromTypescriptParser.PrimaryOrArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#primaryOrArray}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryOrArray(GenScalaFacadesFromTypescriptParser.PrimaryOrArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#nestedType}.
	 * @param ctx the parse tree
	 */
	void enterNestedType(GenScalaFacadesFromTypescriptParser.NestedTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#nestedType}.
	 * @param ctx the parse tree
	 */
	void exitNestedType(GenScalaFacadesFromTypescriptParser.NestedTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#arrayDim}.
	 * @param ctx the parse tree
	 */
	void enterArrayDim(GenScalaFacadesFromTypescriptParser.ArrayDimContext ctx);
	/**
	 * Exit a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#arrayDim}.
	 * @param ctx the parse tree
	 */
	void exitArrayDim(GenScalaFacadesFromTypescriptParser.ArrayDimContext ctx);
	/**
	 * Enter a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#primaryType}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryType(GenScalaFacadesFromTypescriptParser.PrimaryTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#primaryType}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryType(GenScalaFacadesFromTypescriptParser.PrimaryTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#typeGuard}.
	 * @param ctx the parse tree
	 */
	void enterTypeGuard(GenScalaFacadesFromTypescriptParser.TypeGuardContext ctx);
	/**
	 * Exit a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#typeGuard}.
	 * @param ctx the parse tree
	 */
	void exitTypeGuard(GenScalaFacadesFromTypescriptParser.TypeGuardContext ctx);
	/**
	 * Enter a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#parenthesizedType}.
	 * @param ctx the parse tree
	 */
	void enterParenthesizedType(GenScalaFacadesFromTypescriptParser.ParenthesizedTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#parenthesizedType}.
	 * @param ctx the parse tree
	 */
	void exitParenthesizedType(GenScalaFacadesFromTypescriptParser.ParenthesizedTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#typeReference}.
	 * @param ctx the parse tree
	 */
	void enterTypeReference(GenScalaFacadesFromTypescriptParser.TypeReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#typeReference}.
	 * @param ctx the parse tree
	 */
	void exitTypeReference(GenScalaFacadesFromTypescriptParser.TypeReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#objectType}.
	 * @param ctx the parse tree
	 */
	void enterObjectType(GenScalaFacadesFromTypescriptParser.ObjectTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#objectType}.
	 * @param ctx the parse tree
	 */
	void exitObjectType(GenScalaFacadesFromTypescriptParser.ObjectTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#typeBody}.
	 * @param ctx the parse tree
	 */
	void enterTypeBody(GenScalaFacadesFromTypescriptParser.TypeBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#typeBody}.
	 * @param ctx the parse tree
	 */
	void exitTypeBody(GenScalaFacadesFromTypescriptParser.TypeBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#typeMemberList}.
	 * @param ctx the parse tree
	 */
	void enterTypeMemberList(GenScalaFacadesFromTypescriptParser.TypeMemberListContext ctx);
	/**
	 * Exit a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#typeMemberList}.
	 * @param ctx the parse tree
	 */
	void exitTypeMemberList(GenScalaFacadesFromTypescriptParser.TypeMemberListContext ctx);
	/**
	 * Enter a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#typeMember}.
	 * @param ctx the parse tree
	 */
	void enterTypeMember(GenScalaFacadesFromTypescriptParser.TypeMemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#typeMember}.
	 * @param ctx the parse tree
	 */
	void exitTypeMember(GenScalaFacadesFromTypescriptParser.TypeMemberContext ctx);
	/**
	 * Enter a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#tupleType}.
	 * @param ctx the parse tree
	 */
	void enterTupleType(GenScalaFacadesFromTypescriptParser.TupleTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#tupleType}.
	 * @param ctx the parse tree
	 */
	void exitTupleType(GenScalaFacadesFromTypescriptParser.TupleTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#tupleTypeElements}.
	 * @param ctx the parse tree
	 */
	void enterTupleTypeElements(GenScalaFacadesFromTypescriptParser.TupleTypeElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#tupleTypeElements}.
	 * @param ctx the parse tree
	 */
	void exitTupleTypeElements(GenScalaFacadesFromTypescriptParser.TupleTypeElementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#functionType}.
	 * @param ctx the parse tree
	 */
	void enterFunctionType(GenScalaFacadesFromTypescriptParser.FunctionTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#functionType}.
	 * @param ctx the parse tree
	 */
	void exitFunctionType(GenScalaFacadesFromTypescriptParser.FunctionTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#constructorType}.
	 * @param ctx the parse tree
	 */
	void enterConstructorType(GenScalaFacadesFromTypescriptParser.ConstructorTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#constructorType}.
	 * @param ctx the parse tree
	 */
	void exitConstructorType(GenScalaFacadesFromTypescriptParser.ConstructorTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#typeQuery}.
	 * @param ctx the parse tree
	 */
	void enterTypeQuery(GenScalaFacadesFromTypescriptParser.TypeQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#typeQuery}.
	 * @param ctx the parse tree
	 */
	void exitTypeQuery(GenScalaFacadesFromTypescriptParser.TypeQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#thisType}.
	 * @param ctx the parse tree
	 */
	void enterThisType(GenScalaFacadesFromTypescriptParser.ThisTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#thisType}.
	 * @param ctx the parse tree
	 */
	void exitThisType(GenScalaFacadesFromTypescriptParser.ThisTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#propertySignature}.
	 * @param ctx the parse tree
	 */
	void enterPropertySignature(GenScalaFacadesFromTypescriptParser.PropertySignatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#propertySignature}.
	 * @param ctx the parse tree
	 */
	void exitPropertySignature(GenScalaFacadesFromTypescriptParser.PropertySignatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#typeAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterTypeAnnotation(GenScalaFacadesFromTypescriptParser.TypeAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#typeAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitTypeAnnotation(GenScalaFacadesFromTypescriptParser.TypeAnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#callSignature}.
	 * @param ctx the parse tree
	 */
	void enterCallSignature(GenScalaFacadesFromTypescriptParser.CallSignatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#callSignature}.
	 * @param ctx the parse tree
	 */
	void exitCallSignature(GenScalaFacadesFromTypescriptParser.CallSignatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(GenScalaFacadesFromTypescriptParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(GenScalaFacadesFromTypescriptParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#requiredParameterList}.
	 * @param ctx the parse tree
	 */
	void enterRequiredParameterList(GenScalaFacadesFromTypescriptParser.RequiredParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#requiredParameterList}.
	 * @param ctx the parse tree
	 */
	void exitRequiredParameterList(GenScalaFacadesFromTypescriptParser.RequiredParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#requiredParameter}.
	 * @param ctx the parse tree
	 */
	void enterRequiredParameter(GenScalaFacadesFromTypescriptParser.RequiredParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#requiredParameter}.
	 * @param ctx the parse tree
	 */
	void exitRequiredParameter(GenScalaFacadesFromTypescriptParser.RequiredParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#accessibilityModifier}.
	 * @param ctx the parse tree
	 */
	void enterAccessibilityModifier(GenScalaFacadesFromTypescriptParser.AccessibilityModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#accessibilityModifier}.
	 * @param ctx the parse tree
	 */
	void exitAccessibilityModifier(GenScalaFacadesFromTypescriptParser.AccessibilityModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#optionalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterOptionalParameterList(GenScalaFacadesFromTypescriptParser.OptionalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#optionalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitOptionalParameterList(GenScalaFacadesFromTypescriptParser.OptionalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#optionalParameter}.
	 * @param ctx the parse tree
	 */
	void enterOptionalParameter(GenScalaFacadesFromTypescriptParser.OptionalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#optionalParameter}.
	 * @param ctx the parse tree
	 */
	void exitOptionalParameter(GenScalaFacadesFromTypescriptParser.OptionalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#restParameter}.
	 * @param ctx the parse tree
	 */
	void enterRestParameter(GenScalaFacadesFromTypescriptParser.RestParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#restParameter}.
	 * @param ctx the parse tree
	 */
	void exitRestParameter(GenScalaFacadesFromTypescriptParser.RestParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#constructSignature}.
	 * @param ctx the parse tree
	 */
	void enterConstructSignature(GenScalaFacadesFromTypescriptParser.ConstructSignatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#constructSignature}.
	 * @param ctx the parse tree
	 */
	void exitConstructSignature(GenScalaFacadesFromTypescriptParser.ConstructSignatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#indexSignature}.
	 * @param ctx the parse tree
	 */
	void enterIndexSignature(GenScalaFacadesFromTypescriptParser.IndexSignatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#indexSignature}.
	 * @param ctx the parse tree
	 */
	void exitIndexSignature(GenScalaFacadesFromTypescriptParser.IndexSignatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#methodSignature}.
	 * @param ctx the parse tree
	 */
	void enterMethodSignature(GenScalaFacadesFromTypescriptParser.MethodSignatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#methodSignature}.
	 * @param ctx the parse tree
	 */
	void exitMethodSignature(GenScalaFacadesFromTypescriptParser.MethodSignatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#constExpression}.
	 * @param ctx the parse tree
	 */
	void enterConstExpression(GenScalaFacadesFromTypescriptParser.ConstExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#constExpression}.
	 * @param ctx the parse tree
	 */
	void exitConstExpression(GenScalaFacadesFromTypescriptParser.ConstExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceDeclaration(GenScalaFacadesFromTypescriptParser.InterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceDeclaration(GenScalaFacadesFromTypescriptParser.InterfaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#extendsClause}.
	 * @param ctx the parse tree
	 */
	void enterExtendsClause(GenScalaFacadesFromTypescriptParser.ExtendsClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#extendsClause}.
	 * @param ctx the parse tree
	 */
	void exitExtendsClause(GenScalaFacadesFromTypescriptParser.ExtendsClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#classOrInterfaceTypeList}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceTypeList(GenScalaFacadesFromTypescriptParser.ClassOrInterfaceTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#classOrInterfaceTypeList}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceTypeList(GenScalaFacadesFromTypescriptParser.ClassOrInterfaceTypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#classHeritage}.
	 * @param ctx the parse tree
	 */
	void enterClassHeritage(GenScalaFacadesFromTypescriptParser.ClassHeritageContext ctx);
	/**
	 * Exit a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#classHeritage}.
	 * @param ctx the parse tree
	 */
	void exitClassHeritage(GenScalaFacadesFromTypescriptParser.ClassHeritageContext ctx);
	/**
	 * Enter a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#implementsClause}.
	 * @param ctx the parse tree
	 */
	void enterImplementsClause(GenScalaFacadesFromTypescriptParser.ImplementsClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#implementsClause}.
	 * @param ctx the parse tree
	 */
	void exitImplementsClause(GenScalaFacadesFromTypescriptParser.ImplementsClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEnumDeclaration(GenScalaFacadesFromTypescriptParser.EnumDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEnumDeclaration(GenScalaFacadesFromTypescriptParser.EnumDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#enumBody}.
	 * @param ctx the parse tree
	 */
	void enterEnumBody(GenScalaFacadesFromTypescriptParser.EnumBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#enumBody}.
	 * @param ctx the parse tree
	 */
	void exitEnumBody(GenScalaFacadesFromTypescriptParser.EnumBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#enumMemberList}.
	 * @param ctx the parse tree
	 */
	void enterEnumMemberList(GenScalaFacadesFromTypescriptParser.EnumMemberListContext ctx);
	/**
	 * Exit a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#enumMemberList}.
	 * @param ctx the parse tree
	 */
	void exitEnumMemberList(GenScalaFacadesFromTypescriptParser.EnumMemberListContext ctx);
	/**
	 * Enter a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#enumMember}.
	 * @param ctx the parse tree
	 */
	void enterEnumMember(GenScalaFacadesFromTypescriptParser.EnumMemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#enumMember}.
	 * @param ctx the parse tree
	 */
	void exitEnumMember(GenScalaFacadesFromTypescriptParser.EnumMemberContext ctx);
	/**
	 * Enter a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#enumValue}.
	 * @param ctx the parse tree
	 */
	void enterEnumValue(GenScalaFacadesFromTypescriptParser.EnumValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#enumValue}.
	 * @param ctx the parse tree
	 */
	void exitEnumValue(GenScalaFacadesFromTypescriptParser.EnumValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#identifierPath}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierPath(GenScalaFacadesFromTypescriptParser.IdentifierPathContext ctx);
	/**
	 * Exit a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#identifierPath}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierPath(GenScalaFacadesFromTypescriptParser.IdentifierPathContext ctx);
	/**
	 * Enter a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#bindingIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterBindingIdentifier(GenScalaFacadesFromTypescriptParser.BindingIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#bindingIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitBindingIdentifier(GenScalaFacadesFromTypescriptParser.BindingIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(GenScalaFacadesFromTypescriptParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(GenScalaFacadesFromTypescriptParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#lineEnd}.
	 * @param ctx the parse tree
	 */
	void enterLineEnd(GenScalaFacadesFromTypescriptParser.LineEndContext ctx);
	/**
	 * Exit a parse tree produced by {@link GenScalaFacadesFromTypescriptParser#lineEnd}.
	 * @param ctx the parse tree
	 */
	void exitLineEnd(GenScalaFacadesFromTypescriptParser.LineEndContext ctx);
}