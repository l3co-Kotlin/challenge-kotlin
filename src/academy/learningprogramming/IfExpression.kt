package academy.learningprogramming

fun main() {

    val intRange = arrayOf(1, 4, 6, 10)

    if (10 in intRange)
        println("Number in range")

    println(if (5 in intRange) "Number find in range" else "Not found number in range")
}