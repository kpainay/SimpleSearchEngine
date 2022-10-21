    const val MAX = 3
    fun main(args: Array<String>) {
        if (args.size < MAX)
            main(arrayOf("first", "second", "third"))
        else {
            for (i in args) {
                println(i)
            }
        }
    }