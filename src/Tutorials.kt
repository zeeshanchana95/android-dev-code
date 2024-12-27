import java.io.IO.println

fun main() {
    printThreeLines()
    printPow(3, 5)
    printPow(5,2)
    calculateSum(5)
}

fun printPow(base: Int, exponent:Int){
    var result = 1
    for(i in 1..exponent) {
        result *= base
    }
    println("$base to the power of $exponent is: $result")
}

fun printThreeLines() {
    println("First")
    println("Second")
    println("Third")
}

fun calculateSum(num:Int) {
    var sum = 0
    for(i in 1..num) {
        sum += num
    }
    println("The sum of numbers from 1 to $num is: $sum")
}