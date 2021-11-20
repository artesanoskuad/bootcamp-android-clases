package com.artesanoskuad.pruebakotlin

fun main(){
    val numbers = listOf(2, -2, 8, -4, 10, -6, 12)
    val anyNegative : Boolean = numbers.any { it < 0 }
    val anyGT6 = numbers.any { it > 6 }

    println("any negative: $anyNegative, anyGT6: $anyGT6")

    val allEven = numbers.all { it % 2 == 0 }
    val allLess18 = numbers.all { it < 18 }

    println("allEven: $allEven, allLess18: $allLess18")

    val allLess6 = numbers.none { it > 60 }

    println("allLess6: $allLess6")
}