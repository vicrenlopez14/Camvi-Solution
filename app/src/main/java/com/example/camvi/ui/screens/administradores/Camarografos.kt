package com.example.camvi.ui.screens.administradores

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.camvi.model.administradores.CamarografoItemData
import com.example.camvi.model.globales.CamviViews
import com.example.camvi.ui.widgets.administradores.ItemListaCamarografos
import com.example.camvi.ui.widgets.global.AdministradoresScreen


@Preview
@Composable
fun CamarografosListScreenPreview() {
    CamarografosListScreen(rememberNavController())
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable

fun CamarografosListScreen(
    navController: NavController
) {
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
            modifier = Modifier
                .padding(start = 30.dp, top = 20.dp)
        )

        Text(
            text = "Lista de camarógrafos.",
            fontSize = 13.sp,
            fontWeight = FontWeight.Normal,
            modifier = Modifier
                .padding(start = 30.dp)
        )

        Button(
            onClick = {
                navController.navigate(AdministradoresScreen.CrearCamarografo.route)
            },
            modifier = Modifier
                .padding(start = 30.dp, top = 15.dp)
                .width(170.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(red = 233, green = 201, blue = 76),
                contentColor = Color.Black
            )
        ) {
            Text(
                text = "Crear camarógrafo",
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