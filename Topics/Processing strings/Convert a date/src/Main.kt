fun main() {
    // write your code here
    val date = readln()
    val tempString = date.split("-")
    val newDate = mutableListOf<String>()
    newDate.add(0, tempString[1])
    newDate.add(1, tempString[2])
    newDate.add(tempString[0])

    println(newDate.joinToString("/"))
}
class Stack {
    private val items = null
    fun push(){

    }
}