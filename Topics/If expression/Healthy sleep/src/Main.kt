import kotlin.math.min

fun main() {
    // write your code here
    val minmumSleepTime = readln().toInt()
    val maximumSleepTime = readln().toInt()
    val sleepDuration = readln().toInt()

    if (sleepDuration in minmumSleepTime..maximumSleepTime) {
        println("Normal")
    } else if (sleepDuration < minmumSleepTime) {
        println("Deficiency")
    } else {
        println("Excess")
    }

}