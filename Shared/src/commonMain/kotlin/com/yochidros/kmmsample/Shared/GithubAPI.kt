package com.yochidros.kmmsample.Shared

import io.ktor.client.*
import io.ktor.client.request.*
import kotlinx.coroutines.*
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Repository(
    val name: String,
    @SerialName("html_url") val url: String,
)

class GithubAPI {
    val apiClient: GithubAPIClient = GithubAPIClient()
    companion object {
        val BASEURL = "https://api.github.com/users/yochidros/repos"
    }
     fun fetchRepos(callback: (List<Repository>) -> Unit) {
        GlobalScope.apply {
            launch(apiClient.dispatcher) {
                val result = apiClient.client.get<List<Repository>>(BASEURL)
                callback(result)
            }
        }
    }
}


