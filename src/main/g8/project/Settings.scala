import sbt._
import sbt.Keys._
import sbt.librarymanagement.ModuleID

object Settings {

  //IS THIS NEEDED?
  private def crossPlugin(x: ModuleID) = compilerPlugin(x.cross(CrossVersion.full))

  lazy val compilerPlugins: List[ModuleID] = List(
    crossPlugin("org.typelevel"    %% "kind-projector"     % "0.10.3"),
    crossPlugin("com.github.cb372" %% "scala-typed-holes"  % "0.1.6"),
    compilerPlugin("com.olegpy"    %% "better-monadic-for" % "0.3.1")
  )

  private lazy val scalaLangVersion: String = "2.13.5"

  lazy val globalSettings: List[Def.Setting[_]] = List[Def.Setting[_]](
    // improved classLoader layering (google it)
    turbo := true,
    // most useful setting ever
    onChangedBuildSource := ReloadOnSourceChanges,
    // I like implicit success
    showSuccess := false,
    // clears screen before and after each task
    watchBeforeCommand := Watch.clearScreen,
    watchTriggeredMessage := Watch.clearScreenOnTrigger,
    watchForceTriggerOnAnyChange := true
  )

  lazy val commonSettings: List[Def.Setting[_]] = List[Def.Setting[_]](
    scalaVersion := scalaLangVersion,
    organization := "$organization$",
    organizationName := "$organization_name$",
    version := "0.0.1-SNAPSHOT",
    scalacOptions -= "-Xfatal-warnings",
    scalacOptions += "-Yimports:" ++ Seq("scala", "scala.Predef", "cats", "cats.data", "cats.implicits", "cats.effect")
      .mkString(","),
    scalafmtOnCompile := true,
    scalafixOnCompile := true
  )

  lazy val scalaFixSettings: List[Def.Setting[_]] = List[Def.Setting[_]](
    scalafixScalaBinaryVersion := "2.13",
    semanticdbEnabled := true,
    semanticdbVersion := scalafixSemanticdb.revision,
    scalafixDependencies += "com.github.liancheng" %% "organize-imports" % "0.5.0"
  )

  lazy val sbtGithubActionsSettings: List[Def.Setting[_]] = List[Def.Setting[_]](
    githubWorkflowPublishTargetBranches := Seq(),
    githubWorkflowScalaVersions := Seq(scalaLangVersion)
  )

}
