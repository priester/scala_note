package collection

object classListDemo {

  def main(args: Array[String]): Unit = {
    //创建一个
    val list0 = List(1, 7, 9, 8, 0, 3, 5, 4, 6, 2)
    println(list0)
    //将list0中每个元素乘以10后生成一个新的集合
    val list1 = list0.map(_ * 10)
    println(list1)
    // 将list0中的偶数取出来生成一个新的集合
    val list2 = list0.filter(_ % 2 == 0)
    println(list2)
    // 将list0排序后生成一个新的集合
    println("3.")
    val list31 = list0.sorted
    val list32 = list0.sortBy(x => x)
    val list33 = list0.sortWith((x, y) => x < y)
    val list34 = list0.sortWith(_ < _)
    println(list31)
    println(list32)
    println(list33)
    println(list34)
    // 反转顺序
    println("4.")
    val list4 = list0.reverse
    println(list4)
    // 将list0中的元素4个一组,类型为Iterator[List[Int]]
    println("5.")
    val list5 = list0.grouped(4)
    val listx = list0.sliding(4, 4)
    println(list5)
    println(listx)
    // 将Iterator转换成List
    println("6.")
    val list6 = list5.toList
    println(list6)
    // 将多个list压扁成一个List
    println("7.*****")
    val list7 = list6.flatten
    println(list7)
    val lines = List("hello tom hello jerry", "hello jerry", "hello kitty")
    // 先按空格切分，在压平
    println("8.*****")
    val words = lines.flatMap(_.split(" "))
    println(words)
    // 并行计算求和
    println("9.")
    val sum = list0.sum
    //    val sum2 = list0.par.sum
    println(sum)
    //    println(sum2)

    // 化简：reduce    将非特定顺序的二元操作应用到所有元素
    println("10.")
    val red = list0.reduce(_ + _)
    val red2 = list0.reduce((x, y) => x + y)
    println(red)
    println(red2)
    // 将特定顺序的二元操作应用到所有元素
    println("11.")
    val red3 = list0.reduceLeft(_ + _)
    println(red3)

    // 折叠：有初始值（无特定顺序）
    //    val fol = list0.fold(0)(_+_)
    val arr2 = Array(1, 2, 4, 5, 6)
    val fol = arr2.fold(0)(_ + _)

    println(fol)

    // 折叠：有初始值（有特定顺序）
    // 聚合
    val arr = List(List(1, 2, 3), List(3, 4, 5), List(2), List(0))
    val l1 = List(5, 6, 4, 7)
    val l2 = List(1, 2, 3, 4)
    // 求并集
    val uni = l1.union(l2)
    println(uni)
    val uni2 = l1.union(l2).distinct
    println(uni2)
    // 求交集
    val its = l1.intersect(l2)
    println(its)
    // 求差集
    val dif = l1.diff(l2)
    println(dif)
    // println(r3)
  }

}
