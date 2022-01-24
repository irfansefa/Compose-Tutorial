package com.moonstarit.composetutorial

import android.content.Context
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
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

class MainActivity : ComponentActivity() {
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
}

@Composable
fun AllButtons(context: Context) {
    Column(
        modifier = Modifier.padding(all = 8.dp).fillMaxWidth().fillMaxHeight(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Buttons", style = typography.h5, modifier = Modifier.padding(8.dp))
        Button(
            onClick = {
                context.startActivity(JetPackComposeBasicsOne.createIntent(context))
            },
            modifier = Modifier.padding(8.dp),
        ) {
            Text(text = "01 Tutorial: Jetpack Compose basics")
        }
    }
}