addSbtPlugin("org.foundweekends.giter8" %% "sbt-giter8"         % "0.15.0")
libraryDependencies += "org.scala-sbt"  %% "scripted-plugin"    % sbtVersion.value
// These are here for scala-steward
addSbtPlugin("com.codecommit"            % "sbt-github-actions" % "0.14.2")
addSbtPlugin("org.scalameta"             % "sbt-scalafmt"       % "2.4.6")
addSbtPlugin("ch.epfl.scala"             % "sbt-scalafix"       % "0.10.1")
addSbtPlugin("io.github.davidgregory084" % "sbt-tpolecat"       % "0.4.1")
addSbtPlugin("com.timushev.sbt"          % "sbt-updates"        % "0.6.3")
