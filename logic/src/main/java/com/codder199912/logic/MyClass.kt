package com.codder199912.logic

import java.util.Scanner

fun isPrime(x: Int): Boolean {
    if (x < 1) {
        return false
    }
    for (i in 1 until Math.sqrt(x.toDouble()).toInt() + 1) {
        if (x % i == 0) {
            return false
        }
    }
    return true
}

fun main() {
    var scan = Scanner(System.`in`)
    var into = scan.nextInt()
    val res = isPrime(into)
    print(res)
}
