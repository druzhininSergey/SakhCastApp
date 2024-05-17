package com.example.sakhcastapplication.ui.bottom_app_bar

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.navigation.NavGraph
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.sakhcastapplication.ui.catalog_screen.CatalogScreen
import com.example.sakhcastapplication.ui.favorites_screen.FavoritesScreen
import com.example.sakhcastapplication.ui.home_screen.HomeScreen
import com.example.sakhcastapplication.ui.notifications_screen.NotificationScreen
import com.example.sakhcastapplication.ui.search_screen.SearchScreen

@Composable
fun NavGraph(navHostController: NavHostController, paddingValues: PaddingValues) {
    NavHost(
        navController = navHostController,
        startDestination = "home_screen"
    ){
        composable("home_screen"){
            HomeScreen(paddingValues = paddingValues)
        }
        composable("catalog_screen"){
            CatalogScreen(paddingValues = paddingValues)
        }
        composable("favorites_screen"){
            FavoritesScreen(paddingValues = paddingValues)
        }
        composable("notifications_screen"){
            NotificationScreen(paddingValues = paddingValues)
        }
        composable("search_screen"){
            SearchScreen()
        }
    }
}