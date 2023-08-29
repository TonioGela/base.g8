addSbtPlugin("org.foundweekends.giter8" %% "sbt-giter8"         % "0.16.2")
libraryDependencies += "org.scala-sbt"  %% "scripted-plugin"    % sbtVersion.value
// These are here for scala-steward
addSbtPlugin("com.codecommit"            % "sbt-github-actions" % "0.14.2")
addSbtPlugin("org.scalameta"             % "sbt-scalafmt"       % "2.5.1")
addSbtPlugin("ch.epfl.scala"             % "sbt-scalafix"       % "0.11.0")
addSbtPlugin("org.typelevel"             % "sbt-tpolecat"       % "0.5.0")
addSbtPlugin("com.timushev.sbt"          % "sbt-updates"        % "0.6.4")
