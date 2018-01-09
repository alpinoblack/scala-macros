import org.alpinoblack.macros.DebugMacros
import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

/**
  * Created by Or on 1/7/2018.
  */
@RunWith(classOf[JUnitRunner])
class MacroTest extends FunSuite {

  test("simple hello world"){
    DebugMacros.hello()
  }


  test("printing a macro parameter"){
    DebugMacros.printParam("bbb")
    println("aaaa")
  }
}
