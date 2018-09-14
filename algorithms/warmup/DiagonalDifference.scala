import java.io._
import java.math._
import java.security._
import java.text._
import java.util._
import java.util.concurrent._
import java.util.function._
import java.util.regex._
import java.util.stream._

object Solution {

  def diagonalDifference(arr: Array[Array[Int]]): Int = {
    val diag1 = (for {
      (i, j) <- arr.zipWithIndex
      (f, g) <- i.zipWithIndex
      if j == g
    } yield {
      f
    }).sum
    val diag2 = (for {
      (i, j) <- arr.reverse.zipWithIndex
      (f, g) <- i.zipWithIndex
      if j == g
    } yield {
      f
    }).sum
    Math.abs(diag1 - diag2)
  }

  def main(args: Array[String]) {
    val stdin = scala.io.StdIn

    val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

    val n = stdin.readLine.trim.toInt

    val arr = Array.ofDim[Int](n, n)

    for (i <- 0 until n) {
      arr(i) = stdin.readLine.split(" ").map(_.trim.toInt)
    }

    val result = diagonalDifference(arr)

    printWriter.println(result)

    printWriter.close()
  }
}
