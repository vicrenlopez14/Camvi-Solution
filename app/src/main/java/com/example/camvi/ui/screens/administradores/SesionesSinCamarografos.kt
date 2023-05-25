package com.example.camvi.ui.screens.administradores

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.camvi.model.administradores.SesionesSinCamarografosData
import com.example.camvi.model.globales.CamviViews
import com.example.camvi.ui.widgets.administradores.ItemListaSesionesSinCamarografos

@Preview
@Composable
fun SesionesSinCamarografosPreview() {
    SesionesSinCamarografos(navController = rememberNavController())
}

@Composable
fun SesionesSinCamarografos(navController: NavController) {

    val items = remember { mutableStateOf(emptyList<SesionesSinCamarografosData>()) }

    LaunchedEffect(true) {
        try {
            var result = CamviViews.vwSesionesSinFotografos()
            items.value = result
        } catch (e: Exception) {
            println(e)
        }
    }

    Column(
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start,
        modifier = Modifier
            .fillMaxSize()
    ) {

        Text(
            text = "Sesiones sin camarógrafos asignados",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(start = 30.dp, top = 30.dp)
        )

        Text(
            text = "Verifica que sesiones fotográficas no cuentan con un camarógrafo asignado",
            modifier = Modifier.padding(start = 30.dp)
        )

        Divider(
            color = Color.LightGray,
            thickness = 1.dp,
            modifier = Modifier
                .padding(top = 9.dp, bottom = 8.dp)
        )

        LazyColumn(
            Modifier.fillMaxWidth()
        ) {
            items(items.value.size) { index ->
                ItemListaSesionesSinCamarografos(items.value[index], onNavigateTo = {
                    navController.navigate(it)
                })
            }
        }
    }
}

