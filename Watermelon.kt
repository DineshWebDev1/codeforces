import java.util.Scanner

fun main() {
    val scanner  = Scanner(System.`in`)
    val weight = scanner.nextInt()
    println(validateEqualWeight(weight))
}

fun validateEqualWeight(weight: Int):String =  if(weight%2 == 0 && weight != 2)"YES" else "NO"
