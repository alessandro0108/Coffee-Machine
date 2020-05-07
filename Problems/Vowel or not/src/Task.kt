import java.util.Scanner

// write your function here


fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val letter = scanner.next()[0]

    println(isVowel(letter))
}

fun isVowel(letter: Char): Boolean {
    val ucaseLetter = letter.toUpperCase()
    return (ucaseLetter == 'A'
            || ucaseLetter == 'E'
            || ucaseLetter == 'I'
            || ucaseLetter == 'O'
            || ucaseLetter == 'U')
}
