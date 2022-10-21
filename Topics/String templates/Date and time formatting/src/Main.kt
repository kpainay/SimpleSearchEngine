fun main() {
    // getting the date and time
    val (hour, min, sec) = readln()!!.split(" ")
    val (date, mon, year) = readln()!!.split(" ")
    // printing the date and time
    println("$hour:$min:$sec $date/$mon/$year")
}