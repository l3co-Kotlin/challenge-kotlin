package academy.learningprogramming

fun main() {

    val floatVar: Float = -3847.384f

    val floatVar1: Float? = -3847.384f

    val shortArray = shortArrayOf(1, 2, 3, 4, 5)
    val shortArray2: Array<Short> = arrayOf(1, 2, 3, 4, 5)

    println("======================================================")

    Array<Short>(5) { i -> ((i) + 1.toShort()).toShort() }.forEach { println(it) }

    println("======================================================")

    Array<Int?>(200 / 5) { i -> (i + 1) * 5 }.forEach { println(it) }

    println("======================================================")

    charArrayOf('a', 'b', 'c').forEach { println(it) }

    println("======================================================")


    val x: String? = "I AM IN UPPERCASE"

    val y: String = x?.toLowerCase() ?: "I give up!"

    println(y)


    println("======================================================")

    val myNonNullVariable: Int? = null
    myNonNullVariable?.let { it.toDouble() }
//    myNonNullVariable!!.toDouble()
}