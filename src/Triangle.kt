import java.io.IO.println


class Triangle(
    val a:Double,
    val b:Double,
    val c:Double
) : Shape ("Triangle"){
    init {
        println("$name is created with a = $a, b = $b, and c = $c")
        println("$name area is ${area()}")
        println("$name perimeter is ${perimeter()}")
    }

    fun area() = Math.sqrt((perimeter()/2.0)* (perimeter()/2.0 - a) * (perimeter()/2.0 - b)*(perimeter()/2.0 - c))

    fun perimeter() = a + b + c
}