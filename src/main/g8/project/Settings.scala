import sbt._
import sbt.nio.Keys._
import sbt.Keys._
import sbt.librarymanagement.ModuleID
import sbtghactions.GitHubActionsPlugin.autoImport._
import sbtghactions.GenerativePlugin.autoImport._
import scalafix.sbt.ScalafixPlugin.autoImport._
import org.scalafmt.sbt.ScalafmtPlugin.autoImport._

object Settings {

  def crossVersionFullPlugin(p: ModuleID) = compilerPlugin(p.cross(CrossVersion.full))

  private val compilerPlugins: List[ModuleID] = List(
    compilerPlugin("com.olegpy"              %% "better-monadic-for" % "0.3.1"),
    crossVersionFullPlugin("org.typelevel"    % "kind-projector"     % "0.11.3"),
    crossVersionFullPlugin("com.github.cb372" % "scala-typed-holes"  % "0.1.8")
  )

  private val scalaLangVersion: String = "2.13.5"

  val globalSettings: List[Def.Setting[_]] = List[Def.Setting[_]](
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

  val commonSettings: List[Def.Setting[_]] = List[Def.Setting[_]](
    scalaVersion := scalaLangVersion,
    organization := "$organization$",
    organizationName := "$organization_name$",
    version := "0.0.1-SNAPSHOT",
    scalacOptions -= "-Xfatal-warnings",
    scalacOptions += "-Yimports:" ++ Seq("scala", "scala.Predef", "cats", "cats.data", "cats.implicits", "cats.effect")
      .mkString(","),
    libraryDependencies ++= compilerPlugins,
    scalafmtOnCompile := true,
    scalafixOnCompile := true
  )

  val publicSettings: List[Def.Setting[_]] = List[Def.Setting[_]](
    homepage := Some(url("")),
    licenses += "MIT" -> url("https://spdx.org/licenses/MIT.html"),
    developers += Developer("TonioGela", "Antonio Gelameris", "toniogela89@gmail.com", url("https://toniogela.dev"))
  )

  val scalaFixSettings: List[Def.Setting[_]] = List[Def.Setting[_]](
    scalafixScalaBinaryVersion := "2.13",
    semanticdbEnabled := true,
    semanticdbVersion := scalafixSemanticdb.revision,
    scalafixDependencies += "com.github.liancheng" %% "organize-imports" % "0.5.0"
  )

  val sbtGithubActionsSettings: List[Def.Setting[_]] = List[Def.Setting[_]](
    githubWorkflowPublishTargetBranches := Seq(),
    githubWorkflowScalaVersions := Seq(scalaLangVersion)
  )

}
