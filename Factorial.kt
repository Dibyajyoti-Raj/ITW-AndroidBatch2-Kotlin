fun main() {
    println("Enter a number:")
    val input = readLine() ?: "5"
    val number = input.toInt() 

    println("Factorial of $number = ${factorial(number)}")
}

fun factorial(n: Int, r: Int = 1): Int {
    return if (n <= 1) {
        r
    } else {
        factorial(n - 1, n * r)
    }
}