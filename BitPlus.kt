import java.util.Scanner

fun main() {
    val scan = Scanner(System.`in`)
    var n = scan.nextInt()
    var sum = 0
    scan.nextLine()
    while (n > 0){
        when(scan.next()){
            "++X" -> ++sum
            "X++" -> sum++
            "--X" -> --sum
            "X--" -> sum--
        }
        n--
    }

    print(sum)

}