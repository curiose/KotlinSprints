package org.example

fun main() {

    val multiplier = 4

    var multiplierTable = ""

    for (i in 1..9) {
        val result = multiplier * i
        multiplierTable += "$multiplier x $i = $result\n"
    }

    println(multiplierTable)
}