package com.example.lab13

import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.with
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text

enum class ContentState {
    LOADING, CONTENT, ERROR
}

@OptIn(ExperimentalAnimationApi::class)
@Composable
fun AnimatedContentBox(modifier: Modifier = Modifier) {
    var state by remember { mutableStateOf(ContentState.LOADING) }

    Box(
        modifier = modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        AnimatedContent(
            targetState = state,
            transitionSpec = {
                fadeIn() with fadeOut()
            }
        ) { targetState ->
            when (targetState) {
                ContentState.LOADING -> Text(
                    text = "Cargando...",
                    style = TextStyle(color = Color.Gray, fontSize = 24.sp)
                )
                ContentState.CONTENT -> Text(
                    text = "Contenido cargado",
                    style = TextStyle(color = Color.Green, fontSize = 24.sp)
                )
                ContentState.ERROR -> Text(
                    text = "Error al cargar",
                    style = TextStyle(color = Color.Red, fontSize = 24.sp)
                )
            }
        }
    }

    Box(
        modifier = Modifier.padding(20.dp),
        contentAlignment = Alignment.BottomCenter
    ) {
        Button(onClick = {
            state = when (state) {
                ContentState.LOADING -> ContentState.CONTENT
                ContentState.CONTENT -> ContentState.ERROR
                ContentState.ERROR -> ContentState.LOADING
            }
        }) {
            Text(text = "Cambiar estado")
        }
    }
}
