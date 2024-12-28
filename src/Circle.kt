import java.io.IO.println

class Circle(
    val radius:Double
) {

    val PI = 3.141592
    init {
        println("Circle created with radius is $radius")
        println("Circle area is ${area()}")
        println("Circle perimeter is ${perimeter()}")
    }

    fun area() = radius * radius * PI

    fun perimeter() = 2 * radius * PI
}