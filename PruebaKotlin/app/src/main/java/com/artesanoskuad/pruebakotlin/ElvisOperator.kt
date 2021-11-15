package com.artesanoskuad.pruebakotlin

fun main() {
    val persona = Persona("Harttin", 36)
    val personaDos = Persona(null, null)
    val nombre: String = persona.nombre ?: ""
    val edad: Int = persona.edad ?: 0

    val nombreDos: String = personaDos.nombre ?: ""
    val edadDos: Int = personaDos.edad ?: 0

    println("mi nombre es $nombre y tengo ${nombre.length} caracteres y mi edad es $edad")
    println("mi nombre es $nombreDos y tengo ${nombreDos.length} caracteres y mi edad es $edadDos")
}