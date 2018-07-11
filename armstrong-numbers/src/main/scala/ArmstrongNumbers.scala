object ArmstrongNumbers {
  def isArmstrongNumber(x: Int): Boolean = {
    val digits = x.toString.split("").map(_.toInt)
    val num_digits = digits.length
    val armstrongSum = digits.map(d => Math.pow(d, num_digits)).sum

    armstrongSum == x
  }
}
