package com.ignaciosuay.microkotlin

import org.junit.Test

class FunctionTest {

    fun defaultSum(p1: Int, p2: Int = 10, p3: Int = 0): Int {
        return p1 + p2 + p3
    }

    @Test
    fun testDefaultValues() {
        assert(3 == defaultSum(1, 2))
        assert(13 == defaultSum(3))

        assert(15 == defaultSum(3, p3 = 2))
    }

    fun String.hola(): String = "hola " + this

    @Test
    fun testExtensionFunctions() {
        println("suay".hola())
        assert("hola suay" == "suay".hola())
    }

    val String.holap: String get() = "hola " + this

    @Test
    fun testExtensionProperties() {
        println("suay".holap)
        assert("hola suay" == "suay".holap)
    }

    infix fun Any.suayalo(other: Any) = Pair(this, other)

    @Test
    fun testInfix() {
        val a = 1 suayalo 2
        assert(1 == a.first)
        assert(2 == a.second)
    }

    @Test
    fun loopWithIndex() {
        val loop = listOf("a", "b", "c")
        for ((a, i) in loop.withIndex())
            println("$a with index: $i")
    }

    @Test
    fun testVarArgs() {
        val array = arrayOf("a", "b", "c")
        val list2 = listOf("d", *array)

        println(list2)
    }


}