// TODO: provide three functions here

fun generate(functionName: String): (Int) -> Int {

    return when(functionName) {
        "identity" -> ::identity
        "half" -> ::half
        "zero" -> ::zero
        else -> ::zero
    }
}
fun identity(arg: Int): Int {
    return arg
}
fun half(arg: Int): Int {
    return arg / 2
}
fun zero(arg: Int): Int {
    return 0
}