import java.io.IO.println


class Triangle(
    val a:Double,
    val b:Double,
    val c:Double
) {
    init {
        println("Triangle is created with a = $a, b = $b, and c = $c")
        println("Triangle area is ${area()}")
        println("Triangle perimeter is ${perimeter()}")
    }

    fun area() = Math.sqrt((perimeter()/2.0)* (perimeter()/2.0 - a) * (perimeter()/2.0 - b)*(perimeter()/2.0 - c))

    fun perimeter() = a + b + c
}