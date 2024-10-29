package com.proferoman

fun threads1() {
    var num: Int = 0

    val t1 = Thread {
        println("Thread: ${Thread.currentThread().name}")
        Thread.sleep(SLEEP_MS)

        num = (1..1000).random()
    }

    t1.start()
    t1.join()

    println("Thread: ${Thread.currentThread().name}")
    println("Número generado por el hijo: $num")
}