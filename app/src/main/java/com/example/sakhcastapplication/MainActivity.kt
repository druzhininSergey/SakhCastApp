package com.example.sakhcastapplication

import android.os.Bundle
import android.view.View
import android.view.Window
import android.view.WindowManager
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Scaffold
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsControllerCompat
import com.example.sakhcastapplication.data.SeriesSample
import com.example.sakhcastapplication.ui.MainScreen
import com.example.sakhcastapplication.ui.movie_series_view.SeriesView
import com.example.sakhcastapplication.ui.theme.SakhCastApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        window.decorView.systemUiVisibility = (View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
//                or View.SYSTEM_UI_FLAG_FULLSCREEN
//                or View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY)

        enableEdgeToEdge()
        setContent {
            SakhCastApplicationTheme {
                MainScreen()
//                Scaffold {
//                    SeriesView(series = SeriesSample.getFullSeries(), paddingValues = it)
//                }
            }
        }
    }
}
