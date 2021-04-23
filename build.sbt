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
  // These are here for scala-steward
  scalafixDependencies += "com.github.liancheng" %% "organize-imports" % "0.5.0",
  libraryDependencies += Seq()
)
