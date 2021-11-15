package com.artesanoskuad.pruebakotlin

val systemUsers: MutableList<Int> = mutableListOf(1, 2, 3)
//val sudoers: List<Int> = systemUsers // 2

fun main() {
    addSudoer(4)
    println("Tot sudoers: ${getSysSudoers().size}")
    getSysSudoers().forEach {
            i -> println("Some useful info on user $i")
    }
    getSysSudoers()
    addSudoer(5)
}

fun addSudoer(newUser: Int) {
    systemUsers.add(newUser)
}

fun getSysSudoers(): List<Int> {
    return systemUsers
}