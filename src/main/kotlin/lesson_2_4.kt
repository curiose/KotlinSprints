package org.example

fun main() {

    val crystalOre= 7
    val ironOre = 11

    val crystalOreWithBuff = (crystalOre * BUFF).toInt()
    val ironOreWithBuff = (ironOre* BUFF).toInt()

    println("Плюс $crystalOreWithBuff к материалу 'Кристалличесская руда'")

    println("Плюс $ironOreWithBuff к материалу 'Железная руда'")

}

const val BUFF = 0.20

