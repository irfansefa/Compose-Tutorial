package com.moonstarit.animationlab

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.moonstarit.animationlab.ui.AnimationCodelabTheme
import com.moonstarit.animationlab.ui.AnimationHome

class StartAnimationLab : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AnimationCodelabTheme {
                AnimationHome()
            }
        }
    }

    companion object {
        fun createIntent(context: Context) = Intent(context, StartAnimationLab::class.java)
    }
}