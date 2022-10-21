import kotlin.math.min

fun main() {
    // put your code here
    // getting the input data
    val class1 = readln().toUByte()
    val class2 = readln().toUByte()
    val class3 = readln().toUByte()
    // processing the data
    val desksClass1 = class1.floorDiv(2u) + class1.mod(2u)
    val desksClass2 = class2.floorDiv(2u) + class2.mod(2u)
    val desksClass3 = class3.floorDiv(2u) + class3.mod(2u)
    val min1 = min(desksClass2, desksClass1)
    val min2 = min(min1, desksClass3)
    // putting out the results
    println(desksClass2 + desksClass1 + desksClass3)

}