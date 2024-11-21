package com.example.lab13

import androidx.compose.animation.core.animateDpAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun AnimatedSizeAndPositionBox(isExpanded: Boolean, isMoved: Boolean) {
    val size by animateDpAsState(targetValue = if (isExpanded) 200.dp else 100.dp)
    val offsetX by animateDpAsState(targetValue = if (isMoved) 100.dp else 0.dp)
    val offsetY by animateDpAsState(targetValue = if (isMoved) 100.dp else 0.dp)

    Box(
        modifier = Modifier
            .size(size)
            .offset(x = offsetX, y = offsetY)
            .background(Color.Green)
    )
}
