package com.cyberthinkers.tools

import java.io.FileInputStream
import scala.io.Source

//import org.antlr.v4.runtime._
//import org.antlr.v4.runtime.tree.{ErrorNode, TerminalNode}
//
//import org.antlr.v4.runtime._
//import org.antlr.v4.runtime.tree._

import java.io._
import java.nio.file._
import org.snt.inmemantlr._
//import org.snt.inmemantlr.exceptions.IllegalWorkflowException
import org.snt.inmemantlr.listener.DefaultListener
//import org.snt.inmemantlr.tool.ToolCustomizer
//import org.snt.inmemantlr.tree.Ast

object GenScalaFacadesFromTypescript {

  def main(args: Array[String]): Unit = {
    val grammar = new String(Files.readAllBytes(Paths.get("src/main/antlr4/GenScalaFacadesFromTypescript.g4")))
    val bufferedSource = Source.fromFile("C:/cyberthinkers-dev/Babylon.js/dist/babylon.2.4.d.ts")
    val source = bufferedSource.getLines().mkString("\n")
    bufferedSource.close
    parseSource(grammar, source)
    println("done")
  }

  def parseSource(grammar: String, source: String) = {
    val f = new File("src/main/antlr4/GenScalaFacadesFromTypescript.g4")
    val gp = new GenericParser(f)//grammar)
    gp.setListener(new DefaultListener())
    gp.compile()
    val ctx = gp.parse(source)
  }

}

