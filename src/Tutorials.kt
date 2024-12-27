import java.io.IO.println

fun main() {
    printThreeLines()
    printPow(3, 5)
    printPow(5,2)
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
    println("Thrid")

}