import java.util.Scanner
const val THREE = 3
const val FIVE = 5
const val SIX = 6
fun main() {
    // put your code here
    val scanner = Scanner(System.`in`)
    val scan = scanner.nextInt()
    if (scan % 2 == 0) println("Divided by 2")
    if (scan % THREE == 0) println("Divided by 3")
    if (scan % FIVE == 0) println("Divided by 5")
    if (scan % SIX == 0) println("Divided by 6")
}