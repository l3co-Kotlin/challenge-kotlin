package academy.learningprogramming

fun main() {

    val number = 100f

    println("The number is ${number is Float} ")

    val number2: Any = 25.00

    println("The number is ${number2 is Float}")

    println(Vocation().isMyVocation(true))
}