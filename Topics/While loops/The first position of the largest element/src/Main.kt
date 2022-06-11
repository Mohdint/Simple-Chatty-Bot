import java.util.*
fun main() {
    // put your code here
    position()
}
fun position() {
    val scan = Scanner(System.`in`)
    var max = Int.MIN_VALUE
    var pos = 0
    var i = 1
    while (scan.hasNext()) {
        val next = scan.nextInt()
        if (max < next) {
            max = next
            pos = i
        }
        i++
    }
    print("$max $pos")
}