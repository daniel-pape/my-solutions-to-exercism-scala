object DifferenceOfSquares {
  def square(k: Int): Int = k * k

  def sumOfSquares(n: Int): Int = Range.inclusive(1, n).map(square).sum

  def squareOfSum(n: Int): Int = square(Range.inclusive(1, n).sum)

  def differenceOfSquares(n: Int): Int = squareOfSum(n) - sumOfSquares(n)
}
