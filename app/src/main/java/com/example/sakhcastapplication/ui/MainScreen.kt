package com.example.sakhcastapplication.ui

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.navigation.compose.rememberNavController
import com.example.sakhcastapplication.ui.top_bottom_bars.bottom_app_bar.BottomBar
import com.example.sakhcastapplication.ui.top_bottom_bars.top_app_bar.TopBar

@Composable
fun MainScreen() {
    val navController = rememberNavController()
    var isLogin by rememberSaveable { mutableStateOf(false) }

//    if (!isLogin) {
//        LogInScreen(navController = navController)
//    } else {
    Scaffold(
        topBar = { TopBar(navController) },
        bottomBar = { BottomBar(navController) },
        containerColor = MaterialTheme.colorScheme.primary
    ) {
        NavGraph(
            navHostController = navController,
            paddingValues = it,
        )
    }
//    }
}