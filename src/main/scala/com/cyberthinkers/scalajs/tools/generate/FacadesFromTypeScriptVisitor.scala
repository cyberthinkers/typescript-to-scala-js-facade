package com.cyberthinkers.scalajs.tools.generate

import java.util
import java.util.List
import scala.collection.mutable
import scala.collection.JavaConverters._

import com.cyberthinkers.tools.generate._

class FacadesFromTypeScriptVisitor extends GenScalaFacadesFromTypescriptBaseVisitor[Definition] {
  val scope = mutable.ArrayStack[Definition]()

  override def visitTypescriptAmbientDeclarations(ctx: GenScalaFacadesFromTypescriptParser.TypescriptAmbientDeclarationsContext) = {
    scope.push(ModuleOrNamespaceDef("")) // push global scope
    super.visitTypescriptAmbientDeclarations(ctx)
  }

  override def visitDeclareModuleOrNamespace(ctx: GenScalaFacadesFromTypescriptParser.DeclareModuleOrNamespaceContext) = {
    val v = visit(ctx.ambientModuleOrNamespace())
    scope.top.statements.put(v.identifier, v)
    v
  }

  override def visitAmbientModuleOrNamespace(ctx: GenScalaFacadesFromTypescriptParser.AmbientModuleOrNamespaceContext) = {
    val v = ModuleOrNamespaceDef(ctx.ambientModuleName().getText, Some(scope.top))
    ctx.el.forEach(visit(_))
    v
  }
}
