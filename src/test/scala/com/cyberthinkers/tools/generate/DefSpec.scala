//package com.cyberthinkers.tools.generate
//
//import com.cyberthinkers.scalajs.tools.generate._
//import org.scalatest._
//
//class DefSpec extends FlatSpec with Matchers {
//  "DefBasicText" should "allow for a simple line of text" in {
//    val sample = "sample"
//    val d:Def = DefBasicText(sample)
//    assert(d.openingText().length == 1, "only 1 element should appear in openingText()")
//    assert(d.openingText()(0) == sample)
//    assert(d.body().length == 0)
//    assert(d.closingText().length == 0)
//}
//
//import com.cyberthinkers.scalajs.tools.generate.DefBaseKind._
//"DefBase" should "allow for an Object kind" in {
//  val patterns = Array("@js.native @JSGlobal(\"JSNATIVE\") object test() extends js.object {")
//  val baseKind = DefBase(Object, "test", "JSNATIVE")
//  val text = baseKind.openingText().mkString(" ")
//  assert(text == "@js.native @JSGlobal(\"JSNATIVE\") object test() extends js.object {",
//  "annotations and proper signiture should be present")
//}
//
//
//}