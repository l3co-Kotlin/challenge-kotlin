package academy.learningprogramming

fun main() {
    println(labelMultiply(10, 7, "This result is : "))
    println(Employee1("Leco").firstNameUpperCase())

    printCarColor(
        Car1("black"),
        Car1("Green"),
        Car1("Red")
    )


}

fun printCarColor(vararg cars: Car1) {
    for (car in cars) {
        println(car.color)
    }
}

fun labelMultiply(a: Int, b: Int, label: String) = "$label ${a * b}"

class Employee1(val firstName: String) {

    fun firstNameUpperCase() = firstName.toUpperCase()
}

data class Car1(val color: String)