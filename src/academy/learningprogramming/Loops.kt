package academy.learningprogramming

fun main() {

    println("============ Range ===============")
    val range = 1..5
    for (i in range) {
        println(i)
    }
    println("==================================")

    println("============ charr ===============")
    val charRange = 'a'..'z'
    for (a in charRange) {
        println(a)
    }

    println("==================================")


    println("============ String ===============")
    val stringRange = "ABC".."XYZ"

    for (r in stringRange.endInclusive) {
        println(r)
    }

    println("==================================")

    println(3 in range)
    println('q' in charRange)
    println("CCC" in stringRange)
    println("CCCCCCC" in stringRange)
    println("ZZZZZ" in stringRange)

    val backwardRange = 5.downTo(1)

    for (l in backwardRange) {
        println(l)
    }

    val stepedSet = 1..30

    for (g in stepedSet.step(4)) {
        println(g)
    }

    println("==================================")
    println("==================================")
    println("==================================")
    for (a in 0..10 step 2)
        println(a)


    println("==================================")
    println("==================================")
    println("==================================")
    for (a in 50 downTo 0 step 7)
        println(a)

}

