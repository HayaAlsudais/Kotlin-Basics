package com.example.hayakotlin

fun main() {
    var temperature = 35
    while (temperature>=10) {
        when (temperature) {
            30 -> println("ITS HOT")
            20 -> println("ITS COMFY")
            15 -> println("ITS COLD")
            else -> println("temperature $temperature")
        }
        temperature--
    }

        }



