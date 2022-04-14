package com.mikeshea3.sandboxApplication

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ResponseController {

    @GetMapping("/")
    fun index(): String? {
        return "Hello world!"
    }

}