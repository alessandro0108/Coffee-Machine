import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    val type = scanner.next()
    val area: Double

    when (type) {
        "triangle" -> {
            val a = scanner.nextDouble()
            val b = scanner.nextDouble()
            val c = scanner.nextDouble()
            val p = (a + b + c) / 2     // half perimeter
            area = Math.sqrt(p * (p - a) * (p - b) * (p - c))
        }
        "rectangle" -> {
            val a = scanner.nextDouble()
            val b = scanner.nextDouble()
            area = a * b
        }
        "circle" -> {
            val r = scanner.nextDouble()
            area = r * r * 3.14
        }
        else -> area = 0.0
    }
    println(area)
}