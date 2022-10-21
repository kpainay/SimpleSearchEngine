fun main() {
    val studentsMarks = mutableMapOf<String, Int>()

    while (true) {
        val key = readln();
        if (key == "stop") break
        val value = readln()
        if (value == "stop") break
        studentsMarks.putIfAbsent(key, value.toInt())
    }
    println(studentsMarks)
}