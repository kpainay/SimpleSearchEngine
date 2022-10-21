fun main() {
    // getting the data
    val number1 = readln().toInt()
    val number2 = readln().toInt()
    val number3 = readln().toInt()
    // putting out result
    println(!(number1 == number2 || number1 == number3 || number2 ==number3))
}