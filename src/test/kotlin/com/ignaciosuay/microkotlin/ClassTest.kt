package com.ignaciosuay.microkotlin

import com.ignaciosuay.microkotlin.model.*
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

    @Test
    //In Kotlin == use equlas while === compares by reference
    fun comparePersonsWithEquals(){
        val p1 = DataPerson("a")
        val p2 = DataPerson("a")

        assert(p1 == p2)
        assert(!(p1 === p2))
    }

    @Test
    //See notes inside class
    fun MyColectionSizeTest(){
        val mylist = listOf<String>("uee")
        val myCol = MyCollectionBy<String>(mylist)
        println(myCol.size)
    }


}