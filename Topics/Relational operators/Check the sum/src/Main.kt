const val CAP = 20
fun main() {
    // put your code here
    val number1 = readln().toInt()
    val number2 = readln().toInt()
    val number3 = readln().toInt()

    println(
        number1 + number2 == CAP || number1 + number3 == CAP || number3 + number2 == CAP
    )
}