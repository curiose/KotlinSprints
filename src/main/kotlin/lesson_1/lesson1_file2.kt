package org.example.lesson_1


fun main() {
    val numberOfOrders: Int = 1000
    val messageAfterOrder: String = "Благодарим за то, что выбрали нас и совершили покупку!"
    var numberOfWorkers = 2000

    println(numberOfOrders)
    println(messageAfterOrder)
  //println(numberOfWorkers)

    numberOfWorkers = 1999
    println(numberOfWorkers)
}