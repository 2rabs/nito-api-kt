package me.r09i.nito.app

import io.ktor.server.application.*
import me.r09i.nito.app.plugins.configureDependencyInjection
import me.r09i.nito.app.plugins.configureRouting
import me.r09i.nito.app.plugins.configureSerialization

@Suppress("unused")
fun Application.module() {
    configureDependencyInjection()
    configureRouting()
    configureSerialization()
}