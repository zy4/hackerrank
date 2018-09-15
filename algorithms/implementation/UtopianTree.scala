object Solution {

  def utopianTree(n: Int): Int = {
    (0 until n).foldLeft(1) { (acc, x) =>
      if (x % 2 == 0) {
        acc * 2
      } else {
        acc + 1
      }
    }
  }

  def main(args: Array[String]) {
    val stdin = scala.io.StdIn

    val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

    val t = stdin.readLine.trim.toInt

    for (tItr <- 1 to t) {
      val n = stdin.readLine.trim.toInt

      val result = utopianTree(n)

      printWriter.println(result)
    }

    printWriter.close()
  }
}
