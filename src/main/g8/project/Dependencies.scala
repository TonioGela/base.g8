import sbt._
import sbt.Keys._

object Dependencies {

  val coreDependencies: Seq[ModuleID] = Seq(
    "org.typelevel"                %% "cats-effect"    % "3.3.14",
    "com.monovore"                 %% "decline-effect" % "2.3.0",
    "is.cir"                       %% "ciris"          % "2.3.3",
    $if(add_fs2.truthy) $ "co.fs2" %% "fs2-core"       % "3.2.14" $endif$
  )

  val testDependencies: Seq[ModuleID] = Seq("org.typelevel" %% "munit-cats-effect-3" % "1.0.7").map(_ % Test)

}
