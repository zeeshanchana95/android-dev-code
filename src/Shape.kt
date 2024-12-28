import java.io.IO.println

/**
 * abstract classes:
 * - created so that other classes can inherit from that class
 * - can't allow this class to create object
 */
abstract class Shape (
    var name:String
) {
    init {
        println("I am the super class")
    }

    //create abstract functions when you don't know the implementation
    //which class inherit abstract class, it is necessary for that class to provide abstract methods functionality
    abstract fun area():Double

    abstract fun perimeter():Double

    fun changeName(newName:String) {
        name = newName
    }
}