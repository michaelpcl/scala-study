package main.scala.first_study

object ScalaCollection {

  def main(args:Array[String]): Unit ={
    /**
      * 数组
      */
    //数组定义1
    var z:Array[String] = new Array[String](3)
    z(0) = "Runoob"
    z(1) = "Baidu"
    z(2) = "Google"
    for(s <- z){
      println("******"+ s);
    }

    //数组定义2
    var tempArray = Array("111","222","333");
    for(i <- tempArray){
      println("******"+ i);
    }


    /**
      * 列表操作
      */
    //列表的定义1
    var site :List[String] = List("aaa","bbb","ccc");
    println("first method***********"+ site);

    //列表的定义2
    var site2 = "aaa" :: ("bbb" :: ("ccc" :: Nil));
    println("second method***********"+ site2);

    //列表定义3（不指定数据类型）
    var site3 = List("fff","ggg","hhh","jjj");

    //列表函数操作
    println(site3.head);//输出首元素
    println(site3.tail);//输出除了首元素以外的元素

    //列表连接的几种形式
    var tempSite12 = site ::: site2;
    println(tempSite12);
    var tempSite13 = site.:::(site3);
    println(tempSite13);
    var tempSite23 = List.concat(site2,site3);
    println(tempSite23);



    /**
      * set集合操作
      *
      */
    //set定义
    var testSet = Set("qwe","asd","zxc");
    println("set*************" + testSet);
    var set11 = Set(12,21,30,35,50,60,65,70);
    var set22 = Set(10,20,30,40,55,65,80);

    //set的连接操作
    var setTemp  =  set11 .++ (set22);
    println("set的连接方式1*****" + setTemp);
    var setTemp2 = set11 ++ set22;
    println("set的连接方式2*****" + setTemp2);

    //set操作
    testSet += "111";
    println("set添加后的*************" + testSet);

    testSet -= "asd";
    println("set移出后的*************" + testSet);

    //交集
    //var setTemp3 = set11.& (set22);
    var setTemp3 = set11.intersect(set22);
    println("set1 set2的交集和*****" + setTemp3);


    /**
      * map操作
      *
      */
    //map的定义
    var mm1 :Map[String,String] = Map();
    var mm111 = Map("s1" -> 1,"s2" -> 2,"s3" -> 3,"s4" -> 4,"s5" -> 5);

    var mm2 :Map[String,String] = Map();
    var mm222 : Map[String,Int] = Map();

    //新增操作
    mm1 += ("id1" -> "001");
    mm1 += ("id2" -> "002");
    mm1 += ("id3" -> "003");
    mm1 += ("id4" -> "004");
    mm1 += ("id5" -> "005");

    mm2 += ("id6" -> "006");
    mm2 += ("id7" -> "007");
    mm2 += ("id8" -> "008");
    mm2 += ("id9" -> "009");
    mm2 += ("id10" -> "0010");

    mm222 += ("s6" -> 6);
    mm222 += ("s7" -> 7);
    mm222 += ("s8" -> 8);
    mm222 += ("s9" -> 9);
    mm222 += ("s10" -> 10);

    println("map的key*********" + mm1.keys);
    println("map的key*********" + mm111.values);

    //map的合并
    var mmTemp12 = mm1 ++ mm2;
    var mmTemp111222 = mm111.++ (mm222);
    println("mmTemp12的key*********" + mmTemp12.keys);
    println("mmTemp111222的key*********" + mmTemp111222.values);

    //遍历map
    mmTemp12.keys.foreach{
      i =>
      println("key is:" + i) ;
      println("value is" + mmTemp12(i));
    }


    /**
      * 元组操作
      * 元组是可以包含不用类型的元素的集合
      * tuple中的元素最多为22个
      */
    //tuple的定义
    var tup1 = (false,10,23.55,"aaa");
    var tup2 = new Tuple6(10,20,33.56,"SSS","EEE",false);
    //使用 t._1 访问第一个元素， t._2 访问第二个元素
    println("tuple的元组" + tup1._1 + "******" + tup1._2);
    println("**********" + tup2);

    //迭代输出全部元素
    tup1.productIterator.foreach{
      i =>
      println("tup1 element is******" + i);
    }
    tup2.productIterator.foreach{
      i =>
        println("tup2 element is******" + i);
    }


    /**
      * option
      */




    /**
      * 迭代器
      * iterator
      */
    var it1 = Iterator("www",11,"sss");
    var it2 = Iterator(2,5,6,30,45,4,77,90,0);
    //输出结果
    while(it1.hasNext){
      println("*******" + it1.next());
    }
    println("max**********" + it2.max);
    println("min**********" + it2.min);
  }

}
