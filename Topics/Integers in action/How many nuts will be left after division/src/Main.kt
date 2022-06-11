import java.util.Scanner
fun main() {
    // put your code here
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt().toUInt()
    val k = scanner.nextInt().toUInt()
    val res: UInt = k % n
    println(res)
}