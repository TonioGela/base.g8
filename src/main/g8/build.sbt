import Dependencies._

inScope(Global)(
  List(onChangedBuildSource := ReloadOnSourceChanges, showSuccess := false, excludeLintKeys += showSuccess)
)

inThisBuild(List(
  crossScalaVersions                  := List("3.4.1"),
  githubWorkflowPublishTargetBranches := Nil,
  semanticdbEnabled                   := true,
  semanticdbVersion                   := scalafixSemanticdb.revision
))

lazy val root = (project in file(".")).settings(
  scalaVersion     := "3.4.1",
  name             := "$name$",
  organization     := "dev.toniogela",
  organizationName := "toniogela.dev",
  version          := "0.0.1-SNAPSHOT",
  libraryDependencies ++= coreDependencies ++ testDependencies
)
