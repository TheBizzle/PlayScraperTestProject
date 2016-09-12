name := "my-first-app"

scalaVersion := "2.11.8"

version := "1.0.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala).enablePlugins(org.nlogo.PlayScrapePlugin)

scrapeRoutes ++= Seq("/landing")
