import sbt._
import sbt.Keys._

object Dependencies {

  val coreDependencies: Seq[ModuleID] = Seq(
    "org.typelevel"                %% "cats-effect"    % "3.4.11",
    "com.monovore"                 %% "decline-effect" % "2.4.1",
    "is.cir"                       %% "ciris"          % "3.2.0",
    $if(add_fs2.truthy) $ "co.fs2" %% "fs2-core"       % "3.7.0" $endif$
  )

  val testDependencies: Seq[ModuleID] = Seq("org.typelevel" %% "munit-cats-effect-3" % "1.0.7").map(_ % Test)

}
