package com.rak.javaToKotlin

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class KotlinController {
    @GetMapping
    fun healthCheck(): String {
        return "Kotlin Health"
    }
}