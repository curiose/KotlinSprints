package org.example

fun main() {

    val numberOfSpecialists = 50
    val eachSpecialistSalary = 30000
    val numberOfInterns = 30
    val eachInternSalary = 20000

    val specialistsSalary = numberOfSpecialists * eachSpecialistSalary
    println("Всего зарплата специалистов составляет: $specialistsSalary рублей")

    val internsSalary = numberOfInterns * eachInternSalary
    println("Всего зарплата стажеров составляет: $internsSalary рублей")

    val wholeSalary = specialistsSalary + internsSalary

    val averageSalary = wholeSalary / (numberOfSpecialists + numberOfInterns)
    println("Средний заработок одного сотрудника составляет: $averageSalary рублей")

}