package com.example.sakhcastapplication.ui.main_screens.catalog_screen

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.sakhcastapplication.Dimens
import com.example.sakhcastapplication.MOVIE_CATEGORY_SCREEN
import com.example.sakhcastapplication.SERIES_CATEGORY_SCREEN

@Composable
fun CatalogList(categories: List<String>, navHostController: NavHostController, tabIndex: Int) {
    LazyColumn(
        modifier = Modifier
            .fillMaxWidth(),
    ) {
        itemsIndexed(categories) { index, item ->
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)
                    .background(MaterialTheme.colorScheme.primary)
                    .clickable {
                        if (tabIndex == 0) navHostController.navigate(SERIES_CATEGORY_SCREEN)
                        else navHostController.navigate(MOVIE_CATEGORY_SCREEN)
                    },
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(

                    modifier = Modifier.padding(
                        start = Dimens.mainPaddingHalf,
                        end = Dimens.mainPaddingHalf
                    ),
                    text = item,
                    color = MaterialTheme.colorScheme.onPrimary
                )
                Icon(
                    imageVector = Icons.Filled.KeyboardArrowRight,
                    contentDescription = null,
                    tint = MaterialTheme.colorScheme.onPrimary
                )
            }
            if (index != categories.size - 1)
                Divider(
                    modifier = Modifier
                        .padding(start = Dimens.mainPaddingHalf, end = Dimens.mainPaddingHalf),
                    thickness = 1.dp,
                    color = Color.White
                )
        }
    }
}
