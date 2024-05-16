package com.example.sakhcastapplication.ui.favorites_screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
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
import com.example.sakhcastapplication.model.Movie
import com.example.sakhcastapplication.ui.home_screen.movie.MovieItemView

@Composable
fun MoviesPage(moviesWillWatch: List<Movie>) {
    Column (modifier = Modifier.padding(Dimens.mainPadding)){
        Row(
            modifier = Modifier.padding(top = Dimens.mainPadding),
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
        LazyRow {
            itemsIndexed(moviesWillWatch) { _, movie ->
                MovieItemView(movie = movie)
            }
        }
    }
}