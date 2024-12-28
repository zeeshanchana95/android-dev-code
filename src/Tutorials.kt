import java.io.IO.println

fun main() {
    val myRect = Rectangle(4.0, 7.0)
    println("Rectangle area is ${myRect.area()}")
    println("Rectangle perimeter is ${myRect.perimeter()}")
    println("Rectangle square is ${myRect.isSquare()}")

    //myCircle1 and myCircle2 are the instances of the class Circle
    val myCircle1 = Circle(5.0)
    val myCircle2 = Circle(7.0)

//    val x:Int = 0
//    val y:Int = 5
//    x.plus(y) //calling built-in function

    /**
     * Practice Task:
     * - create Triangle class and calculate
     *  - its area and perimeter
     *  - and print it with triangle sides
     */
    val myTriangle = Triangle(2.0, 4.0, 6.0)
}


/**
 * Extension Functions Task:
 * - calculating value of a product
 */
fun List<Int>.product():Int {
    var result = 1
    for (value in this) {
        result *= value
    }
    return result
}