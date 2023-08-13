object RelationalAndLogicalOperators extends App {

  // Relational Operators

  val a = 10
  val b = 20

  val equal = a == b        // Equal to
  val notEqual = a != b     // Not equal to
  val greaterThan = a > b   // Greater than
  val lessThan = a < b      // Less than
  val greaterOrEqual = a >= b // Greater than or equal to
  val lessOrEqual = a <= b    // Less than or equal to

  println(s"Relational Operators:")
  println(s"$a == $b: $equal")
  println(s"$a != $b: $notEqual")
  println(s"$a > $b: $greaterThan")
  println(s"$a < $b: $lessThan")
  println(s"$a >= $b: $greaterOrEqual")
  println(s"$a <= $b: $lessOrEqual")

  // Logical Operators

  val x = true
  val y = false

  val AND = x && y     // Logical AND
  val OR = x || y      // Logical OR
  val NOT_X = !x       // Logical NOT for x
  val NOT_Y = !y       // Logical NOT for y

  println(s"\nLogical Operators:")
  println(s"$x && $y: $AND")
  println(s"$x || $y: $OR")
  println(s"!$x: $NOT_X")
  println(s"!$y: $NOT_Y")
}

