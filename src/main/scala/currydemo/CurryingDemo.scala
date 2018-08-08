package currydemo

object CurryingDemo {
  def m1(str :String)(implicit  name :String ="scala") ={
    str + name
  }

  def main (args: Array[String]): Unit = {
    import Context.a
    println(m1("hi ! "))
  }
}
