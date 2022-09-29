package com.moonstarit.composetutorial

import android.content.Context
import android.os.Bundle
import android.widget.Toast
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
import androidx.compose.material.Scaffold
import androidx.compose.material.ScaffoldState
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.moonstarit.composetutorial.path.oneessentials.JetPackComposeBasicsOne
import com.moonstarit.composetutorial.path.oneessentials.JetpackComposeBasicsFour
import com.moonstarit.composetutorial.path.oneessentials.StarterPathOne
import com.moonstarit.composetutorial.ui.theme.ComposeTutorialTheme
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

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
    val scaffoldState = rememberScaffoldState()
    val coroutineScope = rememberCoroutineScope()
    Scaffold(
        scaffoldState = scaffoldState
    ) {
        Column(
            modifier = Modifier
                .padding(all = 8.dp)
                .fillMaxWidth()
                .fillMaxHeight(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "Compose Camp", style = typography.h5, modifier = Modifier.padding(8.dp))
            Button(
                onClick = {
                    context.startActivity(StarterPathOne.createIntent(context))
                },
                modifier = Modifier.padding(8.dp),
            ) {
                Text(text = "Path 1: Compose Essentials")
            }
            Button(
                onClick = {
                    showSnackbar("Path 2 not started!", coroutineScope, scaffoldState)
                },
                modifier = Modifier.padding(8.dp),
            ) {
                Text(text = "Path 2: Layouts, Theming, Animation")
            }
            Button(
                onClick = {
                    showSnackbar("Path 3 not started!", coroutineScope, scaffoldState)
                },
                modifier = Modifier.padding(8.dp),
            ) {
                Text(text = "Path 3: Architecture and State")
            }
        }
    }
}

private fun showSnackbar(
    text: String,
    coroutineScope: CoroutineScope,
    scaffoldState: ScaffoldState
) {
    coroutineScope.launch {
        scaffoldState.snackbarHostState.showSnackbar(
            message = text
        )
    }
}