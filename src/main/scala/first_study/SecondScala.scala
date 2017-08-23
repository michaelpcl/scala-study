package main.scala.first_study

class SecondScala (val xc:Int,val xd:Int){
  var x:Int = xc;
  var y:Int = xd;
  def move(dx:Int,dy:Int){
    x = x + dx;
    y = y + dy;
    println("x的值：" + x);
    println("y的值：" + y);
  }
}

class Location(override val xc:Int, override val xd :Int, val xz:Int) extends SecondScala(xc,xd){
  var z: Int = xz;

  def move(dx: Int, dy: Int, dz: Int) {
    x = x + dx
    y = y + dy
    z = z + dz
    println ("x 的坐标点 : " + x);
    println ("y 的坐标点 : " + y);
    println ("z 的坐标点 : " + z);
  }
}

object test{
  def main(args:Array[String]): Unit ={
    var loca = new Location(10,20,35)
    loca.move(5,5,5);
  }
}



