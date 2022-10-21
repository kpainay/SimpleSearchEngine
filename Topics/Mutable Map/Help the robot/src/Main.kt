fun helpingTheRobot(purchases: Map<String, Int>, addition: Map<String, Int>): MutableMap<String, Int> {
    // write your code here
    val result = purchases.toMutableMap()
    for ((key, value) in addition) {
        if (purchases.containsKey(key)) {
            result[key] = purchases[key]!! + value
        } else {
            result[key] = value
        }
    }
    return result
}