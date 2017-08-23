package main.scala.first_study
import main.scala.first_study.FirstScala

object HelloWord {
  def main(args:Array[String]): Unit ={
    println("hello word -********************");

    var firstScala = new FirstScala(1.5,5.5);
    println(firstScala.re);
    println(firstScala.im);
    println(firstScala.toString());
  }
}
