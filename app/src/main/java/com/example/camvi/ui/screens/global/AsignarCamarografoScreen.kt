package com.example.camvi.ui.screens.global

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.camvi.R


@Composable
fun CamarografoScreen() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start
    ) {
        Text(
            text = "Asigna un camarógrafo",
            fontFamily = FontFamily(Font(R.font.inter)),
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black,
            modifier = Modifier
                .padding(start = 30.dp, top = 20.dp)
                .fillMaxWidth()
        )
        Text(
            text = "Camarógrafos disponibles.",
            fontFamily = FontFamily(Font(R.font.inter)),
            fontSize = 13.sp,
            color = Color.Black,
            modifier = Modifier
                .padding(start = 30.dp)
                .fillMaxWidth()
        )
        Box(
            Modifier
                .height(1.dp)
                .fillMaxWidth()
                .padding(top = 15.dp, bottom = 12.dp)
                .background(Color(0xCFD1D3))
        )
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 6.dp)
        ) {
            LazyColumn(
                modifier = Modifier.padding(start = 30.dp),
                contentPadding = PaddingValues(bottom = 16.dp)
            ) {
//                items(camarografoList) { camarografo ->
//                    CamarografoItem(camarografo = camarografo)
//                }
            }
        }
    }
}

@Composable
fun CamarografoItem(camarografo: Camarografo) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 8.dp, bottom = 8.dp)
    ) {
        Text(
            text = camarografo.name,
            fontFamily = FontFamily(Font(R.font.inter)),
            fontSize = 16.sp,
            fontWeight = FontWeight.Medium,
            color = Color.Black,
            modifier = Modifier.padding(bottom = 4.dp)
        )
        Text(
            text = camarografo.description,
            fontFamily = FontFamily(Font(R.font.inter)),
            fontSize = 12.sp,
            color = Color.Gray,
            modifier = Modifier.padding(bottom = 4.dp)
        )
        Button(
            onClick = { /* assign cameraman */ },
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 4.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF9B51E0),
                contentColor = Color.White
            )
        ) {
            Text(
                text = "Asignar",
                fontFamily = FontFamily(Font(R.font.inter)),
                fontSize = 12.sp,
                fontWeight = FontWeight.Medium,
                modifier = Modifier.padding(start = 8.dp, end = 8.dp)
            )
        }
    }
}

val camarografoList = listOf(
    Camarografo("Camarógrafo 1", "Cámara Sony Alpha 6400"),
    Camarografo("Camarógrafo 2", "Cámara Canon EOS R"),
    Camarografo("Camarógrafo 3", "Cámara Panasonic Lumix GH5")
)

data class Camarografo(val name: String, val description: String)
