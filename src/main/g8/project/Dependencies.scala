import sbt._
import sbt.Keys._

object Dependencies {

  val coreDependencies: Seq[ModuleID] = Seq(
    "org.typelevel" %% "cats-effect"    % "3.2.2",
    "com.monovore"  %% "decline-effect" % "2.1.0",
    "is.cir"        %% "ciris"          % "2.1.0"
  )

  val testDependencies: Seq[ModuleID] = Seq("org.typelevel" %% "munit-cats-effect-3" % "1.0.6").map(_ % Test)

}
