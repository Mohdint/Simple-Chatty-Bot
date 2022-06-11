import java.util.Scanner
const val TWENTY = 20
fun main() {
    // put your code here
    val scanner = Scanner(System.`in`)
    val a = scanner.nextInt()
    val b = scanner.nextInt()
    val c = scanner.nextInt()
    if (a + b == TWENTY || a + c == TWENTY || b + c == TWENTY) {
        println(true)
    } else {
        println(false)
    }
}