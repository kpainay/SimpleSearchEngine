import kotlin.math.sqrt
const val THREE = 3
fun printIfPrime(number: Int) {
    // write here
    var prim = true
    if (number < 1) {
        prim = false
    } else if (number == 2) {
        prim = true
    } else if (number % 2 == 0) {
        prim = false
    }
    for (i: Int in THREE..sqrt(number.toDouble()).toInt() step 2) {
        if (i % i == 0) {
            prim = false
        }
    }
    if (prim) {
        println("$number is a prime number.")
    } else {
        println("$number is not a prime number.")
    }
}

fun main(args: Array<String>) {
    // write here
    val test = readln().toInt()
    printIfPrime(test)
}