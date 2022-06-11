fun main() {
    // put your code here
    val input = readln().toInt()
    sequenceNumber(input)
}
fun sequenceNumber(input: Int) {
    val list = mutableListOf<Int>()
    var i = 1
    var s: Int
    while (i <= input) {
        s = 1
        while (s <= i) {
            list.add(i)
            if (list.count() <= input) print("$i ")
            s++
        }
        print("")
        i++
    }
}