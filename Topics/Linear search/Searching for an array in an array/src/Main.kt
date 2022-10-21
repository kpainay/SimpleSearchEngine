// write your code here 

fun main(args: Array<String>) {

    val numbers1 = readln().split(" ").map { it.toInt() }
    val numbers2 = readln().split(" ").map { it.toInt() }
    var comparisons = 0
    var count = 0
    for (i in numbers1) {
        count = linearSearch(numbers2, i)
        if (count == -1) {
            comparisons += numbers2.size
        } else {
            comparisons += count
        }
    }
    println(comparisons)
  // put your code here
}
fun <T>linearSearch(array: List<T>, target: T): Int {
    for (i in array.indices) {
        if (array[i] == target) {
            return i+1
        }
    }
    return -1
}
fun <T>numberOccurrences(array: List<T>, target: T): Int {
    var count = 0
    for (i in array.indices) {
        if (array[i] == target) {
            count++
        }
    }
    return count
}
