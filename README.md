# scala-macros
## Macro Debugging
In order to debug a scala macro with break points one must 
1. Add a new Run/Debug Configuration for **Application**
2. In the Edit configuration form add the following parameters:
	1. **Main class**  scala.tool.nsc.Main
	2. **VM Options** -Dscala.usejavacp=true
	3. **Program Arguments** -cp [full name for the class which defines the **macro**] [file path for the using class]
3. In the **sbt** make sure that you add the following dependencies to the **macro** compilation unit
```scala
  libraryDependencies += "org.scala-lang" % "scala-reflect" % scalaVersion.value,
  libraryDependencies += "org.scala-lang" % "scala-compiler" % scalaVersion.value
```
For more details regarding macro debugging: 
1. [Cake Solutions debugging Scala Macros](https://www.cakesolutions.net/teamblogs/2013/09/30/debugging-scala-macros)
2. [Debugging Scala Macros from the Scala Website](https://docs.scala-lang.org/overviews/macros/overview.html#debugging-macros)
