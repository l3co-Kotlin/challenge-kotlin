package academy.learningprogramming

fun main() {


    Array(16) { i -> i * 2 }.forEach { println(it) }

    Vocation().printOfArrayInt(intArrayOf(1, 2, 34, 8))
//    Vocation().printOfArrayInt(arrayOf(12, 3, 4, 5))

    val ints = IntArray(5)
    Vocation().printOfArrayInt(ints)

    arrayOf(1, '1', 1, "abc").forEach { p -> println(p) }

    Vocation().printOfArrayInt(arrayOf(1, 3, 4, 5, 6).toIntArray())
}