package dev.toniogela

import cats.effect.*

object Main extends IOApp.Simple {
  def run: IO[Unit] = $name;format="Camel"$.say().flatMap(IO.println)
}
