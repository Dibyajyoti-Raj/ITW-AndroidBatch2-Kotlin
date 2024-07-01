fun isSubset(list1: List<Int>, list2: List<Int>): Boolean {
    for (element in list1) {
        var found = false
        for (elem in list2) {
            if (element == elem) {
                found = true
                break
            }
        }
        if (!found) {
            return false
        }
    }
    return true
}

fun main() {
    val list1 = listOf(1, 2, 3)
    val list2 = listOf(1, 2, 3, 4, 5)

    println(isSubset(list1, list2))  // Output: true

    val list3 = listOf(1, 6)
    println(isSubset(list3, list2))  // Output: false
}
