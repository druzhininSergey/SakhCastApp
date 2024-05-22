package com.example.sakhcastapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.sakhcastapp.ui.MainScreen
import com.example.sakhcastapp.ui.theme.SakhCastAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SakhCastAppTheme {
                MainScreen()
            }
        }
    }
}