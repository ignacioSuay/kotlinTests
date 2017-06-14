package com.ignaciosuay.microkotlin

import org.junit.Test

class BasicFunctionKtTest {

    @Test
    fun sum2numbersTest() {

        val ba = BasicFunction()
        val res = ba.sum2numbers(2, 3)
        assert(res == 6)
    }

    @Test
    fun substract2numbers() {
        val substract2numbers = substract2numbers(1, 1)
        assert(substract2numbers == 0)
    }

    @Test
    fun whenFun() {
        assert(whenFun("a") == "1")

        assert(whenFun("d") == "other")
    }

    @Test
    fun sumTest() {
        val suma = sum(2, 1)
        assert(3 == suma)
    }

    @Test
    fun forTest() {
        for (i in 1..10) {
            println(i)
        }

        println("-------")
        for (i in 10 downTo 1 step 2) {
            println(i)
        }
    }

    @Test
    fun mapForTest() {
        val map = mapOf("a" to 1, "b" to 2, "c" to 3)

        for ((letter, num) in map) {
            println("$letter assigned to $num")
        }
    }

    @Test
    fun whenInTest() {
        val a = Math.random() * 100
        println("value: $a")

        when (a) {
            in 1..50 -> println("is between 1 to 50")
            in 51..100 -> println("is more than 50")
        }
    }

    @Test
    fun tryTest() {
        assert(1f == division(2, 2))

        assert(0f == division(2, 0))
    }

    fun division(a: Int, b: Int): Float = try {
        (a / b).toFloat()
    } catch (e: Exception) {
        0f
    }


}