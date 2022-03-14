package me.r09i.nito.app

import io.ktor.server.engine.*
import io.ktor.server.netty.*
import me.r09i.nito.app.plugins.*

fun main() {
    embeddedServer(Netty, port = 8080, host = "0.0.0.0") {
        configureDependencyInjection()
        configureRouting()
        configureSerialization()
    }.start(wait = true)
}
