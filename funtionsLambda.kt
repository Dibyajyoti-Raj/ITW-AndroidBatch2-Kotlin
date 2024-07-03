fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    
    val result = numbers
        .map { it * it } // Square all the numbers
        .filter { it % 2 != 0 } // Filter out the even numbers
        .reduce { sum, number -> sum + number } // Sum the remaining numbers
    
    println("The result is: $result")
}
