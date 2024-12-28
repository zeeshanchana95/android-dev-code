import java.io.IO.println

class Circle(
    val radius:Double
):Shape("circle") {

    private val PI = 3.141592
    init {
        println("$name created with radius is $radius")
        println("$name area is ${area()}")
        println("$name perimeter is ${perimeter()}")
    }

    fun area() = radius * radius * PI

    fun perimeter() = 2 * radius * PI
}