package fanxin

class UpperBoundDemo[T <: Comparable[T]] {
  def select(first:T ,second:T):T={
    if(first.compareTo(second)>0)first else second
  }
}

object UpperBoundDemo{
  def main (args: Array[String]): Unit = {

    val u = new UpperBoundDemo[MissRight]
    val m1 = new MissRight("xh",1)
    val m2 = new MissRight("xm",2)
    val res =  u.select(m1,m2)
    println(res.name)
  }
}

class MissRight(val name :String,val faceValue:Int) extends Comparable[MissRight]{
  override def compareTo (o: MissRight): Int =
    this.faceValue -o.faceValue
}