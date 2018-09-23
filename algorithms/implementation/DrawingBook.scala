object Solution {

  def pageCount(n: Int, p: Int): Int = {
    val forward = ((p - (p % 2)) / 2) :: Nil
    val backward = ((n - (n % 2)) / 2) - forward.head :: Nil
    (forward ::: backward).min
  }

  def main(args: Array[String]) {
    val stdin = scala.io.StdIn

    val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

    val n = stdin.readLine.trim.toInt

    val p = stdin.readLine.trim.toInt

    val result = pageCount(n, p)

    printWriter.println(result)

    printWriter.close()
  }
}
