package com.ignaciosuay.microkotlin

import org.junit.Before
import org.junit.Test

class TypeSystemTests {


    @Test
    fun nullableTests() {
        //need to add the ?
        var num: Int? = 1

        //need to check if it is null
        if (num != null) {
            assert(1 == num * 1)
        }
    }

    open class Person(val name: String)
    class Italian(val address: String, name: String) : Person(name)
    class English(val address: String, name: String) : Person(name)

    @Test
    fun testAsCast() {

        val luigi = Italian("calle 1", "luigi")
        val john = Italian("street 1", "john")

        val p: Person = luigi
        val pItalian = p as? Italian
        val pEnglish = luigi as? English

        if (pItalian != null) {
            assert(pItalian.name == "luigi")
        }
        assert(pEnglish == null)
    }

    @Test(expected = KotlinNullPointerException::class)
    fun testExclamations() {

        val luigi = Italian("calle 1", "luigi")
        val john = Italian("street 1", "john")

        val p: Person = luigi
        val pItalian = p as? Italian
        val pEnglish = luigi as? English

        assert(pItalian!!.name == "luigi")

        //This throws a NPE
        assert(pEnglish!!.name == "john")

    }

    @Test
    fun letTest() {
        val luigi = Italian("calle 1", "luigi")
        val john = Italian("street 1", "john")

        val p: Person = luigi
        val pItalian = p as? Italian
        val pEnglish = luigi as? English

        pItalian?.let { assert(it.name == "luigi") }

        //if the result is null the assert won't be executed
        pEnglish?.let { assert(it.name == "never executed") }
    }

    class proxyClass {
        private lateinit var italian: Italian

        @Before
        fun setup() {
            println("italian is null? $italian?.name")
            italian = Italian("c1", "luigi")
            println("italian is null? $italian?.name")
        }
    }

    @Test
    fun lateInitTest() {
        //should lazy initialize the italian var
        val proxyClass : proxyClass
    }


}