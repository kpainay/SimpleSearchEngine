fun main() {
    // write your code here
    val size = readln().toInt()
    val set = MutableList(size) { readln().toInt() }
    val number = readln().toInt()
    println(
        if (number in set) "YES" else "NO"
    )
}