import java.util.Scanner
const val TEN = 10
fun main() {
    // put your code here
    val scanner = Scanner(System.`in`)
    val scan = scanner.nextInt()
    val rev1 = scan % TEN
    val rev2 = scan / TEN % TEN
    val rev3 = scan / TEN / TEN
    println("$rev1$rev2$rev3")
}