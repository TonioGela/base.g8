addSbtPlugin("org.foundweekends.giter8" %% "sbt-giter8"         % "0.16.2")
libraryDependencies += "org.scala-sbt"  %% "scripted-plugin"    % sbtVersion.value
// These are here for scala-steward
addSbtPlugin("com.github.sbt"            % "sbt-github-actions" % "0.15.0")
addSbtPlugin("org.scalameta"             % "sbt-scalafmt"       % "2.5.0")
addSbtPlugin("ch.epfl.scala"             % "sbt-scalafix"       % "0.10.4")
addSbtPlugin("io.github.davidgregory084" % "sbt-tpolecat"       % "0.4.2")
addSbtPlugin("com.timushev.sbt"          % "sbt-updates"        % "0.6.4")
