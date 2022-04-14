package com.mikeshea3.sandboxApplication

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.atomic.AtomicLong

@RestController
class ResponseController {
    private val counter = AtomicLong()
    @GetMapping("/greeting")
    fun greeting(@RequestParam(value = "name", defaultValue = "World") name: String?): Response {
        return Response(counter.incrementAndGet(), String.format(template, name))
    }

    // ?
    companion object {
        private const val template = "Hello, %s!"
    }
}