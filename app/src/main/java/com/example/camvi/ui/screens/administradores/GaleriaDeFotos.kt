package com.example.camvi.ui.screens.administradores

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.camvi.R
import com.example.camvi.ui.widgets.administradores.ItemListaGaleriaFotos
import com.example.camvi.ui.widgets.administradores.ItemListaSesionesSinCamarografos

@Preview(showBackground = true)
@Composable
fun GaleriaDeFotos() {
    Column(
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start,
        modifier = Modifier
            .fillMaxSize()) {

        Text(
            text = "Galería de fotos",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(start = 30.dp, top = 30.dp, bottom = 5.dp)
        )

        Text(
            text = "Estas son fotografías que los clientes pueden utilizar para decorar las propuestas " +
                    "de sus citas, dándoles un toque más animado y gráfico.",
            modifier = Modifier.padding(start = 30.dp) )

        Divider(
            color = Color.LightGray,
            thickness = 1.dp,
            modifier = Modifier
                .padding(top = 10.dp, bottom = 10.dp)
        )

        LazyColumn(
            Modifier.fillMaxWidth()){
            item { ItemListaGaleriaFotos()}
        }

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxWidth()) {

            Button(
                onClick = { /*TODO*/ },
                colors = ButtonDefaults.buttonColors
                    (containerColor = colorResource(id = R.color.YellowLight)),
                modifier = Modifier.padding(start = 15.dp, bottom = 10.dp, top = 6.dp)) {

                Text(
                    text = "Subir",
                    color = colorResource(id = R.color.black))
            }
        }
    }
}