A [Giter8][https://github.com/foundweekends/giter8] template for [Cats-effect 3](https://typelevel.org/cats-effect/) with a lot of bells and whistles!

This template features:
- a strong `scalafmt` configuration
- a strong `scalafix` configuration + organize import rule
- an opinionated overridden base import with `cats._` and `cats.effect._` stuff
- `munit-cats-effect-3` as test framework
- `sbt-github-actions`, `sbt-tpolecat`, `sbt-updates` plugins
- `kind-projector`, `scala-typed-holes` and `better-monadic-for` compiler plugins
- everything in a way too modular configuration

...plus it should stay up to date with dependencies thanks to [Scala-Steward](https://github.com/scala-steward-org/scala-steward-action)