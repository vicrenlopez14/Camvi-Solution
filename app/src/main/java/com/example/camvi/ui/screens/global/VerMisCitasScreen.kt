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

@Composable
fun VerMisCitasScreen() {
    // Text View "Mis sesiones"
    Text(
        text = "Mis sesiones",
        fontSize = 28.sp,
        color = Color.Black,
        modifier = Modifier
            .padding(start = 26.dp, top = 78.dp, end = 221.dp, bottom = 615.dp)
    )

    // Horizontal line
    Image(
        painter = painterResource(id = R.drawable.line),
        contentDescription = "Line",
        modifier = Modifier
            .fillMaxWidth()
            .height(1.dp)
            .padding(top = 123.dp, bottom = 603.dp)
    )

    // Text View "Sesión fotográfica para una boda"
    Text(
        text = "Sesión fotográfica para una boda",
        fontSize = 20.sp,
        color = Color.Black,
        modifier = Modifier
            .padding(start = 26.dp, top = 150.dp, end = 89.dp, bottom = 554.dp)
    )

    // Image View "Calendar"
    Image(
        painter = painterResource(id = R.drawable.calendar),
        contentDescription = "Calendar",
        modifier = Modifier
            .size(24.dp, 28.dp)
            .padding(start = 26.dp, top = 227.dp, end = 361.dp, bottom = 476.dp)
    )

    // Text View "José Orellana"
    Text(
        text = "José Orellana",
        fontSize = 16.sp,
        modifier = Modifier
            .padding(start = 64.dp, top = 194.dp, end = 250.dp, bottom = 515.dp)
    )

    // Image View "Camera"
    Image(
        painter = painterResource(id = R.drawable.camara),
        contentDescription = "Camera",
        modifier = Modifier
            .size(26.dp, 26.dp)
            .padding(start = 26.dp, top = 191.dp, end = 360.dp, bottom = 514.dp)
    )

    // Text View "Vence 06/06/2023"
    Text(
        text = "Vence 06/06/2023",
        fontSize = 16.sp,
        modifier = Modifier
            .padding(start = 64.dp, top = 233.dp, end = 213.dp, bottom = 476.dp)
    )

    // Button "Detalles"
    Button(
        onClick = { /* Do something */ },
        modifier = Modifier
            .width(102.dp)
            .height(39.dp)
            .padding(start = 293.dp, top = 201.dp, end = 16.dp, bottom = 491.dp)
    ) {
        Text(
            text = "Detalles",
            fontSize = 14.sp,
            color = Color.White
        )
    }
}

