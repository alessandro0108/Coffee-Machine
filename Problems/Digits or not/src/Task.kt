import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // write your code here
    val c1 = scanner.next().first()
    val c2 = scanner.next().first()
    val c3 = scanner.next().first()
    val c4 = scanner.next().first()

    println(c1.isDigit().toString() + '\\' + c2.isDigit() + '\\' + c3.isDigit() + '\\' + c4.isDigit())
}