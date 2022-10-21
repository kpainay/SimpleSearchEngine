const val GET_FIRST_DIGIT = 100
const val GET_SECOND_DIGIT = 10

fun main() {
    // put your code here
    val number = readln().toInt()
    println(
        number.floorDiv(GET_FIRST_DIGIT) + number.floorDiv(GET_SECOND_DIGIT)
            .mod(GET_SECOND_DIGIT) + number.mod(GET_SECOND_DIGIT)
    )
}