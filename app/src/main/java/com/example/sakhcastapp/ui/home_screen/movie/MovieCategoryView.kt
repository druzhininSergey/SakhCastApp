package com.example.sakhcastapp.ui.main_screens.home_screen.movie

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.sakhcastapp.model.MovieCard
import com.example.sakhcastapp.ui.theme.spacing

@Composable
fun MovieCategoryView(movieCardList: List<MovieCard>) {
    Row(
        modifier = Modifier.padding(
            top = MaterialTheme.spacing.mainPadding,
            start = MaterialTheme.spacing.mainPadding
        ),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Фильмы",
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp
        )
        Icon(
            modifier = Modifier.padding(
                top = MaterialTheme.spacing.smallPadding,
                start = MaterialTheme.spacing.smallPadding
            ),
            imageVector = Icons.Filled.KeyboardArrowRight,
            contentDescription = null
        )
    }
    LazyRow(
        modifier = Modifier.padding(
            top = MaterialTheme.spacing.mainPadding,
            bottom = MaterialTheme.spacing.mainPadding
        ),
        contentPadding = PaddingValues(
            start = MaterialTheme.spacing.mainPadding,
            end = MaterialTheme.spacing.mainPadding
        ),
        horizontalArrangement = Arrangement.spacedBy(MaterialTheme.spacing.mainPadding)
    ) {
        itemsIndexed(movieCardList) { _, item ->
            MovieItemView(movieCard = item)
        }
    }
}
