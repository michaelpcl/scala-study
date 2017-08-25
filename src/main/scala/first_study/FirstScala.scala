package main.scala.first_study

class FirstScala(real: Double, imaginary: Double) {
  def re = real
  def im = imaginary
  override def toString() =
    "" +re + (
      if (im < 0) ""
      else "+") + im + "i"
}



