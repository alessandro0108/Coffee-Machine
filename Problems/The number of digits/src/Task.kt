import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val number = scanner.nextInt()

    val digits: Int

    digits = when {
        number / 1000 >= 1 -> 4
        number / 100 >= 1 -> 3
        number / 10 >= 1 -> 2
        else -> 1
    }
    println(digits)
}