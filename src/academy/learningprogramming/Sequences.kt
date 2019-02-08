package academy.learningprogramming

fun main() {

    val carsTest = listOf<CarTest>(
        CarTest("Ford", 2018, "black"),
        CarTest("Honda", 2019, "white"),
        CarTest("Chevrollet", 2016, "white"),
        CarTest("Yunday", 2000, "white")
    )

    carsTest.printList()

    val carGt2018 = carsTest.asSequence()
        .filter { it.year >= 2016 }
        .map { println(it.name); it.color }
        .filter { it.equals("black") }
        .map { println(it); it }
        .toList()

    carGt2018.printList()

}

fun <T> List<T>.printList() {
    this.forEach { println(it) }
    println("Finish print list")
}

data class CarTest(val name: String, val year: Int, val color: String)