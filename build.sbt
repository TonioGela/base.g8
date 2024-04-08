lazy val root = (project in file(".")).settings(
  name                                            := "base.g8",
  scalaVersion                                    := "2.13.13",
  Test / test                                     := { val _ = (Test / g8Test).toTask("").value },
  scriptedLaunchOpts ++= List(
    "-Xms1024m",
    "-Xmx1024m",
    "-XX:ReservedCodeCacheSize=128m",
    "-Xss2m",
    "-Dfile.encoding=UTF-8"
  ),
  ThisBuild / githubWorkflowPublishTargetBranches := Seq(),
  ThisBuild / githubWorkflowScalaVersions         := Seq("2.13.13"),
  ThisBuild / githubWorkflowBuild                 :=
    Seq(WorkflowStep.Sbt(List("g8Test"), name = Some("Testing template"))),
  // These are here for scala-steward
  libraryDependencies ++= Seq(
    "org.typelevel"       %% "cats-core"         % "2.10.0",
    "org.typelevel"       %% "cats-effect"       % "3.5.4",
    "co.fs2"              %% "fs2-io"            % "3.10.2",
    "com.monovore"        %% "decline-effect"    % "2.4.1",
    "com.disneystreaming" %% "weaver-cats"       % "0.8.3",
    "com.disneystreaming" %% "weaver-scalacheck" % "0.8.3"
  )
)
