object Solution {

  def birthdayCakeCandles(ar: Array[Int]): Int = {
    val max = ar.max
    ar.map(_.toLong).filterNot(_ != max).length
  }

  def main(args: Array[String]) {
    val stdin = scala.io.StdIn

    val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

    val arCount = stdin.readLine.trim.toInt

    val ar = stdin.readLine.split(" ").map(_.trim.toInt)
    val result = birthdayCakeCandles(ar)

    printWriter.println(result)

    printWriter.close()
  }

}
