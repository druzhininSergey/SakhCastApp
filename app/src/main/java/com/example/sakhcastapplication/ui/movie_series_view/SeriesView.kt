package com.example.sakhcastapplication.ui.movie_series_view

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.sakhcastapplication.R

@Composable
fun SeriesView() {
    val scrollState = rememberScrollState()
    Box() {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(scrollState)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(500.dp)
                    .graphicsLayer {
                        alpha = 1f - ((scrollState.value.toFloat() / scrollState.maxValue) * 2.5f)
                        translationY = 0.5f * scrollState.value
                    },
                contentAlignment = Alignment.Center
            ) {
                Image(
                    painter = painterResource(id = R.drawable.series_poster),
                    contentDescription = null,
                    modifier = Modifier.fillMaxSize(),
                    contentScale = ContentScale.Crop,
                )
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(250.dp)
                        .align(Alignment.BottomStart)
                        .drawBehind {
                            val colors = listOf(Color.Black.copy(alpha = 0f), Color.Black)
                            drawRect(
                                brush = Brush.verticalGradient(colors),
                                size = size
                            )
                        },
                    contentAlignment = Alignment.BottomStart
                ) {
                    Text(text = "Фильм 1", fontSize = 25.sp)
                }
            }
            Box(modifier = Modifier.background(MaterialTheme.colorScheme.primary)) {
                Text(
                    text = stringResource(id = R.string.text),
                    Modifier.padding(horizontal = 8.dp, vertical = 4.dp)
                )
            }

        }
    }
}