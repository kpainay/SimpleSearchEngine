fun main() {
    // write your code here
    val word = readln() // reading the word from stdin
    // printing the word via stdout
    println("${word.length} repetitions of the word $word: ${word.repeat(word.length)}")
}