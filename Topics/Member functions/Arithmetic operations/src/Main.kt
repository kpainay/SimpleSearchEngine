class ArithmeticOperations(number1: Int = 0, number2: Int = 0) {
    var x = number1
    var y = number2
    fun addition() = x + y
    fun subtraction() = x - y
    fun multiplication() = x * y
    fun division() = if (y != 0) x / y else 0
}
// write your class here