package com.example.sakhcastapp.ui.favorites_screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.sakhcastapp.ui.FAVORITES_SCREEN

@Composable
fun FavoritesScreen(paddingValues: PaddingValues) {
    Box(
        modifier = Modifier
            .padding(paddingValues)
            .background(MaterialTheme.colorScheme.primary)
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(text = FAVORITES_SCREEN)
    }
}