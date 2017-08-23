package main.scala.first_study

import sun.plugin2.jvm.RemoteJVMLauncher.CallBack

/*object ScalaFunction {
  /**
    * ************* () => Unit ******代表任何无参数，无返回值的函数
    * 右箭头‘=>’表明程序中存在一个匿名函数，箭头左边是匿名函数的参数列表，右边是函数体
    */
  def oncePreSecond(callback: () => Unit){
    while (true){
      callback();
      Thread sleep 1000;
    }
  }

  def timeFields(){
    println("time field-**************");
  }

  def main(args:Array[String]): Unit ={
    //函数式编程的特点，函数可以作为参数
    //oncePreSecond(timeFields);
    /**
      * 使用匿名函数
      */
    oncePreSecond(() => println("anonymous function test ********** time field-**************"));
  }*/



  //*****************************************/
  /*object Test {
    def main(args: Array[String]) {
      delayed(time(1));
    }

    def time(x:Int) = {
      println("获取时间，单位为纳秒")
      System.nanoTime
    }
    def delayed( t:  => Long ) = {
      println("在 delayed 方法内")
      println("参数： " + t)
    }*/



    //*******************************************/
    /*object Test {
      def main(args: Array[String]) {
        printStrings("Runoob", "Scala", "Python");
      }
      def printStrings( args:String* ) = {
        var i : Int = 0;
        for( arg <- args ){
          println("Arg value[" + i + "] = " + arg );
          i = i + 1;
        }
      }*/




      //************************************闭包
      object ScalaFunction {
        var factor = 3
        def main(args: Array[String]) {
          println( "muliplier(1) value = " +  multiplier(1) )
          println( "muliplier(2) value = " +  multiplier(2) )
        }
        val multiplier = (i:Int) => i * factor
    }
