package com.example.sakhcastapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.navigation.compose.rememberNavController
import com.example.sakhcastapplication.ui.bottom_app_bar.BottomBar
import com.example.sakhcastapplication.ui.bottom_app_bar.NavGraph
import com.example.sakhcastapplication.ui.theme.SakhCastApplicationTheme
import com.example.sakhcastapplication.ui.top_app_bar.TopBar

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val navController = rememberNavController()
            SakhCastApplicationTheme(darkTheme = true) {
                Scaffold(
                    topBar = { TopBar() },
                    bottomBar = { BottomBar(navController) },
                    containerColor = MaterialTheme.colorScheme.primary
                ) {
                    NavGraph(navHostController = navController, paddingValues = it)
                }
            }
        }
    }
}
