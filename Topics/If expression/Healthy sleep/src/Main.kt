import java.util.Scanner
fun main() {
    // write your code here
    val scanner = Scanner(System.`in`)
    val a = scanner.nextInt()
    val b = scanner.nextInt()
    val h = scanner.nextInt()
    println(if (h > b) "Excess" else if (h < a) "Deficiency" else "Normal")
}