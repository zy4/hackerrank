object Solution {

  def staircase(n: Int) {
    for (i <- 1 to n)
      println(
        (scala.List.fill(n - i)(" ") ::: scala.List.fill(i)("#")).mkString)
  }

  def main(args: Array[String]) {
    val stdin = scala.io.StdIn

    val n = stdin.readLine.trim.toInt

    staircase(n)
  }

}
