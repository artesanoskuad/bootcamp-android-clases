package com.artesanoskuad.pruebakotlin

fun main(){
    val shuffled = listOf(5, 4, 2, 1, 3)
    val natural = shuffled.sorted()
    val inverted = shuffled.sortedBy { -it }
    val randomValues = shuffled.shuffled()

    println("natural: $natural, inverted: $inverted, random: $randomValues")

}