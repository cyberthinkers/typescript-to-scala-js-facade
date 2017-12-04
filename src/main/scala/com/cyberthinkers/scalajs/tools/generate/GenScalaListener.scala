//package com.cyberthinkers.scalajs.tools.generate
//import collection.mutable._
//import scala.collection.JavaConverters._
//import com.cyberthinkers.tools.generate.GenScalaFacadesFromTypescriptParser._
//import org.antlr.v4.runtime.tree._
//import com.cyberthinkers.tools.generate._
//
//import scala.collection.mutable
//
//class GenScalaListener extends GenScalaFacadesFromTypescriptBaseListener {
//  val parseTreePropertyValue = new ParseTreeProperty[String]()
//  val definition =  new ParseTreeProperty[Definition]()
//  val accessibilityModifier =  new ParseTreeProperty[AccessibilityModifierDef]()
//  val global = mutable.ArrayStack[Definition]()
//
//  override def enterTypescriptAmbientDeclarations(ctx: TypescriptAmbientDeclarationsContext): Unit = {
//    global.push(ModuleOrNamespaceDef("")) // push global unnamed space on top
//  }
//
//  override def exitAmbientModuleName(ctx: AmbientModuleNameContext): Unit = {
//    // need to check for string literals before this
//    val name = (for(p <- ctx.identifierPath().ident.asScala) yield parseTreePropertyValue.get(p)).mkString(".")
//    val definition: Definition = global.top.statements.getOrElseUpdate(name, ModuleOrNamespaceDef(name, Some(global.top)))
//    global.push(definition)
//  }
//
//  override def exitAmbientModuleOrNamespace(ctx: AmbientModuleOrNamespaceContext): Unit = {
//    global.pop()
//  }
//
//  override def exitClassName(ctx: ClassNameContext): Unit = {
//    val name = parseTreePropertyValue.get(ctx.bindingIdentifier())
//    val definition: Definition = global.top.statements.getOrElseUpdate(name, ClassDef(name))
//    global.push(definition)
//  }
//
//  override def exitClassDeclaration(ctx: ClassDeclarationContext): Unit = {
//    // FIXME: missing class args
//    global.pop()
//  }
//
//  override def exitAmbientPropertyMemberDeclaration(ctx: AmbientPropertyMemberDeclarationContext): Unit = {
//
//  }
//
//  override def exitPropertySignature(ctx: PropertySignatureContext): Unit = {
//    val name = parseTreePropertyValue.get(ctx.optionalBindingIdentifier())
//    val op = accessibilityModifier.get(ctx.optionalBindingIdentifier().optionalParam())
//    definition.put(ctx, PropertyDef(name, op.modifier))
//  }
//
//  override def exitAmbientClassBodyElementProperty(ctx: AmbientClassBodyElementPropertyContext): Unit  = {
//
//  }
//  /////////////////////
//
//  override def exitOptStaticDef(ctx: OptStaticDefContext): Unit = {
//    accessibilityModifier.put(ctx, AccessibilityModifierDef(AccessibilityModifiers.staticModifier))
//  }
//
//  override def exitOptStaticNotDef(ctx: OptStaticNotDefContext): Unit = {
//    accessibilityModifier.put(ctx, AccessibilityModifierDef(0))
//  }
//
//  override def exitOptionalModifier(ctx: OptionalModifierContext): Unit = {
//    accessibilityModifier.put(ctx, AccessibilityModifierDef(AccessibilityModifiers.optionalModifier))
//  }
//
//  override def exitRequiredParam(ctx: RequiredParamContext): Unit = {
//    accessibilityModifier.put(ctx, AccessibilityModifierDef(AccessibilityModifiers.requiredModifier))
//  }
//
//  override def exitOptionalBindingIdentifier(ctx: OptionalBindingIdentifierContext): Unit = {
//    val name = parseTreePropertyValue.get(ctx.bindingIdentifier())
//    val modifier:Int = accessibilityModifier.get(ctx.optionalParam()).modifier
//    accessibilityModifier.put(ctx, AccessibilityModifierDef(modifier))
//  }
//
//  //
//  //  override def exitEnumName(ctx: EnumNameContext): Unit = {
//  //    ctx.bindingIdentifier()
//  //    val name = parseTreePropertyValue.get(ctx.bindingIdentifier())
//  //    val accessibilityModifier = 0
//  //    val definition: Definition = global.top.statements.getOrElseUpdate(name, EnumDef(name))
//  //    global.push(definition)
//  //  }
//  override def exitEnumDeclaration(ctx: EnumDeclarationContext): Unit = {
//    // FIXME: missing enum body
//    global.pop()
//  }
//
///////////////////////
//
//
//
///////////////////////
//
//  override def exitPublicModifier(ctx: PublicModifierContext): Unit = {
//    accessibilityModifier.put(ctx, AccessibilityModifierDef(AccessibilityModifiers.publicModifier))
//  }
//
//  override def exitProtectedModifier(ctx: ProtectedModifierContext): Unit = {
//    accessibilityModifier.put(ctx, AccessibilityModifierDef(AccessibilityModifiers.protectedModifier))
//  }
//
//  override def exitPrivateModifier(ctx: PrivateModifierContext): Unit  = {
//    accessibilityModifier.put(ctx, AccessibilityModifierDef(AccessibilityModifiers.privateModifier))
//  }
//
//  /////////////////////
//
//  override def exitBasicIdentifier(ctx: BasicIdentifierContext): Unit = {
//    parseTreePropertyValue.put(ctx, ctx.identifier().getText)
//  }
//
//  override def exitStringLiteralIdentifier(ctx: StringLiteralIdentifierContext): Unit = {
//    parseTreePropertyValue.put(ctx, ctx.StringLiteral().getText)
//  }
//}
