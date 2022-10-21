import kotlin.math.abs
fun main() {
    // write your code here
    val (xCoordinate1, yCoordinate1) = readln().split(" ")
    val (xCoordinate2, yCoordinate2) = readln().split(" ")

    // The queens take out each other when the x coordinate of queen A equals to that of queen B.
    // Also if the absolute value of the difference between the y coordinates of the queens is equal to the absolute
    // value of the difference between the x coordinates of the queens.
    if (xCoordinate1 == yCoordinate2 || yCoordinate1 == xCoordinate2 ||
        abs(xCoordinate1.toInt() - xCoordinate2.toInt()) == abs(yCoordinate1.toInt() - yCoordinate2.toInt())
    ) {
        println("YES")
    } else {
        println("NO")
    }

}