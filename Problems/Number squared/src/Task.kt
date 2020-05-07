import java.util.*

// write your code here
fun square(num: Int): Int {
    return num * num
}

/* Do not change code below */
fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val number = scanner.nextInt()
    println(square(number))
}