object Main extends App {
  // Tipos de datos
  // Scala es debilmente tipado
  // Val es constante
  // Var es dinamico

  val nombre = "Juan";
  val decimal = 1.3;
  val name: String = "nombre";

  var edad = 24;

  // Imprimir
  print(nombre + "tiene" + edad + "años");

  // Crear variables en modo Lazy
  lazy val x: Double = 1 / 0;

}
