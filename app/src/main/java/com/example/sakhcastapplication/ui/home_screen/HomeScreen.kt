package com.example.sakhcastapplication.ui.home_screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.icons.Icons
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.sakhcastapplication.Dimens
import com.example.sakhcastapplication.R
import com.example.sakhcastapplication.data.STUB
import com.example.sakhcastapplication.ui.theme.SakhCastApplicationTheme

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun HomeScreen() {
    val series = STUB.getAllSeries()
    SakhCastApplicationTheme(darkTheme = true) {
        Scaffold(
            topBar = {
                TopAppBar(
                    title = {
                        Text(
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center,
                            text = stringResource(R.string.sakh_cast)
                        )
                    },
                    actions = {
                        IconButton(onClick = {}) {
                            Icon(
                                modifier = Modifier.padding(),
                                painter = painterResource(id = R.drawable.ic_accaunt),
                                contentDescription = "",
                            )
                        }
                    },
                    colors = TopAppBarDefaults.topAppBarColors(MaterialTheme.colorScheme.tertiary)
                )
            }
        ) {
            Column(
                modifier = Modifier
                    .padding(it)
                    .padding(start = Dimens.mainPadding)
            ) {
                Text(modifier = Modifier.padding(top = Dimens.mainPadding),
                    text = "Продолжить просмотр",
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp
                )

                Text(modifier = Modifier.padding(top = Dimens.mainPadding),
                    text = "Сериалы",
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp
                )
                LazyRow {
                    itemsIndexed(series){_, item ->
                        SeriesItemView(series = item)
                    }
                }
                Text(modifier = Modifier.padding(top = Dimens.mainPadding),
                    text = "Фильмы",
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp
                )
            }
        }
    }
}
