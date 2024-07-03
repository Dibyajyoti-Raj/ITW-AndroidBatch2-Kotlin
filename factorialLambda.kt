fun calculateFactorial(number: Int): Int {
    // Define the lambda to calculate factorial
    val factorial: (Int) -> Int = { n ->
        if (n == 0 || n == 1) 1
        else (2..n).reduce { acc, i -> acc * i }
    }
    return factorial(number)
}

fun main() {
    val number = 5
    val result = calculateFactorial(number)
    println("Factorial of $number is $result")
}
