package academy.learningprogramming

import java.lang.NumberFormatException

fun main() {

    val value = "17"

    val number = try {
        value.toInt()
    } catch (ex: NumberFormatException) {
        0
    } finally {
        println("Finally number")
    }

    println(parseNumber("10.1") ?: "Can't parse the value")

}

fun parseNumber(num: String): Int? {
    return try {
        num.toInt()
    } catch (ex: NumberFormatException) {
        null
    } finally {
        println("Finally parseNumber")
    }
}