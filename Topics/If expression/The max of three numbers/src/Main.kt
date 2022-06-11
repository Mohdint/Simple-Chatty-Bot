import java.util.Scanner
fun main() {
    val scanner = Scanner(System.`in`)
    val a = scanner.nextInt()
    val b = scanner.nextInt()
    val c = scanner.nextInt()
    println(if (a > c) maxOf(a, b) else maxOf(b, c))
}