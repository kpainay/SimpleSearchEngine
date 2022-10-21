fun main() {
    val size = readln().toInt()
    val numbers = MutableList(size){ readln().toInt() }
    val newSet = mySort(numbers)
    numbers.sort()
    println(numbers[0])
    // write your code here
}
fun mySort(numbers: MutableList<Int>): MutableList<Int> {
    var temp = 0
    for (i in 0 until numbers.size-1) {
        for (j in 0 until numbers.size) {
            if (numbers[i] < numbers[j]) {
                temp = numbers[i]
                numbers[i] = numbers[j]
                numbers[j] = temp
            }
        }
    }
    return numbers
}