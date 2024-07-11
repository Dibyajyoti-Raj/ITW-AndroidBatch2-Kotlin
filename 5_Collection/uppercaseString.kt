fun printUppercaseString(input: String?) {
    input?.let {
        println(it.uppercase())
    } ?: println("String is null")
}

fun main() {
    val str1: String? = "hello"
    val str2: String? = null

    printUppercaseString(str1)  // Output: HELLO
    printUppercaseString(str2)  // Output: String is null
}
