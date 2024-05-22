package com.example.sakhcastapp.ui

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import com.example.sakhcastapp.ui.app_bars.MainTopBar
import com.example.sakhcastapp.ui.app_bars.bottom_app_bar.BottomBar

@Composable
fun MainScreen() {
    val navController = rememberNavController()

    Scaffold(
        topBar = { MainTopBar() },
        bottomBar = { BottomBar(navController) },
        containerColor = MaterialTheme.colorScheme.primary
    ) {
        NavGraph(
            navHostController = navController,
            paddingValues = it,
        )
    }
}