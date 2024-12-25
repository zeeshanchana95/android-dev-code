import java.io.IO.println

fun main() {
    var x = 20.123235F //float (32 bits) memory but less accurate
    var y = 8F
    println("The result of x / y is: ${x / y}")

    var x1 = 20.1534334344334 //for double (64 bits) but more accurate
    var y1 = 8
    println("The result of x / y is: ${x / y}")

    //practice task
    //calculating volume of sphere
    val PI = 3.142
    var radius = 5.5
    var volumeOfSphere = 0.75 * PI * (radius*radius*radius)
    println("The volume of the sphere with the radius $radius is $volumeOfSphere")
}
