package org.example

fun main() {

    val tables = 13
    val reservedTablesToday = tables
    val reservedTableTomorrow = 9

    val avTableToday = tables - reservedTablesToday > 0
    val avTableTomorrow = tables - reservedTableTomorrow > 0

    println("[Доступность столиков на сегодня: $avTableToday]\n[Доступность столиков на завтра: $avTableTomorrow]")
}