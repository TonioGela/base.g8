import sbt._
import sbt.Keys._

object Dependencies {

  val coreDependencies: Seq[ModuleID] = Seq(
    "org.typelevel"                %% "cats-effect"    % "3.2.9",
    "com.monovore"                 %% "decline-effect" % "2.2.0",
    "is.cir"                       %% "ciris"          % "2.2.0",
    $if(add_fs2.truthy)$ 
    "co.fs2"                       %% "fs2-core"       % "3.2.1"$endif$
  )

  val testDependencies: Seq[ModuleID] = Seq("org.typelevel" %% "munit-cats-effect-3" % "1.0.6").map(_ % Test)

}
