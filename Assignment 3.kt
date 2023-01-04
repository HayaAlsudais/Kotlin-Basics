package com.example.hayakotlin

fun main() {
    val numbers = arrayOf(10.5, 15.5, 20.5, 25.5, 30.5)
    var sum= 0.0
    for (number in numbers)
        sum += number
    val average = sum / numbers.size
    println("Average : $average")

}