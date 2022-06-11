fun main() {
    val list = List(readln().toInt()) { readln().toInt() }
    var n = 1
    val saved = mutableSetOf(1)
    for (i in 0 until list.size - 1) {
        if (list[i] > list[i + 1]) {
            n = 1
        } else n++
        saved += n
    }
    print(saved.maxOrNull())
}
