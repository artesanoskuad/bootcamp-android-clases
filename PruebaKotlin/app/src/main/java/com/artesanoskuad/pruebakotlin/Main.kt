package com.artesanoskuad.pruebakotlin

fun cases(obj: Any) {
    when (obj) { // 1
        1 -> println("One") // 2
        "Hello" -> println("Greeting") // 3
        is Long -> println("Long") // 4
        !is String -> println("Not a string") // 5
        else -> println("Unknown") // 6
    }
}

class SuperClase {
    fun superMetodo(){
        println("Soy un super método")
    }
}

fun whenAssign(obj: Any): Any {
    val result = when (obj) { // 1
        1L -> "one" // 2
        "Hello" -> 1 // 3
        is Long -> false // 4
        7 -> SuperClase()
        else -> 42 // 5
    }
    return result
}

fun main(){
    //cases("Goku")
    //cases(1)
    //cases("Hello")
    val superClase = SuperClase()
    superClase.superMetodo()
    val result = whenAssign(8)

    //(result as SuperClase).superMetodo()
    if(result is SuperClase) {
        result.superMetodo()
    }
    print(result)

}