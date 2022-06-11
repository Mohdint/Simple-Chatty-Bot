fun main() {
    // write your code here
    val order = List(readln().toInt()) { readln().toInt() }
//    println(if (order == order.sorted()) "YES" else "NO")
    var asc = true
    for (i in 1..order.lastIndex) {
        if (order[i] <= order[i - 1]) {
            asc = false
            break
        }
    }
    println(if (asc) "YES" else "NO")
}