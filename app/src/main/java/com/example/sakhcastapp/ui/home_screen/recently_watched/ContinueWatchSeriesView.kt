package com.example.sakhcastapp.ui.main_screens.home_screen.recently_watched

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.sakhcastapp.R
import com.example.sakhcastapp.data.Samples
import com.example.sakhcastapp.model.SeriesCard

@Preview(showBackground = true)
@Composable
fun Preview1() {
    ContinueWatchSeriesView(seriesCard = Samples.getOneSeries())
}

@Preview(showBackground = true)
@Composable
fun ContinueWatchSeriesView(seriesCard: SeriesCard) {
    Card(
        modifier = Modifier
            .height(234.dp)
            .width(416.dp)
            .padding(16.dp)
    ) {
        Box {
            Image(
                modifier = Modifier.fillMaxSize(),
                painter = painterResource(id = R.drawable.series_backdrop),
                contentDescription = null,
                contentScale = ContentScale.Crop,
            )
            Column(
                Modifier
                    .padding(start = 6.dp, bottom = 6.dp)
                    .background(
                        color = Color.Gray.copy(alpha = 0.8f),
                        shape = RoundedCornerShape(8.dp)
                    )
                    .padding(start = 8.dp, end = 8.dp, top = 4.dp, bottom = 4.dp)
                    .align(Alignment.BottomStart)
            ) {
                Text(
                    modifier = Modifier
                        .align(Alignment.Start),
                    text = seriesCard.name,
                    color = MaterialTheme.colorScheme.onPrimary,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    modifier = Modifier
                        .align(Alignment.Start),
                    text = seriesCard.totalSeasonsAndSeries,
                    color = MaterialTheme.colorScheme.onPrimary,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold
                )
            }
        }
    }
}