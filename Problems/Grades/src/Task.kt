import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val numberOfGrades = scanner.nextInt()

    var numberOfAs = 0
    var numberOfBs = 0
    var numberOfCs = 0
    var numberOfDs = 0

    repeat(numberOfGrades) {
        val grade = scanner.nextInt()
        when (grade) {
            5 -> numberOfAs++
            4 -> numberOfBs++
            3 -> numberOfCs++
            2 -> numberOfDs++
        }
    }

    println("$numberOfDs $numberOfCs $numberOfBs $numberOfAs")
}