package demo

class StructDemo(val name: String, var age: Int, faceValue: Int) {
  var gender :String = _

  def getFaceValve(): Int ={
    faceValue
  }
  //辅助构造器
  def this(name: String, age: Int, faceValue: Int,gender :String){
    this(name ,age ,faceValue)
    this.gender = gender
  }
}

object StructDemo {
  def main(args: Array[String]): Unit = {
    val s = new StructDemo("xx", 21, 8)
    s.age = 22
    println(s.name)
    println(s.age)
    println(s.getFaceValve())

    val p = new StructDemo("小红",2,2,gender = "n")
    println(p.gender)
  }
}
