package com.example.sakhcastapp.ui

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.sakhcastapp.ui.catalog_screen.CatalogScreen
import com.example.sakhcastapp.ui.favorites_screen.FavoritesScreen
import com.example.sakhcastapp.ui.home_screen.HomeScreen
import com.example.sakhcastapp.ui.notification_screen.NotificationScreen
import com.example.sakhcastapp.ui.search_screen.SearchScreen

@Composable
fun NavGraph(
    navHostController: NavHostController,
    paddingValues: PaddingValues,
) {
    NavHost(
        navController = navHostController,
        startDestination = HOME_SCREEN
    ) {
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
            SearchScreen(paddingValues = paddingValues)
        }
    }
}