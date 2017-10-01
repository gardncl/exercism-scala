object Bob {
  def response(statement: String): String = {
    if (statement.matches(shouting))
      "Whoa, chill out!"
    else if (statement.matches(question))
      "Sure."
    else if (statement.matches(address))
      "Fine. Be that way!"
    else
      "Whatever."
  }

  val shouting = "(?=.*[A-Z])[^a-z]*"
  val question = ".*[?]\\s*"
  val address = "\\s*"
}
