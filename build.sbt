import Dependencies._

ThisBuild / scalaVersion     := "2.12.8"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "com.example"
ThisBuild / organizationName := "example"


lazy val root = (project in file("."))
  .settings(
    name := "Akka ScalaClean Test",
	addCompilerPlugin("org.scalameta" % "semanticdb-scalac" % "4.1.11" cross CrossVersion.full),
	scalacOptions += "-Yrangepos",
    libraryDependencies += scalaTest % Test,
    libraryDependencies += "org.scala-lang.modules" % "scala-java8-compat_2.12" % "0.9.0",
    libraryDependencies += "com.typesafe" % "config" % "1.3.4"
  )

