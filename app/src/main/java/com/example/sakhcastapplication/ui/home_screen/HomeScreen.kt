package com.example.sakhcastapplication.ui.home_screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.sakhcastapplication.Dimens
import com.example.sakhcastapplication.data.Samples
import com.example.sakhcastapplication.ui.home_screen.movie.MovieCategoryView
import com.example.sakhcastapplication.ui.home_screen.movie.MovieItemView
import com.example.sakhcastapplication.ui.home_screen.recently_watched.RecentlyWatchedView
import com.example.sakhcastapplication.ui.home_screen.series.SeriesCategoryView
import com.example.sakhcastapplication.ui.theme.SakhCastApplicationTheme

@Preview
@Composable
fun HomeScreen(paddingValues: PaddingValues) {
    val seriesList = Samples.getAllSeries()
    val movieList = Samples.getAllMovies()
    val scrollState = rememberScrollState()

    SakhCastApplicationTheme(darkTheme = true) {
        Column(
            modifier = Modifier
                .padding(paddingValues)
                .padding(start = Dimens.mainPadding)
                .verticalScroll(scrollState)
        ) {
            RecentlyWatchedView()
            SeriesCategoryView(seriesList)
            MovieCategoryView(movieList = movieList)
        }
    }
}

