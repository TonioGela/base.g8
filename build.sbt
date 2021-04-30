// This build is for this Giter8 template.
// To test the template run `g8` or `g8Test` from the sbt session.
// See http://www.foundweekends.org/giter8/testing.html#Using+the+Giter8Plugin for more details.
lazy val root = (project in file(".")).enablePlugins(ScriptedPlugin).settings(
  name := "base.g8",
  Test / test := { val _ = (Test / g8Test).toTask("").value },
  scalaVersion := "2.13.5",
  scriptedLaunchOpts ++=
    List("-Xms1024m", "-Xmx1024m", "-XX:ReservedCodeCacheSize=128m", "-Xss2m", "-Dfile.encoding=UTF-8"),
  resolvers +=
    Resolver.url("typesafe", url("https://repo.typesafe.com/typesafe/ivy-releases/"))(Resolver.ivyStylePatterns),
  // this makes g8 buggy
  useSuperShell := false,
  // These are here for scala-steward
  scalafixDependencies += "com.github.liancheng" %% "organize-imports" % "0.5.0",
  libraryDependencies += Seq(
    "org.typelevel"    %% "cats-effect"         % "3.1.0",
    "com.monovore"     %% "decline-effect"      % "1.3.0",
    "is.cir"           %% "ciris"               % "2.0.0-RC2",
    ("org.typelevel"    % "kind-projector"      % "0.11.3").cross(CrossVersion.full),
    ("com.github.cb372" % "scala-typed-holes"   % "0.1.8").cross(CrossVersion.full),
    "com.olegpy"       %% "better-monadic-for"  % "0.3.1",
    "org.typelevel"    %% "munit-cats-effect-3" % "1.0.2"
  )
)
