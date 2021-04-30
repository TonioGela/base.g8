package $organization;format="package"$

import munit.CatsEffectSuite

class $name;format="Camel"$Suite extends CatsEffectSuite {

  test("test $name;format="Camel"$ says \"Hello Cats\"") {
    $name;format="Camel"$.say().map(it => assertEquals(it, "Hello Cats!"))
  }
}