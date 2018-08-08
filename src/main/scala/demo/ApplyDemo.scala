package demo

/**
  * apply 方法通常称为注入方法，在伴生对象做初始化操作
  * apply 方法的参数不需要和构造器的参数列表统一
  * unallpy方法通常称为提取方法，使用unapply方法来提取固定数量的对象
  * unallpy会返回一个序列（Option），内部生产一个Some对象来存放一些值
  * apply方法和unapply 会被隐式的调用
  * @param name
  * @param age
  * @param faceValue
  */
class ApplyDemo(val name: String, var age: Int, var faceValue: Int) {
}

object ApplyDemo {
  def apply(name: String, age: Int, faceValue: Int): ApplyDemo =
    new ApplyDemo(name, age, faceValue)

  def unapply(applyDemo: ApplyDemo): Option[(String, Int, Int)] = {
    if (applyDemo == null) {
      None
    } else {
      Some(applyDemo.name, applyDemo.age, applyDemo.faceValue)
    }
  }
}

object Test {
  def main(args: Array[String]): Unit = {
    val applyDemo = ApplyDemo("xx", 21, 12)
    applyDemo match {
      case ApplyDemo("xx", age, faceValue) => println(s"age :$age")
      case _ => println("No")
    }
  }
}