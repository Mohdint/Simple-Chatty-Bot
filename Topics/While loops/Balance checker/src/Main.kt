import java.util.Scanner
fun main() {
    balanceChecker()
}
fun balanceChecker() {
    val sc = Scanner(System.`in`)
    var balance = readln().toInt()
    while (sc.hasNextInt()) {
        // TODO
        val purchase = sc.nextInt()
        if (balance - purchase < 0) {
            println("Error, insufficient funds for the purchase. Your balance is $balance, but you need $purchase.")
        }
        balance -= purchase
    }
    // TODO
    if (balance >= 0) {
        println("Thank you for choosing us to manage your account! Your balance is $balance.")
    }
}