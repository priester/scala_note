package demo

/**
  * 类和伴生对象可以访问互相访问私有方法和属性
  */
class Person {
  val id :String = "100"
  var name:String = _
  //private 只有本类 及伴生对象访问到
  private var age:Int = 0
  //只有自己能访问
  private[this] val gender= "n"

  def printTestName(): Unit ={
    println(Person.test)
  }
}

//已类名相同，并且用object修饰
object Person {
  private val test = "test"
  def main(args: Array[String]):Unit= {
    val p = new Person()
    p.printTestName()
    p.name="小明"
    p.age=5
    println(p.age)
  }
}
object Test1 {

}