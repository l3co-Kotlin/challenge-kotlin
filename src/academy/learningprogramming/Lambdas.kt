package academy.learningprogramming

fun main() {

//    run { println("Test") }
//    println(countTo100())

    val employees = listOf(
        Employees("Leandro", "costa", 2017),
        Employees("Juliana", "costa", 2013),
        Employees("Marcos", "costa", 1993)
    )

    println(findByLastName("costa", employees))

//
//    println(employees.minBy { e -> e.startYear })
//    println(employees.maxBy { e -> e.startYear })
}

fun findByLastName(name: String, employees: List<Employees>) {

    employees.forEach returnBlock@{
        if (it.lastName == name) {
            println("Name found ${it.firstName}")
            return@returnBlock
        }
    }

    println("Name not found")
}

fun countTo100() =
    StringBuilder().apply {
        (1..99).forEach { number ->
            append(number)
            append(", ")
        }
        append(100)
    }.toString()

//fun countTo100(): String = with(StringBuilder()) {
//    (1..99).forEach { number ->
//        append(number)
//        append(", ")
//    }
//    append(100)
//    toString()
//}


//fun countTo100(): String {
//    val numbers = StringBuilder()
//    for (i in 1..99) {
//        numbers.append(i)
//        numbers.append(", ")
//    }
//    numbers.append(100)
//    return numbers.toString()
//}

data class Employees(val firstName: String, val lastName: String, val startYear: Int)