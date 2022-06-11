fun main() {
    // put your code here
    val list = mutableListOf<Int>()
    do {
        val input = readln().toInt()
        list.add(input)
    } while (input > 0)
    println(list.maxOrNull())
}