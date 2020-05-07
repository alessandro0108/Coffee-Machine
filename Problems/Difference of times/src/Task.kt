import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val hours1 = scanner.nextInt()
    val minutes1 = scanner.nextInt()
    val seconds1 = scanner.nextInt()
    val hours2 = scanner.nextInt()
    val minutes2 = scanner.nextInt()
    val seconds2 = scanner.nextInt()

    val seconds = (hours2 - hours1) * 60 * 60 + (minutes2 - minutes1) * 60 + seconds2 - seconds1

    println(seconds)
}