package com.proferoman

const val SLEEP_MS: Long = 2000

fun main() {
    println("Threads1")
    println("--------------------------------------------")
    threads1()
    println()
    println()

    println("Threads2")
    println("--------------------------------------------")
    threads2()
    println()
    println()

    println("Sequential")
    println("--------------------------------------------")
    sequential()
    println()
    println()

    println("Process")
    println("--------------------------------------------")
    process()
    println()
    println()
}
