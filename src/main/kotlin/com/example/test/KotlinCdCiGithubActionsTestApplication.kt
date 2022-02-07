package com.example.test

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinCdCiGithubActionsTestApplication

fun main(args: Array<String>) {
    runApplication<KotlinCdCiGithubActionsTestApplication>(*args)
}
