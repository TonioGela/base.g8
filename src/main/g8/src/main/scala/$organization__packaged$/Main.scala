package $organization;format="package"$

object Main extends IOApp.Simple {
  def run: IO[Unit] = $name;format="Camel"$.say().flatMap(IO.println)
}
