package com.ignaciosuay.microkotlin

import org.junit.Test

class OperatorOverloadingTest {

    class Person(var name: String) {
        operator fun plus(other: Person): Person = Person(name + other.name)
        operator fun plusAssign(other: Person): Unit {
            this.name = this.name + other.name
        }
    }

    @Test
    fun overloadPlusTest() {
        val p1 = Person("hola")
        val p2 = Person(" mundo")
        val p3 = p1 + p2
        assert(p3.name == "hola mundo")

        val p4 = Person(" suay")
        p1 += p4
        assert(p1.name == "hola suay")
    }

}