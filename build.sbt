// This build is for this Giter8 template.

// To test the template run `g8` or `g8Test` from the sbt session.
// See http://www.foundweekends.org/giter8/testing.html#Using+the+Giter8Plugin for more details.
lazy val root = (project in file(".")).enablePlugins(ScriptedPlugin).settings(
  name                                            := "base.g8",
  scalaVersion                                    := "2.12.15",
  Test / test                                     := { val _ = (Test / g8Test).toTask("").value },
  scriptedLaunchOpts ++=
    List("-Xms1024m", "-Xmx1024m", "-XX:ReservedCodeCacheSize=128m", "-Xss2m", "-Dfile.encoding=UTF-8"),
  resolvers +=
    Resolver.url("typesafe", url("https://repo.typesafe.com/typesafe/ivy-releases/"))(Resolver.ivyStylePatterns),
  // this makes g8 buggy
  useSuperShell                                   := false,
  ThisBuild / githubWorkflowPublishTargetBranches := Seq(),
  ThisBuild / githubWorkflowScalaVersions         := Seq("2.12.15"),
  ThisBuild / githubWorkflowBuild := Seq(WorkflowStep.Sbt(List("g8Test"), name = Some("Testing template"))),
  // These are here for scala-steward
  scalafixDependencies += "com.github.liancheng" %% "organize-imports" % "0.6.0",
  libraryDependencies ++= Seq(
    "org.typelevel"    %% "cats-effect"         % "3.3.9",
    "co.fs2"           %% "fs2-core"            % "3.2.5",
    "com.monovore"     %% "decline-effect"      % "2.2.0",
    "is.cir"           %% "ciris"               % "2.3.2",
    ("org.typelevel"    % "kind-projector"      % "0.13.2").cross(CrossVersion.full),
    ("com.github.cb372" % "scala-typed-holes"   % "0.1.11").cross(CrossVersion.full),
    "com.olegpy"       %% "better-monadic-for"  % "0.3.1",
    "org.typelevel"    %% "munit-cats-effect-3" % "1.0.7"
  )
)
