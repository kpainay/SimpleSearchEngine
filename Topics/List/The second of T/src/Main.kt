fun solution(names: List<String>): Int {

    var returnIdex = -1
    for (i in 1 until names.size step 2) {
        if (names[i][0].equals('t', true)) {
            returnIdex = i
            break
        }
    }
    return returnIdex
}