import java.io.IO.println

fun main() {
    var myVariable:Int = 5
    println("The value of my var int variable is : $myVariable")
    myVariable = 1
    println("The value of my var int variable is now: $myVariable")

    val myVariable1 = 1
    println("The value of my val variable is $myVariable1")
//    myVariable1 = 2
    println("The value of val variable is now: $myVariable1")

    var myBoolVariable = true
    println("The value of my bool variable is: $myBoolVariable")
    myBoolVariable = false //can't assign 1 or 0
    println("The value of my bool variable is now: $myBoolVariable")


    //practice task:
    var myName:String = "Zeeshan Ahmed"
    var myAge:Int = 23
    println("My name is: $myName.")
    println("I am $myAge years old.")
}
