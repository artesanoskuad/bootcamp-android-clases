package com.artesanoskuad.pruebakotlin

fun main() {
    val numbers = listOf(1, -2, 3, -4, 5, -6)
    val numerosPositivos = numbers.filter { x -> x > 0 }
    val numerosNegativos = numbers.filter { it < 0 }

    println(numbers)
    println(numerosPositivos)
    println(numerosNegativos)


}