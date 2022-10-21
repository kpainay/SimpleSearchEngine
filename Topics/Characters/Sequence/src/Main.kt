fun main() {
    // put your code here
    var firstChar = readln().first()
    val secondChar = readln().first()
    var thirdChar = readln().first()

    println(secondChar in firstChar..thirdChar && ++firstChar == secondChar && secondChar == --thirdChar)
}