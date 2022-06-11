import java.util.Scanner
fun main() {
    val scanner = Scanner(System.`in`)
    val a = scanner.nextInt()
    val b = scanner.nextInt()
    // put your code here
    var max = a
    if (b > a) max = b
    println(max)
}