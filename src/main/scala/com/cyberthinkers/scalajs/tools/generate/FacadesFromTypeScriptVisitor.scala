package com.cyberthinkers.scalajs.tools.generate

import java.util
import java.util.List
import scala.collection.mutable
import scala.collection.JavaConverters._

import com.cyberthinkers.tools.generate._

class FacadesFromTypeScriptVisitor(vardefinition: Definition) extends GenScalaFacadesFromTypescriptBaseVisitor[Definition] {

  override def visitTypescriptAmbientDeclarations(ctx: GenScalaFacadesFromTypescriptParser.TypescriptAmbientDeclarationsContext) = {
    FacadesFromTypeScriptVisitor.scope.push(ModuleOrNamespaceDef("")) // push global scope
    super.visitTypescriptAmbientDeclarations(ctx)
  }

  override def visitDeclareModuleOrNamespace(ctx: GenScalaFacadesFromTypescriptParser.DeclareModuleOrNamespaceContext) = {
    val v = visit(ctx.ambientModuleOrNamespace())
    scope.top.statements.put(v.identifier, v)
    v
  }

  override def visitAmbientModuleOrNamespace(ctx: GenScalaFacadesFromTypescriptParser.AmbientModuleOrNamespaceContext) = {
    val v = ModuleOrNamespaceDef(ctx.ambientModuleName().getText, Some(scope.top))
    v
  }

  override def visitClassDeclaration(ctx: GenScalaFacadesFromTypescriptParser.ClassDeclarationContext) = {
    val abstractOpt = if(ctx.abstractOpt().getText() != null)
    val className = ctx.className().getText();
    ctx.ambientClassBodyElement().lis
    visit(ctx.ambientClassBodyElement())
    super.visitClassDeclaration(ctx)
  }
}

object FacadesFromTypeScriptVisitor {
  val scope = mutable.ArrayStack[Definition]()
}
