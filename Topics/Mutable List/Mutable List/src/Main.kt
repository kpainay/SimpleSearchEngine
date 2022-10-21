fun names(namesList: List<String>): List<String> {
    val nameCount = mutableListOf<String>()
    // add your code here
    for (name in namesList) {
        if (!nameCount.contains(
                "The name $name is repeated ${namesList.count { it.equals(name, true) }} times"
            )
        ) {
            nameCount.add("The name $name is repeated ${namesList.count { it.equals(name, true) }} times")
        }
    }
    return nameCount
}
