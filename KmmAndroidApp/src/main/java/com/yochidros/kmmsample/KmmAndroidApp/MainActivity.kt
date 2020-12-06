package com.yochidros.kmmsample.KmmAndroidApp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.yochidros.kmmsample.Shared.GithubAPI

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        GithubAPI().fetchRepos {
            runOnUiThread {
                val tv: TextView = findViewById(R.id.text_view)
                tv.text = it.map { it.name }.joinToString("\n")
            }
        }
    }
}
