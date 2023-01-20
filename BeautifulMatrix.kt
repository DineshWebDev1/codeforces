import java.util.Scanner

fun main() {
    val scan = Scanner(System.`in`)
    var n = 5

    while (n > 0){
        val rowData = arrayListOf<Int>()
        for (i in 1..5){
            rowData.add(scan.nextInt())
        }
        if(rowData.distinct().size > 1){
            val pos = rowData.indexOf(1)+1
            val x = if(pos>3) pos-3 else 3-pos
            val y = if(n>3) n-3 else 3-n
            print(x+y)
            return
        }
        n--
        scan.nextLine()
    }
}