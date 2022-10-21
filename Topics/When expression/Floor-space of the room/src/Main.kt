import kotlin.math.sqrt

fun main() {
    // write your code here
    when (readln()) {
        "triangle" -> {
            val a = readln().toDouble()
            val b = readln().toDouble()
            val c = readln().toDouble()
            val p = (a + b + c) / 2
            println(sqrt(p * (p - a) * (p - b) * (p - c)))
        }
        "rectangle" -> {
            val a = readln().toDouble()
            val b = readln().toDouble()
            println(a * b)
        }
        "circle" -> {
            val r = readln().toDouble()
            println(3.14 * r * r)
        }
    }
}