import java.util.Scanner
fun main() {
    // write your code here
    val scanner = Scanner(System.`in`)
    val ch1 = scanner.next().first()
    val ch2 = scanner.next().first()
    val res = ch1.equals(ch2, ignoreCase = true)
    println(res)
}