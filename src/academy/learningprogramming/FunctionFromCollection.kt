package academy.learningprogramming

fun main() {

    val colors = listOf("white", "black", "green")
    println(colors)

    val seasons = listOf("Spring", "Winter", "Summer", "Fall")

    val zippedCollections = colors.zip(seasons)
    println(zippedCollections)

    println(colors + seasons)

    println(colors.union(seasons))

    val listEmpty = emptyList<String>()

    val intList = listOf(1, 2, 3, 4, 5)

    println(intList.max())

    println(intList.min())

    if (!listEmpty.isEmpty()) {
        println(listEmpty[0])
    }

    println(listEmpty)


}