const val TEN = 10
const val TWENTY = 20
const val FIFTEEN = 15
const val TWENTY_FIVE = 25
fun main() {
    // write your code here

    val numberOfCups: Int
    val itsWeekEnd: Boolean
    numberOfCups = readln().toInt()
    itsWeekEnd = readln().toBoolean()
    if (itsWeekEnd) {
        println(numberOfCups >= FIFTEEN && numberOfCups <= TWENTY_FIVE)
    } else {
        println(numberOfCups >= TEN && numberOfCups <= TWENTY)
    }
}