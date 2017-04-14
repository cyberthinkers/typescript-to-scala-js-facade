package com.cyberthinkers.scalajs.tools.generate

import scala.collection.mutable

trait TypeScriptDef {
  val identifier: String
}

object AccessibilityModifiers {
  val publicModifier = 1 // default is public
  val protectedModifier = 2
  val privateModifier = 4
  val staticModifier = 8
  val readonlyModifier = 16
}

abstract class Definition(identifier: String) extends TypeScriptDef {
  val statements = mutable.LinkedHashMap[String, Definition]()
}

case class ModuleOrNamespaceDef(identifier: String) extends Definition(identifier) {

}

case class ClassDef(identifier: String) extends Definition(identifier) {

}

case class VariableDefStatement(identifier: String, accessibilityModifier: Int) extends Definition(identifier) {

}

case class TypeScriptModule(identifier: String) extends Definition(identifier) {

}

object GenScalaFacade {

}
