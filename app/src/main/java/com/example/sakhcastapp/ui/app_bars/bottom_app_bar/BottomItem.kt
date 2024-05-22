package com.example.sakhcastapp.ui.app_bars.bottom_app_bar

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.sharp.Home
import androidx.compose.material.icons.sharp.Search
import androidx.compose.ui.graphics.vector.ImageVector
import com.example.sakhcastapp.ui.CATALOG_SCREEN
import com.example.sakhcastapp.ui.FAVORITES_SCREEN
import com.example.sakhcastapp.ui.HOME_SCREEN
import com.example.sakhcastapp.ui.NOTIFICATION_SCREEN
import com.example.sakhcastapp.ui.SEARCH_SCREEN

sealed class BottomItem(
    val title: String,
    val icon: ImageVector,
    val route: String,
) {
    object HomeScreen : BottomItem("Главная", Icons.Sharp.Home, HOME_SCREEN)
    object CatalogScreen : BottomItem("Каталог", Icons.Filled.Menu, CATALOG_SCREEN)
    object FavoritesScreen : BottomItem("Избранное", Icons.Filled.Star, FAVORITES_SCREEN)
    object NotificationsScreen :
        BottomItem("Уведомления", Icons.Filled.Notifications, NOTIFICATION_SCREEN)
    object SearchScreen : BottomItem("Поиск", Icons.Sharp.Search, SEARCH_SCREEN)
}