const val NINE = 9
fun main() {
    // put your code here
    val read = readln().toInt()
    if (read in 1..NINE) {
        println(true)
    } else {
        println(false)
    }
}