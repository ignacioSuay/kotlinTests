package com.ignaciosuay.microkotlin

class BasicFunction() {

    fun sum2numbers(n1: Int, n2: Int): Int {
        return n1 + n2
    }

}

fun substract2numbers(n1: Int, n2: Int): Int {
    return n1 - n2
}

fun whenFun(text: String) =
    when(text){
        "a"-> "1"
        "b"-> "2"
        else -> "other"
    }

fun sum(a: Int, b: Int):Int = a + b


