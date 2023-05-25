package com.example.camvi.ui.screens.administradores

import android.media.Image
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.camvi.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
@Preview
fun VerEditarCamarografo(){
    Surface(){
        Row(
                        horizontalArrangement = Arrangement.Start,
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.fillMaxWidth()
        ) {
        }
        LazyColumn(){
            item {
                Column(
                     modifier = Modifier
                         .fillMaxSize()
                         .padding(horizontal = 20.dp, vertical = 30.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                     Image(
                        painter = painterResource(id = R.drawable.persona),
                        contentDescription = "",
                        modifier = Modifier
                            .size(width = 96.dp, height = 98.dp)
                            .clip(CircleShape)
                            .border(1.dp, Color.Black, CircleShape)
                    )
                    Text(
                        text = "Agregar",
                        fontFamily = FontFamily(Font(R.font.inter_semibold)),
                        fontSize = 16.sp,
                        color = Color(0xFFD29405),
                        modifier = Modifier
                            .padding(vertical = 30.dp)
                            .clickable(onClick = { /* TODO */ })
                    )
                    Spacer(modifier = Modifier.height(10.dp))
                    OutlinedTextField(
                        value = "nombre.value",
                        onValueChange = {
                            //
                        },
                        label = { Text("Nombre") },
                        modifier = Modifier.fillMaxWidth(0.95f)
                    )
                    Spacer(modifier = Modifier.height(10.dp))
                    OutlinedTextField(
                    value = "contacto.value",// variable,
                    onValueChange = {
                        "contacto.value = it"
                    },
                    label = { Text("Contacto") },
                    modifier = Modifier.fillMaxWidth(0.95f)
                )

                Spacer(modifier = Modifier.height(10.dp))

                OutlinedTextField(
                    value = "dui.value",
                    onValueChange = {
                        "dui.value = it"
                    },
                    label = { Text("DUI") },
                    modifier = Modifier.fillMaxWidth(0.95f)
                )

                Spacer(modifier = Modifier.height(10.dp))

                OutlinedTextField(
                    value = "correo.value",
                    onValueChange = {
                        "correo.value = it"
                    },
                    label = { Text("Correo") },
                    modifier = Modifier.fillMaxWidth(0.95f)
                )

                Spacer(modifier = Modifier.height(10.dp))

                OutlinedTextField(
                    value =" contrasena.value",
                    onValueChange = {
                        "contrasena.value = it"
                    },
                    label = { Text("Contraseña") },
                    modifier = Modifier.fillMaxWidth(0.95f)
                )

                Spacer(modifier = Modifier.height(40.dp))
                Button(onClick = {
                                 //CrearCamarografos()


                },
                        shape = RoundedCornerShape(15.dp),
                        border = BorderStroke(width = 1.dp, color = Color(0xFFF3DE8A)),
                        colors = ButtonDefaults.outlinedButtonColors(
                            containerColor = Color.White
                        ),
                            modifier = Modifier
                                .width(250.dp)
                                .height(48.dp)
                )
                {
                    Text(
                    text = "Actualizar camarógrafo",
                    color = Color.Black,
                    fontSize = 16.sp,
                    fontFamily = FontFamily(Font(R.font.inter_semibold))
                    )
                }

                }
            }
        }
    }
}