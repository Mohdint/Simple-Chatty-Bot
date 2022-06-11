fun main() {
    // put your code here
    /* First way */
//    val list = mutableListOf(readln().toInt(), readln().toInt(), readln().toInt())
//    println((list[0]..list[1]).count { it % list[2] == 0 })

    val a = readln().toInt()
    val b = readln().toInt()
    val n = readln().toInt()

    /* Second way */
//    val res = a / n - b /n
//    if (a % n == 0 && b % n == 0) println(res + 1) else println(res)

    /* Third way */
    println((a..b).count { it % n == 0 })

    /* Fourth way */
//    var count = 0
//    for (i in a..b) { if (i % n == 0) count++ }
//    println(count)
}