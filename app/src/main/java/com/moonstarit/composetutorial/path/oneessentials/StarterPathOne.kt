package com.moonstarit.composetutorial.path.oneessentials

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.MaterialTheme.typography
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.moonstarit.composetutorial.ui.theme.ComposeTutorialTheme

class StarterPathOne : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeTutorialTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    AllButtons(this)
                }
            }
        }
    }

    companion object {
        fun createIntent(context: Context) = Intent(context, StarterPathOne::class.java)
    }
}

@Composable
fun AllButtons(context: Context) {
    Column(
        modifier = Modifier
            .padding(all = 8.dp)
            .fillMaxWidth()
            .fillMaxHeight(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Path 1 - Compose essentials",
            style = typography.h5,
            modifier = Modifier.padding(8.dp)
        )
        Button(
            onClick = {
                context.startActivity(JetPackComposeBasicsOne.createIntent(context))
            },
            modifier = Modifier.padding(8.dp),
        ) {
            Text(text = "01 Tutorial: Jetpack Compose basics")
        }
        Button(
            onClick = {
                context.startActivity(JetpackComposeBasicsFour.createIntent(context))
            },
            modifier = Modifier.padding(8.dp),
        ) {
            Text(text = "04 Jetpack Compose basics")
        }
        Button(
            onClick = {
                context.startActivity(JetPackComposeLayoutSix.createIntent(context))
            },
            modifier = Modifier.padding(8.dp),
        ) {
            Text(text = "06 Jetpack Compose Layout")
        }
    }
}