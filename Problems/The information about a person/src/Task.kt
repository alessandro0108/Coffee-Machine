import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val firstName = scanner.next()
    val lastName = scanner.next()
    val age = scanner.nextInt()

    println("${firstName.first()}. $lastName, $age years old")
}