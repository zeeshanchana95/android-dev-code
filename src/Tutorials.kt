import java.io.IO.print
import java.io.IO.println

fun main() {
    //while loop: to execute certain pieces of code several time

    var x = 3;
    while (x > 0) {
        println("hello")
        x--
    }
    println("whats up?")

    //printing array elements
    val myArray = arrayOf("hello", "guys", "whats up?")
    val arrayLength = myArray.size
    var i = 0
    while (i < arrayLength) {
        println(myArray[i])
        i++
    }


    //practice task 01: input number and print count down
    println("Enter number: ")
    val number = readLine()?.toInt()
    println("Lets count from $x down to 0:")
    if(number != null) {
        while(number >= 0) {
            println(number)
            number--
        }
    }

    //practice task 02: enter two numbers and calculate the result by first number power of second number
    println("Enter number 01: ")
    val num1 = readLine()?.toInt()
    println("Enter number 02: ")
    val num2 = readLine()?.toInt()

    if(num1 != null && num2 != null) {
        var result = 1
        var i = 0
        while(i < num2) {
            result *= num1
            i++
        }
        println("$num1 to the power of $num2 is $result")
    }










}
