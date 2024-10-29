package com.proferoman

import kotlin.system.measureTimeMillis

class RandomInt {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            Thread.sleep(SLEEP_MS)
            print((1..1000).random())
        }
    }
}

fun launchProcess(): Process {
    val javaPath = System.getProperty("java.class.path")
    val className = "com.proferoman.RandomInt"

    val pb = ProcessBuilder("kotlin", "-cp", javaPath, className)
    return pb.start()
}

fun process() {
    var num1 = 0
    var num2 = 0

    val timeMillis = measureTimeMillis {
        val process1 = launchProcess()
        val process2 = launchProcess()

        num1 = process1.inputStream.bufferedReader().readText().toInt()
        num2 = process2.inputStream.bufferedReader().readText().toInt()
    }

    println("Thread: ${Thread.currentThread().name}")
    println("Número generado por los procesos: $num1 y $num2")
    println("Ha tardado $timeMillis milisegundos")
}