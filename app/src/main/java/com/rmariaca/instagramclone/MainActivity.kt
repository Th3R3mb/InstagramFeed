package com.rmariaca.instagramclone

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.rmariaca.instagramclone.model.Post
import com.rmariaca.instagramclone.ui.screens.FeedScreen
import com.rmariaca.instagramclone.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        // Ejercicio sección 01
        val post = Post(1, "yo", "", "", 0, "Prueba")
        println(post)
        println(post.copy(isLiked = true))

        setContent {
            MyApplicationTheme {
                FeedScreen()
            }
        }
    }
}