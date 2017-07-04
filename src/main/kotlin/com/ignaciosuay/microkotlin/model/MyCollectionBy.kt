package com.ignaciosuay.microkotlin.model

//the keyword by will generete a class that implements an interface and adds it as a parameter.
// it will implement the decorator pattern which will add integrate a new variable instead of extending it
// this is particulary useful when the class you want to extend is final
class MyCollectionBy<T>(val innerList: Collection<T> = ArrayList<T>()) : Collection<T> by innerList {

    override val size: Int
        get() {
            println("getting size")
            return innerList.size
        }

}