import java.util.Scanner
const val FOUR = 4
const val ONE_HUNDRED = 100
const val FOUR_HUNDRED = 400
fun main() {
    // write your code here
    val scanner = Scanner(System.`in`)
    val year = scanner.nextInt()
    println(if (year % FOUR == 0 && year % ONE_HUNDRED != 0 || year % FOUR_HUNDRED == 0) "Leap" else "Regular")
}