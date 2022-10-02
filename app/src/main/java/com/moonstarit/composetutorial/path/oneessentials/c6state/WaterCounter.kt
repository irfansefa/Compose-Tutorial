package com.moonstarit.composetutorial.path.oneessentials.c6state

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun StatefulWaterCounter(
    modifier: Modifier
) {
    var count by rememberSaveable { mutableStateOf(0) }
    StatelessWaterCounter(
        count = count,
        onIncrement = { count++ },
        modifier = modifier,
    )
}

@Composable
fun StatelessWaterCounter(
    count: Int,
    onIncrement: () -> Unit,
    modifier: Modifier
) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(16.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        if (count > 0) {
            Text(text = "You've had $count glasses.")
        }
        Button(
            onClick = onIncrement,
            enabled = count < 10,
            modifier = modifier.padding(top = 8.dp)
        ) {
            Text(text = "Add one")
        }
    }
}

@Preview
@Composable
fun PreviewStatelessWaterCounter() {
    StatelessWaterCounter(
        count = 1,
        onIncrement = {},
        modifier = Modifier,
    )
}

@Preview
@Composable
fun PreviewStatefulWaterCounter() {
    StatefulWaterCounter(modifier = Modifier)
}