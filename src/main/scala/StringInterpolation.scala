object StringInterpolationExample {
  def main(args: Array[String]): Unit = {
    val name = "Alice"
    val age = 30
    val height = 1.65

    // String interpolation using s-interpolator
    val message1 = s"My name is $name. I am $age years old."
    println(message1)

    // String interpolation with expressions using s-interpolator
    val message2 = s"In 5 years, I will be ${age + 5} years old."
    println(message2)

    // String interpolation using f-interpolator (formatted)
    val message3 = f"My height is $height%.2f meters."
    println(message3)

    // String interpolation using raw-interpolator
    val rawString = "Hello\nWorld"
    val rawMessage = raw"Raw string: $rawString"
    println(rawMessage)
  }
}
