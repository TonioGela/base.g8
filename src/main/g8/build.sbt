import Dependencies._
import Settings._

inScope(Global)(globalSettings)
inThisBuild(commonSettings ++ scalaFixSettings)

lazy val root = (project in file(".")).settings(name := "$name$", sbtGithubActionsSettings)
