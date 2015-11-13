name := "public-hello"

version := "0.0.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "2.2.4" % "test",
  "org.scalatestplus" %% "play" % "1.4.0-M3" % "test"
  //specs2 % Test
)

routesGenerator := InjectedRoutesGenerator
