package com.example.sakhcastapplication.ui.home_screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.sakhcastapplication.Dimens
import com.example.sakhcastapplication.R
import com.example.sakhcastapplication.model.Series
import com.example.sakhcastapplication.ui.theme.SakhCastApplicationTheme

@Preview(showBackground = true)
@Composable
fun x() {
    SakhCastApplicationTheme(darkTheme = true) {
        SeriesItemView(series = Series(1, "Сериал 1", 9.0, 10.0, 2022, "1 Сезон 23 Cерии"))
    }
}

@Composable
fun SeriesItemView(series: Series) {
    Box() {
        Column() {
            SeriesCard(series)
            Text(text = series.title, fontSize = 12.sp, fontWeight = FontWeight.Bold)
            Spacer(modifier = Modifier.height(4.dp))
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.width(160.dp)
            ) {
                Text(text = series.year.toString(), fontSize = 12.sp)
                Text(text = series.totalSeries, fontSize = 12.sp)
            }
        }
    }
}

@Composable
fun SeriesCard(series: Series) {
    Card(
        modifier = Modifier
            .padding(top = Dimens.mainPadding, end = Dimens.mainPadding)
            .width(160.dp)
            .height(240.dp),
        shape = RoundedCornerShape(10.dp),
        colors = CardDefaults.cardColors(),
    ) {
        Box {
            Image(
                modifier = Modifier
                    .fillMaxSize(),
                painter = painterResource(id = R.drawable.soup),
                contentDescription = null,
                contentScale = ContentScale.FillBounds
            )
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(color = Color.Black.copy(alpha = 0.9f))
                    .padding(8.dp)
                    .align(Alignment.BottomStart)
            ) {
                Column(
                    modifier = Modifier.weight(1f),
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {
                    Text("IMDB", color = Color.White, fontSize = 10.sp)
                    Text(series.imdbRating.toString(), color = Color.White, fontSize = 8.sp)
                }
                Column(
                    modifier = Modifier.weight(1f),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text("Кинопоиск", color = Color.White, fontSize = 10.sp)
                    Text(series.kinopoiskRating.toString(), color = Color.White, fontSize = 8.sp)
                }
            }
        }
    }
}