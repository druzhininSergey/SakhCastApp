package com.example.sakhcastapp.ui.home_screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.sakhcastapp.data.Samples
import com.example.sakhcastapp.ui.main_screens.home_screen.movie.MovieCategoryView
import com.example.sakhcastapp.ui.main_screens.home_screen.recently_watched.ContinueWatchView
import com.example.sakhcastapp.ui.main_screens.home_screen.series.SeriesCategoryView

@Composable
fun HomeScreen(paddingValues: PaddingValues) {
    val seriesList = Samples.getAllSeries()
    val movieList = Samples.getAllMovies()
    val scrollState = rememberScrollState()

    Column(
        modifier = Modifier
            .padding(paddingValues)
            .verticalScroll(scrollState)
            .background(color = MaterialTheme.colorScheme.primary)
    ) {
        ContinueWatchView()
        SeriesCategoryView(seriesCardList = seriesList)
        MovieCategoryView(movieCardList = movieList)
    }
}