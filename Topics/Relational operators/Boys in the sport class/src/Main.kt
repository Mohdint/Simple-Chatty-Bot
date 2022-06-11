import java.util.Scanner
fun main() {
    // put your code here
    val scanner = Scanner(System.`in`)
    val h1 = scanner.nextInt()
    val h2 = scanner.nextInt()
    val h3 = scanner.nextInt()
//    val ascending = h1 >= h2 && h2 >= h3 || h3 >= h2 && h3 >= h1
//    val descending = h1 <= h2 && h2 <= h3 || h3 <= h2 && h3 <= h1 /* its same 2 lines below ↓ */
    val ascending = h2 in h1..h3
    val descending = h2 in h3..h1
    if (ascending || descending) {
        println(true)
    } else {
        println(false)
    }
}