fun main() {
    // write your code here
    val word = readln()
    val copy = mutableListOf<String>()

    for (i in word.lastIndex downTo 0) {
        copy.add(word[i].toString())
    }
    if (word.equals(copy.joinToString(""), true)) {
        println("yes")
    } else {
        println("no")
    }
//    println("$word \n${copy.joinToString("")}")
}