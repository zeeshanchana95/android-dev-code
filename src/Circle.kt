import java.io.IO.println
import java.util.*

class Circle(
    val radius:Double
):Shape("circle") {

    /**
     * Companion Object:
     * - a type of object which belongs to specific class
     * - basically if we want a class where we want both types of functionality of like
     *  - we can create normal object
     *  - we can create companion object (need class name to call variables or functions)
     * then we use companion object there
     * - we create companion object inside another class but not in a separate Kotlin file
     * - syntax: companion object {}
     */
    companion object {
        fun randomCircle(): Circle {}
        val radius = Random.nextDouble(1.0, 10.0)
        return Circle(radius)
    }

    init {
        println("$name created with radius is $radius")
        println("$name area is ${area()}")
        println("$name perimeter is ${perimeter()}")
//        ImportantNumbers.function()
    }

    override fun area() = radius * radius * ImportantNumbers.PI

    override fun perimeter() = 2 * radius * ImportantNumbers.PI
}