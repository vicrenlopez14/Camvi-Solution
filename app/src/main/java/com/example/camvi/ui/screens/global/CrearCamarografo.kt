package com.example.camvi.ui.screens.global

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.camvi.R

@Composable

fun PersonalInfoScreen() {
    Surface() {
    Column(
        Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {
        Image(
            painter = painterResource(id = R.drawable.flechaatras),
            contentDescription = null,
            modifier = Modifier
                .padding(start = 10.dp, top = 23.dp)
                .width(32.dp)
                .height(33.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.avatar),
            contentDescription = null,
            modifier = Modifier
                .padding(top = 56.dp)
                .width(83.dp)
                .height(87.dp)
        )
        Text(
            text = "Agregar",
            color = Color(0xFFD29405),
            modifier = Modifier
                .padding(top = 151.dp)
                .clickable { /* TODO */ }
        )
        Image(
            painter = painterResource(id = R.drawable.line),
            contentDescription = null,
            modifier = Modifier
                .padding(top = 188.dp)
        )
        Text(
            text = "Información personal",
            fontWeight = FontWeight.Bold,
            fontSize = 16.sp,
            modifier = Modifier
                .padding(top = 227.dp)
        )
        Text(
            text = "Nombre",
            fontSize = 18.sp,
            modifier = Modifier
                .padding(top = 287.dp)
        )
        Text(
            text = "Contacto",
            fontSize = 18.sp,
            modifier = Modifier
                .padding(top = 341.dp)
        )
        Text(
            text = "DUI",
            fontSize = 18.sp,
            modifier = Modifier
                .padding(top = 393.dp)
        )
        Text(
            text = "Correo",
            fontSize = 18.sp,
            modifier = Modifier
                .padding(top = 451.dp)
        )
    }

        
    }
}


