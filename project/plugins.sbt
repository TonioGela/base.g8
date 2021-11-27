addSbtPlugin("org.foundweekends.giter8" %% "sbt-giter8"         % "0.13.1")
libraryDependencies += "org.scala-sbt"  %% "scripted-plugin"    % sbtVersion.value
// These are here for scala-steward
addSbtPlugin("com.codecommit"            % "sbt-github-actions" % "0.13.0")
addSbtPlugin("org.scalameta"             % "sbt-scalafmt"       % "2.4.4")
addSbtPlugin("ch.epfl.scala"             % "sbt-scalafix"       % "0.9.33")
addSbtPlugin("io.github.davidgregory084" % "sbt-tpolecat"       % "0.1.20")
addSbtPlugin("com.timushev.sbt"          % "sbt-updates"        % "0.6.0")
