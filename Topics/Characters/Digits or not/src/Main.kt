const val FOUR = 4
fun main() {
    // write your code here
    repeat(FOUR) {
        println(readln().first().isDigit())
    }
}