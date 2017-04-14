package com.cyberthinkers.scalajs.tools.generate

import org.antlr.v4.runtime.tree._
import com.cyberthinkers.tools.generate._

/**
  * Created by cyberthinkers-msi on 4/5/2017.
  */
class GenScalaListener extends GenScalaFacadesFromTypescriptBaseListener {
  val parseTreeProperty = new ParseTreeProperty[String]()

}
