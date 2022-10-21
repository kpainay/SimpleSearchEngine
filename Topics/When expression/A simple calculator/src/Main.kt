fun main() {
    // write your code here
    val (a, b, c) = readln().split(' ')
    val firstNumber = a.toLong()
    val secondNumber = c.toLong()

    val result = when (b) {
        "+" -> firstNumber + secondNumber
        "-" -> firstNumber - secondNumber
        "/" ->
            if (secondNumber != 0L) {
                firstNumber / secondNumber
            } else {
                "Division by 0!"
            }
        "*" -> firstNumber * secondNumber
        else -> "Unknown operator"
    }
    println(result)
}