package com.cyberthinkers.tools

import scala.collection.mutable

/**
  * Created by Larry Melia on 8/11/2016.
  */
class GenFacade(globalScope: GlobalScope) {

}

object GenFacade {

  protected def indent(level: Int): String = " " * level * 2

  def generateSource(globalScope: GlobalScope, packageName: String): String = {
    val out: StringBuilder = new StringBuilder
    out.append(s"package $packageName\n\n")
    out.append(standardImports())
    out.toString()
  }

  def standardImports() = {
    "import scala.scalajs.js\n" +
    "import js.annotation._\n" +
    "import js.|\n" +
    "import scala.scalajs.js.typedarray._\n"+
    "import org.scalajs.dom\n" +
    "import scala.scalajs.js.annotation.JSExport\n" +
    "import org.scalajs.dom.raw._\n\n"
  }
}


