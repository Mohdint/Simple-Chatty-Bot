fun main() {
    // write your code here
    val range = readln().toInt()
    val range1 = readln().toInt()..readln().toInt()
    if (range in range1) println(true) else println(false)
}