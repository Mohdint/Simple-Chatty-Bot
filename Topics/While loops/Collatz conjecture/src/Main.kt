const val THREE = 3
fun main() {
    // put your code here
    var n = readln().toInt()
    while (n != 1) {
        print("$n ")
        if (n % 2 == 1) {
            n = n * THREE + 1
        } else {
            n /= 2
        }
    }
    print(n)
}