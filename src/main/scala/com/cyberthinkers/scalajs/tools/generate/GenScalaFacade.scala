package com.cyberthinkers.scalajs.tools.generate

import scala.collection.mutable

trait TypeScriptId {
  val identifier: String
}

object AccessibilityModifiers {
  val publicModifier = 1 // default is public
  val protectedModifier = 2
  val privateModifier = 4
  val staticModifier = 8
  val readonlyModifier = 16
  val optionalModifier = 32
  val requiredModifier = 64
}

trait PropertyModifier {
  val modifier: Int
}

abstract class Definition(identifier: String) extends TypeScriptId {
  val statements = mutable.LinkedHashMap[String, Definition]()
}

case class AccessibilityModifierDef(modifier: Int) extends PropertyModifier {

}

case class ModuleOrNamespaceDef(identifier: String, parent:Option[Definition] = None) extends Definition(identifier) {

}

case class ClassDef(identifier: String) extends Definition(identifier) {

}

case class EnumDef(identifier: String) extends Definition(identifier) {
}

case class FunctionDef(identifier: String) extends Definition(identifier) {
}

case class InterfaceDef(identifier: String) extends Definition(identifier) {
}

case class PropertyDef(identifier: String, modifier: Int) extends Definition(identifier) with PropertyModifier {
}

case class TypeDef(identifier: String, accessibilityModifier: Int) extends Definition(identifier) {
}

case class VariableDef(identifier: String, accessibilityModifier: Int) extends Definition(identifier) {
}

object GenScalaFacade {

}
