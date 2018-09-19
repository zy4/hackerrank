object Solution {

  def breakingRecords(scores: Array[Int]): Array[Int] = {
    val max = for {
      (s, i) <- scores.zipWithIndex
      if i > 0 && s > scores.splitAt(i)._1.max
    } yield {
      s
    }
    val min = scores.zipWithIndex
      .filter { case (s, i) => i > 0 && s < scores.splitAt(i)._1.min }
      .map(_._1)

    Array(max.length, min.length)
  }

  def main(args: Array[String]) {
    val stdin = scala.io.StdIn

    val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

    val n = stdin.readLine.trim.toInt

    val scores = stdin.readLine.split(" ").map(_.trim.toInt)
    val result = breakingRecords(scores)

    printWriter.println(result.mkString(" "))

    printWriter.close()
  }
}
