name := "public-hello"

version := "0.0.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  specs2 % Test
)

// Play 2.4 recommends using injection route generation.
// See -> https://www.playframework.com/documentation/2.4.x/Migration24#Dependency-Injection
//
routesGenerator := InjectedRoutesGenerator
