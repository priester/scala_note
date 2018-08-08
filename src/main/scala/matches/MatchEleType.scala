package matches

import scala.util.Random

object MatchEleType{
  def main(args:Array[String]):Unit= {
    val arr = Array("123", 100, true)
    val element = arr(Random.nextInt(arr.length))
    println(element)

    element match {
      case str: String => println("String")
      case int: Int => println("int")
      case bool: Boolean => println("bool")
      case _: Any => println("Not Matched")
    }
  }
}