import java.util.Scanner

fun swapInts(ints: IntArray): IntArray {

    return intArrayOf(ints[1], ints[0])

}

fun main() {

    val scanner = Scanner(System.`in`)
    while (scanner.hasNextLine()) {
        val ints = intArrayOf(
            scanner.nextInt(),
            scanner.nextInt()
        )
        val swapped = swapInts(ints)
        println(swapped[0])
        println(swapped[1])
    }
}