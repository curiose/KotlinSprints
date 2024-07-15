package org.example.lesson_1


fun main() {

    val seconds = 6480

    val minutes = seconds / REMAINDER

    val remainingSeconds = seconds % REMAINDER

    val hour = minutes / REMAINDER

    val remainingMinutes = minutes % REMAINDER

    val formattedTime = String.format("%02d:%02d:%02d", hour, remainingMinutes, remainingSeconds)
    println(formattedTime)

}

const val REMAINDER = 60