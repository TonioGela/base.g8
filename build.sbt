lazy val root = (project in file(".")).settings(
  name                                            := "base.g8",
  scriptedLaunchOpts ++= List(
    "-Xms1024m",
    "-Xmx1024m",
    "-XX:ReservedCodeCacheSize=128m",
    "-Xss2m",
    "-Dfile.encoding=UTF-8"
  ),
  ThisBuild / githubWorkflowPublishTargetBranches := Nil,
  ThisBuild / githubWorkflowScalaVersions         := List("2.12"),
  ThisBuild / githubWorkflowBuild                 :=
    List(WorkflowStep.Sbt(List("g8Test"), name = Some("Testing template"))),
  // These are here for scala-steward
  libraryDependencies ++= Seq(
    "org.typelevel"       %% "cats-core"         % "2.11.0",
    "org.typelevel"       %% "cats-effect"       % "3.5.4",
    "co.fs2"              %% "fs2-io"            % "3.10.2",
    "com.monovore"        %% "decline-effect"    % "2.4.1",
    "com.disneystreaming" %% "weaver-cats"       % "0.8.4",
    "com.disneystreaming" %% "weaver-scalacheck" % "0.8.4",
    "org.scala-lang"       % "scala-library"     % "2.13.14",
    "org.scala-lang"       % "scala3-library_3"  % "3.4.2"
  )
)
