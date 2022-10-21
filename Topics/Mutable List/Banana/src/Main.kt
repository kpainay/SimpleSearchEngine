fun solution(strings: MutableList<String>, str: String): MutableList<String> {
    // put your code here
    val replacement = "Banana"
    val newList = mutableListOf<String>()
    for (string in strings) {
        if (string == str ){
            newList.add(replacement)
        } else {
            newList.add(string)
        }
    }
    return newList
}