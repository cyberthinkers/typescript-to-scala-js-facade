package com.cyberthinkers.tools

import java.io.FileInputStream
import scala.io.Source

import com.cyberthinkers.tools.GenScalaFacadesFromTypescriptParser.TypescriptAmbientDeclarationsContext
import org.antlr.v4.runtime._
import org.antlr.v4.runtime.tree.{ErrorNode, TerminalNode}

import org.antlr.v4.runtime._
import org.antlr.v4.runtime.tree._

import java.io._

object GenScala {

  def main(args: Array[String]): Unit = {
    val bufferedSource = Source.fromFile("C:/cyberthinkers-dev/Babylon.js/dist/babylon.2.4.d.ts")
    val source = bufferedSource.getLines().mkString("\n")
    bufferedSource.close
    parseSource(source)
    println("done")
  }

  def parseSource(source: String) = {
    val input = new ANTLRInputStream(source)
    val lexer = new GenScalaFacadesFromTypescriptLexer(input)
    val tokens = new CommonTokenStream(lexer)
    val parser = new GenScalaFacadesFromTypescriptParser(tokens)
   // parser.addParseListener(GenScala)
    val listeners = new GenScalaListeners
    parser.addParseListener(listeners)
    parser.typescriptAmbientDeclarations().start
    listeners.ambientMgr
  }

}

