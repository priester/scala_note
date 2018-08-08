package matches

object PartialFunctionDemo {
  def m1: PartialFunction[String,Int] = {
    case "one" => println("case 1")
      1
    case "two"=> println("case 2")
      2
  }

  def m2 (s :String): Int =s match {
    case "one" => println("case 1")
      1
    case "two"=> println("case 2")
      2
  }

  def main (args: Array[String]): Unit = {
    println(m1("one"))
    println(m2("one"))
  }
}
