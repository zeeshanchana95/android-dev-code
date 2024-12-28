import java.io.IO.println
import java.util.*

class Rectangle(
    val a:Double,
    val b:Double
):Shape("Rectangle") {

    companion object {
        fun randomRectangle() :Rectangle {
            val a = Random.nextDouble(1.0, 10.0)
            val b = Random.nextDouble(1.0, 10.0)
            return Rectangle(a, b)
        }
    }
    //constructor and function overloading

//    constructor(a: Double):this(a, a)
//
//    constructor(a:Int, b:Int):this(a.toDouble(), b.toDouble())

    init {
        println("$name created with a = $a and b = $b")
    }

    //declaring user-defined functions
    override fun area(): Double = a * b

    override fun perimeter(): Double = 2 * a + 2 * b

    fun isSquare() = a == b
}