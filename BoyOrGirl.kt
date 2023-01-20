import java.util.*

fun main() {
    val scan = Scanner(System.`in`)
    val username = scan.nextLine()

    if(username.split("").distinct().size%2 != 0){
        println("CHAT WITH HER!")
    }else{
        println("IGNORE HIM!")
    }
}