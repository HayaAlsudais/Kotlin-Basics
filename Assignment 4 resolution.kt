package com.example.hayakotlin

fun main () {
    haya(num1= 7.0, num2 = 6.5)
    haya(num1= 7.0, num2 = 6.5, operator="*")
    haya(num1= 7.0, num2 = 6.5, operator= "-")
    haya(num1= 7.0, num2 = 6.5, operator= "/")

}
fun haya(num1: Double, num2: Double, operator: String = "+") {
    when (operator) {
        "+" -> println(num1 + num2)
        "-" -> println(num1 - num2)
        "*" -> println(num1 * num2)
        "/" -> println(num1 / num2)
        else -> println("not the correct Operator")
    }
}