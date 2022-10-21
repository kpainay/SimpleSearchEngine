fun main() {
    // write your code here
    val firstNumber = readln().toInt()
    val secondNumber = readln().toInt()
    val thirdNumber = readln().toInt()

    println(firstNumber in secondNumber..thirdNumber)
}