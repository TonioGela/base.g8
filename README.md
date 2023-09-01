![GitHub Workflow Status](https://img.shields.io/github/actions/workflow/status/TonioGela/base.g8/ci.yml?branch=main) ![GitHub last commit](https://img.shields.io/github/last-commit/TonioGela/base.g8) ![GitHub](https://img.shields.io/github/license/TonioGela/base.g8) [![Scala Steward badge](https://img.shields.io/badge/Scala_Steward-helping-blue.svg?style=flat&logo=data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAA4AAAAQCAMAAAARSr4IAAAAVFBMVEUAAACHjojlOy5NWlrKzcYRKjGFjIbp293YycuLa3pYY2LSqql4f3pCUFTgSjNodYRmcXUsPD/NTTbjRS+2jomhgnzNc223cGvZS0HaSD0XLjbaSjElhIr+AAAAAXRSTlMAQObYZgAAAHlJREFUCNdNyosOwyAIhWHAQS1Vt7a77/3fcxxdmv0xwmckutAR1nkm4ggbyEcg/wWmlGLDAA3oL50xi6fk5ffZ3E2E3QfZDCcCN2YtbEWZt+Drc6u6rlqv7Uk0LdKqqr5rk2UCRXOk0vmQKGfc94nOJyQjouF9H/wCc9gECEYfONoAAAAASUVORK5CYII=)](https://scala-steward.org)

 
A [Giter8](https://github.com/foundweekends/giter8) template for [Cats-effect 3](https://typelevel.org/cats-effect/) with a lot of bells and whistles!

This template features:
- a strong `scalafmt` configuration
- a strong `scalafix` configuration + organize import rule
- an opinionated overridden base import with `cats._` and `cats.effect._` stuff
- `munit-cats-effect-3` as test framework
- `sbt-github-actions`, `sbt-tpolecat`, `sbt-updates` plugins
- `kind-projector`, `scala-typed-holes` and `better-monadic-for` compiler plugins
- everything in a way too modular configuration

...plus it should stay up to date with dependencies thanks to [Scala-Steward](https://github.com/scala-steward-org/scala-steward-action)
