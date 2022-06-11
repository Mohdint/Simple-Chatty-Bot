const val EIGHTEEN = 18
const val FIFTY_NINE = 59
fun main() {
    // write your code here
    val jop = readln().toInt()
    if (jop in EIGHTEEN..FIFTY_NINE) println(true) else println(false)
}