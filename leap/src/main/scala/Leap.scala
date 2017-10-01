object Leap {
  def leapYear(year: Int): Boolean = {
    divisible(4) && (!divisible(100) || divisible(400))

    def divisible(n: Int): Boolean = year % 4 == 0
  }
}
