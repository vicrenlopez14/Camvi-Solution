package com.example.camvi.ui.screens.global

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.camvi.R
import com.example.camvi.viewmodel.clientes.VerMasCamarografoViewModel


//@Preview(showBackground = true)
@Composable
fun VerMasFotografoScreen(idCamarografo:Int,
                          verMasCamarografoViewModel: VerMasCamarografoViewModel = viewModel()) {

    val verMasCamarografoState by verMasCamarografoViewModel.uiState.collectAsState()

    Column (
        modifier = Modifier
            .padding(top = 20.dp, start = 8.dp)
            .fillMaxSize(),
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp),
            horizontalArrangement = Arrangement.End,
            verticalAlignment = Alignment.Top,
        ) {
            IconButton(
                onClick = { /*TODO*/ }) {
                Image(
                    painter = painterResource(id = R.drawable.campana), contentDescription = "",
                    Modifier.size(40.dp))
            }
        }

        Card(
            colors = CardDefaults.cardColors(
                containerColor = colorResource(id = R.color.YellowLight)),
            modifier = Modifier
                .width(380.dp)
                .padding(10.dp),
        ) {

            //Imagen
            Column(
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .padding(10.dp)) {

                Image(
                    painter = painterResource(id = R.drawable.avatar),
                    contentDescription = "",
                    modifier = Modifier
                        .padding(10.dp)
                        .size(80.dp))

                OutlinedButton(
                    onClick = { /*TODO*/ },
                    border = BorderStroke(width = 1.5.dp, color = colorResource(id = R.color.DarkYellow)),
                    colors = ButtonDefaults.outlinedButtonColors (contentColor = colorResource(id = R.color.DarkYellow)),
                    modifier = Modifier
                        .align(alignment = Alignment.CenterHorizontally)) {
                    Text(
                        fontWeight = FontWeight.Bold,
                        text = "Solicitar",
                        color= colorResource(id = R.color.DarkYellow))
                }
            }
        }

        //Nombre
        Column(
            horizontalAlignment = Alignment.Start,
            modifier = Modifier
                .padding(15.dp)){
            Text(
                text = verMasCamarografoState.nombre,
                fontFamily = FontFamily(Font(R.font.inter_boldd))
            )
            Text(
                text = "Camarógrafo de Camvi")
        }

        //Info del Camarografo
        Column(
            horizontalAlignment = Alignment.Start,
            modifier = Modifier
                .padding(15.dp)){

            Text(
                modifier = Modifier
                    .padding(bottom = 10.dp),
                text = "Información del camarógrafo",
                fontFamily = FontFamily(Font(R.font.inter_boldd))
            )
            Row(
                modifier = Modifier
                    .fillMaxWidth()){
                Image(
                    painter = painterResource(id = R.drawable.escuela),
                    contentDescription = "",
                    modifier = Modifier
                        .size(40.dp))

                Text(text = verMasCamarografoState.tituloFormacion,
                    modifier = Modifier
                        .align(Alignment.CenterVertically)
                        .padding(start = 15.dp))
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()){
                Image(
                    painter = painterResource(id = R.drawable.correo),
                    contentDescription = "",
                    modifier = Modifier
                        .size(40.dp))

                Text(text = verMasCamarografoState.correo,
                    modifier = Modifier
                        .align(Alignment.CenterVertically)
                        .padding(start = 15.dp))
            }
        }

        //Sobre el camarografo
        Column(horizontalAlignment = Alignment.Start,
            modifier = Modifier
                .padding(15.dp)) {

            Text(
                fontFamily = FontFamily(Font(R.font.inter_boldd)),
                text = "Sobre mi")

            Text(
                text = verMasCamarografoState.acercaDe)
        }
    }
}