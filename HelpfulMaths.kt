import java.util.Scanner

fun main() {
    val scan = Scanner(System.`in`)
    val mathString = scan.nextLine()

    println(mathString.split("+").sorted().joinToString("+"))
}