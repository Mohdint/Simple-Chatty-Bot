import java.util.Scanner
fun main() {
    // write your code here
    val scanner = Scanner(System.`in`)
    val ch = scanner.next().first()
    val res = ch.isUpperCase() || ch.isDigit() && ch != '0'
    println(res)
}