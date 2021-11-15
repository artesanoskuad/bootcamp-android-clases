package com.artesanoskuad.pruebakotlin

const val POINTS_X_PASS: Int = 15
val mutablePassAccounts: MutableMap<Int, Int> = mutableMapOf(1 to 100, 2 to 100, 3 to 100)
val passReport: Map<Int, Int> = mutablePassAccounts

fun updatePointsCredit(accountId: Int) {
    if (mutablePassAccounts.containsKey(accountId)) {
        println("Updating $accountId...")
        mutablePassAccounts[accountId] = mutablePassAccounts.getValue(accountId) + POINTS_X_PASS
        println("Nuevo Saldo: ${mutablePassAccounts[accountId]}")
    } else {
        println("Error: Trying to update a non-existing account (id: $accountId)")
    }
}

fun accountsReport() {
    println("EZ-Pass report:")
    passReport.forEach {
            (k, v) -> println("ID $k (key): credit $v (value)")
    }
}

fun addNewKey(id: Int){
    if(mutablePassAccounts.containsKey(id).not()){
        mutablePassAccounts[id] = 100
        println("El id $id fue creado con exito")
    } else {
        println("El id $id ya existe")
    }
}

fun main() {
    accountsReport()
    updatePointsCredit(1)
    updatePointsCredit(1)
    updatePointsCredit(5)
    updatePointsCredit(2)
    updatePointsCredit(2)
    updatePointsCredit(3)
    updatePointsCredit(3)
    updatePointsCredit(3)
    updatePointsCredit(3)
    addNewKey(5)
    updatePointsCredit(5)
    accountsReport()
}