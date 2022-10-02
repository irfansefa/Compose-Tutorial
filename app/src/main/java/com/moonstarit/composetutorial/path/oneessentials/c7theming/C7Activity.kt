package com.moonstarit.composetutorial.path.oneessentials.c7theming

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.moonstarit.composetutorial.ui.theme.ComposeTutorialTheme

/**
 * https://developer.android.com/codelabs/jetpack-compose-theming?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fjetpack-compose-for-android-developers-1%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fjetpack-compose-theming#0
 */
class C7Activity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeTutorialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background,
                ) {
                    C7Screen()
                }
            }
        }
    }

    companion object {
        fun createIntent(context: Context) = Intent(context, C7Activity::class.java)
    }
}

@Composable
fun C7Screen() {
    Text(text = "Compose theming")
}