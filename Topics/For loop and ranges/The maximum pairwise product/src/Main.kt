fun main() {
    // write your code here
    val list = List(readln().toInt()) { readln().toInt() }.sortedDescending()
    if (list.size == 1) println(list[0]) else println(list[0] * list[1])
}