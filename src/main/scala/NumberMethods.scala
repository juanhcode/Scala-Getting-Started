object NumberMethodsExample {
  def main(args: Array[String]): Unit = {
    val num = 42.75

    // Absolute value
    val absValue = num.abs
    println(s"Absolute value: $absValue")

    // Ceiling and floor
    val ceilValue = num.ceil
    val floorValue = num.floor
    println(s"Ceiling value: $ceilValue")
    println(s"Floor value: $floorValue")

    // Rounding
    val roundedValue = num.round
    println(s"Rounded value: $roundedValue")

    // Maximum and minimum
    val maxNumber = num.max(10)
    val minNumber = num.min(50)
    println(s"Maximum value between $num and 10: $maxNumber")
    println(s"Minimum value between $num and 50: $minNumber")

    // Exponentiation and power
    val squaredValue = num * num
    val cubedValue = math.pow(num, 3)
    println(s"Square of $num: $squaredValue")
    println(s"Cube of $num: $cubedValue")

    // Trigonometric functions
    val sineValue = math.sin(num)
    val cosineValue = math.cos(num)
    val tangentValue = math.tan(num)
    println(s"Sine of $num: $sineValue")
    println(s"Cosine of $num: $cosineValue")
    println(s"Tangent of $num: $tangentValue")

    // Conversions between radians and degrees
    val radians = math.toRadians(45)
    val degrees = math.toDegrees(math.Pi / 4)
    println(s"45 degrees in radians: $radians")
    println(s"π/4 radians in degrees: $degrees")
  }
}
