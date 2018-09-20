object Solution {

  def sockMerchant(n: Int, ar: Array[Int]): Int = {
    ar.groupBy(identity)
      .collect { case (x, ys) if ys.lengthCompare(1) > 0 => x }
      .map { n =>
        (n, ar.count(_ == n))
      }
      .map {
        case (_, count) => (count - (count % 2)) / 2
      }
      .sum
  }

  def main(args: Array[String]) {
    val stdin = scala.io.StdIn

    val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

    val n = stdin.readLine.trim.toInt

    val ar = stdin.readLine.split(" ").map(_.trim.toInt)
    val result = sockMerchant(n, ar)

    printWriter.println(result)

    printWriter.close()
  }
}
