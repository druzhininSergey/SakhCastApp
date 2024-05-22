package com.example.sakhcastapp.ui.main_screens.home_screen.recently_watched

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
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
import androidx.compose.ui.unit.sp
import com.example.sakhcastapp.R
import com.example.sakhcastapp.data.Samples
import com.example.sakhcastapp.model.MovieCard
import com.example.sakhcastapp.ui.POSTER_TAGS_BACKGROUND_ALPHA
import com.example.sakhcastapp.ui.theme.spacing

@Preview(showBackground = true)
@Composable
fun PreviewContinueWatchFilmView() {
    ContinueWatchFilmView(movieCard = Samples.getOneMovie())
}

@Preview(showBackground = true)
@Composable
fun ContinueWatchFilmView(movieCard: MovieCard) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .aspectRatio(960f / 540f)
            .padding(MaterialTheme.spacing.mainPadding),
    ) {
        Box {
            Image(
                modifier = Modifier.fillMaxSize(),
                painter = painterResource(id = R.drawable.movie_backdrop),
                contentDescription = null,
                contentScale = ContentScale.Crop,
            )
            Column(
                Modifier
                    .padding(
                        start = MaterialTheme.spacing.mainPaddingHalf,
                        bottom = MaterialTheme.spacing.mainPaddingHalf
                    )
                    .background(
                        color = Color.Gray.copy(alpha = POSTER_TAGS_BACKGROUND_ALPHA),
                        shape = MaterialTheme.shapes.small
                    )
                    .padding(
                        start = MaterialTheme.spacing.mainPaddingHalf,
                        end = MaterialTheme.spacing.mainPaddingHalf,
                        top = MaterialTheme.spacing.smallPadding,
                        bottom = MaterialTheme.spacing.smallPadding
                    )
                    .align(Alignment.BottomStart)
            ) {
                Text(
                    modifier = Modifier
                        .align(Alignment.Start),
                    text = movieCard.ruTitle,
                    color = Color.White,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    modifier = Modifier
                        .align(Alignment.Start),
                    text = movieCard.duration,
                    color = Color.White,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold
                )
            }
        }
    }
}