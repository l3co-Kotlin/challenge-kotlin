package academy.learningprogramming

fun main() {
    println(User.getNumber())
}

class User {
    companion object {
        private val number = 10f

        fun getNumber(): Float = number
    }
}