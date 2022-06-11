const val ONE = 1
fun main() {
    // put your code here
    val read = readln().toInt()
    val res = read % 2
    if (res == ONE) {
        println(read + ONE)
    } else {
        println(read + 2)
    }
}