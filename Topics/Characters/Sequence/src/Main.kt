import java.util.Scanner
const val ONE = 1
fun main() {
    // put your code here
    val scanner = Scanner(System.`in`)
    val ch1 = scanner.next().first()
    val ch2 = scanner.next().first()
    val ch3 = scanner.next().first()
    val res = ch1 + ONE == ch2 && ch2 + ONE == ch3
    println(res)
}