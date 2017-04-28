package com.cyberthinkers.scalajs.tools.generate

trait Def {
  def openingText(): Array[String] = Array.empty
  def body(): Array[Def] = Array.empty
  def closingText(): Array[String] = Array.empty
}

case class DefBasicText(text: String) extends Def {
  override def openingText() = Array(text)
}

case class DefPackage(packageName: String) extends Def {
  override def openingText(): Array[String] = Array(s"package $packageName")
}

object DefBaseKind extends Enumeration {
  type BaseKind = Value
  val Object = Value("object")
  val Class = Value("class")
  val Trait = Value("trait")
}

import com.cyberthinkers.scalajs.tools.generate.DefBaseKind._
import scala.collection.mutable

case class DefBase(baseKind: BaseKind, name: String, jsNativeName: String, constructor: String = "()", extendsWithDef: Array[String] = Array("js.object")) extends Def {
  val defs = mutable.LinkedHashMap[String, Def]()
  override def openingText(): Array[String] = {
    def global = if(name != jsNativeName) s"@JSGlobal(${'"'}$jsNativeName${'"'})" else "@JSGlobal"
    def extendsWith = "extends " + extendsWithDef.mkString(" with ")
    s"@js.native\n$global\n$baseKind $name$constructor $extendsWith {".split("\n")
  }
  override def closingText(): Array[String] = Array("}")
}