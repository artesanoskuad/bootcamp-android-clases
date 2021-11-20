package com.artesanoskuad.pruebakotlin

fun main() {
    val sumResult = calculate(4, 5, ::sum)
    val mulResult = calculate(4, 5) { a, b -> a * b }
    val restaResult = calculate(4, 5){ a, b -> a - b }

    println("sumResult $sumResult, mulResult $mulResult, resta $restaResult")

    val func = operation()
    println(func(5))
}

fun calculate(x: Int, y: Int, operation: (Int, Int) -> Int): Int {
    return operation(x, y)
}

fun sum(x: Int, y: Int) = x + y

fun resta(x: Int, y: Int) = x - y

fun operation(): (Int) -> Int {
    return ::square
}

fun square(x: Int) = x * x
