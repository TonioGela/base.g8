package dev.toniogela

import cats.effect.*

object $name; format = "Camel" $ { 
    def say(): IO[String] = IO.delay("Hello Cats Effect!") 
}
