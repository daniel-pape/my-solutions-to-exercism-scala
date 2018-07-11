class Bob {
  def hey(phrase: String) = {
    def isQuestion = phrase.endsWith("?")
    def isShouted = phrase.toUpperCase == phrase
    def isNothingSaid = phrase.trim.isEmpty

    val answer = if (isNothingSaid) {
      "Fine. Be that way!"
    } else if (isQuestion) {
      "Sure."
    } else if (isShouted) {
      "Whoa, chill out!"
    } else {
      "Whatever."
    }

    answer
  }
}

