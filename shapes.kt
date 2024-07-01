abstract class Shape {
    abstract fun area()
}

class Rectangle(private val length: Double, private val width: Double) : Shape() {
    override fun area() {
        println("Area of rectangle is ${length * width}")
    }

    fun perimeter() {
        println("Perimeter of rectangle is ${2 * (length + width)}")
    }
}

class Circle(private val radius: Double) : Shape() {
    override fun area() {
        println("Area of circle is ${3.14 * radius * radius}")
    }

    fun perimeter() {
        println("Perimeter of circle is ${2 * 3.14 * radius}")
    }
}

fun main() {
    val rectangle = Rectangle(5.0, 3.0)
    rectangle.area()
    rectangle.perimeter()

    val circle = Circle(4.0)
    circle.area()
    circle.perimeter()
}
