package academy.learningprogramming

fun main() {

    val coffees = mapOf<String, Coffee>(
        "Colombia" to Coffee("Colombian coffee", 10),
        "Brasilian" to Coffee("Minas coffee", 5)
    )

    val pair = Pair<String, Int>("leco", 26)

    val (fullName, age) = pair

    val (name, caffeine) = Coffee("Colombian coffee", 10)

}

class Coffee(val name: String, val caffeine: Int) {

    operator fun component1() = name
    operator fun component2() = caffeine
}