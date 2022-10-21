const val ONE = 1
const val TWO = 2
const val THREE = 3
const val FOUR = 4
const val ZERO = 0
fun main() {
    // write your code here
    val direction = readln().toInt()
    println(
        when (direction) {
            ONE -> "move up"
            TWO -> "move down"
            THREE -> "move left"
            FOUR -> "move right"
            ZERO -> "do not move"
            else -> "error!"
        }
    )
}