package demo

object WordCount {
  def main(args:Array[String]):Unit= {
      val lines = List("hello java" ,"hello python","hello scala")

      val words = lines.flatMap(_.split(" "))
      println (words)

      val tuples = words.map((_,1))
      println (tuples)

      val grouped =  tuples.groupBy(_._1)
      println (grouped)

      val sumed = grouped.mapValues(_.size)
      println(sumed)

      val sorted = sumed.toList.sortBy(_._2)
      println(sorted)

      val result = sorted.reverse
      println(result)
  }
}
