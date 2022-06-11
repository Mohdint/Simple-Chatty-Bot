const val ONE_HOUR = 3600
const val ONE_MINUTE = 60
fun main() {
    // put your code here
    val h1 = readln().toInt()
    val m1 = readln().toInt()
    val s1 = readln().toInt()
    val h2 = readln().toInt()
    val m2 = readln().toInt()
    val s2 = readln().toInt()
    val res = (h2 - h1) * ONE_HOUR + (m2 - m1) * ONE_MINUTE + (s2 - s1)
    println(res)
}