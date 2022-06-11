const val TEN = 10
fun main() {
    val input = readln().toInt()
    val a = input / TEN % TEN
    val b = input % TEN
    val c = input / (TEN * TEN)
    println(a + b + c)
}