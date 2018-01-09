package org.alpinoblack.macros

/**
  * Created by Or on 1/7/2018.
  */
object DebugMacros {

  import language.experimental.macros

  import scala.reflect.macros.blackbox.Context

  def hello(): Unit = macro helloImpl

  def helloImpl(c: Context)(): c.Expr[Unit] = {
    import c.universe._
    reify {
      println("Hello World!")
    }
  }

  def printParam(param: Any): Unit = macro printParamImpl

  def printParamImpl(c: Context)(param: c.Expr[Any]): c.Expr[Unit] = {
    import c.universe._
    println("aa")
    val m = reify {param.splice}
    val n = reify { println(param.splice) }

    n
  }

  def debug(param: Any): Unit = macro debugImpl

  def debugImpl(c: Context)(param: c.Expr[Any]): c.Expr[Unit] = {
    import c.universe._
    val paramRep = show(param.tree)
    val paramRepTree = Literal(Constant(paramRep))
    val paramRepExpr = c.Expr[String](paramRepTree)
    val n = reify { println(paramRepExpr.splice + " = " + param.splice) }
    n
  }

}
