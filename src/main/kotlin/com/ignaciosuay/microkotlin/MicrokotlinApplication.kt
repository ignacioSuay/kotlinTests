package com.ignaciosuay.microkotlin

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class MicrokotlinApplication

fun main(args: Array<String>) {
    SpringApplication.run(MicrokotlinApplication::class.java, *args)
}
