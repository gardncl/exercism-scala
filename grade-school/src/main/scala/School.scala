import scala.collection._

class School {
  private val internalDb = scala.collection.mutable.Map[Int, Seq[String]]()

  def add(name: String, g: Int) = {
    val students = internalDb.getOrElseUpdate(g, List()) :+ name
    internalDb.put(g, students)
  }

  def db: Map[Int, Seq[String]] = internalDb.toMap

  def grade(g: Int): Seq[String] = db.getOrElse(g, Seq())

  def sorted: Map[Int, Seq[String]] =
    immutable.TreeMap(internalDb.mapValues(_.sorted).toSeq: _*)
}
