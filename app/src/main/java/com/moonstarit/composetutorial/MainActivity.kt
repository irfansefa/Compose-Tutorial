package com.moonstarit.composetutorial

import android.content.Context
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
import androidx.compose.material.Scaffold
import androidx.compose.material.ScaffoldState
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.moonstarit.animationlab.StartAnimationLab
import com.moonstarit.composetutorial.path.oneessentials.StarterPathOne
import com.moonstarit.composetutorial.ui.theme.ComposeTutorialTheme
import com.moonstarit.navigation.NavigationActivity
import com.moonstarit.navigationlab.StartNavigationActivity
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeTutorialTheme {
                Surface(color = MaterialTheme.colors.background) {
                    AllButtons()
                }
            }
        }
    }
}

@Composable
fun AllButtons(context: Context = LocalContext.current) {
    val scaffoldState = rememberScaffoldState()
    val coroutineScope = rememberCoroutineScope()
    Scaffold(
        scaffoldState = scaffoldState
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(all = 8.dp)
                .padding(innerPadding)
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
                    context.startActivity(StartAnimationLab.createIntent(context))
                },
                modifier = Modifier.padding(8.dp),
            ) {
                Text(text = "Path 2: Layouts, Theming, Animation")
            }
            Button(
                onClick = {
                    context.startActivity(StartNavigationActivity.createIntent(context))
                },
                modifier = Modifier.padding(8.dp),
            ) {
                Text(text = "Path 3: Architecture and State: Navigation")
            }
            Button(
                onClick = {
                    showSnackbar("Path 4 not started!", coroutineScope, scaffoldState)
                },
                modifier = Modifier.padding(8.dp),
            ) {
                Text(text = "Path 4: Accessibility, testing, and performance")
            }
            Button(
                onClick = {
                    context.startActivity(NavigationActivity.createIntent(context))
                },
                modifier = Modifier.padding(8.dp),
            ) {
                Text(text = "Navigation Example")
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