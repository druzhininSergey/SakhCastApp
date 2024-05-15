package com.example.sakhcastapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import com.example.sakhcastapplication.ui.home_screen.HomeScreen
import com.example.sakhcastapplication.ui.theme.SakhCastApplicationTheme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
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
                            colors = TopAppBarDefaults.topAppBarColors(MaterialTheme.colorScheme.tertiary),
                        )
                    },
                    bottomBar = {
                        BottomAppBar {

                        }
                    }
                ) {
                    HomeScreen(it)
                }
            }
        }
    }
}
