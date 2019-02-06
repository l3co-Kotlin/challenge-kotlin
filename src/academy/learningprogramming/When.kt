package academy.learningprogramming

enum class Estacoes {
    PRIMAVERA, VERAO, INVERNO, OUTONO
}

fun main() {

    val estacao = Estacoes.PRIMAVERA

    when (estacao) {
        Estacoes.PRIMAVERA -> println("PRIMAVERA")
        Estacoes.VERAO -> println("VERAO")
        Estacoes.INVERNO -> println("INVERNO")
        Estacoes.OUTONO -> println("OUTONO")
    }

    val value = 10

    when (value) {
        in 0..5 -> println("First range")
        in 6..10 -> println("Second range")
        else -> println("Range out")
    }


}