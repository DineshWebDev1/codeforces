import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    var count = scanner.nextInt()
    var solutionCount = 0
    while(count > 0){
        solutionCount += if(listOf(scanner.nextInt(), scanner.nextInt(), scanner.nextInt()).filter { it == 1 }.size > 1)1 else 0
        count--
        scanner.nextLine()
    }
    println(solutionCount)
}
