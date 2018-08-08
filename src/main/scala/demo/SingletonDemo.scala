package demo

import scala.collection.mutable.ArrayBuffer

/**
  * 单例模式
  * 工具类
  * 单利对象
  */
object SingletonDemo {

  def main(args: Array[String]): Unit = {
    val factory = SessionFactory
    println(factory.getSessions)
    println(factory.getSessions.size)
    factory.removeSession
    println(factory.getSessions)
  }
}

object SessionFactory {
  println("ok...")
  var i = 5
  var sessions = new ArrayBuffer[Session]()

  def getSessions = sessions

  def removeSession = {
    val s = sessions(0)
    sessions.remove(0)
    println("remove" + s)
  }

  while (i > 0) {
    sessions += new Session
    i -= 1
  }
}

class Session {

}
