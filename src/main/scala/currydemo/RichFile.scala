package currydemo

import scala.io.Source


class RichFile (val file: String) {
  def read (): String = {
    Source.fromFile(file).mkString
  }
}

object RichFile {
  def main (args: Array[String]): Unit = {
    //这个过程是显示的实现read方法

    val file = "C:\\Users\\fany\\IdeaProjects\\scala_note\\src\\main\\scala\\currydemo\\test"
    //    val content :String  = new RichFile(file).read()
    //    println(content)

    import MyPredef.fileToRichFile
    val content= file.read()
    println(content)
    //

  }
}
