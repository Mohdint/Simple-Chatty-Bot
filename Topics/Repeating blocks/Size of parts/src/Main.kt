fun main() {
    // put your code here
    val list = List(readln().toInt()) { readln().toInt() }
    print(list.count { it == 0 })
    print(" ")
    print(list.count { it == 1 })
    print(" ")
    print(list.count { it == -1 })
}