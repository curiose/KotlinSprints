package org.example

fun main() {

    val buff = 20
    val crystalOre= 7
    val ironOre = 11

    val crystalOreWithBuff = (crystalOre * buff) / HUNDRED.toInt()
    val ironOreWithBuff = (ironOre * buff) / HUNDRED.toInt()

    println("Плюс $crystalOreWithBuff к материалу 'Кристалличесская руда'")

    println("Плюс $ironOreWithBuff к материалу 'Железная руда'")

}

const val HUNDRED = 100

