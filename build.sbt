import sbt.Keys._

name := "macros"

version := "1.0"

organization := "org.scalamacros"

scalaVersion in ThisBuild := "2.11.8"
run <<= run in Compile in core

lazy val macros = (project in file("macros")).settings(
  libraryDependencies += "org.scala-lang" % "scala-reflect" % scalaVersion.value,
    libraryDependencies += "org.scala-lang" % "scala-compiler" % scalaVersion.value
)

lazy val core = (project in file("core")) dependsOn macros settings (
  libraryDependencies += "junit" % "junit" % "4.10" % Test,
  libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.4" % "test"
  )


    