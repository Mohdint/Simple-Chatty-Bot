import java.util.Scanner

fun main() {
    // put your code here
    val scanner = Scanner(System.`in`)
    val r1 = scanner.nextInt().toUInt()
    val r2 = scanner.nextInt().toUInt()
    val res: UInt = r2 / r1
    println(res)
}
