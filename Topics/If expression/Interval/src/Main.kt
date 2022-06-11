import java.util.Scanner
const val TWELVE = 12
const val FIFTEEN = 15
const val SIXTEEN = 16
const val NINETEEN = 19
fun main() {
    // write your code here
    val scanner = Scanner(System.`in`)
    val scan = scanner.nextInt()
    println(if (scan > -FIFTEEN && scan <= TWELVE || scan in FIFTEEN..SIXTEEN || scan >= NINETEEN) "True" else "False")
}