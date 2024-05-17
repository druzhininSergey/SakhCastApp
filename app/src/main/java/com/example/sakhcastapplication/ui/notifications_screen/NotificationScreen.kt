package com.example.sakhcastapplication.ui.notifications_screen

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material.icons.outlined.ArrowDropDown
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.sakhcastapplication.Dimens
import com.example.sakhcastapplication.data.Samples
import com.example.sakhcastapplication.ui.home_screen.movie.MovieItemView

@Preview
@Composable
fun PreviewNotificationScreen() {
    NotificationScreen(paddingValues = PaddingValues(20.dp))
}

@Composable
fun NotificationScreen(paddingValues: PaddingValues) {
    val notificationList = Samples.getAllNotifications()

    LazyColumn(
        modifier = Modifier
            .padding(paddingValues)
            .fillMaxWidth()
            .background(MaterialTheme.colorScheme.primary),
    ) {
        itemsIndexed(notificationList) { index, notification ->
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable { },
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    modifier = Modifier
                        .padding(start = Dimens.mainPadding, top = 3.dp, bottom = 3.dp)
                        .widthIn(max = 350.dp),
                    text = notification.text.substringBefore("<br>")
                )
                Icon(
                    imageVector = Icons.Filled.KeyboardArrowRight,
                    contentDescription = null,
                    tint = if (!notification.isRead) Color.Blue else Color.White
                )
            }
            if (index in 0 until notificationList.size - 1) {
                Divider(
                    thickness = 1.dp,
                    modifier = Modifier
                        .padding(start = Dimens.mainPadding, end = Dimens.mainPadding)
                )
            }
        }
    }
}