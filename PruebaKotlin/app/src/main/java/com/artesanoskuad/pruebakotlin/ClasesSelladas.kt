package com.artesanoskuad.pruebakotlin

sealed class Mammal(val name: String)
class Cat(catName: String) : Mammal(catName)
class Human(humanName: String, val job: String) : Mammal(humanName)

fun greetMammal(mammal: Mammal): String {
    return when (mammal) { // 3
        is Human -> "Hello ${mammal.name}; You're working as a ${mammal.job}"
        is Cat -> "Hello ${mammal.name}"
    }
}
fun main() {
    val snowy = greetMammal(Cat("Snowy"))
    println(snowy)
    val jon = greetMammal(Human("jon", "singer"))
    println(jon)
}