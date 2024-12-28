import java.io.IO.println

fun main() {
    val a = 3.0
    val b = 4.0
    val height = 2.0

    //anonymous classes
    val parallelogram = object: Shape("Parallelogram", a, b, height )  {

        init {
            println("Parallelogram created with a = $a and b = $b and height = $height")
            println("The area is ${area()}")
            println("The perimeter is ${perimeter()}")
        }
        override fun area(): Double {
            return a * height
        }

        override fun perimeter(): Double {
            return 2 * a + 2 * b
        }

        fun isRectangle():Boolean = height == b
    }
    println("Is the parallelogram is Rectangle? ${parallelogram.isRectangle()}")


    val c = 5.0
    val d = 6.0
    val trapezium = object:Shape("Trapeeze", a, b, c, d, height) {
        override fun area(): Double {
            return  (a * b * height) / 2.0
        }

        override fun perimeter(): Double {
            return a + b + c + d
        }

        fun isRectangle():Boolean = (b == b) && (height == height / 2)
    }
    println("Is the trapezium is Rectangle? ${trapezium.isRectangle()}")
}
