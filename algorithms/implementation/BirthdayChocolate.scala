object Solution {

  def birthday(s: Array[Int], d: Int, m: Int): Int = {
    s.zipWithIndex.count { case (_, i) => s.slice(i, i + m).sum == d }
  }

  def main(args: Array[String]) {
    val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

    val n = StdIn.readLine.trim.toInt

    val s = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)
    val dm = StdIn.readLine.replaceAll("\\s+$", "").split(" ")

    val d = dm(0).toInt

    val m = dm(1).toInt

    val result = birthday(s, d, m)

    printWriter.println(result)

    printWriter.close()
  }

}
