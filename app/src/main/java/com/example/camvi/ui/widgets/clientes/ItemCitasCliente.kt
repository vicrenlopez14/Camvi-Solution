package com.example.camvi.ui.widgets.clientes

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
//import androidx.compose.foundation.layout.RowScopeInstance.align
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.camvi.R
import com.example.camvi.model.clientes.CitasClienteData

//@Preview
@Composable
fun ItemCitasCliente(citasClienteData: CitasClienteData){


    Surface() {
            Column(
                    modifier = Modifier
                        .fillMaxWidth()
            ) {
                Text(
                    text = citasClienteData.titulo, //variable de titulo
                    fontFamily = FontFamily(Font(R.font.inter_semibold)),
                        fontSize= 18.sp,
                        color = Color.Black,
                        modifier = Modifier
                            .padding(bottom = 5.dp)
                            .padding(end = 56.dp)
                )
                Row {
                    Image(painter = painterResource(id = R.drawable.camara),
                           contentDescription = null,
                            modifier = Modifier
                                .size(25.dp)
                                .padding(start = 5.dp)
                    )
                    Spacer(modifier = Modifier.width(15.dp))
                    Text(
                         text = citasClienteData.nombre, //variable de nombre del fotografo
                         fontFamily= FontFamily(Font(R.font.inter)),
                         fontSize = 13.sp,
                         color = Color.Black,

                    )
                        Row(

                        ){
                            Button(
                                onClick = {
                                          //aca vamos pantalla con parametro
                                },
                                    modifier = Modifier.padding(start = 140.dp)
                                        .height(30.dp),
                                    shape = RoundedCornerShape(16.dp),
                                    colors = ButtonDefaults.textButtonColors(
                                    contentColor = Color.Black,
                                    containerColor = colorResource(id = R.color.DarkYellow)
                                    )
                            ) {
                                Text(
                                    text = "Detalles",
                                    fontFamily= FontFamily(Font(R.font.inter)),
                                    fontSize = 12.sp,
                                    color = Color.Black
                                )
                            }
                        }
                }
                Row {
                    Image(painter = painterResource(id = R.drawable.calendar),
                           contentDescription = null,
                            modifier = Modifier
                                .size(25.dp)
                                .padding(start = 5.dp)
                    )
                    Spacer(modifier = Modifier.width(15.dp))
                    Text(
                         text = citasClienteData.fecha, //variable de fecha de la sesion
                         fontFamily= FontFamily(Font(R.font.inter)),
                         fontSize = 13.sp,
                         color = Color.Black,

                    )
                }
            }
    }
}