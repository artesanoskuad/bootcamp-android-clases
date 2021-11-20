package com.artesanoskuad.pruebakotlin

fun main() {
    val coordinates: Pair<Int, Int> = Pair(2, 3)
    val coordinatesDos: Pair<Int, String> = Pair(2, "Tres")
    val coordinatesInferred = Pair(4, 8)
    val coordinatesWithTo = 2 to 3
    val coordinatesDoubles = Pair(2.1, 3.5)

    val x1 = coordinates.first
    val y1 = coordinates.second
    val (x, y) = coordinates


    print(coordinates)
    print(coordinatesDos)
    print(coordinatesInferred)
    print(coordinatesWithTo)
    print(coordinatesDoubles)
    println()
    print(x1)
    print(y1)
    println()
    print(x)
    print(y)
    println()

    val coordinates3D = Triple(2, 3, 1)
    val x3 = coordinates3D.first
    val y3 = coordinates3D.second
    val z3 = coordinates3D.third
    val (x4, y4, z4) = coordinates3D
    print(coordinates3D)
}