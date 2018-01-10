package org.alpinoblack.core

import org.alpinoblack.macros.DebugMacros

/**
  * Created by Or on 1/7/2018.
  */
object MacroApp extends App{

  val m = {
    val b = 1
    val a = 2
    a + b
  }
  DebugMacros.debug(m)

  class A {
    def a: Int = 42
    def b: String = "b"
  }

  class B {
    def beta: String = "beta"
  }

  println(DebugMacros.methodNames[A])
  println(DebugMacros.methodNames[B])

}
