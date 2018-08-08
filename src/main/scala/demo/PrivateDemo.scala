package demo

//类名前加private关键字，包名权限
private[demo] class PrivateDemo private( var age: Int) {
  private val name = "xx"
  //对象私有字段
  private[this] val ale: Int = 24

  private def SayHello(): Unit = {
    println( name + " say  hello")
  }
}

object PrivateDemo {
  def main(args: Array[String]): Unit = {
    val demo = new PrivateDemo( 90)
    demo.SayHello()
  }
}
