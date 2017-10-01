object SpaceAge {
  def onMercury(age: Double): Double = earthAge(age, .24)
  def onVenus(age: Double): Double = earthAge(age, 0.62)
  def onEarth(age: Double): Double = earthAge(age, 1)
  def onMars(age: Double): Double = earthAge(age, 1.88)
  def onJupiter(age: Double): Double = earthAge(age, 11.86)
  def onSaturn(age: Double): Double = earthAge(age, 29.46)
  def onUranus(age: Double): Double = earthAge(age, 84.01)
  def onNeptune(age: Double): Double = earthAge(age, 164.79)

  private val earthOrbit: Double = 365.25
  private def earthAge(age: Double, seconds: Double): Double = age / secondsInYear(seconds)
  private def secondsInYear(orbitComparedToEarth: Double): Double = 24 * 60 * 60 * (orbitComparedToEarth * earthOrbit)
}
