interface Drawable {
    fun drawInfo()
}

class Square(private val side: Double) : Drawable {
    override fun drawInfo() {
        println("Square with side length $side")
        println("Area of square: ${side * side}")
        println("Perimeter of square: ${4 * side}")
    }
}

class Triangle(private val base: Double, private val height: Double) : Drawable {
    override fun drawInfo() {
        println("Triangle with base $base and height $height")
        println("Area of triangle: ${0.5 * base * height}")
        // Assuming it's an equilateral triangle for simplicity in perimeter calculation
        println("Perimeter of triangle: ${3 * base}")
    }
}

fun main() {
    val square = Square(4.0)
    square.drawInfo()

    val triangle = Triangle(3.0, 5.0)
    triangle.drawInfo()
}
