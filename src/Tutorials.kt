import java.io.IO.println

fun main() {
    val list = listOf(1,2,3,4,5)
    val array = arrayOf(1,2,3,4,5)

    println(list)

    printAlternately(array)
}

fun printAlternately(list: List<Int>) {
    var i = 0
    var j = list.size - 1
    var toggle = true
    while (i <= j) {
        if(toggle) {
            println(list[i])
            i++
        } else {
            println(list[j])
            j--
        }
        toggle = !toggle
    }
}
