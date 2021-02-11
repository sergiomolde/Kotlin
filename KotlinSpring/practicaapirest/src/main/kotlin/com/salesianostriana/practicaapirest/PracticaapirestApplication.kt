package com.salesianostriana.practicaapirest

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class PracticaapirestApplication

fun main(args: Array<String>) {
	runApplication<PracticaapirestApplication>(*args)
}

data class Message(val id: String?, val text: String)

@RestController
class MessageResource {
	@GetMapping
	fun index(): List<Message> = listOf(
		Message("1", "Hola"),
		Message("2", "¿Qué tal?"),
		Message("3", "¡Buenas tardes!")
	)
}