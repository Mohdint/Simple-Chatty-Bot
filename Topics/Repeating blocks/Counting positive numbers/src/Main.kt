fun main() {
    // put your code here
    val list = List(readln().toInt()) { readln().toInt() }
    print(list.count { it > 0 })
}