package com.yochidros.kmmsample.Shared

import io.ktor.client.*
import kotlinx.coroutines.CoroutineDispatcher

expect class GithubAPIClient() {
    val client: HttpClient
    val dispatcher: CoroutineDispatcher
}