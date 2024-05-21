package com.example.sakhcastapplication.ui.log_in_screen

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.twotone.Lock
import androidx.compose.material.icons.twotone.Person
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusDirection
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.key.Key
import androidx.compose.ui.input.key.KeyEventType
import androidx.compose.ui.input.key.key
import androidx.compose.ui.input.key.onKeyEvent
import androidx.compose.ui.input.key.type
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.sakhcastapplication.HOME_SCREEN
import com.example.sakhcastapplication.R
import com.example.sakhcastapplication.data.Samples

@Composable
fun LogInScreen(navController: NavHostController) {
    var login by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var passwordHidden by rememberSaveable { mutableStateOf(true) }
    val focusManager = LocalFocusManager.current
    Column(
        modifier = Modifier
            .padding()
            .background(MaterialTheme.colorScheme.primary)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            modifier = Modifier.padding(top = 50.dp),
            text = stringResource(id = R.string.sakh_cast),
            fontSize = 40.sp,
            fontWeight = FontWeight.Bold
        )
        TextField(
            colors = TextFieldDefaults.colors(
                unfocusedIndicatorColor = Color.Transparent,
            ),
            keyboardOptions = KeyboardOptions(imeAction = ImeAction.Next),
            keyboardActions = KeyboardActions(
                onNext = {
                    focusManager.moveFocus(FocusDirection.Down)
                }
            ),
            modifier = Modifier.padding(top = 20.dp),
            shape = RoundedCornerShape(10.dp),
            value = login,
            onValueChange = { login = it },
            label = { Text("Логин") },
            leadingIcon = { Icon(imageVector = Icons.TwoTone.Person, contentDescription = null) },

            singleLine = true,
        )
        Spacer(modifier = Modifier.height(20.dp))
        TextField(
            colors = TextFieldDefaults.colors(
                unfocusedIndicatorColor = Color.Transparent,
            ),
            shape = RoundedCornerShape(10.dp),
            value = password,
            leadingIcon = { Icon(imageVector = Icons.TwoTone.Lock, contentDescription = null) },
            onValueChange = { password = it },
            singleLine = true,
            label = { Text("Пароль") },
            visualTransformation =
            if (passwordHidden) PasswordVisualTransformation() else VisualTransformation.None,
            keyboardOptions = KeyboardOptions(imeAction = ImeAction.Done),
            keyboardActions = KeyboardActions(
                onDone = {}//TODO "Реализовать логику как у кнопки ВОЙТИ при нажатии Done на клавиатуре "
            ),
            trailingIcon = {
                IconButton(onClick = { passwordHidden = !passwordHidden }) {
                    val visibilityIcon =
                        if (passwordHidden) painterResource(id = R.drawable.ic_visibility) else painterResource(
                            id = R.drawable.ic_visibility_off
                        )
                    val description = if (passwordHidden) "Show password" else "Hide password"
                    Icon(painter = visibilityIcon, contentDescription = description)
                }
            }
        )
        Log.i("!!!", "pas = $password")
        Log.i("!!!", "log = $login")
        Button(
            onClick = { navController.navigate(HOME_SCREEN) }, //TODO Реализовать передачу логина пароля на проверку
            shape = RoundedCornerShape(10.dp)
        ) {
            Text(text = "Войти")
        }
    }
}