const val MINUTES = 60
const val HOURS = 3600
const val DAYS = 86400
const val MILLI = 1000
fun main() {
    val totalSeconds = System.currentTimeMillis() / MILLI /* don't change this line */
    val hours = totalSeconds % DAYS / (DAYS - HOURS)
    val minutes = totalSeconds % HOURS / (HOURS - MINUTES)
    val seconds = totalSeconds % MINUTES
    println("$hours:$minutes:$seconds")

}
