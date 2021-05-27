addSbtPlugin("org.foundweekends.giter8" %% "sbt-giter8"         % "0.13.1")
libraryDependencies += "org.scala-sbt"  %% "scripted-plugin"    % sbtVersion.value
// These are here for scala-steward
addSbtPlugin("com.codecommit"            % "sbt-github-actions" % "0.11.0")
addSbtPlugin("org.scalameta"             % "sbt-scalafmt"       % "2.4.2")
addSbtPlugin("ch.epfl.scala"             % "sbt-scalafix"       % "0.9.28")
addSbtPlugin("io.github.davidgregory084" % "sbt-tpolecat"       % "0.1.19")
addSbtPlugin("com.timushev.sbt"          % "sbt-updates"        % "0.5.3")
