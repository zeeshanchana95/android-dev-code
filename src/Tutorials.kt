import java.io.IO.println

fun main() {
    /**
     * Inheritance:
     *  - it is the one of the pillar of object-oriented programming where
     *      - there is a parent class called super class which contain general functionality that other classes (subclasses or child classes) get by default
     *      - use : besides constructor of child classes to inherit parent class
     *      - after extending parent class, child classes will get all the methods and properties of parent class by default
     */
    val myCircle1 = Circle(5.0)
    myCircle1.changeName("Peter")
    println(myCircle1.name)

    val myTriangle = Triangle(2.0, 3.0, 5.0)
    myTriangle.changeName(("Susan"))
    println("The name of triangle is ${myTriangle.name}")
}