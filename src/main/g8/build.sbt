ThisBuild / organization := "com.example"
ThisBuild / scalaVersion := "2.13.5"

inThisBuild(List(
  scalafixScalaBinaryVersion := "2.13",
  semanticdbEnabled := true,
  semanticdbVersion := scalafixSemanticdb.revision,
  scalafixDependencies += "com.github.liancheng" %% "organize-imports" % "0.5.0",
  githubWorkflowPublishTargetBranches := Seq(),
  githubWorkflowScalaVersions := Seq(scalaVersion.value)
))

lazy val root = (project in file(".")).settings(name := "base.g8")
