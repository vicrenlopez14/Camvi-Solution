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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.camvi.R

@Composable
fun SesionesAgendadasScreen() {
    Box(modifier = Modifier.fillMaxSize()) {
        Text(
            text = "Sesiones agendadas",
            fontSize = 27.sp,
            color = Color.Black,
            modifier = Modifier
                .align(Alignment.TopCenter)
                .padding(top = 16.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.line),
            contentDescription = null,
            modifier = Modifier
                .align(Alignment.TopCenter)
                .padding(top = 64.dp)
                .width(406.dp)
                .height(3.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.menu),
            contentDescription = null,
            modifier = Modifier
                .align(Alignment.TopStart)
                .padding(start = 16.dp, top = 16.dp)
                .size(64.dp, 43.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.sesion),
            contentDescription = null,
            modifier = Modifier
                .align(Alignment.TopStart)
                .padding(start = 16.dp, top = 96.dp)
                .size(83.dp, 128.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.personicon),
            contentDescription = null,
            modifier = Modifier
                .align(Alignment.TopStart)
                .padding(start = 16.dp, top = 232.dp)
                .size(22.dp, 24.dp)
        )
        Text(
            text = "Sesión fotográfica",
            fontSize = 20.sp,
            color = Color.Black,
            modifier = Modifier
                .align(Alignment.TopStart)
                .padding(start = 48.dp, top = 96.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.calendar),
            contentDescription = null,
            modifier = Modifier
                .align(Alignment.TopStart)
                .padding(start = 48.dp, top = 168.dp)
                .size(21.dp, 20.dp)
        )
        Text(
            text = "José Ramírez",
            modifier = Modifier
                .align(Alignment.TopStart)
                .padding(start = 80.dp, top = 136.dp)
        )
        Text(
            text = "Vence el 23/05/2023",
            modifier = Modifier
                .align(Alignment.TopStart)
                .padding(start = 80.dp, top = 184.dp)
        )
    }

}