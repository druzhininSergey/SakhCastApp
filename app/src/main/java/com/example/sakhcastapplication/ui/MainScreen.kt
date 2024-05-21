package com.example.sakhcastapplication.ui

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.sakhcastapplication.LOG_IN_SCREEN
import com.example.sakhcastapplication.ui.log_in_screen.LogInScreen
import com.example.sakhcastapplication.ui.top_bottom_bars.bottom_app_bar.BottomBar
import com.example.sakhcastapplication.ui.top_bottom_bars.top_app_bar.TopBar

@Composable
fun MainScreen() {
    val navController = rememberNavController()
    val currentBackStackEntry by navController.currentBackStackEntryAsState()
    val currentDestination = currentBackStackEntry?.destination?.route
    var showBars by remember { mutableStateOf(currentDestination != LOG_IN_SCREEN) }
    LaunchedEffect(currentDestination) {
        showBars = currentDestination != LOG_IN_SCREEN
    }
//    var isLogin by rememberSaveable { mutableStateOf(false) }
//
//    if (!isLogin) {
//        LogInScreen(navController = navController)
//    } else {
    Scaffold(
        topBar = { if (showBars) TopBar(navController) },
        bottomBar = { if (showBars) BottomBar(navController) },
        containerColor = MaterialTheme.colorScheme.primary
    ) {
        NavGraph(
            navHostController = navController,
            paddingValues = it,
        )
    }
//    }
}