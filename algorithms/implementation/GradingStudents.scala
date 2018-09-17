object Solution {

  def gradingStudents(grades: Array[Int]): Array[Int] = {
    grades.collect {
      case i: Int =>
        i match {
          case j if j >= 38 && j % 5 >= 3 => j + 5 - (j % 5)
          case _                          => i
        }
    }
  }

  def main(args: Array[String]) {
    val scan = scala.io.StdIn

    val fw = new PrintWriter(sys.env("OUTPUT_PATH"))

    val n = scan.readLine.trim.toInt

    val grades = Array.ofDim[Int](n)

    for (gradesItr <- 0 until n) {
      val gradesItem = scan.readLine.trim.toInt
      grades(gradesItr) = gradesItem
    }

    val result = gradingStudents(grades)

    fw.println(result.mkString("\n"))

    fw.close()
  }
}
