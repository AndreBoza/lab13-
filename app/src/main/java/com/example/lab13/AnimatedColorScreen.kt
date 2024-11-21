package com.example.lab13

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.lab13.AnimatedColorBox

@Composable
fun AnimatedColorScreen(modifier: Modifier = Modifier) {
    var isBlue by remember { mutableStateOf(true) }

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Button(onClick = { isBlue = !isBlue }) {
            Text(text = if (isBlue) "Cambiar a Verde" else "Cambiar a Azul")
        }

        Spacer(modifier = Modifier.height(16.dp))

        AnimatedColorBox(isBlue = isBlue)
    }
}
