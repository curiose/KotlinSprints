package org.example.lesson_1

//Объяви переменную с количеством секунд, которые Гагарин провел в космосе.
//
//- Переведи в коде количество секунд в целые минуты и целые часы, сохраняя остаток секунд и минут в новые переменные;
//- Выведи в консоль время, проведенное в космосе в формате [часы:минуты:секунды], например так: 01:30:09;
//- Значения часов, минут и секунд отображать двумя цифрами.

fun main() {
    val seconds = 6480

    val minutes = seconds / 60

    val remainingSeconds = seconds % 60

    val hour = minutes / 60

    val remainingMinutes = minutes % 60

    println("$hour:$remainingMinutes:$remainingSeconds"+"0")


}