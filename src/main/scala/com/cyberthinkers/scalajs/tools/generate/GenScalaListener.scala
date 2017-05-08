package com.cyberthinkers.scalajs.tools.generate
import collection.mutable._
import scala.collection.JavaConverters._
import com.cyberthinkers.tools.generate.GenScalaFacadesFromTypescriptParser._
import org.antlr.v4.runtime.tree._
import com.cyberthinkers.tools.generate._

import scala.collection.mutable

class GenScalaListener extends GenScalaFacadesFromTypescriptBaseListener {
  val parseTreeProperty = new ParseTreeProperty[String]()
  val definitions =  new ParseTreeProperty[Definition]()
  val global = mutable.ArrayStack[Definition]()

  override def enterTypescriptAmbientDeclarations(ctx: TypescriptAmbientDeclarationsContext): Unit = {
    global.push(ModuleOrNamespaceDef(""))
  }

  override def exitAmbientModuleName(ctx: AmbientModuleNameContext): Unit = {
    // need to check for string literals before this
    val name = (for(p <- ctx.identifierPath().ident.asScala) yield parseTreeProperty.get(p)).mkString(".")
    val definition: Definition = global.top.statements.getOrElseUpdate(name, ModuleOrNamespaceDef(name, Some(global.top)))
    global.push(definition)
  }

  override def exitAmbientModuleOrNamespace(ctx: AmbientModuleOrNamespaceContext): Unit = {
    global.pop()
  }

  override def exitClassName(ctx: ClassNameContext): Unit = {
    ctx.bindingIdentifier()
    val name = parseTreeProperty.get(ctx.bindingIdentifier())
    val definition: Definition = global.top.statements.getOrElseUpdate(name, ClassDef(name))
    global.push(definition)
  }

  override def exitClassDeclaration(ctx: ClassDeclarationContext): Unit = {
    // FIXME: missing class args
    global.pop()
  }m8pbb-6120761826@pers.craigslist.org

  override def exitEnumName(ctx: EnumNameContext): Unit = {
    ctx.bindingIdentifier()
    val name = parseTreeProperty.get(ctx.bindingIdentifier())
    val accessibilityModifier = 0
    val definition: Definition = global.top.statements.getOrElseUpdate(name, EnumDef(name, accessibilityModifier))
    global.push(definition)
  }

  override def exitEnumDeclaration(ctx: EnumDeclarationContext): Unit = {
    // FIXME: missing enum body
    global.pop()
  }

  override def exitBasicIdentifier(ctx: BasicIdentifierContext): Unit = {
    parseTreeProperty.put(ctx, ctx.identifier().getText)
  }

  override def exitStringLiteralIdentifier(ctx: StringLiteralIdentifierContext): Unit = {
    parseTreeProperty.put(ctx, ctx.StringLiteral().getText)
  }
}
