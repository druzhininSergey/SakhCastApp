package com.example.sakhcastapp.ui.main_screens.home_screen.recently_watched

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.sakhcastapp.data.Samples
import com.example.sakhcastapp.ui.theme.spacing

@OptIn(ExperimentalFoundationApi::class)
@Preview
@Composable
fun ContinueWatchView() {
    val film = Samples.getOneMovie()
    val series = Samples.getOneSeries()
    val pagerState = rememberPagerState { 2 }
    var tabIndex by remember {
        mutableIntStateOf(0)
    }
    LaunchedEffect(tabIndex) {
        pagerState.animateScrollToPage(tabIndex)
    }
    LaunchedEffect(pagerState.currentPage) {
        tabIndex = pagerState.currentPage
    }
    Column {
        Text(
            modifier = Modifier.padding(
                top = MaterialTheme.spacing.mainPadding,
                start = MaterialTheme.spacing.mainPadding
            ),
            text = "Продолжить просмотр",
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp
        )
        HorizontalPager(
            state = pagerState
        ) { index ->
            when (index) {
                0 -> ContinueWatchSeriesView(seriesCard = series)
                1 -> ContinueWatchFilmView(movieCard = film)
            }
        }
    }
}