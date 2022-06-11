import java.util.Scanner
fun main() {
    // put your code here
    val scanner = Scanner(System.`in`)
    val n1 = scanner.nextInt()
    val n2 = scanner.nextInt()
    val n3 = scanner.nextInt()
    val res1 = n1 != n2 && n2 != n3
    val res2 = n3 != n2 && n3 != n1
    println(res1 && res2)
}