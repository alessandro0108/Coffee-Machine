import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    val min = scanner.nextInt()
    val max = scanner.nextInt()
    val actual = scanner.nextInt()

    if (actual < min)
        println("Deficiency")
    else if (actual > max)
        println("Excess")
    else
        println("Normal")
}