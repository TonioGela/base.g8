import Dependencies._
import Settings._

inScope(Global)(globalSettings)
inThisBuild(scalaFixSettings ++ sbtGithubActionsSettings ++ publicSettings)

lazy val root = (project in file("."))
  .settings(name := "$name$", commonSettings, libraryDependencies ++= coreDependencies ++ testDependencies)
