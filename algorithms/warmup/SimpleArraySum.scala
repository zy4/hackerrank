import java.io.PrintWriter

object Solution {

  def simpleArraySum(ar: Array[Int]): Int = {
    ar.fold(0) { (z, i) =>
      z + i
    }
  }

  def main(args: Array[String]) {
    val stdin = scala.io.StdIn

    val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

    val arCount = stdin.readLine.trim.toInt

    val ar = stdin.readLine.split(" ").map(_.trim.toInt)
    val result = simpleArraySum(ar)

    printWriter.println(result)

    printWriter.close()
  }
}
