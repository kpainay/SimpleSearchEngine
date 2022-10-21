fun main() {

    // put your code here

    val boy1: Int = readln().toInt()
    val boy2: Int = readln().toInt()
    val boy3: Int = readln().toInt()

    println(boy2 in boy1..boy3 || boy2 in boy3..boy1)
}