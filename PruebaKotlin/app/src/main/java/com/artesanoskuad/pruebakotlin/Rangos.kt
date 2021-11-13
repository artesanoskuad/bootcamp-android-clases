package com.artesanoskuad.pruebakotlin

fun main(){
    for(indice in 1..3){
        println(indice)
    }
    println()
    for(i in 2..8 step 2) { // 2
        println("$i step 2")
    }
    println()
    for (i in 3 downTo 0) { // 3
        println("$i downTo 0")
    }
    println()
    for (c in 'A'..'Z') { // 1
        print(c)
    }
    println()
    for (c in 'A'..'Z' step 2) { // 1
        print(c)
    }
    println()
    val x = 2
    if (x in 1..5) { // 1
        print("x is in range from 1 to 5")
    }
    println()
    if (x !in 6..10) { // 2
        print("x is not in range from 6 to 10")
    }
}