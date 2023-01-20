import java.util.Scanner

fun main() {
    val scan = Scanner(System.`in`)
    val string1 = scan.nextLine()
    val string2 = scan.nextLine()

    val result = string1.compareTo(string2, true)
    if(result > 0){
        print(1)
    }else if (result < 0){
        print(-1)
    }else{
        print(0)
    }

}