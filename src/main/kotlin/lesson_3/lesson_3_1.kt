package org.example.lesson_3

fun main() {

    val userName = "Гость"
    val afternoon = 12
    val evening = 17

    fun greets(currentTime : Int, userName : String) {
        if (currentTime >= 16 ) {
            println("Добрый вечер, $userName")
        }
        else {
            println("Добрый день, $userName")
        }
    }

    var greeting = greets(afternoon, userName)

    greeting = greets(evening, userName)

}
