package org.example.lesson_1

fun main() {
    val length: Long = 40_868_600_000
    val age: Byte = 27
    val partOfDay: Float = 0.075f
    val seconds: Short = 6480
    val partOfYear: Double = 2.0547945205479453E-4
    val apogee: Int = 327000

    println("Расстояние, которое пролетел Гагарин пока был в космосе в миллиметрах - $length,\nВозраст Гагарина на момент полета (целых лет) - $age,\n" +
            "Какую часть дня Гагарин провел в космосе - $partOfDay,\nКоличество секунд которое Гагарин провел в космосе - $seconds,\n" +
            "какую часть года Гагарин провел в космосе - $partOfYear,\nАпогей орбиты Гагарина в метрах - $apogee\n")
}