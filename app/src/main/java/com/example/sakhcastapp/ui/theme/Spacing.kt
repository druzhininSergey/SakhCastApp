package com.example.sakhcastapp.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

data class Spacing(
    val mainPadding: Dp = 16.dp,
    val mainPaddingHalf: Dp = 8.dp,
    val smallPadding: Dp = 4.dp,
    val smallTextPadding: Dp = 3.dp
)

val LocalSpacing = compositionLocalOf { Spacing() }
val MaterialTheme.spacing: Spacing
    @Composable
    @ReadOnlyComposable
    get() = LocalSpacing.current