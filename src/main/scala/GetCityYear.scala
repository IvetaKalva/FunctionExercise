object GetCityYear extends App {
  def getCityYear(p0: Double, perc: Double, delta: Int, p: Int): Int = {
    var count: Double = p0
    var yearCount: Int = 0
    while (p0 <= count) {
      count += (count * (perc * 0.01)) + delta
      yearCount += 1
      if (count >= p) return yearCount
    }
    return -1
  }
  println(getCityYear(1000,2,50,1200)) //should print 3
  println(getCityYear(1000,2,-50,1200)) //should print -1
  println(getCityYear(1500000,2.5,10000,2000000)) //should print 10
}