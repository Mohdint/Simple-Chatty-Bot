const val THREE = 3
const val FIVE = 5
fun main() {
    // write your code here
    val range = readln().toInt()..readln().toInt()
    for (i in range) {
        if (i % THREE == 0 && i % FIVE == 0) {
            println("FizzBuzz")
        } else if (i % THREE == 0) {
            println("Fizz")
        } else if (i % FIVE == 0) {
            println("Buzz")
        } else println(i)
    }
}