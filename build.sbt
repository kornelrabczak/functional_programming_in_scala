import Dependencies._

ThisBuild / scalaVersion     := "2.13.0"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "com.thecookiezen"
ThisBuild / organizationName := "TheCookieZen.com"

lazy val root = (project in file("."))
  .settings(
    name := "Functional Programming in Scala",
    libraryDependencies += scalaTest % Test
  )
