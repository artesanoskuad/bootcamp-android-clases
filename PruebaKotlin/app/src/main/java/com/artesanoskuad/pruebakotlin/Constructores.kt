package com.artesanoskuad.pruebakotlin

class OtroNombre() {

    init {
        println("Init block")
    }

    constructor(i: Int) : this() {
        println("Constructor $i")
    }

    constructor(nombre: String) : this() {
        println("Constructor con parametro nombre: $nombre")
    }

}

fun main(){
    val constructors = OtroNombre(1)
    val constructorsSegundoIntento = OtroNombre()
    val constructorsTercerIntento = OtroNombre("Harttin")
}