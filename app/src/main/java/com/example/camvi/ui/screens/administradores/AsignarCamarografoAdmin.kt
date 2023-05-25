package com.example.camvi.ui.screens.global

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
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.camvi.R
import com.example.camvi.model.clientes.CamarografoDisponibleData
import com.example.camvi.model.globales.CamviViews
import com.example.camvi.ui.widgets.administradores.ItemListaCamarografosParaAsignar
import com.example.camvi.viewmodel.clientes.ClientesNavigatorViewModel


//@Preview
@Composable
fun AsignarCamarografoAdmin(
    idSesion:Int,
    ClientesNavigationModel:ClientesNavigatorViewModel = viewModel()) {

    val items = remember { mutableStateOf(emptyList<CamarografoDisponibleData>()) }

    LaunchedEffect(true){
        try {
            val result = CamviViews.vwNombresCamarografosDesocupados(3)
            items.value = result
        }catch (e:Exception){
            println(e)
        }
    }

    Column(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start
    ) {
        Text(
            text = "Asigna un camarógrafo",
            modifier = Modifier
                .padding(start = 30.dp, top = 20.dp),
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily(Font(R.font.inter))
        )

        Text(
            text = "Camarógrafos disponibles",
            modifier = Modifier
                .padding(start = 30.dp),
            fontSize = 13.sp,
            fontFamily = FontFamily(Font(R.font.inter))
        )

        Divider(
            color = Color.LightGray,
            thickness = 1.dp,
            modifier = Modifier
                .padding(top = 9.dp, bottom = 10.dp)
        )

        LazyColumn(
            Modifier
                .fillMaxWidth()
        ) {
            items(items.value.size){index ->
                ItemListaCamarografosParaAsignar(items.value[index])
            }
        }
    }
}