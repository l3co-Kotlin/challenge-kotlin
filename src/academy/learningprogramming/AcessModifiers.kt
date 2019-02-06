package academy.learningprogramming

fun main() {

    val john = Employee("John")
    val isis = Employee("Isis", false)

    println("================= ${john.firstName} ===================")

    println(john.firstName)
    println(john.fullTime)

    println("================= ${isis.firstName} ===================")

    println(isis.firstName)
    println(isis.fullTime)

//    ==================== Car Data Class =====================


    val car = Car("white", "Fiat", 2015)

    println(car)

    val car2 = car.copy(model = "Mercedes")
    println(car2)
}

data class Car(val color: String, val model: String, val year: Int)

class Employee(val firstName: String, fullTime: Boolean = true) {
    var fullTime = fullTime
        get() {
            println("Running the custom get")
            return field
        }
        set(value) {
            println("Running the custom set $value")
            field = value
        }
}


//class Employee(val firstName: String, var fullTime: Boolean = true)

//class Employee constructor(val firstName: String)
//class Employee(val firstName: String) {
//
//    var fullTime: Boolean = true
//
//    constructor(firstName: String, fullTime: Boolean) : this(firstName) {
//        this.fullTime = fullTime
//    }
//}


//    val firstName: String
//
//    init {
//        this.firstName = firstName
//    }
//    val firstName = firstName