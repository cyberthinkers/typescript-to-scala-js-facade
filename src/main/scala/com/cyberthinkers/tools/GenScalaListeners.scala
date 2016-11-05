package com.cyberthinkers.tools
import com.cyberthinkers.tools.GenScalaFacadesFromTypescriptParser.AmbientPropertyMemberDeclarationContext

/**
import scala.collection.mutable

  * Created by Larry Melia on 7/26/2016.
  */
class GenScalaListeners extends GenScalaFacadesFromTypescriptBaseListener {

  val ambientMgr = new AmbientMgr

  override def enterTypescriptAmbientDeclarations(ctx: GenScalaFacadesFromTypescriptParser.TypescriptAmbientDeclarationsContext): Unit = {
    ambientMgr.startDef(GlobalScope())
  }

  override def enterAmbientModuleDeclaration(ctx: GenScalaFacadesFromTypescriptParser.AmbientModuleDeclarationContext): Unit = {
    ambientMgr.startDef(AmbientModule())
  }

  override def exitAmbientModuleDeclaration(ctx: GenScalaFacadesFromTypescriptParser.AmbientModuleDeclarationContext): Unit = {
    println(s"exit module path: ${ctx.identifierPath().getText}")
    ambientMgr.endDef(ctx.identifierPath().getText)
  }

  override def enterAmbientClassDeclaration(ctx: GenScalaFacadesFromTypescriptParser.AmbientClassDeclarationContext): Unit = {
    println("class enter")
    ambientMgr.startDef(AmbientClass())
  }

  override def exitAmbientClassDeclaration(ctx: GenScalaFacadesFromTypescriptParser.AmbientClassDeclarationContext): Unit = {
    println(s"exit class path: ${ctx.bindingIdentifier().getText}")
    ambientMgr.endDef(ctx.bindingIdentifier().getText)
  }

  override def exitAmbientPropertyMemberDeclaration(ctx: AmbientPropertyMemberDeclarationContext): Unit = {
    val accessibilityModifier = ctx.accessibilityModifier().getText
    val staticOpt = ctx.staticOpt().getText
    val propertyName = ctx.propertyName().getText
    val ambientProperty = ctx.ambientProperty().getText

  }
}


