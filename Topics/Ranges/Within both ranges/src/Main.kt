fun main() {
    // write your code here
    val n1 = readln().toInt()
    val n2 = readln().toInt()
    val n3 = readln().toInt()
    val n4 = readln().toInt()
    val n5 = readln().toInt()
    if (n5 in n1..n2 && n5 in n3..n4) println(true) else println(false)
}