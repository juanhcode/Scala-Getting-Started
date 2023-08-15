object SimplePatternMatching extends App {

  // Example 1: Matching integers
  val number = 7
  val result1 = number match {
    case 0 => "Zero"
    case 1 => "One"
    case _ => "Other"
  }

  // Example 2: Matching characters
  val char = 'A'
  val result2 = char match {
    case 'A' => "Uppercase A"
    case 'a' => "Lowercase a"
    case _ => "Other character"
  }

  // Example 3: Matching boolean values
  val isTrue = true
  val result3 = isTrue match {
    case true => "It's true"
    case false => "It's false"
  }

  // Example 4: Matching multiple conditions
  val age = 25
  val result4 = age match {
    case x if x < 18 => "Underage"
    case x if x >= 18 && x < 65 => "Adult"
    case _ => "Senior"
  }

  // Printing results
  println(result1)
  println(result2)
  println(result3)
  println(result4)
}
