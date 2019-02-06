package academy.learningprogramming

interface CustomString {

    fun upper(value: String): String
}

fun myTest(cs: CustomString) {

    println(cs.upper("Test 123"))
}

fun main() {
    myTest(object : CustomString {
        override fun upper(value: String) = value.toUpperCase()
    })
}