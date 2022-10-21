fun main() {
    // write your code here
    val inputString = readln()
    val newString = mutableListOf<String>()
    for (char in inputString.indices) {
        newString.add(inputString[char].toString().repeat(2))
    }
    println(newString.joinToString(""))
}