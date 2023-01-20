import java.util.*

fun main() {
    val scan = Scanner(System.`in`)
    val x = scan.nextLine()
    println(x.replaceFirstChar { it.titlecase() })
}