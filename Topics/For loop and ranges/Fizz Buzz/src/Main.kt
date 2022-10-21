fun main() {
    val lowerBound = readln().toInt()
    val upperBound = readln().toInt()

    for (i in lowerBound..upperBound) {
        println(
            when {
                i % 15 == 0 -> "FizzBuzz"
                i % 3 == 0 -> "Fizz"
                i % 5 == 0 -> "Buzz"
                else -> i
            }
        )
    }
    // put your code here
}