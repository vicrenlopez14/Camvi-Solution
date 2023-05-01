package com.example.camvi.ui.screens.global

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
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
fun MyScreen() {
    Column(
        Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Row(
            Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp)
        ) {
            Image(
                painter = painterResource(R.drawable.flechaatras),
                contentDescription = null,
                modifier = Modifier
                    .size(28.dp)
                    .align(Alignment.CenterVertically)
            )
            Text(
                text = "Sesión fotográfica para una boda",
                fontSize = 24.sp,
                color = Color.Black,
                modifier = Modifier
                    .padding(start = 8.dp)
                    .align(Alignment.CenterVertically)
            )
        }
        Row(
            Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp)
        ) {
            Image(
                painter = painterResource(R.drawable.celular),
                contentDescription = null,
                modifier = Modifier
                    .size(32.dp)
                    .align(Alignment.CenterVertically)
            )
            Text(
                text = "Contacto:",
                fontSize = 16.sp,
                color = Color.Black,
                modifier = Modifier
                    .padding(start = 8.dp)
                    .align(Alignment.CenterVertically)
            )
            OutlinedTextField(
                value = "",
                onValueChange = { },
                modifier = Modifier
                    .weight(1f)
                    .padding(start = 8.dp)
            )
        }
        Row(
            Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp)
        ) {
            Image(
                painter = painterResource(R.drawable.dui),
                contentDescription = null,
                modifier = Modifier
                    .size(26.dp)
                    .align(Alignment.CenterVertically)
            )
            Text(
                text = "Nombre:",
                fontSize = 16.sp,
                color = Color.Black,
                modifier = Modifier
                    .padding(start = 8.dp)
                    .align(Alignment.CenterVertically)
            )
            OutlinedTextField(
                value = "",
                onValueChange = { },
                modifier = Modifier
                    .weight(1f)
                    .padding(start = 8.dp)
            )
        }
        Row(
            Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp)
        ) {
            Image(
                painter = painterResource(R.drawable.casa),
                contentDescription = null,
                modifier = Modifier
                    .size(22.dp)
                    .align(Alignment.CenterVertically)
            )
            Text(
                text = "Dirección:",
                fontSize = 16.sp,
                color = Color.Black,
                modifier = Modifier
                    .padding(start = 8.dp)
                    .align(Alignment.CenterVertically)
            )
            OutlinedTextField(
                value = "",
                onValueChange = { },
                modifier = Modifier
                    .weight(1f)
                    .padding(start = 8.dp)
            )
        }
        Row(
            Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp)
        ) {
            Image(
                painter = painterResource(R.drawable.reloj),
                contentDescription = null,
                modifier = Modifier
                    .size(21.dp)
                    .align(Alignment.CenterVertically)
            )
            Text(
                text = "Hora finalización:",
                fontSize = 16.sp,
                color = Color.Black,
                modifier = Modifier
                    .padding(start = 8.dp)
                    .align(Alignment.CenterVertically)
            )
        }
    }
}
