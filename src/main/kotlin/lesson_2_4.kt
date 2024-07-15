package org.example

fun main() {

    val buff = 20
    val crystalOre= 7
    val ironOre = 11

    val crystalOreWithBuff = (crystalOre * buff) / 100.toInt()
    val ironOreWithBuff = (ironOre* buff)/ 100.toInt()

    println("Плюс $crystalOreWithBuff к материалу 'Кристалличесская руда'")

    println("Плюс $ironOreWithBuff к материалу 'Железная руда'")

}


