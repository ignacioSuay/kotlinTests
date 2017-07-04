package com.ignaciosuay.microkotlin

import com.ignaciosuay.microkotlin.model.DataPerson
import org.junit.Test

class LambdaTests {

    @Test
    fun lambdaTest() {
        val sum = { x: Int, y: Int -> x + y }
        assert(5 == sum(2, 3))
    }

    @Test
    fun lambdaMax(){
        val people = listOf<DataPerson>(DataPerson("aaa"), DataPerson("bbb"))
        val maxName = people.maxBy { it.name }

        assert("bbb" == maxName?.name)
    }

    @Test
    fun testSequence(){
        val people = listOf<DataPerson>(DataPerson("aaa"), DataPerson("bbb")).asSequence()

        val name = people.filter { it.name > "b" }
                .map { it.name }
                .toList()

        assert("bbb" == name[0])
    }
}