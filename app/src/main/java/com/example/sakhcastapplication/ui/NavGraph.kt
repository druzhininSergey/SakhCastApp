package com.example.sakhcastapplication.ui

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.sakhcastapplication.CATALOG_SCREEN
import com.example.sakhcastapplication.FAVORITES_SCREEN
import com.example.sakhcastapplication.MOVIE_CATEGORY_SCREEN
import com.example.sakhcastapplication.HOME_SCREEN
import com.example.sakhcastapplication.LOG_IN_SCREEN
import com.example.sakhcastapplication.MOVIE_VIEW
import com.example.sakhcastapplication.NOTIFICATION_SCREEN
import com.example.sakhcastapplication.SEARCH_SCREEN
import com.example.sakhcastapplication.SERIES_CATEGORY_SCREEN
import com.example.sakhcastapplication.SERIES_VIEW
import com.example.sakhcastapplication.ui.log_in_screen.LogInScreen
import com.example.sakhcastapplication.ui.main_screens.catalog_screen.CatalogScreen
import com.example.sakhcastapplication.ui.movie_series_view.MovieView
import com.example.sakhcastapplication.ui.movie_series_view.SeriesView
import com.example.sakhcastapplication.ui.main_screens.favorites_screen.FavoritesScreen
import com.example.sakhcastapplication.ui.main_screens.home_screen.HomeScreen
import com.example.sakhcastapplication.ui.main_screens.notifications_screen.NotificationScreen
import com.example.sakhcastapplication.ui.main_screens.search_screen.SearchScreen

@Composable
fun NavGraph(
    navHostController: NavHostController,
    paddingValues: PaddingValues,
) {
    NavHost(
        navController = navHostController,
        startDestination = LOG_IN_SCREEN
    ) {
        composable(LOG_IN_SCREEN) {
            LogInScreen(navController = navHostController)
        }
        composable(HOME_SCREEN) {
            HomeScreen(paddingValues = paddingValues)
        }
        composable(CATALOG_SCREEN) {
            CatalogScreen(paddingValues = paddingValues)
        }
        composable(FAVORITES_SCREEN) {
            FavoritesScreen(paddingValues = paddingValues)
        }
        composable(NOTIFICATION_SCREEN) {
            NotificationScreen(paddingValues = paddingValues)
        }
        composable(SEARCH_SCREEN) {
            SearchScreen()
        }
        composable(MOVIE_VIEW) {
            MovieView()
        }
        composable(SERIES_VIEW) {
            SeriesView()
        }
    }
}