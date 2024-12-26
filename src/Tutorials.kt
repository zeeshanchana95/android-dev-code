import java.io.IO.print
import java.io.IO.println

fun main() {
   //lists in kotlin
    //arrays values can be changed but lists value can't be change
    val array = arrayOf(1,2,3) //arrays size can't be changed
//    val list = listof(1,2,3)

    array[0] = 3
//    list[0] = 3 //values of lists are immutable means can't changed

    //how to make mutable list?
    //using mutable function
    val list = mutableListof(1,2,3) //mutable list can change even in size
    array[0] = 3
    list[0] = 3

    list.add(4) //add new item in list at runtime
    println(list) //print the whole list i.e., [1,2,3,4]

    //remove value at the end from the list
    list.remove(4)
    println(list) //[1,2,3]

    //remove value at particular index
    list.removeAt(2)
    println(list)

    //so, if we have to add values at the end, we need to use mutable list



    //practice task: task 10 numbers as input from user and then print the list at the end
    val mutableList = mutableListOf<Int>()
    println("Enter 10 numbers one by one to add in the list: ")
    for(i in 1..10) {
        val x = readLine()?.toInt()
        if(x != null){
            mutableList.add(x)
        }
    }
    //can also use for loop to print list items
//    for(i in mutableList) {
//        println(i)
//    }
    println(mutableList)



    //practice task: input 5 numbers from user and print them in reverse order
    val mutableList2 = mutableListOf<Int>()
    println("Enter 5 numbers one by one: ")
    for(i in 1..5) {
        val number = readLine()?.toInt()
        if(number != null) {
            mutableList2.add(number)
        }
    }
    for(i in mutableList2.size - 1 downTo 0) {
        println(mutableList2[i])
    }


    //practice task: input number larger than 1 and then generate fibonacci series up to that number
    val mutableList3 = mutableListOf(0, 1)
    println("Enter a number n > 1: ")
    val number = readLine()?.toInt()
    if(number != null) {
        var nextNumber = 0
        for(i in 2..number-1) {
            nextNumber = mutableList3[i-1] + mutableList3[i-2]
            mutableList3.add(nextNumber)
        }
    }
    println(mutableList3)

}
