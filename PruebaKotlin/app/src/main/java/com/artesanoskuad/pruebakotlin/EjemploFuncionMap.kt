package com.artesanoskuad.pruebakotlin

fun main() {
    val numbers = listOf(1, -2, 3, -4, 5, -6)
    val doubled = numbers.map { x -> x * 2 }
    val tripled = numbers.map { it * 3 }
    val numbersString = numbers.map { x -> x.toString() }

    val listaFiltradaYModificada = numbers.filter { x -> x > 0 }
        .map { x -> x.toString() }

    println(numbers)
    println(doubled)
    println(tripled)
    println(numbersString)
    println(listaFiltradaYModificada)
}