fun transformList(strings: List<String>, transformer: (String) -> String): List<String> {
    return strings.map(transformer)
}

fun main() {
    val strings = listOf("apple", "banana", "cherry")

    // Define a transformer function to convert strings to uppercase
    val toUpperCase: (String) -> String = { it.toUpperCase() }

    // Transform the list using the transformer function
    val transformedList = transformList(strings, toUpperCase)

    println("Original list: $strings")
    println("Transformed list: $transformedList")
}
