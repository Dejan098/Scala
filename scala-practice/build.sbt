name := "scala-practice"

version := "0.1"

scalaVersion := "2.13.4"

val circeVersion = "0.12.3"

scalacOptions ++= Seq("-language:implicitConversions", "-deprecation")

libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.8" % Test

libraryDependencies += "junit" % "junit" % "4.10" % "test"

libraryDependencies += "org.scalactic" %% "scalactic" % "3.2.9"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.9" % "test"
libraryDependencies += "org.json4s" % "json4s-native_2.10" % "3.2.5"


libraryDependencies ++= Seq(
  "io.circe" %% "circe-core",
  "io.circe" %% "circe-generic",
  "io.circe" %% "circe-parser",

).map(_ % circeVersion)
