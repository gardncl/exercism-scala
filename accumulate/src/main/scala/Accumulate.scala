class Accumulate {
  def accumulate[A, B](f: (A) => B, list : List[A]): List[B] = {
    list match {
      case h :: tail => f(h) :: accumulate(f, tail)
      case _ => List.empty
    }
  }
}