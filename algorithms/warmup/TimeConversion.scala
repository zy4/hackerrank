object Solution {

  def timeConversion(s: String): String = {
    import java.text.SimpleDateFormat
    val sdf = new SimpleDateFormat("hh:mm:ssaa")
    val sdf2 = new SimpleDateFormat("HH:mm:ss")
    sdf2.format(sdf.parse(s))
  }

  def main(args: Array[String]) {
    val scan = scala.io.StdIn

    val fw = new PrintWriter(sys.env("OUTPUT_PATH"))

    val s = scan.readLine

    val result = timeConversion(s)

    fw.println(result)

    fw.close()
  }

}
