import java.util.Scanner
fun main() {
    // put your code here
    val scanner = Scanner(System.`in`)
    val r1 = scanner.nextInt()
    val r2 = scanner.nextInt()
    val r3 = scanner.nextInt()
    val first = r1 >= r2 && r1 <= r3
    val second = r1 <= r2 && r1 >= r3
    println(first || second)
}