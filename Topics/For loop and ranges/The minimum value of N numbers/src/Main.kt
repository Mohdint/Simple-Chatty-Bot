fun main() {
    // write your code here
//    val list = mutableListOf<Int>()
//    repeat(readln().toInt()) { list.add(readln().toInt()) }
//    println(list.minOrNull())

    val min = List(readln().toInt()) { readln().toInt() }
    println(min.minOrNull())

//    var x = Int.MAX_VALUE
//    repeat(readln().toInt()) {
//        val input = readln().toInt()
//        if (input < x) x = input
//    }
//    print(x)
}