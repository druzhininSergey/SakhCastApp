package com.example.sakhcastapplication.ui.home_screen.series

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.sakhcastapplication.Dimens
import com.example.sakhcastapplication.model.Series

@Composable
fun SeriesCategoryView(seriesList: List<Series>){
    Text(
        modifier = Modifier.padding(top = Dimens.mainPadding),
        text = "Сериалы",
        fontWeight = FontWeight.Bold,
        fontSize = 20.sp
    )
    LazyRow {
        itemsIndexed(seriesList) { _, item ->
            SeriesItemView(series = item)
        }
    }
}
