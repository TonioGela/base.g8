import sbt._
import sbt.Keys._

object Dependencies {

  val coreDependencies: Seq[ModuleID] = Seq(
    "org.typelevel" %% "cats-core"      % "2.13.0",
    "org.typelevel" %% "cats-effect"    % "3.7.0",
    "co.fs2"        %% "fs2-io"         % "3.13.0",
    "com.monovore"  %% "decline-effect" % "2.6.2"
  )

  val testDependencies: Seq[ModuleID] = Seq(
    "org.typelevel" %% "weaver-cats"       % "0.12.0",
    "org.typelevel" %% "weaver-scalacheck" % "0.12.0"
  ).map(_ % Test)

}
