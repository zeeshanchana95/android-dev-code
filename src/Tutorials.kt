import java.io.IO.println

fun main() {
    /**
     * Singleton Object:
     *  - It is a type of object where only single instance exists
     */

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

    val circle = Circle.randomCircle()

}
