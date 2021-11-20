package com.artesanoskuad.pruebakotlin

fun main(){
    //List<String> nombres = new ArrayList()
    val nombres = listOf<String>("Harttyn", "Goku", "Marcelo", "Raul", "ETC", "Vegeta")
    for(aux in nombres){
        println("Nombre: $aux, en un for")
    }

    println()

    var contador = 0
    while (nombres.size > contador){
        println("Nombre: ${nombres[contador]}, en un while")
        contador++
    }

    println()

    var contadorParaDoWhile = 0
    do {
        println("Nombre: ${nombres[contadorParaDoWhile]}, en un do while")
        contadorParaDoWhile++
    } while (nombres.size > contadorParaDoWhile)
}