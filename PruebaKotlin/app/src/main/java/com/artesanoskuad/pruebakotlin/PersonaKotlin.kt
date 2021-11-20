package com.artesanoskuad.pruebakotlin


class MutableStack<E>(private vararg val items: E) {

    fun randomObject(): E {
        return items.random()
    }

    /*fun <E> genericsFunction(param: E) {
        print(param)
    }*/
}

class OtraClase {

    fun <H> estoTambienEsGeneric(param: H){
        print(param)
    }
}

fun main() {

    val mutableInt: MutableStack<Int> = MutableStack(1, 2, 3, 4, 5, 6, 7, 8)
    val mutableString = MutableStack("uno", "dos", "tres", "cuatro")
    val mutableStringJava = MutableStackJava(listOf("Juno", "Jdos", "Jtres", "Jcuatro"))

    val randomInt = mutableInt.randomObject()
    val randomString = mutableString.randomObject()
    val randomJava = mutableStringJava.randomObject()

    println(randomInt)
    println(randomString)
    println(randomJava)

}