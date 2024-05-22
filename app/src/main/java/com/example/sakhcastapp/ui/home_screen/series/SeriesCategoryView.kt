package com.example.sakhcastapp.ui.main_screens.home_screen.series

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
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
import com.example.sakhcastapp.model.SeriesCard

@Composable
fun SeriesCategoryView(seriesCardList: List<SeriesCard>) {
    Row(
        modifier = Modifier.padding(start = 16.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Сериалы",
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
        modifier = Modifier.padding(top = 16.dp),
        contentPadding = PaddingValues(start = 16.dp, end = 16.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        itemsIndexed(seriesCardList) { _, item ->
            SeriesItemView(seriesCard = item)
        }
    }
}
