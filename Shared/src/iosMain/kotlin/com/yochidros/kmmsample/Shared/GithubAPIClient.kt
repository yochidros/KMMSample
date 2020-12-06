package com.yochidros.kmmsample.Shared

import io.ktor.client.*
import io.ktor.client.engine.ios.*
import io.ktor.client.features.json.*
import io.ktor.client.features.json.serializer.*
import kotlinx.coroutines.CoroutineDispatcher
import platform.darwin.dispatch_get_current_queue
import platform.darwin.dispatch_get_main_queue

actual class GithubAPIClient actual constructor() {
    actual val client: HttpClient = HttpClient(Ios) {
        install(JsonFeature) {
            serializer = KotlinxSerializer(json = kotlinx.serialization.json.Json {
                isLenient = false
                ignoreUnknownKeys = true
                allowSpecialFloatingPointValues = true
                useArrayPolymorphism = false
            })
        }
    }

    actual val dispatcher: CoroutineDispatcher = Dispacher(dispatch_get_current_queue())
}

