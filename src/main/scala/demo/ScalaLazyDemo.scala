package demo

/**
  * Created by fany on 2018/8/3.
  *
  * lazy 定义惰性变量，会实现延时加载，只有在调用时候才会实力化这个变量
  */
class ScalaLazyDemo {

}
object ScalaLazyDemo{
  def init ():Unit = {
    println("call init")
  }

  def main (args:Array[String]):Unit = {
    val property = init()
    println ("after init")
    println(property)
  }
}

object ScalaLazyDemo2{
  def init ():Unit = {
    println("call init")
  }

  def main (args:Array[String]):Unit = {
    lazy val property = init()
    println ("after init")
    println(property)
  }
}