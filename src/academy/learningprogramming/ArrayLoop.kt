package academy.learningprogramming

fun main() {

    val names = arrayOf("Leandro", "Gabriel", "Juliana")
    for (index in names.indices) {
        println("Name : ${names[index]} - Position : $index")
    }
}