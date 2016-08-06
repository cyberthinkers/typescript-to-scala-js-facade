package com.cyberthinkers.tools

/**
  * Created by Larry Melia on 7/29/2016.
  */

sealed trait TypeScriptNode

object AccessibilityEnum extends Enumeration {
  type Accessibility = Value
  val publicAccess, protectedAccess, privateAccess = Value
}

import AccessibilityEnum.Accessibility

case class AmbientModule(val identifierPath: String) extends TypeScriptNode

case class AmbientClass(val className: String, val abstractClass: Boolean /*typeParameters?*/ /* extends */) extends TypeScriptNode

case class AmbientConstructor() extends TypeScriptNode

case class AmbientProperty(accessibility: Accessibility, propertyName: String, staticProperty: Boolean) extends TypeScriptNode

// need indexSignature
