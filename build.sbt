name := "public-hello"

version := "0.0.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  specs2 % Test
)

routesGenerator := InjectedRoutesGenerator
