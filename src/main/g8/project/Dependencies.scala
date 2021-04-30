import sbt._
import sbt.Keys._

object Dependencies {

  val coreDependencies: Seq[ModuleID] = Seq(
    "org.typelevel" %% "cats-effect"    % "3.1.0",
    "com.monovore"  %% "decline-effect" % "1.3.0",
    "is.cir"        %% "ciris"          % "2.0.0-RC2"
  )

  val testDependencies: Seq[ModuleID] = Seq("org.typelevel" %% "munit-cats-effect-3" % "1.0.2").map(_ % Test)

}
