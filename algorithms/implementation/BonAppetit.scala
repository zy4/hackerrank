object Solution {

  def bonAppetit(bill: Array[Int], k: Int, b: Int) {
    if ((bill.sum - bill(k)) / 2 == b) {
      println("Bon Appetit")
    } else {
      println(b - (bill.sum - bill(k)) / 2)
    }
  }

  def main(args: Array[String]) {
    val nk = StdIn.readLine.replaceAll("\\s+$", "").split(" ")

    val n = nk(0).toInt

    val k = nk(1).toInt

    val bill =
      StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)
    val b = StdIn.readLine.trim.toInt

    bonAppetit(bill, k, b)
  }
}
