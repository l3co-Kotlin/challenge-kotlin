package academy.learningprogramming

abstract class Printer(val modelName: String) {

    open fun printerModel() = println("The model name of this printer is $modelName")
    abstract fun bestSelling(): Double

}

class LaserPrinter(modelName: String) : Printer(modelName) {
    override fun bestSelling() = 129.90
    override fun toString(): String {
        return "LaserPrinter(modelName = $modelName)"
    }
}

fun main() {
    val laserPrinter = LaserPrinter("Hp 1220")
    laserPrinter.printerModel()
    println(laserPrinter)
}