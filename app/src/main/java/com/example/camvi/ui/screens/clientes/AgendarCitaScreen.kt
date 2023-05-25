package com.example.camvi.ui.screens.clientes


import android.content.Context
import android.widget.Toast
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
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.camvi.R
import com.example.camvi.model.globales.CamviProcedures

@OptIn(ExperimentalMaterial3Api::class)
@Composable
@Preview(showBackground = true)
fun AgendarCita() {

    val titulo = remember{
        mutableStateOf("")
    }

    val fecha = remember {
        mutableStateOf("")
    }

    val horaInicio = remember {
        mutableStateOf("")
    }

    val horaFin = remember {
        mutableStateOf("")
    }

    val lugar = remember {
        mutableStateOf("")
    }

    val camarografo = remember{
        mutableStateOf("")
    }

    val reservador = remember {
        mutableStateOf("")
    }

    val telefono = remember {
        mutableStateOf("")
    }

    val dui = remember {
        mutableStateOf("")
    }

    val context = LocalContext.current

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(10.dp)
            .verticalScroll(rememberScrollState())
    ) {

        Text(
            text = "Agenda tu cita en Camvi",
            fontFamily = FontFamily(Font(R.font.inter)),
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp,
            modifier = Modifier
                .padding(start = 20.dp, top = 30.dp)
        )

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

        //Titulo
        Text(
            text = "Título",
            fontWeight = FontWeight.Bold,
            fontSize = 15.sp,
            modifier = Modifier.padding(start = 20.dp)
        )

        OutlinedTextField(
            value = titulo.value,
            onValueChange = {titulo.value = it},
            label = { Text(text = "Sesión fotográfica en boda") },
            modifier = Modifier
                .width(350.dp)
                .padding(start = 20.dp, bottom = 20.dp)
        )

        //fecha
        Text(
            text = "Selecciona la fecha",
            fontWeight = FontWeight.Bold,
            fontSize = 15.sp,
            modifier = Modifier.padding(start = 20.dp)
        )

        OutlinedTextField(
            value = fecha.value,
            onValueChange = {fecha.value = it},
            label = { Text(text = "Fecha") },
            modifier = Modifier
                .width(350.dp)
                .padding(start = 20.dp, bottom = 20.dp)
        )

        Text(
            text = "Selecciona la hora",
            fontWeight = FontWeight.Bold,
            fontSize = 15.sp,
            modifier = Modifier.padding(start = 20.dp)
        )

        //Hora Inicio
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
                    value = horaInicio.value,
                    onValueChange = {horaInicio.value = it},
                    label = { Text(text = "14:00 pm") },
                    modifier = Modifier
                        .padding(bottom = 20.dp)
                        .width(145.dp)
                )
            }

            //Hora Fin
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
                    value = horaFin.value,
                    onValueChange = {horaFin.value},
                    label = { Text(text = "14:30 pm") },
                    modifier = Modifier
                        .padding(bottom = 20.dp)
                        .width(145.dp)

                )
            }
        }

        //Lugar
        Text(
            text = "Lugar",
            fontWeight = FontWeight.Bold,
            fontSize = 15.sp,
            modifier = Modifier.padding(start = 20.dp)
        )

        OutlinedTextField(
            value = lugar.value,
            onValueChange = {lugar.value = it},
            label = { Text(text = "Instituto Tecnico Ricaldone") },
            modifier =
            Modifier
                .width(350.dp)
                .padding(start = 20.dp, bottom = 20.dp)
        )

        //Camarografo
        Text(
            text = "Elije a tu camarográfo",
            fontWeight = FontWeight.Bold,
            fontSize = 15.sp,
            modifier = Modifier.padding(start = 20.dp)
        )

        OutlinedTextField(
            value = camarografo.value,
            onValueChange = {camarografo.value = it},
            label = { Text(text = "Camila Sofía Ramos Hernández") },
            modifier =
            Modifier
                .width(350.dp)
                .padding(start = 20.dp, bottom = 20.dp)
        )

        //Reservador
        Text(
            text = "Reservador",
            fontWeight = FontWeight.Bold,
            fontSize = 15.sp,
            modifier = Modifier.padding(start = 20.dp)
        )

        OutlinedTextField(
            value = reservador.value,
            onValueChange = {reservador.value = it},
            label = { Text(text = "María Jimena Castro Morales") },
            modifier =
            Modifier
                .width(350.dp)
                .padding(start = 20.dp, bottom = 20.dp)
        )

        //Dui
        Text(
            text = "DUI",
            fontWeight = FontWeight.Bold,
            fontSize = 15.sp,
            modifier = Modifier.padding(start = 20.dp)
        )

        OutlinedTextField(
            value = dui.value,
            onValueChange = {dui.value = it},
            label = { Text(text = "00000000-0") },
            modifier =
            Modifier
                .width(350.dp)
                .padding(start = 20.dp, bottom = 20.dp)
        )

        //Telefono
        Text(
            text = "Teléfono",
            fontWeight = FontWeight.Bold,
            fontSize = 15.sp,
            modifier = Modifier.padding(start = 20.dp)
        )

        OutlinedTextField(
            value = telefono.value,
            onValueChange = {telefono.value = it},
            label = { Text(text = "0000-0000") },
            modifier =
            Modifier
                .width(350.dp)
                .padding(start = 20.dp, bottom = 20.dp)
        )

        //Boton Cancelar
        Row(
            modifier = Modifier
                .width(350.dp))
        {
            Column(modifier = Modifier
                .weight(1f),
                horizontalAlignment = Alignment.CenterHorizontally)
            {
                Button(
                    onClick = {},
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

            //Boton Enviar
            Column(modifier = Modifier
                .weight(1f),
                horizontalAlignment = Alignment.CenterHorizontally)
            {
                Button(
                    onClick = { AgendarCita(
                                titulo.value,
                                fecha.value,
                                horaInicio.value,
                                horaFin.value,
                                lugar.value,
                                camarografo.value,
                                reservador.value,
                                dui.value,
                                telefono.value,
                                context
                                )},
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
        }
    }
}

fun AgendarCita(
    titulo:String,
    fecha:String,
    horaInicio: String,
    horaFin:String,
    lugar: String,
    camarografo: String,
    reservador:String,
    dui:String,
    telefono: String,
    context: Context
){
    val result = CamviProcedures.spAgendarCita(
        titulo,
        fecha,
        horaInicio,
        horaFin,
        lugar,
        camarografo,
        reservador,
        dui,
        telefono,
    )
    if(result == 1 ){
        Toast.makeText(context,"Cita agendada con éxito", Toast.LENGTH_LONG).show()
    }
    else{
        Toast.makeText(context,"Hubo un error a la hora de agendar tú cita", Toast.LENGTH_LONG).show()
    }
}