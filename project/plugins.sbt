addSbtPlugin("org.foundweekends.giter8" %% "sbt-giter8"            % "0.18.0")
libraryDependencies += "org.scala-sbt"            %% "scripted-plugin" % sbtVersion.value
// These are here for scala-steward
addSbtPlugin("org.typelevel"             % "sbt-typelevel"         % "0.8.5")
addSbtPlugin("org.typelevel"             % "sbt-typelevel-mergify" % "0.8.5")
addSbtPlugin("org.typelevel"             % "sbt-tpolecat"          % "0.5.3")
addSbtPlugin("org.scalameta"             % "sbt-scalafmt"          % "2.6.0")
addSbtPlugin("ch.epfl.scala"             % "sbt-scalafix"          % "0.14.6")
