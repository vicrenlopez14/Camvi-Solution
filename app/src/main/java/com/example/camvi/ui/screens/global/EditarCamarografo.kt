package com.example.camvi.ui.screens.global

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.camvi.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun EditarCamarografo() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text(
            text = "Usuario",
            fontSize = 18.sp,
            modifier = Modifier
                .align(Alignment.Start)
                .paddingFromBaseline(top = 510.dp)
        )
        Text(
            text = "Nombre",
            fontSize = 18.sp,
            modifier = Modifier
                .align(Alignment.Start)
                .paddingFromBaseline(top = 287.dp)
        )
        Text(
            text = "Contraseña",
            fontSize = 18.sp,
            modifier = Modifier
                .align(Alignment.Start)
                .paddingFromBaseline(top = 573.dp)
        )
        OutlinedTextField(
            value = "",
            onValueChange = {},
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 48.dp, top = 536.dp, end = 27.dp, bottom = 122.dp),
            label = { Text("Usuario") }
        )
        OutlinedTextField(
            value = "",
            onValueChange = {},
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 48.dp, top = 312.dp, end = 299.dp, bottom = 395.dp),
            label = { Text("Nombre") }
        )
        OutlinedTextField(
            value = "",
            onValueChange = {},
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 48.dp, top = 595.dp, end = 271.dp, bottom = 122.dp),
            label = { Text("Contraseña") },
            visualTransformation = PasswordVisualTransformation()
        )
        Button(
            onClick = {},
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(top = 680.dp),
        ) {
            Text(text = "Actualizar")
        }
        Image(
            painter = painterResource(id = R.drawable.avatar),
            contentDescription = null,
            modifier = Modifier
                .size(83.dp)
                .paddingFromBaseline(top = 56.dp)
                .align(Alignment.CenterHorizontally)
        )
        Image(
            painter = painterResource(id = R.drawable.line),
            contentDescription = null,
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .paddingFromBaseline(top = 188.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.flechaatras),
            contentDescription = null,
            modifier = Modifier
                .size(32.dp)
                .padding(start = 16.dp, top = 23.dp, end = 363.dp, bottom = 675.dp)
                .align(Alignment.Start)
        )
    }
}
