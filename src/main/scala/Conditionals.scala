object ConditionalsAndTernaryOperator extends App {

  // if Statements

  val age = 18

  if (age >= 18) {
    println("You are of legal age")
  }

  // if-else Statements

  val score = 75

  if (score >= 70) {
    println("You passed the exam")
  } else {
    println("You did not pass the exam")
  }

  // Ternary Operator

  val number = 5
  val result = if (number > 0) "Positive" else "Negative"

  println(s"The number $number is $result")
}
