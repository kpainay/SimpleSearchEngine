const val UPPERBOUND = 100
const val LOWERBOUND = 0
fun main() {
    val a = readln().toInt()
    val b = readln().toInt()
    val c = readln().toInt()
    val d = readln().toInt()

    for (i in LOWERBOUND..UPPERBOUND) {
        if (a * cube(i) + b * square(i) + c * i + d == 0) {
            println(i)
        }
    }
    // put your code here
}
fun square(num: Int) = num * num
fun cube(num: Int) = num * num * num