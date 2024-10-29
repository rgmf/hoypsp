package com.proferoman

import kotlin.system.measureTimeMillis

fun threads2() {
    var num1 = 0
    var num2 = 0

    val t1 = Thread {
        println("Thread: ${Thread.currentThread().name}")
        Thread.sleep(SLEEP_MS)

        num1 = (1..1000).random()
    }

    val t2 = Thread {
        println("Thread: ${Thread.currentThread().name}")
        Thread.sleep(SLEEP_MS)

        num2 = (1..1000).random()
    }

    val timeMillis = measureTimeMillis {
        t1.start()
        t2.start()

        t1.join()
        t2.join()
    }

    println("Thread: ${Thread.currentThread().name}")
    println("Número generado por los hijos: $num1 y $num2")
    println("Ha tardado $timeMillis milisegundos")
}