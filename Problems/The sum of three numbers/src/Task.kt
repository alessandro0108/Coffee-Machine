import java.util.Scanner

// write your function here
fun sum(a: Int, b: Int, c:Int): Int {
    return a + b + c
}

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val a = scanner.nextInt()
    val b = scanner.nextInt()
    val c = scanner.nextInt()

    println(sum(a, b, c))
}