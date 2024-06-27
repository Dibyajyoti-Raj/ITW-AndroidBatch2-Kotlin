fun main() {
    var x = 56
    var y = 98
    val a = y
    while (y != 0) {
        val temp = y
        y = x % y
        x = temp
    }
    println("The GCD of $x and $a is $x")
}


