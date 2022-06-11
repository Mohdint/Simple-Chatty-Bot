import java.util.Scanner
fun main() {
    // put your code here
    val scanner = Scanner(System.`in`)
    val duration = scanner.nextInt()
    val foodCost = scanner.nextInt()
    val flyCost = scanner.nextInt()
    val hotelOneDay = scanner.nextInt()
    val d = foodCost * duration
    val f = flyCost * 2
    val h = hotelOneDay * (duration - 1)
    println(d + f + h)
}