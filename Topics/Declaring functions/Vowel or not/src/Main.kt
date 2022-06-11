// write your function here
fun isVowel(letter: Char): Boolean = letter in "AOUEIaouei"
fun main() {
    val letter = readLine()!!.first()
    println(isVowel(letter))
}