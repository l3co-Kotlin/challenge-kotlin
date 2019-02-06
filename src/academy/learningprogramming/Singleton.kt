package academy.learningprogramming

import java.time.Year

fun main() {

    println(CompanyCommunications.getTagLine())
    println(CompanyCommunications.getCopyrightLine())
}

object CompanyCommunications {

    private val currentYear = Year.now().value

    fun getTagLine() = "Our company rocks!"

    fun getCopyrightLine() = "Copyright \u0049 $currentYear Our Company. All rights reserved."
}