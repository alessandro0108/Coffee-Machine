import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // write your code here
    val c = scanner.next().first()
    val cCaps = c.toUpperCase()

    println(c.isLetter() && c == cCaps || c.isDigit() && c != '0')
}