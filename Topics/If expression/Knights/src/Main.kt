import kotlin.math.abs
import java.util.Scanner
fun main() {
    // write your code here
    val scanner = Scanner(System.`in`)
    val x1 = scanner.nextInt()
    val y1 = scanner.nextInt()
    val x2 = scanner.nextInt()
    val y2 = scanner.nextInt()
//    val vertical = x1 == x2
//    val horizontal = y1 == y2
//    val diagonal = abs(x1 - x2) == abs(y1 - y2)
    if (x1 == x2 || y1 == y2) println("YES") else if (abs(x2 - x1) == abs(y2 - y1)) println("YES") else println("NO")
}