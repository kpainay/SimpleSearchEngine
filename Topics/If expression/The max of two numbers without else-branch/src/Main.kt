fun main() {

    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()

    // put your code here
    var max = a
    if (a < b) {
        max=b
    }
    println(max)
}