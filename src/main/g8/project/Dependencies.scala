import sbt._
import sbt.Keys._

object Dependencies {

  val coreDependencies: Seq[ModuleID] = Seq(
    "org.typelevel" %% "cats-effect"    % "3.1.1",
    "com.monovore"  %% "decline-effect" % "2.0.0",
    "is.cir"        %% "ciris"          % "2.0.0"
  )

  val testDependencies: Seq[ModuleID] = Seq("org.typelevel" %% "munit-cats-effect-3" % "1.0.3").map(_ % Test)

}
