object Solution {

  def divisibleSumPairs(n: Int, k: Int, ar: Array[Int]): Int = {
    (for {
      i <- 0 until n
      j <- 0 until n
      if i < j && (ar(i) + ar(j)) % k == 0
    } yield {
      (i, j)
    }).length
  }

  def main(args: Array[String]) {
    val stdin = scala.io.StdIn

    val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

    val nk = stdin.readLine.split(" ")

    val n = nk(0).trim.toInt

    val k = nk(1).trim.toInt

    val ar = stdin.readLine.split(" ").map(_.trim.toInt)
    val result = divisibleSumPairs(n, k, ar)

    printWriter.println(result)

    printWriter.close()
  }

}
