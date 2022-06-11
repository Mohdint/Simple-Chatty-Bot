import java.util.Scanner
fun main() {
    // write your code here
    val scanner = Scanner(System.`in`)
    val oddOrEven = scanner.nextInt()
    if (oddOrEven % 2 == 0) println("EVEN") else println("ODD")
}