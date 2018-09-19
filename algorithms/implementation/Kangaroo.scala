object Solution {

  def kangaroo(x1: Int, v1: Int, x2: Int, v2: Int): String = {
    val q = (x2.toDouble - x1.toDouble) / (v1.toDouble - v2.toDouble)
    val answer = (v1 == v2 && x1 == x2) || (v1 != v2 && q >= 0 && Math.floor(q) == Math
      .ceil(q))
    if (answer) "YES" else "NO"
  }

  def main(args: Array[String]) {
    val stdin = scala.io.StdIn

    val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

    val x1V1X2V2 = stdin.readLine.split(" ")

    val x1 = x1V1X2V2(0).trim.toInt

    val v1 = x1V1X2V2(1).trim.toInt

    val x2 = x1V1X2V2(2).trim.toInt

    val v2 = x1V1X2V2(3).trim.toInt

    val result = kangaroo(x1, v1, x2, v2)

    printWriter.println(result)

    printWriter.close()
  }
}
