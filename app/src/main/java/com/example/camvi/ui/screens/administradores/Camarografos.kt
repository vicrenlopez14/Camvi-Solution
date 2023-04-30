package com.example.camvi.ui.screens.administradores

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.camvi.R
import com.example.camvi.model.administradores.CamarografoItemData
import com.example.camvi.model.globales.CamviViews
import com.example.camvi.ui.widgets.administradores.ItemListaCamarografos

@Preview
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CamarografosScreen() {
    val items = remember { mutableStateOf(emptyList<CamarografoItemData>()) }

    LaunchedEffect(true) {
        try {
            val result = CamviViews.vwListaDeCamarografos()
            items.value = result
        } catch (e: Exception) {
            println(e)
        }
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text(
            text = "Camarógrafos",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black,
            modifier = Modifier
                .padding(start = 30.dp, top = 20.dp)
        )

        Text(
            text = "Lista de camarógrafos.",
            fontSize = 13.sp,
            fontWeight = FontWeight.Normal,
            color = Color.Black,
            modifier = Modifier
                .padding(start = 30.dp)
        )

        Button(
            onClick = {},
            modifier = Modifier
                .padding(start = 30.dp, top = 15.dp)
                .width(170.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.White,
                contentColor = Color.Black
            )
        ) {
            Text(
                text = "Crear camarógrafo",
                color = Color.Black
            )
        }

        LazyColumn(
            modifier = Modifier
                .padding(top = 20.dp)
                .fillMaxWidth()
        ) {
            items(items.value.size) { index ->
                ItemListaCamarografos(items.value[index])
            }
        }
    }

}