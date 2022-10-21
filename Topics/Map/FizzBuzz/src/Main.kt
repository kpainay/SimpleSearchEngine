fun iterator(map: Map<String, Int>) {
    // put your code here
    for ((key, value) in map) {
        if (value % 3 == 0) {
            println("Fizz")
        } else if (value % 5 == 0) {
            println("Buzz")
        } else {
            println("FizzBuzz")
        }
    }
}