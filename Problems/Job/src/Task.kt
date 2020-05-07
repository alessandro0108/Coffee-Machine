import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    val age = scanner.nextInt()
    val validRange = 18..59

    println(age in validRange)
}