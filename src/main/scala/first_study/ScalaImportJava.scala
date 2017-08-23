package main.scala.first_study

import java.text.SimpleDateFormat
import java.util.Date

object ScalaImportJava {
  def main(args:Array[String]): Unit ={
    var sdf = new SimpleDateFormat("yyyy-MM-DD HH:mm:ss");
    var dateStr = sdf.format(new Date());
    var tempStr = "I have a dream";
    var result = tempStr.split(" ");
    for(i<-result){
        println(i);
        if(i.equals("dream")){
          println("************" + i.substring(3,5));
        }
    }
    println(dateStr);

    //变量声明1
    var num:Int = 2;
    println("***"+num);
    var str:String ="beautiful girl"
    println("***"+str);

    //变量声明2
    var a,b,c:Int = 500;

    var tup = (2,"ss",false);
    println(tup._1);
    println(tup._2);
    println(tup._3);




  }
}
