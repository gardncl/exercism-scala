object Hamming {
  def distance(a: String, b: String): Option[Int] = {
    val equalLength = a.length == b.length
    equalLength match {
      case true => Some(count(a,b))
      case false => None
    }
  }

  private def count(a: String, b: String): Int = {
    (a, b)
      .zipped
      .filter((a, b) => a != b)
      ._1.length
  }
}
