package com.ignaciosuay.microkotlin

import com.ignaciosuay.microkotlin.model.PersonIniConstructor
import org.junit.Test

class ObjectTests {

    //Because we define with Object this is a singleton
    // Kotlin provides first-class language support for this using the object declaration feature.
    // The object declaration combines a class declaration and a declaration of a single instance of that class.
    object PersonService {
        val paco = PersonIniConstructor("paco")

        fun add1(num: Int) = num + 1
    }

    @Test
    fun testSingleton() {
        val person = PersonService.paco
        assert("PACO" == person.name)

        assert(PersonService.add1(2) == 3)
    }
}
