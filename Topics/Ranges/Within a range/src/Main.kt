fun main() {
    // write your code here
    val range1 = readln().toInt()..readln().toInt()
    val range2 = readln().toInt()..readln().toInt()
    val range = readln().toInt()
    if (range in range1 || range in range2) println(true) else println(false)
}