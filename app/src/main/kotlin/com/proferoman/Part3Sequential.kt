package com.proferoman

import kotlin.system.measureTimeMillis

fun sequential() {
    var num1 = 0
    var num2 = 0

    val lambda1 = {
        println("Thread: ${Thread.currentThread().name}")
        Thread.sleep(SLEEP_MS)

        num1 = (1..1000).random()
    }

    val lambda2 = {
        println("Thread: ${Thread.currentThread().name}")
        Thread.sleep(SLEEP_MS)

        num2 = (1..1000).random()
    }

    val timeMillis = measureTimeMillis {
        lambda1()
        lambda2()
    }

    println("Thread: ${Thread.currentThread().name}")
    println("Número generado por las lambda: $num1 y $num2")
    println("Ha tardado $timeMillis milisegundos")
}