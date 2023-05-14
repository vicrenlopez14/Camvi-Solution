package com.example.camvi.ui.screens.global

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
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

@Composable
fun GalleryScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
    ) {
        Text(
            text = "Galería de fotos",
            modifier = Modifier
                .padding(start = 30.dp, top = 20.dp),
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily(Font(R.font.inter)),
            color = Color.Black,
            textAlign = TextAlign.Start
        )
        Text(
            text = "Estas son fotografías que los clientes pueden utilizar para decorar las propuestas de sus citas, dándoles un toque más animado y gráfico.",
            modifier = Modifier
                .padding(start = 30.dp),
            fontSize = 13.sp,
            fontWeight = FontWeight.Normal,
            fontFamily = FontFamily(Font(R.font.inter)),
            color = Color.Black,
            textAlign = TextAlign.Start
        )
        Spacer(
            modifier = Modifier
                .height(1.dp)
                .padding(top = 15.dp, bottom = 12.dp)
                .background(color = Color(0xCFD1D3))
        )
        Column(
            modifier = Modifier.padding(start = 40.dp, top = 6.dp)
        ) {
            LazyColumn(
                modifier = Modifier.fillMaxWidth(),
                contentPadding = PaddingValues(vertical = 8.dp)
            ) {
                items(10) {
                    // replace with your gallery item composable
//                    GalleryItem()
                }
            }
            Button(
                onClick = { /* Handle click */ },
                modifier = Modifier
                    .padding(top = 30.dp, bottom = 35.dp)
                    .width(120.dp)
                    .align(Alignment.CenterHorizontally),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFFECC734),
                    contentColor = Color.Black
                )
            ) {
                Text(text = "Subir")
            }
        }
    }
}
