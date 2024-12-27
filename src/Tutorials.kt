import java.io.IO.println

fun main() {
    val pow = printPow(3,5)
    println("3 to the power of 5 is: $pow")
    println(multiply(3,5))

    val list = listOf(3,2,5,1,5,6,7)
    val index = returnItemIndex(list, 5)
    println("The index of 5 is: $index")
}

fun printFirstItem(list:listOf<Int>) = println(list[0])

//single line functions
fun multiply(a:Int, b:Int) = a * b

fun printPow(base: Int, exponent:Int):Int {
    var result = 1
    for(i in 1..exponent) {
        result *= base
    }
    return result
//    println("after") //ignored
}


// practice task: given a list with items. user give item to search from list and program will return index of item.
fun returnItemIndex(list:listOf<Int>, searchedItem:Int):Int {
    for (item in 0..list.size - 1) {
        if(searchedItem == list[item]) {
            return item
        }
    }
}


//practice task
fun calculateSum(num:Int):Int {
    var sum = 0
    for(i in 1..num) {
        sum += num
    }
    return sum
}