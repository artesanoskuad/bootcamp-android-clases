package com.artesanoskuad.pruebakotlin

enum class State {
    IDLE, RUNNING, FINISHED;
    fun prueba(){
        println("Esto es una prueba")
    }
}

enum class Color(val rgb: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF),
    YELLOW(0xFFFF00);
    fun containsRed() = (this.rgb and 0xFF0000 != 0)
    fun otraFuncion() {
        print("Otra funcion")
    }
}

fun main(){
    val primerEstado = State.IDLE
    val segundoEstado = State.RUNNING
    val tercerEstado = State.FINISHED

    val message = when (tercerEstado) {
        State.IDLE -> "It's idle"
        State.RUNNING -> "It's running"
        State.FINISHED -> "It's finished"
    }
    println(message)

    primerEstado.prueba()

    val red = Color.RED
    println(red)
    println(red.rgb)
    println(red.containsRed())
    println(Color.BLUE.containsRed())
    red.otraFuncion()
}