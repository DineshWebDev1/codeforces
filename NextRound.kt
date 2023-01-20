import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    val k = scanner.nextInt()
    val scores = mutableListOf<Int>()
    if(n >= k){
        for (i in 0 until n) {
            val score = scanner.nextInt()
            scores.add(score)
        }
        println(countNextRoundParticipants(scores, k))
    }
}

fun countNextRoundParticipants(scores: List<Int>, k:Int):Int{
    return if(scores[k-1] != 0){
        val uniqueScores = scores.distinct()
        if(uniqueScores.size == 1){
            scores.size
        }else{
            scores.filter { it >= scores[k-1] }.size
        }
    }else if((scores[k-1] == 0) && (scores.distinct().size > 1)){
        scores.filter { it > 0 }.size
    }else{
        0
    }
}