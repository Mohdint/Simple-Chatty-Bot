const val FOUR = 4
fun main() {
    // put your code here
    var max = 0
    repeat(readln().toInt()) {
        val input = readln().toInt()
        if (input % FOUR == 0 && input > max) max = input
    }
    println(max)
}