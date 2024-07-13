package org.example

fun main() {

    val hourDeparture = 9
    val minuteDeparture = 39
    val timeInTrip = 457

    val totalMinutesInTrip = hourDeparture * REMAINED + minuteDeparture + timeInTrip

    val hourArrival = totalMinutesInTrip / REMAINED

    val minutesArrival = totalMinutesInTrip % REMAINED

    val formattedTimeArrival = String.format("Время прибытия поезда: %02d:%02d", hourArrival, minutesArrival)
    println(formattedTimeArrival)

}

const val REMAINED = 60