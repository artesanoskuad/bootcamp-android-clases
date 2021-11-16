package com.artesanoskuad.pruebakotlin

fun main() {
    val words = listOf("Lets", "find", "somehow", "in", "collection", "somehow")
    val first = words.find { it.startsWith("some") }
    val last = words.findLast { it.startsWith("some") }

    println("first: $first, last: $last")
}