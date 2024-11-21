package com.example.lab13

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.lab13.AnimatedSizeAndPositionBox

@Composable
fun AnimatedSizeAndPositionScreen(modifier: Modifier = Modifier) {
    var isExpanded by remember { mutableStateOf(false) }
    var isMoved by remember { mutableStateOf(false) }

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Row(horizontalArrangement = Arrangement.spacedBy(16.dp)) {
            Button(onClick = { isExpanded = !isExpanded }) {
                Text(text = if (isExpanded) "Reducir tamaño" else "Expandir tamaño")
            }
            Button(onClick = { isMoved = !isMoved }) {
                Text(text = if (isMoved) "Mover a origen" else "Mover")
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Nuevo componente animado
        AnimatedSizeAndPositionBox(isExpanded = isExpanded, isMoved = isMoved)
    }
}
