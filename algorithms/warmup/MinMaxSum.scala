object Solution {

  def miniMaxSum(arr: Array[Int]) {
    val res = (for ((v, i) <- arr.zipWithIndex) yield {
      arr.indices.collect { case x if x != i => arr(x) }.toArray
    }).map(_.map(_.toLong)).map(_.sum)
    println(s"${res.min} ${res.max}")
  }

  def main(args: Array[String]) {
    val stdin = scala.io.StdIn

    val arr = stdin.readLine.split(" ").map(_.trim.toInt)
    miniMaxSum(arr)
  }
}
