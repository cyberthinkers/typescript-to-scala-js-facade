package com.cyberthinkers.scalajs.tools.generate

import java.io._
import java.nio.file._
import scala.io.Source
import com.cyberthinkers.tools.generate._
import org.antlr.v4.runtime._
import org.antlr.v4.runtime.tree._

object GenScalaFacadesFromTypescript {
  def main(args: Array[String]): Unit = {
    /*
    val bufferedSource = Source.fromFile("C:/cyberthinkers-dev/Babylon.js/dist/babylon.2.4.d.ts")
    val source = bufferedSource.getLines().mkString("\n")
    bufferedSource.close
    */
    // FIXME - pull from arg list, this is a temporary thing for development
//    val source = new String(Files.readAllBytes(Paths.get("C:/cyberthinkers-dev/Babylon.js/dist/babylon.2.4.d.ts")))
//    val source = new String(Files.readAllBytes(Paths.get("C:/cyberthinkers-dev/DefinitelyTyped/react/index.d.ts")))
    val source = new String(Files.readAllBytes(Paths.get("C:/cyberthinkers-dev/DefinitelyTyped/jquery/index.d.ts")))
    parseSource(source)
  }

  def parseSource(source: String) = {
    val lexer = new GenScalaFacadesFromTypescriptLexer(new ANTLRInputStream(source))
    val tokens = new CommonTokenStream(lexer)
    val parser = new GenScalaFacadesFromTypescriptParser(tokens);
    println("parsing")
    val tree = parser.typescriptAmbientDeclarations()
    //val s = tree.toStringTree(parser).toString()
    val walker = new ParseTreeWalker()
    val listener = new GenScalaListener()
    println("walking")
    walker.walk(listener, tree)
    println("done")
  }

}

