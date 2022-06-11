fun main() {
    // put your code here
    val input = readln().toInt()
    var square = 1
    while (square * square <= input) {
        println(square * square)
        square++
    }
}