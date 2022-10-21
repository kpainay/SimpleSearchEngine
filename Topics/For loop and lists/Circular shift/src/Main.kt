fun main() {
    // write your code here
    val n = readLine()!!.toInt()
    val list = MutableList(n) { readln().toInt() }
    val newList = shift(list)
    println(newList.joinToString(" "))
}

fun <T> shift(list: MutableList<T>): MutableList<T> {
    val newList = mutableListOf<T>()
    newList.add(list.last())
    for (i in list.indices) {
        if (i == list.lastIndex) {
//            newList.add(0, list.last())
        } else {
            newList.add(list[i])
        }
    }
    return newList
}