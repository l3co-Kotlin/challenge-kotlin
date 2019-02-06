package academy.learningprogramming

fun main() {

    var str: String? = null

    println(str?.toUpperCase())
    println(str?.toUpperCase() ?: "Null variable")

    var abc: Any? = arrayOf("abc", "aaaa")

    println("The var abc is ${abc as? String}")

    val str2: String? = "Abc1234"

    printText(str2 ?: "Teste")

    str2?.let { printText("\n$it\n") }
}

fun printText(str: String) {
    println(str)
}