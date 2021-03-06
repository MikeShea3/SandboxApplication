package com.mikeshea3.sandboxApplication

//import org.springframework.boot.SpringApplication
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.ApplicationContext
import org.springframework.context.annotation.Bean
import java.util.*


// runApplication vs SpringApplication?

@SpringBootApplication
class SandboxApplication

fun main(args: Array<String>) {
	runApplication<SandboxApplication>(*args)
}

@Bean
fun commandLineRunner(ctx: ApplicationContext): CommandLineRunner? {
	return CommandLineRunner { args: Array<String?>? ->
		println("Let's inspect the beans provided by Spring Boot:")
		val beanNames: Array<String> = ctx.beanDefinitionNames
		Arrays.sort(beanNames)
		for (beanName in beanNames) {
			println(beanName)
		}
	}
}