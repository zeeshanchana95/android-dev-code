import java.io.IO.print
import java.io.IO.println


fun main() {
    //array: ways to save several objects inside single object
//    val myIntArray = arrayOf(3, 2, 6, 4)
//    val myMixArray = arrayOf("hello", "guys", 3)

    val first = "hello"
    val second = "guys"
    val third = "whats up?"
    //above and below line is equal
    val myStringArray = arrayOf("hello", "guys", "what's up")
    println(myStringArray) //can't print array with println method

    //we can access individual elements of array using index
    println(myStringArray[0]) //hello (first element)
    println(myStringArray[1])
    println(myStringArray[2])
    println(myStringArray[3]) //Exception: ArrayIndexOutOfBound



}
