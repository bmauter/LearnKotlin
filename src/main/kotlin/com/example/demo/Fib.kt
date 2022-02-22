package com.example.demo

fun main() {
    fib(0, 1)
}

fun fib(a: Int, b: Int) {
    val c = a + b
    println(c)
    if (c < 10000) {
        fib(b, c)
    }
}
