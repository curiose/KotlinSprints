package org.example

fun main() {

    val progressLogs = "D2-D4;0"

    val splttedMoveNumber = progressLogs.split(";")
    val splittedMoves = splttedMoveNumber[0].split("-")

    val moveFrom = splittedMoves[0]
    println("Ход из клетки: $moveFrom")

    val moveTo = splittedMoves[1]
    println("Ход в клетку: $moveTo")

    val moveNumber = splttedMoveNumber[1]
    println("Номер хода: $moveNumber")
}