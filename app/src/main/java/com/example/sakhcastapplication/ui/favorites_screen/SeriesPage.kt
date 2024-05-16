package com.example.sakhcastapplication.ui.favorites_screen

import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
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
import com.example.sakhcastapplication.model.Series
import com.example.sakhcastapplication.ui.home_screen.series.SeriesItemView

@Composable
fun SeriesPage(
    seriesWatching: List<Series>,
    seriesWillWatch: List<Series>,
    seriesFinishedWatching: List<Series>
) {
    val categoryNames = listOf("Cмотрю", "Буду смотреть", "Досмотрел")
    val scrollState = rememberScrollState()
    Column(
        modifier = Modifier
            .padding(Dimens.mainPadding)
            .verticalScroll(scrollState)
    ) {
        categoryNames.forEachIndexed { index, name ->
            Row(
                modifier = Modifier.padding(top = Dimens.mainPadding),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                Text(
                    text = name,
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
                itemsIndexed(
                    when (index) {
                        0 -> seriesWatching
                        1 -> seriesWillWatch
                        2 -> seriesFinishedWatching
                        else -> emptyList()
                    }
                ) { _, series ->
                    SeriesItemView(series = series)
                }
            }
        }
    }
}