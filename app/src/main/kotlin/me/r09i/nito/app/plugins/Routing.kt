package me.r09i.nito.app.plugins

import io.ktor.server.routing.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import me.r09i.nito.kernel.EnvVar
import org.koin.java.KoinJavaComponent.inject

fun Application.configureRouting() {

    val envVar by inject<EnvVar>(EnvVar::class.java)

    routing {
        get("/") {
            call.respondText("Hello ${envVar.SAMPLE}!")
        }
    }
}
