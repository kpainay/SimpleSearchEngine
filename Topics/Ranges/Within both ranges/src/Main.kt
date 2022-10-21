fun main() {
    // write your code here
    val firstNumber = readln().toInt()
    val secondNumber = readln().toInt()
    val thirdNumber = readln().toInt()
    val fourthNumber = readln().toInt()
    val fifthNumber = readln().toInt()

    println(fifthNumber in firstNumber..secondNumber && fifthNumber in thirdNumber..fourthNumber)
}