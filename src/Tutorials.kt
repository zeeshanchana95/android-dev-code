import java.io.IO.print
import java.io.IO.println


fun main() {
    //conditions (if statements)
    val x = 7
    val y = 7

    if(x < y) {
        println("x is lesser than y")
    } else if(x > y) {
        println("x is greater than y")
    } else {
        println("x is equal to y")
    }
    println("This will always be executed")

    val z = if(x + y == 14) 3 else 4
    if(x < y || y * y == 49)
        println("at least one of the conditions is true")
    println("The value of z is $z")


    //practice task
    val string = "racecar"
    val reversedString = string.toLowerCase().reversed()
    println("The string is $string")
    if(string == reversedString)
        println("The string $string is a palindrom")
    else
        println("The string $string is not a palindrome")

}
