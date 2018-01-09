package org.alpinoblack.core

import org.alpinoblack.macros.DebugMacros

/**
  * Created by Or on 1/7/2018.
  */
object MacroApp extends App{

  println("aa")
  //DebugMacros.printParam("bbb")
  val m = 1
  DebugMacros.debug(1 + m)

}
