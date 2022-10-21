fun main() {
    // write your code here
    val sideOne = readln().toInt()
    val sideTwo = readln().toInt()
    val sideThree = readln().toInt()

    // If Logic to check for the validity of a triangle
    if (sideOne + sideTwo > sideThree && sideOne + sideThree > sideTwo && sideTwo + sideThree > sideOne) {
        println("YES")
    } else {
        println("NO")
    }
}