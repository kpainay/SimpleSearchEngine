fun main() {
    // write your code here
    val variable = readln().first()

    println(variable.isUpperCase() || variable in '\u0031'..'\u0039')
}