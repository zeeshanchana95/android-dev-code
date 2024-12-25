import java.io.IO.println


fun main() {
    //nullable values
//    val userInput = readLine()
//    println(userInput.toUpperCase()) //error: value can be nullable


    //readLine() always return string value even you enter number
    println("Enter something: ")
    val userInput = readLine()
    if(userInput != null)
        println(userInput.toInt() - 5)


    //practice task
    val inputAge = readLine()
    val age = inputAge.toInt()
    if(age > 0 && age < 18)
        println("You are not an adult.")
    else if(age >= 18 && age <65)
        println("You are an adult.")
    else
        println("You are really really old")

}
