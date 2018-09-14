object Solution {

  def plusMinus(arr: Array[Int]) {
    val negPos = arr.partition(_ < 0)
    val pos = negPos._2.partition(_ > 0)
    println(pos._1.length / arr.length.toDouble)
    println(negPos._1.length / arr.length.toDouble)
    println(pos._2.length / arr.length.toDouble)
  }

  def main(args: Array[String]) {
    val stdin = scala.io.StdIn

    val n = stdin.readLine.trim.toInt

    val arr = stdin.readLine.split(" ").map(_.trim.toInt)
    plusMinus(arr)
  }
}
