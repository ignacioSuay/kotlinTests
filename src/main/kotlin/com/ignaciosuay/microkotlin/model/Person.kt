package com.ignaciosuay.microkotlin.model

class PersonPrimaryConstructor(val name: String, val address: String)

class PersonIniConstructor(name: String) {
    val name: String = name.toUpperCase()
}

//note: We need to use field or it will go into recursion
class PersonCustomGetter(name: String) {

    val name: String = name + " hola"
        get() = field.toUpperCase() //note we are using field, this is what is called Backing field
}

