/*
// Use IntelliJ IDE and Look at other solutions to this problem Then Try to Use it inside IDE.
// You will be surprised because most of them are broken except for the following solutions.
// First Way
import java.util.Scanner
fun main() {
    val scanner = Scanner(System.`in`)
    // put your code here
    val scan1 = scanner.next()
    val scan2 = scanner.next()
    val scan3 = scanner.next()
    val scan4 = scanner.next()
    println(scan1)
    println(scan2)
    println(scan3)
    println(scan4)
}
*/
/* // Second Way */
import java.util.Scanner
const val FOUR = 4
fun main() {
    val scanner = Scanner(System.`in`)
    // put your code here
    val items = mutableListOf<String>()
    for (count in 1..FOUR) {
        val item: String = scanner.next()
        items.add(item)
    }
    items.forEach { println(it) }
}