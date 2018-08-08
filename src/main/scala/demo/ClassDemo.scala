package demo

object ClassDemo {

  def main(args: Array[String]):Unit= {
    val hunam = new Human
    println(hunam.name)
    println(hunam.fight)
  }

}
trait Flyable{
  //声明一个没有值的字段
  val distance:Int
  //声明一个没有实现的方法
  def fight:String
  //声明一个实现的方法
  def fly: Unit = {
    println("I can fly")
  }
}
abstract class Animal{
  val name :String
  def run():String
  def climb: Unit ={
    print ("I can  climb")
  }
}

class Human extends Animal with Flyable{
  override val name: String = "小明"

  override def run(): String = "I can run "

  override val distance: Int = 10

  override def fight: String = "I can fight"
}