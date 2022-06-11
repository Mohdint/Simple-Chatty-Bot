// write your code here
fun divide(div1: Long, div2: Long) = div1.toDouble() / div2.toDouble()
/* Do not change code below */
fun main() {
    val a = readLine()!!.toLong()
    val b = readLine()!!.toLong()
    println(divide(a, b))
}