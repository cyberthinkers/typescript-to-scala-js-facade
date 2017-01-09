//package com.cyberthinkers.tools
//import org.scalatest._
///**
//  * Created by cyberthinkers-msi on 9/24/2016.
//  */
//class GenScalaSpec extends FlatSpec with Matchers {
//  "typescript 'declare module and 2 class definitions'" should "produce internal module and class definitions" in {
//    val source =
//      """
//        declare module moduleTest {
//          class test1 {
//          }
//          class test2 {
//          }
//        }
//        declare module moduleTest {
//          class test3 {
//          }
//        }
//      """
//      .stripMargin
//    val mgr: AmbientMgr = GenScala.parseSource(source)
//    val scope = mgr.scope
//    assert(scope.length == 1, "default global scope should be present")
//    val container = mgr.scope.top
//    assert(container.children.size == 1, "should be one module present")
//    val module = container.children.get("moduleTest")
//    assert(module.isDefined)
//    assert(module.get.children.size == 3,"moduleTest should have 3 classes")
//    assert(module.get.children.isDefinedAt("test1")
//      && module.get.children.isDefinedAt("test2")
//      && module.get.children.isDefinedAt("test3"), "moduleTest should have 3 classes named test1, test2, test3")
//  }
//}
