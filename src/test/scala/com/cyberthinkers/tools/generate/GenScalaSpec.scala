package com.cyberthinkers.scalajs.tools.generate

import org.scalatest._
//import org.scalatest.Assertions._

class GenScalaSpec extends FlatSpec with Matchers {
  "typescript 'declare module and 2 class definitions'" should "merge internal module and class definitions when the same name is used" in {
    val source =
      """
        declare module moduleTest1 {
          class test1 { }
          class test2 { }
        }
        declare module moduleTest2 {
          class test3 { }
          class test4 { }
          class test5 { }
          class test3 { }
        }
        declare module moduleTest1 {
          class test2 { }
          class test1 { }
        }
      """.stripMargin
    val visitor = GenScalaFacadesFromTypescript.parseSource(source)
    println("statements: " + visitor.scope.top.statements)
//    assert(listener.global.length == 1, "global scope should be present")
//    val last = listener.global.last
//    assert(last.statements.size == 2, "only 2 module declarations should be present")
//    assert(last.statements.get("moduleTest1").isDefined, "moduleTest1 should be present")
//    assert(last.statements.get("moduleTest2").isDefined, "moduleTest2 should be present")
//    assert(last.statements.get("moduleTest1").get.statements.size == 2, "moduleTest1 should only have 2 class defs")
//    assert(last.statements.get("moduleTest2").get.statements.size == 3, "moduleTest1 should only have 2 class defs")
//    val s1 = last.statements.get("moduleTest1").get.statements
//    for (n <- Seq("test2", "test1")) assert(s1.get(n).isDefined, s"moduleTest2 should have $n class")
//    val s2 = last.statements.get("moduleTest2").get.statements
//    for (n <- Seq("test5", "test3", "test4")) assert(s2.get(n).isDefined, s"moduleTest2 should have $n class")
  }

  "typescript 'class definitions'" should "support basic property types including arrays'" in {
    val source =
      """
      declare module m1 {
          class c1 {
              p1: boolean;
              p2: number;
              p3: string;
              p4: any;
              p5: boolean[];
              p6: number[];
              p7: string[];
              p8: any[];
          }
      }
      """.stripMargin
    val visitor = GenScalaFacadesFromTypescript.parseSource(source)
//    assert(listener.global.length == 1, "global scope should be present")
//    val last = listener.global.last
//    assert(last.statements.size == 1 && last.statements.get("m1").isDefined, "only m1 module definition should be present")
//    val s1 = last.statements.get("m1").get
//    assert(s1.statements.size == 1 && s1.statements.get("c1").isDefined, "only class c1 should be present")
//    val c1 = s1.statements.get("c1").get
//    assert(c1.statements.size == 8, "class c1 should have 8 properties")
  }
}
