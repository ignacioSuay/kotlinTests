package com.ignaciosuay.microkotlin

import com.ignaciosuay.microkotlin.model.PersonCustomGetter
import com.ignaciosuay.microkotlin.model.PersonPrimaryConstructor
import com.ignaciosuay.microkotlin.model.PersonIniConstructor
import org.junit.Test

class ClassTest {

    @Test
    fun testClass() {
        val person = PersonPrimaryConstructor("a", "uee")
        println(person.address)
    }

    @Test
    fun testInitializeConstructorClass() {
        val person = PersonIniConstructor("a")
        println(person.name)
    }
    @Test
    fun testCustomGetter() {
        val person = PersonCustomGetter("a")
        println(person.name)
    }

}