fun main() {
    val count = IntArray(94) 

    println("Enter the charecters.")
    val s = readLine() ?: ""

    for (i in s.indices) {
        val x = s[i].toInt()
        if (x in 32..126) {
            count[x - 32]++
        }
    }

    for (j in count.indices) {
        if (count[j] != 0) {
            println("${(j + 32).toChar()} - ${count[j]}")
        }
    }
}
