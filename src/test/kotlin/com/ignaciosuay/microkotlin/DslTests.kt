package com.ignaciosuay.microkotlin

import org.junit.Test

class DslTests {

    @Test
    fun testLambdaWithoutReceiver() {
        val stringWithReceiver: (StringBuilder) -> Unit = { it.append("hello") }
        var sb = StringBuilder()
        stringWithReceiver(sb)
        println(sb)
    }

    @Test
    fun testLambdaWithReceiver() {
        val stringWithReceiver: StringBuilder.() -> Unit = { append("hello") }
        var sb = StringBuilder()
        stringWithReceiver(sb)
        println(sb)
    }

    @Test
    fun testLambdaWithReceiverAndInputParams() {
        val sum = fun Int.(other: Int): Int = this + other
        assert(3 == 1.sum(2))
    }

//    class TABLE {
//        fun tr(init: TR.() -> Unit)
//    }
//
//    class TR {
//        fun td(init: TD.() -> Unit)
//    }
//
//    class TD
}