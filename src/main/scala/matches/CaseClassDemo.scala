package matches



import scala.util.Random

object CaseClassDemo {
  def main (args: Array[String]): Unit = {

    var arr = Array(CheckTimeOutTask,SubmitTask("0007","task-00001"),HeartBeat(3000))

    arr(Random.nextInt(arr.length)) match {
      case CheckTimeOutTask => println ("CheckTimeOutTask")
      case HeartBeat(time) => println ("HeartBeat")
      case SubmitTask(post,task) => println ("SubmitTask")
    }
  }
}

case class HeartBeat(time:Long)
case class SubmitTask(id:String,task:String)
case object CheckTimeOutTask