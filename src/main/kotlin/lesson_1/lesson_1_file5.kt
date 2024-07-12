package org.example.lesson_1


fun main() {

    val minutes = SECONDS / 60

    val remainingSeconds = SECONDS % 60

    val hour = minutes / 60

    val remainingMinutes = minutes % 60

    val formattedTime = String.format("%02d:%02d:%02d", hour, remainingMinutes, remainingSeconds)
    println(formattedTime)



}

const val SECONDS = 6480