package com.example.sakhcastapplication.ui.main_screens.home_screen.movie

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import com.example.sakhcastapplication.model.MovieCard
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.sakhcastapplication.Dimens

@Composable
fun MovieCategoryView(movieCardList: List<MovieCard>) {
    Row(
        modifier = Modifier.padding(top = Dimens.mainPadding, start = Dimens.mainPadding),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Фильмы",
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp
        )
        Icon(
            modifier = Modifier.padding(top = 4.dp, start = 5.dp),
            imageVector = Icons.Filled.KeyboardArrowRight,
            contentDescription = null
        )
    }
    LazyRow(
        modifier = Modifier.padding(top = Dimens.mainPadding),
        contentPadding = PaddingValues(start = Dimens.mainPadding, end = Dimens.mainPadding),
        horizontalArrangement = Arrangement.spacedBy(Dimens.mainPadding)
    ) {
        itemsIndexed(movieCardList) { _, item ->
            MovieItemView(movieCard = item)
        }
    }
}
