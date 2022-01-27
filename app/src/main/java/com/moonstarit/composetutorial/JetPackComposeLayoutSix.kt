package com.moonstarit.composetutorial

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Text
import com.moonstarit.composetutorial.ui.theme.ComposeTutorialTheme

class JetPackComposeLayoutSix: ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeTutorialTheme {
                Text(text = "Hello World")
            }
        }
    }

    companion object {
        fun createIntent(context: Context) = Intent(context, JetPackComposeLayoutSix::class.java)
    }
}