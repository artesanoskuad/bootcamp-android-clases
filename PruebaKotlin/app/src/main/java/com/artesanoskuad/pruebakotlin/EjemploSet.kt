package com.artesanoskuad.pruebakotlin

val openIssues: MutableSet<String> =
    mutableSetOf("uniqueDescr1", "uniqueDescr2", "uniqueDescr3")

fun addIssue(uniqueDesc: String): Boolean {
    return openIssues.add(uniqueDesc)
}

fun getStatusLog(isAdded: Boolean): String {
    return if (isAdded) {
        "registered correctly."
    } else {
        "marked as duplicate and rejected."
    }
}

fun registerIssueAndPrintLog(aNewIssue : String) {
    val isAddIssue = addIssue(aNewIssue)
    val statusLog = getStatusLog(isAddIssue)
    println("Issue $aNewIssue $statusLog")
}

fun main() {
    registerIssueAndPrintLog("uniqueDescr4")
    registerIssueAndPrintLog("uniqueDescr2")
    registerIssueAndPrintLog("uniqueDescr5")
}