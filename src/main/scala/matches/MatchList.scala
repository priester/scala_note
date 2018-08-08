package matches


object MatchList {
  def main (args: Array[String]): Unit = {

    //    val arr = Array(1, 2, 3, 4)
    //    arr match {
    //      case Array(_, x, y) => println(s"case $x $y")
    //      case Array(1, a, b, c) => println(s"case $a $b $c")
    //      case _ => println("not match")
    //    }

    //    val tup =(2,3,4)
    //
    //    tup match{
    //      case (2,a,b)=> println(s"case: $a $b")
    //      case _ => println("not match")
    //    }

    val list = List(0, 1, 2, 4)

    list match {
      case 0 :: Nil => println("case1: 0")
      case a :: b :: c :: d :: Nil => println(s"case2: $a $b $c $d")
      case 0 :: a => println(s"case3: $a")
      case _ => println("Not Matched")
    }
  }
}
