import sbt._
import sbt.Keys._

object Dependencies {

  val coreDependencies: Seq[ModuleID] = Seq(
    "org.typelevel" %% "cats-core"      % "2.13.0",
    "org.typelevel" %% "cats-effect"    % "3.5.4",
    "co.fs2"        %% "fs2-io"         % "3.13.0",
    "com.monovore"  %% "decline-effect" % "2.4.1"
  )

  val testDependencies: Seq[ModuleID] = Seq(
    "com.disneystreaming" %% "weaver-cats"       % "0.8.4",
    "com.disneystreaming" %% "weaver-scalacheck" % "0.8.3"
  ).map(_ % Test)

}
