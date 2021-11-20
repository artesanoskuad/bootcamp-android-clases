package com.artesanoskuad.pruebakotlin

fun main() {
    printAll("mensaje 1", "mensaje 2", "mensaje 3")
    printAllNumbers(1,3,4,5,6,8)
    val nombre = "Harttin"
    val variable = "Esto es un string"
    variable.estaFuncionVaAImprimir(5,5)

    val entera : Int = 10
    entera.nombreDeLaFuncionDeExtension()
}

fun printAll(vararg messages: String) {
    for (m in messages) {
        println(m)
    }
}

fun printAllNumbers(vararg edades: Int) {
    for(goku in edades){
        println("La edad es: $goku")
    }
}

fun Int.nombreDeLaFuncionDeExtension(){
    println("Esto se encuentra en una función de extensión")
}

fun String.estaFuncionVaAImprimir(parametroUno: Int, parametroDos: Int){
    print("$parametroUno y $parametroDos")
}