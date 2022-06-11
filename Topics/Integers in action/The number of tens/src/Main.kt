import java.util.Scanner
const val TEN = 10
fun main() {
    // put your code here
    val scanner = Scanner(System.`in`)
    val scan = scanner.nextInt()
    val mod = scan % TEN
    val res = scan - mod
    println(res / TEN % TEN)
}