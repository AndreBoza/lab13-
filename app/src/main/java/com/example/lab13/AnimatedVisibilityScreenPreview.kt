package com.example.lab13

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.lab13.ui.AnimatedVisibilityScreen
import com.example.lab13.ui.theme.Lab13Theme

@Preview(showBackground = true)
@Composable
fun AnimatedVisibilityScreenPreview() {
    Lab13Theme {
        AnimatedVisibilityScreen()
    }
}
