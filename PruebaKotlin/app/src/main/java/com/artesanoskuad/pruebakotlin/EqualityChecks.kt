package com.artesanoskuad.pruebakotlin

class Test

fun main(){
    val test1 = Test()
    val test2 = Test()

    if(test1 == test2){
        println("Son iguales $test1 == $test2")
    } else {
        println("No son iguales $test1 == $test2")
    }
    val numeroMaximo = max(10,12)
    println(numeroMaximo)
}

fun max(a: Int, b: Int) = if (a > b) a else b