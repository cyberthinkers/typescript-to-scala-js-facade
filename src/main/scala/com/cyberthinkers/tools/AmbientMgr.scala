package com.cyberthinkers.tools

import scala.collection.mutable

/**
  * Created by cyberthinkers-msi on 8/11/2016.
  */
class AmbientMgr {

  val scope = mutable.ArrayStack[AmbientContainer]()
  val properties =  mutable.ArrayStack[AmbientProperty]()

  def startDef(container: AmbientContainer) = {
    scope.push(container)
  }

  def endDef(id: String) = {
    val last = scope.pop
    last.id = id
    val parent: AmbientContainer = scope.top
    val previous = parent.children.get(id)
    if(previous.isDefined) {
      previous.get.children ++= last.children
    } else {
      parent.children.put(id, last)
    }
  }

  def addNode(node: TypeScriptNode) = {
    scope.last.properties.add(node)
  }

  def addAmbientProperty(ambientProperty: AmbientProperty) = {
    properties += ambientProperty
  }
}
