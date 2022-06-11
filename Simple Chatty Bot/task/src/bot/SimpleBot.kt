package bot
import java.util.Scanner
val scanner = Scanner(System.`in`)
const val TWO = 2
fun main() {
    greet("M-Robot", "2022")
    remindName()
    guessAge()
    count()
    test()
    end()
}
fun greet(assistantName: String, birthYear: String) {
    println("Hello! My name is ${assistantName}.")
    println("I was created in ${birthYear}.")
    println("Please, remind me your name.")
}
fun remindName() {
   print("> ")
    val name = scanner.nextLine()
    println("What a great name you have, ${name}!")
}
fun guessAge() {
    println("Let me guess your age.")
    println("Enter remainders of dividing your age by 3, 5 and 7.")
   print("> ")
    val rem3 = scanner.nextInt()
   print("> ")
    val rem5 = scanner.nextInt()
   print("> ")
    val rem7 = scanner.nextInt()
    val age = { a: Int, b: Int, c: Int -> (a * 70 + b * 21 + c * 15) % 105 }
    println("Your age is ${age(rem3, rem5, rem7)}; that's a good time to start programming!")
}
fun count() {
    println("Now I will prove to you that I can count to any number you want.")
   print("> ")
    val num = scanner.nextInt()
    for (i in 0..num) {
        print(i)
        println("!")
    }
}
fun test() {
    println("Let's test your programming knowledge.")
    println("Why do we use Methods?")
    println("1. To repeat a statement multiple times.")
    println("2. To decompose a program into several small subroutines.")
    println("3. To determine the execution time of a program.")
    println("4. To interrupt the execution of a program.")
    val right = TWO
   print("> ")
    while (scanner.hasNextInt()) {
        val input = scanner.nextInt()
        if (input == right) break else println("Please, try again.")
       print("> ")
    }
}
fun end() {
    println("Congratulations, have a nice day!")
}
