// write your code here
const val TEEN = 10
fun getLastDigit(a: Int) = if (a < 1) -a % -TEEN else a % TEEN
/* Do not change code below */
fun main() {
    val a = readLine()!!.toInt()
    println(getLastDigit(a))
}