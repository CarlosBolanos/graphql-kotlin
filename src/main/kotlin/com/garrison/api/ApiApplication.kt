package com.garrison.api

import graphql.execution.instrumentation.tracing.TracingInstrumentation
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean


@SpringBootApplication
class ApiApplication  {
	@Bean
	fun tracing() :TracingInstrumentation = TracingInstrumentation()
}

fun main(args: Array<String>) {
	runApplication<ApiApplication>(*args)
}
