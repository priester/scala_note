package matches

import scala.util.Random

object MatchStr {
  def main(args:Array[String]):Unit= {
    val arr = Array("12","23","34","45")
    val res = arr(Random.nextInt(arr.length))
    println (res)

    res match {
      case "12"=> println("12...")
      case "23"=> println("23...")
      case "34"=> println("34...")
      case _ =>println("...")
    }
  }
}
