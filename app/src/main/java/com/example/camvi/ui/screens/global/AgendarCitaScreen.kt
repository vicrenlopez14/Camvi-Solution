package com.example.camvi.ui.screens.global


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
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
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.camvi.R


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CameraScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text(
            text = "Asigna un camarógrafo",
            fontFamily = FontFamily(Font(R.font.inter)),
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp,
            modifier = Modifier
                .padding(start = 30.dp, top = 40.dp)
        )

        Image(
            painter = painterResource(id = R.drawable.boda),
            contentDescription = "Imagen de una boda",
            modifier = Modifier
                .height(110.dp)
                .width(170.dp)
                .align(Alignment.CenterHorizontally)
                .padding(top = 20.dp)
        )

        Button(
            onClick = { /* TODO */ },
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(bottom = 30.dp)
        ) {
            Text(
                text = "Selecciona de nuestra galeria",
                color = Color.Black
            )
        }

        Text(
            text = "Título",
            fontWeight = FontWeight.Bold,
            fontSize = 15.sp,
            modifier = Modifier.padding(start = 50.dp)
        )

        OutlinedTextField(
            value = "",
            onValueChange = { },
            label = { Text(text = "Sesión fotográfica en boda") },
            modifier = Modifier
                .width(300.dp)
                .padding(start = 50.dp, bottom = 20.dp)
        )

        Text(
            text = "Selecciona la fecha",
            fontWeight = FontWeight.Bold,
            fontSize = 15.sp,
            modifier = Modifier.padding(start = 50.dp)
        )

        OutlinedTextField(
            value = "",
            onValueChange = { },
            label = { Text(text = "Fecha") },
            modifier = Modifier
                .width(300.dp)
                .padding(start = 50.dp, bottom = 20.dp)
        )

        Text(
            text = "Selecciona la hora",
            fontWeight = FontWeight.Bold,
            fontSize = 15.sp,
            modifier = Modifier.padding(start = 50.dp)
        )

        Row(
            modifier = Modifier.padding(bottom = 20.dp)
        ) {
            Column(
                modifier = Modifier
                    .weight(1f)
                    .padding(start = 50.dp, top = 10.dp)
            ) {
                Text(
                    text = "Inicio",
                    fontWeight = FontWeight.Bold,
                    fontSize = 15.sp
                )

                OutlinedTextField(
                    value = "",
                    onValueChange = { },
                    label = { Text(text = "14:00 pm") },
                    modifier = Modifier.padding(bottom = 20.dp)
                )
            }

            Column(
                modifier = Modifier
                    .weight(1f)
                    .padding(start = 50.dp, top = 10.dp)
            ) {
                Text(
                    text = "Fin",
                    fontWeight = FontWeight.Bold,
                    fontSize = 15.sp
                )

                OutlinedTextField(
                    value = "",
                    onValueChange = { },
                    label = { Text(text = "14:30 pm") },
                    modifier = Modifier.padding(bottom = 20.dp)
                )
            }
        }

        Text(
            text = "Lugar",
            fontWeight = FontWeight.Bold,
            fontSize = 15.sp,
            modifier = Modifier.padding(start = 50.dp)
        )

        OutlinedTextField(
            value = "",
            onValueChange = { },
            label = { Text(text = "Instituto Tecnico Ricaldone") },
            modifier =
            Modifier
                .width(300.dp)
                .padding(start = 50.dp, bottom = 20.dp)
        )
    }
}