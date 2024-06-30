fun main(args: Array<String>) {
    var numList = mutableListOf(1, 2, 3, 4, 5)
    rev(numList)
    println(numList)
}

fun rev(nl: MutableList<Int>) {
    var i = 0
    var j = nl.size - 1
    while (i < j) {
        val temp = nl[i]
        nl[i] = nl[j]
        nl[j] = temp
        i++
        j--
    }
}
