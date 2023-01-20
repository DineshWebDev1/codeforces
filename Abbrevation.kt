import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    var count = scanner.nextInt()
    var words = mutableListOf<String>()
    while (count > 0){
        count--
        words.add(scanner.next())
    }

   words.forEach { println(abbreviateLengthyWord(it))}
}

fun abbreviateLengthyWord(word: String) = if (word.length > 10)"${word[0]}${word.substring(1..word.length-2).length}${word[word.length-1]}" else word
