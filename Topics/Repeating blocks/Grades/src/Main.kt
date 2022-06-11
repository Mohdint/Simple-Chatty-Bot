const val D = 2
const val C = 3
const val B = 4
const val A = 5
fun main() {
    // put your code here
    val grade = mutableListOf<Int>()
    repeat(readln().toInt()) { grade.add(readln().toInt()) }
    val countA = grade.count { it == A }
    val countB = grade.count { it == B }
    val countC = grade.count { it == C }
    val countD = grade.count { it == D }
    println("$countD $countC $countB $countA")
}