package me.r09i.nito.app.di

import io.ktor.server.application.*
import me.r09i.nito.kernel.EnvVar
import org.koin.dsl.module

fun applicationModule(appEnv: ApplicationEnvironment) = module {
    single<EnvVar> {
        object : EnvVar {
            override val PORT: Int = appEnv.intPropertyOrDefault(
                path = "ktor.deployment.port",
                defaultValue = 8080,
            )

            override val SAMPLE: String = appEnv.stringPropertyOrDefault(
                path = "nito.sample",
                defaultValue = "",
            )
        }
    }
}

private fun ApplicationEnvironment.intPropertyOrDefault(
    path: String,
    defaultValue: Int,
): Int {
    val prop = config.propertyOrNull(path = path)?.getString()
    return prop?.toInt() ?: defaultValue
}

private fun ApplicationEnvironment.stringPropertyOrDefault(
    path: String,
    defaultValue: String,
): String {
    val prop = config.propertyOrNull(path = path)?.getString()
    return prop ?: defaultValue
}