const val TEN = 10
const val FIFTEEN = 15
const val TWENTY = 20
const val TWENTY_FIVE = 25
fun main() {
    // write your code here
    val cups = readln().toInt()
    val weekend = readln().toBoolean()
    val weekendCups = weekend && cups in FIFTEEN..TWENTY_FIVE
    val butterCups = !weekend && cups in TEN..TWENTY
    println(weekendCups || butterCups)
}