import Dependencies._
import Settings._

inScope(Global)(globalSettings)
inThisBuild(commonSettings ++ scalaFixSettings ++ ++ sbtGithubActionsSettings)

lazy val root = (project in file("."))
  .settings(name := "$name$", libraryDependencies ++= coreDependencies ++ testDependencies)
