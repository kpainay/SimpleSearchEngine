fun bill(priceList: Map<String, Int>, shoppingList: MutableList<String>): Int {
    // put your code here
    var sum = 0
    for ((key, value) in priceList) {
        if (shoppingList.contains(key)) {
            sum += value
        }
    }
    return sum
}