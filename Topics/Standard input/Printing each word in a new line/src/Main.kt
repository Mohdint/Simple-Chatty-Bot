import java.util.Scanner
const val FIVE = 5
fun main() {
    val scanner = Scanner(System.`in`)
    // put your code here
    val item = mutableListOf<String>()
    for (i in 1..FIVE) {
        val scan = scanner.next()
        item.add(scan)
    }
    item.forEach { println(it) }
}