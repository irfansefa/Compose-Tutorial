package com.moonstarit.composetutorial.path.oneessentials

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.moonstarit.composetutorial.ui.theme.ComposeTutorialTheme

class C6StateInCompose : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeTutorialTheme {
                C6StateScreen()
            }
        }
        // https://developer.android.com/codelabs/jetpack-compose-layouts?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fcompose%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fjetpack-compose-layouts#8
    }

    companion object {
        fun createIntent(context: Context) = Intent(context, C6StateInCompose::class.java)
    }
}

@Composable
fun C6StateScreen(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier,
        contentAlignment = Alignment.Center
    ) {
        Text(text = "State in Compose")
    }
}