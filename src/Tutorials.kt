import java.io.IO.println

fun main() {

    /**
     * Visibility Modifiers:
     * - they are used to limit where specific
     *  - variables
     *  - functions
     *  - constructors
     *  are used.
     *
     *  - following are visibility modifiers:
     *      1. public: that member can be accessed by any class
     *      2. private: that member can only be accessed inside that particular class
     *      3. protected: that member can be accessed in that class and all its subclasses
     *
     *
     */
    val myCircle1 = Circle(5.0)
    myCircle1.changeName("Peter")
    println(myCircle1.name)

    val myTriangle = Triangle(2.0, 3.0, 5.0)
    myTriangle.changeName(("Susan"))
    println("The name of triangle is ${myTriangle.name}")
}