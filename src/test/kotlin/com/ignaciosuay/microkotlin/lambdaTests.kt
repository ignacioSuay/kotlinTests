package com.ignaciosuay.microkotlin

import com.ignaciosuay.microkotlin.model.DataPerson
import com.ignaciosuay.microkotlin.model.Person
import org.junit.Test

class LambdaTests {

    @Test
    fun lambdaTest() {
        val sum = { x: Int, y: Int -> x + y }
        assert(5 == sum(2, 3))
    }

    @Test
    fun lambdaMax() {
        val people = listOf<DataPerson>(DataPerson("aaa"), DataPerson("bbb"))
        val maxName = people.maxBy { it.name }

        assert("bbb" == maxName?.name)
    }

    @Test
    fun testSequence() {
        val people = listOf<DataPerson>(DataPerson("aaa"), DataPerson("bbb")).asSequence()

        val name = people.filter { it.name > "b" }
                .map { it.name }
                .toList()

        assert("bbb" == name[0])
    }

    interface OnClickListener {
        fun onClick(name: String)
    }

    class Button(var onclickListenr: OnClickListener)

    @Test
            //it should be an easy way to do it but I cannot find it
    fun testInterfaces() {
        var button = Button(object : OnClickListener {
            override fun onClick(name: String) {
                print(name)
            }
        })

    }

    @Test
    fun testWith() {

        val p = with(Person()) {
            name = "suay"
            age = 31
            this
        }

        assert(p.age == 31)
        assert(p.name == "suay")
    }

    @Test
    //Difference between with and apply is that apply always return the object which is applied
    fun testApply(){

        val p = Person().apply {
            name = "suay"
            age = 31
        }

        assert(p.age == 31)
        assert(p.name == "suay")
    }

}