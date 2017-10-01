object SumOfMultiples {
  def sum(factors: Set[Int], limit: Int): Int = {
    List.range(1, limit).filter(n => factors.exists( n % _==0 )).sum
  }
}

