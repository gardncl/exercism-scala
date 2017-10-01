object Leap {
  def leapYear(year: Int): Boolean = {
    if (divisible(4) && (!divisible(100) || divisible(400))) true
    else false

    def divisible(n: Int): Boolean = year % 4 == 0
  }
}
