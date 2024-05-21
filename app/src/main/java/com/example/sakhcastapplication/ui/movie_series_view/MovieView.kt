package com.example.sakhcastapplication.ui.movie_series_view

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
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
import kotlin.math.min

@Composable
fun MovieView() {
    val scrollState = rememberScrollState()

    Box(modifier = Modifier.fillMaxSize()) {
        Image(
            painter = painterResource(id = R.drawable.movie_poster),
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.5f)
                .graphicsLayer {
                    alpha = min(1f, 1 - (scrollState.value / 1000f))
                    translationY = -scrollState.value * 0.1f
                },
            contentScale = ContentScale.Crop,
        )

        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(scrollState)
        ) {
            Spacer(modifier = Modifier.height(200.dp))

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(250.dp)
                    .drawBehind {
                        val colors = listOf(Color.Gray.copy(alpha = 0f), Color.Gray)
                        drawRect(
                            brush = Brush.verticalGradient(colors),
                            size = size
                        )
                    },
                contentAlignment = Alignment.BottomStart
            ) {
                Box(modifier = Modifier.background(Color.Transparent)) {
                    Text(text = "Фильм 1", fontSize = 25.sp)
                }
            }

            Box(modifier = Modifier.background(Color.Gray)) {
                Text(
                    text = stringResource(id = R.string.text),
                    Modifier.padding(horizontal = 8.dp, vertical = 4.dp)
                )
            }
        }
    }
}