import java.io.IO.print
import java.io.IO.println

fun main() {
    //when statement
        //use to simply if statements
        //it takes less line of code
        //simplify statements
    val age = readLine()?.toInt()
    val x = 5
    when(age) {
        in 0..5 -> println("You're a young kid.")
        in 6..17 -> println("You're a teenager.")
        18 -> println("Finally, you're 18")
        19, 20 -> println("You're a young adult.")
        in 21..65 -> println("YOu're an adult.")
        else -> println("You're are really old.")
    }

    val string = readLine()
    when(string) {
        "hello" -> println("How are you?")
    }

    //if there is another variable which needs to be compared then we can't use when statement anymore because when statement is dependent on only single variable
    when(age) {
        in 0..5 -> println("You're a young kid.")
//        println("Another line.") //can't use more than two statements. Note: use {} for that
        in 6..17 -> println("You're a teenager.")
//        18 && x==6 -> println("You are 18") //error: can't use two variables
        18 -> if (x == 6) {
            println("Finally, you're 18")
        }

        19, 20 -> {
            println("You're a young adult.")
            println("Another line.")
        }
        in 21..65 -> println("YOu're an adult.")
        else -> println("You're are really old.")
    }




    //solving problem using if statements
//    if(age in 0..5) {
//        println("You're a young kid.")
//    } else if (age in 6..17) {
//        println("You're a teenager")
//    } else if(age == 18) {
//        println("Finally, you're 18!")
//    } else if(age == 19 || age == 20) {
//        println("You're are a young adult.")
//    } else if(age in 21..65) {
//        println("You're an adult.")
//    } else {
//        println("You're are really old.")
//    }


    //practice task: take input from user as Country name and then greet in that way.
    val countryName = readLine()
    when(countryName){
        "Pakistan" -> println("Assalam-o-alaikum")
        "USA" -> println("Hello")
        "Germany" -> println("Hallo")
        "Russia" -> println("privet")
        else -> println("I don't know Greetings of that country.")
    }
}
