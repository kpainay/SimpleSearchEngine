fun main() {
    // write your code here
    val stringOne = readln()
    val operator = readln()
    val stringTwo = readln()

    println(
        when (operator) {
            "equals" -> stringTwo == stringOne
            "plus" -> stringOne + stringTwo
            "endsWith" -> stringOne.endsWith(stringTwo)
            else -> "Unknown operation"
        }
    )
}