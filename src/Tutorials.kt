import java.io.IO.print
import java.io.IO.println

fun main() {
    println("Please enter a number")
    val input = readLine()?.toInt()

    if(input != null) {
        if(input.isPrime()) {
            println("$input is a prime number.")
        } else {
            println("$input is not a prime number.")
        }
    }
}

//extension functions:
    //we don't need to specify what is its type
fun Int.isPrime(number:Int):Boolean {
    for (i in 2 until this - 1) {
        if(this % i == 0) {
            return false
        }
    }
    return true
}


fun alternatingSum(vararg numbers:Int):Int {
    var sum = 0
    var toggle = true
    for(number in numbers) {
        if(toggle) {
            sum += number
        } else {
            sum -= number
        }
        toggle = !toggle
    }
    return sum
}