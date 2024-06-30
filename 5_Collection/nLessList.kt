fun main() {
    val numList = mutableListOf(1, 2, 3, 4, 5, 6, 7)
    println("Enter the number.")
    val n = readLine()?.toInt() ?: 5

    remove_nLess(n, numList)
    println(numList)
}

fun remove_nLess(n: Int, nl: MutableList<Int>) {
    for (i in nl.size - 1 downTo 0) {
        if (nl[i] < n) {
            nl.removeAt(i)
        }
    }
}