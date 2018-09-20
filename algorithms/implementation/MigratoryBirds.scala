object Solution {

  def migratoryBirds(arr: Array[Int]): Int = {
    arr.groupBy(identity).mapValues(_.length).maxBy(_._2)._1
  }

  def main(args: Array[String]) {
    val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

    val arrCount = StdIn.readLine.trim.toInt

    val arr =
      StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)
    val result = migratoryBirds(arr)

    printWriter.println(result)

    printWriter.close()
  }
}
