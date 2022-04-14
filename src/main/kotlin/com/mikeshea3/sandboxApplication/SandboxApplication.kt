package com.mikeshea3.sandboxApplication

//import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

// runApplication vs SpringApplication?

@SpringBootApplication
class SandboxApplication

fun main(args: Array<String>) {
	runApplication<SandboxApplication>(*args)
}