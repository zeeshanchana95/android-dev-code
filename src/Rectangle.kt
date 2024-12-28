import java.io.IO.println

/**
 * Constructor:
 * - it is used to specify the values that we need to create the class
 */
class Rectangle(
    val a:Double,
    val b:Double
) {
    //write all the logic that is executed when create Rectangle object
    init {
        println("Rectangle created with a = $a and b = $b")
    }

    //declaring user-defined functions
    fun area() = a * b

    fun perimeter() = 2 * a + 2 * b

    fun isSquare() = a == b
}