package com.example.lab13

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.lab13.AnimatedContentBox

@Composable
fun AnimatedContentScreen(modifier: Modifier = Modifier) {
    AnimatedContentBox(modifier = modifier.fillMaxSize())
}
