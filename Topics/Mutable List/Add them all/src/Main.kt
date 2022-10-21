fun solution(first: List<Int>, second: List<Int>): MutableList<Int> {
    return first.toMutableList().apply { addAll(second) }
}