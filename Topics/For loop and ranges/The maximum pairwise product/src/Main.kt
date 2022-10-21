fun main() {
    val size = readln().toInt()
    val numbers = MutableList(size) { readln().toInt() }
    var maxProduct = 0L
    var product = 0L
    numbers.sort()

    for (i in 0 until numbers.size) {
        for (j in 0 until numbers.size) {
            product = numbers[i].toLong() * numbers[j].toLong()
            if (product > maxProduct && i != j) {
                maxProduct = product
            }
        }
    }
    if (numbers.size == 1) {
        println(numbers[0])
    } else {
        println(maxProduct)
    }
    // write your code here
}