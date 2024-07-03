class InvalidAgeException(message: String) : Exception(message)
fun checkAge(age: Int) {
    if (age < 18) {
        throw InvalidAgeException("Age must be 18 or older. Provided age: $age")
    } else {
        println("Age is valid: $age")
    }
}

fun main() {
    val ages = listOf(16, 18, 20)
    
    for (age in ages) {
        try {
            checkAge(age)
        } catch (e: InvalidAgeException) {
            println(e.message)
        }
    }
}
