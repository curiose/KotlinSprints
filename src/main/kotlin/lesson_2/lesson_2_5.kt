package org.example.lesson_2

import kotlin.math.pow

fun main() {

    val deposit = 70_000
    val interestRate = 16.7

    val years = 20

    val devidents = deposit * (1 + interestRate / 100).pow(years.toDouble())
    val totalDevidents = String.format("Размер вклада через 20 лет: %.3f", devidents)

    println(totalDevidents)
}