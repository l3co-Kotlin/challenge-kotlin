package academy.learningprogramming

fun main() {
    val hello1: String = "Hello"
    val hello2: String = "Hello"

    println(hello1.equals(hello2))
    println(hello1 == hello2)
    println(hello1 === hello2)

    var value = 2988
    val test: Any

    test = "Abc"

    if (test is String) {
        println(test.toUpperCase())
    }
}
