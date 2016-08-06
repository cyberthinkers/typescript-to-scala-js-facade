package com.cyberthinkers.tools

import java.io.FileInputStream
import scala.io.Source

import com.cyberthinkers.tools.GenScalaFacadesFromTypescriptParser.TypescriptAmbientDeclarationsContext
import org.antlr.v4.runtime._
import org.antlr.v4.runtime.tree.{ErrorNode, TerminalNode}

import org.antlr.v4.runtime._
import org.antlr.v4.runtime.tree._

import java.io._


/**
  * Created by Larry Melia on 7/26/2016.
  */
object GenScalaFacadesFromTypescriptBaseListenerScala extends GenScalaFacadesFromTypescriptBaseListener {

  def main(args: Array[String]): Unit = {
    val bufferedSource = Source.fromFile("C:\\cyberthinkers-dev\\Babylon.js\\dist\\babylon.2.4.d.ts")
    val buf = new StringBuilder
    for(line <- bufferedSource.getLines) {
      buf.append(line)
      buf.append('\n')
    }
    bufferedSource.close
    parseSource(bufferedSource.toString())
    println("done")
  }

  def parseSource(source: String): Unit = {
    val input = new ANTLRInputStream(source)
    val lexer = new GenScalaFacadesFromTypescriptLexer(input)
    val tokens = new CommonTokenStream(lexer)
    val parser = new GenScalaFacadesFromTypescriptParser(tokens)
    parser.typescriptAmbientDeclarations().enterRule(GenScalaFacadesFromTypescriptBaseListenerScala)
  }

}

