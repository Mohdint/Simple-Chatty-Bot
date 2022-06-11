/*
//First
fun main() {
    println("08:00 You have one billion dollars")
    println("08:30 You have two thousand dollars")
    println("09:10 You have no dollars!")
}

//Second
fun main() {
    println(
        """
        08:00 You have one billion dollars
        08:30 You have two thousand dollars
        09:10 You have no dollars!
        """.trimIndent()
    )
}
*/

/*//Third */
fun main() {
    val data = HashMap<String, String>()
    data["08:00 "] = "You have one billion dollars"
    data["08:30 "] = "You have two thousand dollars"
    data["09:10"] = " You have no dollars!"
    printData(data)
}
fun <J, K> printData(map: Map<J, K>) {
    for ((time, value) in map.entries) {
        println("${time}$value")
    }
}
