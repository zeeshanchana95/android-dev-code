import java.io.IO.print
import java.io.IO.println

fun main() {
    //for loop:
    //use specific array elements
    val myArray = arrayOf(1,2,3)
    for(i in myArray) {
        println(i)
    }

    //use range
    for( i in 5..10) {
        println(i)
    }

    //count down
    for(i in 10 downTo 5){
        println(i)
    }

    //count down with 2 difference
    for(i in 10 downTo 5 step 2){
        println(i)
    }

    //print letters from a to z
    for(i in 'a'..'z') {
        println(i)
    }


    //practical example
    val myArray1 = arrayOf((4,5,8,9,10,2,3)
    var max = myArray1[0]
    for(item in myArray1) {
        if(item > max) {
            max = item
        }
    }
    println("Maximum value of array is $max")

}
