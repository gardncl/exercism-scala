object SpaceAge {
  def onEarth(age: Double): Double = age / secondsInYear(365.25)
  def onMercury(age: Double): Double = age / secondsInYear(87.97)
  def onVenus(age: Double): Double = age / secondsInYear(224.7)
  def onMars(age: Double): Double = age / secondsInYear(1.88)
  def onJupiter(age: Double): Double = age / secondsInYear(11.86)
  def onSaturn(age: Double): Double = age / secondsInYear(29.46)
  def onUranus(age: Double): Double = age / secondsInYear(84.01)
  def onNeptune(age: Double): Double = age / secondsInYear(164.79)

  def secondsInYear(daysInYear: Double): Double = 24 * 60 * 60 * daysInYear
}
