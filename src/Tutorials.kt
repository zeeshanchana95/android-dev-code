import java.io.IO.println

fun main() {
    val array = intArrayOf(10,20,25)
    val max = getMax(1,2,7,5,3, *array,4,6,1,10,15,4)
    println("The maximum is $max")
    searchFor("How to become a good programmer.")
    searchFor(search = "How to become the best Kotlin Programmer.", searchEngine = "Bing")
    searchFor(searchEngine = "Bing", search = "How to become best Kotlin programmer.")

    val sum = alternatingSum(3,4,5,2,1,2,3)
    println("The alternating sum is $sum")
}

//vararg:
    //- used to accept one or more than one input from user
    //- used to insert array items in between to our vararg elements

//default arguments:
    //- set initial value of an argument during function declaration

//named Parameters or Named Arguments:
    //- used for our easiness if we have lots of parameters
    //- you don't need to remember its order but just use name of parameter and then assign value to it.


fun searchFor(search: String, searchEngine:String = "Google") {
    println("Searching for $search on $searchEngine")
}
fun getMax(vararg numbers:Int):Int {
    var max = numbers[0]
    for(number in numbers) {
        if(number > max) {
            max = number
        }
    }
    return max
}

//homework: create a function named "alternatingSum" that takes vararg parameter and the function should return the alternating sum (firstNumber - secondNumber + thirdNumber - fourthNumber + etc. of the numbers
fun alternatingSum(vararg numbers:Int):Int {
    var alternativeSum = 0
    for(i in 0..numbers.size - 1) {
        if(i %2 == 0) {
            alternativeSum += numbers[i]
        } else {
            alternativeSum -= numbers[i]
        }
    }
    return alternativeSum;
}