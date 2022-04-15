package com.mikeshea3.sandboxApplication

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ResponseController {

    @GetMapping("/")
    fun index(): ResponseEntity<String> {
        return ResponseEntity<String>("Hello world", HttpStatus.OK)
    }

}