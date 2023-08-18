object StringMethodsExample {
  val str = "Hello, Scala Programming!"

  // Length of the string
  val length = str.length
  println(s"Length of the string: $length")

  // Convert to uppercase and lowercase
  val upperCase = str.toUpperCase
  val lowerCase = str.toLowerCase
  println(s"Uppercase: $upperCase")
  println(s"Lowercase: $lowerCase")

  // Substring
  val substring = str.substring(7, 12)
  println(s"Substring: $substring")

  // Replace
  val replaced = str.replace("Scala", "Java")
  println(s"Replaced: $replaced")

  // Split
  val words = str.split(" ")
  println(s"Words: ${words.mkString(", ")}")

  // Starts with and ends with
  val startsWithHello = str.startsWith("Hello")
  val endsWithProgramming = str.endsWith("Programming!")
  println(s"Starts with 'Hello': $startsWithHello")
  println(s"Ends with 'Programming!': $endsWithProgramming")

  // Index of and last index of
  val indexScala = str.indexOf("Scala")
  val lastIndexComma = str.lastIndexOf(",")
  println(s"Index of 'Scala': $indexScala")
  println(s"Last index of ',': $lastIndexComma")
}
