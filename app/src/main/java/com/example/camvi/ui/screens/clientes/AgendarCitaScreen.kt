package com.example.camvi.ui.screens.clientes


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.camvi.R


@OptIn(ExperimentalMaterial3Api::class)
@Composable
@Preview (showBackground = true)
fun AgendarCita() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(10.dp)
            .verticalScroll(rememberScrollState())
    ) {

        Titulo()

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxSize()
        ) {
            Image(
                painter = painterResource(id = R.drawable.boda),
                contentDescription = "Imagen de una boda",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .padding(top = 30.dp)
                    .size(250.dp, 170.dp)
                    .clip(RoundedCornerShape(16.dp))
            )
        }

        Button(
            onClick = { /* TODO */ },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFFF3DE8A)),

            modifier = Modifier
                .padding(bottom = 30.dp, top = 10.dp)
                .align(Alignment.CenterHorizontally)
        ) {
            Text(
                text = "Selecciona de nuestra galeria",
                color = Color.Black,
                fontSize = 15.sp

            )
        }

        txtTitulo()
        txtFecha()
        txtHora()
        txtLugar()
        txtCamarografo()
        txtReservador()
        txtDUI()
        txtTelefono()

        Row(
            modifier = Modifier
                .width(350.dp))
        {
            Column(modifier = Modifier
                .weight(1f),
                horizontalAlignment = Alignment.CenterHorizontally)
            {
                btnCancelar()
            }
            Column(modifier = Modifier
                .weight(1f),
                horizontalAlignment = Alignment.CenterHorizontally)
            {
                btnEnviar()
            }
        }

    }
}

@Composable
private fun Titulo(){
    Text(
        text = "Agenda tu cita en Camvi",
        fontFamily = FontFamily(Font(R.font.inter)),
        fontWeight = FontWeight.Bold,
        fontSize = 20.sp,
        modifier = Modifier
            .padding(start = 20.dp, top = 40.dp)
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun txtTitulo(){
    Text(
        text = "Título",
        fontWeight = FontWeight.Bold,
        fontSize = 15.sp,
        modifier = Modifier.padding(start = 20.dp)
    )

    OutlinedTextField(
        value = "",
        onValueChange = { },
        label = { Text(text = "Sesión fotográfica en boda") },
        modifier = Modifier
            .width(350.dp)
            .padding(start = 20.dp, bottom = 20.dp)
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun txtFecha(){
    Text(
        text = "Selecciona la fecha",
        fontWeight = FontWeight.Bold,
        fontSize = 15.sp,
        modifier = Modifier.padding(start = 20.dp)
    )

    OutlinedTextField(
        value = "",
        onValueChange = { },
        label = { Text(text = "Fecha") },
        modifier = Modifier
            .width(350.dp)
            .padding(start = 20.dp, bottom = 20.dp)
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun txtHora(){
    Text(
        text = "Selecciona la hora",
        fontWeight = FontWeight.Bold,
        fontSize = 15.sp,
        modifier = Modifier.padding(start = 20.dp)
    )

    Row(
        modifier = Modifier.padding(bottom = 10.dp)
    ) {
        Column(
            modifier = Modifier
                .weight(1f)
                .padding(start = 20.dp, top = 10.dp)
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
                modifier = Modifier
                    .padding(bottom = 20.dp)
                    .width(145.dp)
            )
        }

        Column(
            modifier = Modifier
                .weight(1f)
                .padding(start = 5.dp, top = 10.dp)
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
                modifier = Modifier
                    .padding(bottom = 20.dp)
                    .width(145.dp)

            )
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun txtLugar(){
    Text(
        text = "Lugar",
        fontWeight = FontWeight.Bold,
        fontSize = 15.sp,
        modifier = Modifier.padding(start = 20.dp)
    )

    OutlinedTextField(
        value = "",
        onValueChange = { },
        label = { Text(text = "Instituto Tecnico Ricaldone") },
        modifier =
        Modifier
            .width(350.dp)
            .padding(start = 20.dp, bottom = 20.dp)
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun txtCamarografo(){
    Text(
        text = "Elije a tu camarográfo",
        fontWeight = FontWeight.Bold,
        fontSize = 15.sp,
        modifier = Modifier.padding(start = 20.dp)
    )

    OutlinedTextField(
        value = "",
        onValueChange = { },
        label = { Text(text = "Camila Sofía Ramos Hernández") },
        modifier =
        Modifier
            .width(350.dp)
            .padding(start = 20.dp, bottom = 20.dp)
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun txtReservador(){
    Text(
        text = "Reservador",
        fontWeight = FontWeight.Bold,
        fontSize = 15.sp,
        modifier = Modifier.padding(start = 20.dp)
    )

    OutlinedTextField(
        value = "",
        onValueChange = { },
        label = { Text(text = "María Jimena Castro Morales") },
        modifier =
        Modifier
            .width(350.dp)
            .padding(start = 20.dp, bottom = 20.dp)
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun txtDUI(){
    Text(
        text = "DUI",
        fontWeight = FontWeight.Bold,
        fontSize = 15.sp,
        modifier = Modifier.padding(start = 20.dp)
    )

    OutlinedTextField(
        value = "",
        onValueChange = { },
        label = { Text(text = "00000000-0") },
        modifier =
        Modifier
            .width(350.dp)
            .padding(start = 20.dp, bottom = 20.dp)
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun txtTelefono(){
    Text(
        text = "Teléfono",
        fontWeight = FontWeight.Bold,
        fontSize = 15.sp,
        modifier = Modifier.padding(start = 20.dp)
    )

    OutlinedTextField(
        value = "",
        onValueChange = { },
        label = { Text(text = "0000-0000") },
        modifier =
        Modifier
            .width(350.dp)
            .padding(start = 20.dp, bottom = 20.dp)
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun btnCancelar(){
    Button(
        onClick = { /* TODO */ },
        colors = ButtonDefaults.buttonColors(
            containerColor = colorResource(id = R.color.RedError)),

        modifier = Modifier
            .padding(bottom = 30.dp, top = 10.dp)
    ) {
        Text(
            text = "Cancelar",
            color = Color.White

        )
    }
}

@Composable
private fun btnEnviar(){
    Button(
        onClick = { /* TODO */ },
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.Green),

        modifier = Modifier
            .padding(bottom = 30.dp, top = 10.dp)
    ) {
        Text(
            text = "Envíar",
            color = Color.White

        )
    }
}
