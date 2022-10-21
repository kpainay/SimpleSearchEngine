class Block(val color: String) {

    object BlockProperties {
        var length: Int = 14
        var width: Int = 9

        fun blocksInBox(boxLength: Int, boxWidth: Int): Int {
            return (boxLength / length) * (boxWidth / width)
        }
    }
}
