package com.example.sakhcastapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.sakhcastapplication.ui.MainScreen
import com.example.sakhcastapplication.ui.theme.SakhCastApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SakhCastApplicationTheme(darkTheme = true) {
                MainScreen()
//                Surface (modifier = Modifier
//                    .fillMaxSize()
//                    .background(Color.Gray)){
//                    MovieCategoryScreen()
//                }
            }
        }
    }
}
