package dev.toniogela

import weaver.*
import cats.syntax.all.*

object $name;format="Camel"$Suite extends SimpleIOSuite {

  test("$name;format="Camel"$ says \"Hello Cats Effect!\"")(
    Effectfool.say().map(it => expect(it === "Hello Cats Effect!"))
  )
}