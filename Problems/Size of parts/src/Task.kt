import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val numberOfParts = scanner.nextInt()
    var ready = 0
    var toBeFixed = 0
    var toBeRejected = 0

    repeat(numberOfParts) {
        val detector = scanner.nextInt()
        when (detector) {
            0 -> ready++
            1 -> toBeFixed++
            -1 -> toBeRejected++
        }
    }

    println("$ready $toBeFixed $toBeRejected")
}