import java.io.IO.println


fun main() {
    //comparison operators give result as true or false
    val x = 4
    val y = 5
    println(x == y) //true when x = y
    println(x > y)
    println(x >= y)
    println(x < y)
    println(x <= y)
    println(x != y)

    //logical operators && (AND), || (OR), ! (NOT) used to combine expressions
    val a = 6
    val b = 10
    println(x == y && a == b) //true when all expressions result as true
    println(x == y || a == b) //true when any one expression results as true
    println(!(x == y) || a == b)

    //NOTE: AND operator (like * in math) expression will be evaluated first
    println(!(x == y || a == b && a > y))


    //practice task
    val simpleExpression = 3 > 4 || 4 > 3  && 4 <= 4 //true

    val bool = true
    val x1 = 9
    val y1 = 3
    val z1 = 9
    val hardExpression = !(x1 != z1) && bool || z1 > (x1 + y1) && (!bool || y1 < z1) //true
    println(hardExpression)
//                           9    9       true    9     9    3         true   3    9
//                           true      &&  true || 9 > 12        &&     false ||  true
//                           true     &&  true    || false        && false || true
//                           true ||  false || true
//                            true

}
