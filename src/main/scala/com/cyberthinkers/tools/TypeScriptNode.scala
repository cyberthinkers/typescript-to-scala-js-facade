package com.cyberthinkers.tools

import scala.collection.mutable

/**
  * Created by Larry Melia on 7/29/2016.
  */

abstract class TypeScriptNode() {
  var id: String = ""
}

case class PropertyNode(accessibilityModifier: String, staticOpt: Boolean, propertyName: String, properties: List[AmbientProperty]) {
}

abstract class AmbientContainer extends TypeScriptNode {
  val children: mutable.Map[String, AmbientContainer] = mutable.LinkedHashMap.empty
  val properties:  mutable.Set[TypeScriptNode] = mutable.LinkedHashSet.empty
}

case class GlobalScope() extends AmbientContainer {
}

case class AmbientModule() extends AmbientContainer {
}

case class AmbientClass() extends AmbientContainer {
}

case class AmbientProperty() extends TypeScriptNode {
}

case class AmbientField() extends TypeScriptNode {
}

case class AmbientFunction() extends TypeScriptNode {
}