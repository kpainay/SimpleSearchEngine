    val lambda: (Long, Long) -> Long = {
        left, right ->
        var prod: Long = 1
        for (i in left..right) { prod *= i }
        prod
    }
