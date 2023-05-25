package com.example.camvi.ui.screens.clientes

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.camvi.R
import com.example.camvi.model.clientes.CitasClienteDetalleData
import com.example.camvi.model.globales.CamviFunctions

@Composable
//@Preview
fun VerMasCitaCliente(navController: NavHostController, idSesion: Int){
    var detalle: CitasClienteDetalleData= CitasClienteDetalleData()

    LaunchedEffect(key1 = idSesion) {
        detalle = CamviFunctions.fnCitasClienteDetalle(idSesion) ?: CitasClienteDetalleData()
    }

    Surface() {
         Row(
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth()
            ){
                Image(
                painter = painterResource(id = R.drawable.arrowl),
                contentDescription = null,
                modifier = Modifier
                    .size(width = 100.dp, height = 40.dp)
                    .padding(top = 18.dp)
                    .padding(end = 60.dp)
                  )
            }
         Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(horizontal = 20.dp, vertical = 30.dp)
         ) {
                Spacer(modifier = Modifier.height(15.dp))
                Text(
                    text = detalle.titulo?: "", //aca va el titulo o sea variable
                    fontFamily = FontFamily(Font(R.font.inter_semibold)),
                    fontSize= 18.sp,
                    color = Color.Black,
                    modifier = Modifier
                        .padding(bottom = 5.dp)
                        .padding(end = 25.dp)
                )
                Spacer(modifier = Modifier.height(5.dp))
                 Text(
                        text = detalle.detalle?:"", //aca va el titulo o sea variable
                        fontFamily = FontFamily(Font(R.font.inter)),
                        fontSize= 14.sp,
                        color = Color.Black,
                        modifier = Modifier
                            .padding(bottom = 5.dp)
                            .padding(end = 25.dp)
                 )
                 Spacer(modifier = Modifier.height(5.dp))

                //InformacionEvento(sesiones: Sesiones)
                Column(
                     modifier = Modifier
                        .fillMaxWidth()
                    ) {
                        Text(
                            text = "Evento",
                            fontFamily = FontFamily(Font(R.font.inter_semibold)),
                            fontSize= 16.sp,
                            color = Color.Black,
                            textAlign= TextAlign.Start,
                            modifier = Modifier.padding(end = 280.dp),
                        )
                        Spacer(modifier = Modifier.height(20.dp))
                         Row {
                              Image(painter = painterResource(id = R.drawable.casa),
                                  contentDescription = null,
                              modifier = Modifier
                                  .size(25.dp)
                              )
                             Spacer(modifier = Modifier.width(15.dp))
                             Text(
                                 text = "Lugar",
                                 fontFamily= FontFamily(Font(R.font.inter)),
                                 fontSize = 13.sp,
                                 color = Color.Gray,
                                modifier = Modifier
                                    .weight(1f)

                             )
                             Spacer(modifier = Modifier.width(30.dp))
                             Text(text = detalle.lugar?:"", //aca va de nuevo la variable
                                fontFamily= FontFamily(Font(R.font.inter)),
                                 fontWeight = FontWeight.Bold,
                                 fontSize = 13.sp,
                                 modifier = Modifier
                                    .weight(1f)
                             )
                         }
                        Spacer(modifier = Modifier.height(20.dp))
                         Row {
                              Image(painter = painterResource(id = R.drawable.calendar),
                                  contentDescription = null,
                              modifier = Modifier
                                  .size(25.dp)
                              )
                             Spacer(modifier = Modifier.width(15.dp))
                             Text(
                                 text = "Fecha",
                                 fontFamily= FontFamily(Font(R.font.inter)),
                                 fontSize = 13.sp,
                                 color = Color.Gray,
                                 modifier = Modifier
                                    .weight(1f)
                             )
                             Spacer(modifier = Modifier.width(30.dp))
                             Text(text = detalle.fecha?:"", //aca va de nuevo la variable
                                fontFamily= FontFamily(Font(R.font.inter)),
                                 fontWeight = FontWeight.Bold,
                                 fontSize = 13.sp,
                                 modifier = Modifier
                                    .weight(1f)
                             )
                         }
                         Spacer(modifier = Modifier.height(20.dp))
                         Row {
                              Image(painter = painterResource(id = R.drawable.reloj),
                                  contentDescription = null,
                              modifier = Modifier
                                  .size(25.dp)
                              )
                             Spacer(modifier = Modifier.width(15.dp))
                             Text(
                                 text = "Hora inicio",
                                 fontFamily= FontFamily(Font(R.font.inter)),
                                 fontSize = 13.sp,
                                 color = Color.Gray,
                                 modifier = Modifier
                                    .weight(1f)
                             )
                             Spacer(modifier = Modifier.width(30.dp))
                             Text(text = detalle.horaIni?:"", //aca va de nuevo la variable
                                fontFamily= FontFamily(Font(R.font.inter)),
                                 fontWeight = FontWeight.Bold,
                                 fontSize = 13.sp,
                                 modifier = Modifier
                                    .weight(1f)
                             )
                         }
                         Spacer(modifier = Modifier.height(20.dp))
                         Row {
                              Image(painter = painterResource(id = R.drawable.reloj),
                                  contentDescription = null,
                              modifier = Modifier
                                  .size(25.dp)
                              )
                             Spacer(modifier = Modifier.width(15.dp))
                             Text(
                                 text = "Hora finalización",
                                 fontFamily= FontFamily(Font(R.font.inter)),
                                 fontSize = 13.sp,
                                 color = Color.Gray,
                                 modifier = Modifier
                                    .weight(1f)
                             )
                             Spacer(modifier = Modifier.width(30.dp))
                             Text(text = detalle.horaFinali?:"", //aca va de nuevo la variable
                                fontFamily= FontFamily(Font(R.font.inter)),
                                 fontWeight = FontWeight.Bold,
                                 fontSize = 13.sp,
                                 modifier = Modifier
                                    .weight(1f)
                             )
                         }


        }
                Spacer(modifier = Modifier.height(60.dp))
                //InformacionCliente()
                Column(
                     modifier = Modifier
                    .fillMaxWidth()
                    ) {
                    Text(
                        text = "Cliente",
                        fontFamily = FontFamily(Font(R.font.inter_semibold)),
                        fontSize= 16.sp,
                        color = Color.Black,
                        textAlign= TextAlign.Start,
                        modifier = Modifier.padding(end = 280.dp),
                    )
                    Spacer(modifier = Modifier.height(20.dp))
                    Row {
                          Image(painter = painterResource(id = R.drawable.personicon),
                              contentDescription = null,
                          modifier = Modifier
                              .size(25.dp)
                          )
                         Spacer(modifier = Modifier.width(15.dp))
                         Text(
                             text = "Nombre",
                             fontFamily= FontFamily(Font(R.font.inter)),
                             fontSize = 13.sp,
                             color = Color.Gray
                         )
                         Spacer(modifier = Modifier.width(30.dp))
                         Text(text = detalle.nombre?:"", //aca va de nuevo la variable
                            fontFamily= FontFamily(Font(R.font.inter)),
                             fontWeight = FontWeight.Bold,
                             fontSize = 13.sp,
                         )
                    }
                     Spacer(modifier = Modifier.height(20.dp))
                     Row {
                          Image(painter = painterResource(id = R.drawable.celular),
                              contentDescription = null,
                          modifier = Modifier
                              .size(25.dp)
                          )
                         Spacer(modifier = Modifier.width(15.dp))
                         Text(
                             text = "Contacto",
                             fontFamily= FontFamily(Font(R.font.inter)),
                             fontSize = 13.sp,
                             color = Color.Gray
                         )
                         Spacer(modifier = Modifier.width(30.dp))
                         Text(text = detalle.contacto?:"", //aca va de nuevo la variable
                            fontFamily= FontFamily(Font(R.font.inter)),
                             fontWeight = FontWeight.Bold,
                             fontSize = 13.sp,
                         )
                     }
                     Spacer(modifier = Modifier.height(20.dp))
                     Row {
                          Image(painter = painterResource(id = R.drawable.dui),
                              contentDescription = null,
                          modifier = Modifier
                              .size(25.dp)
                          )
                         Spacer(modifier = Modifier.width(15.dp))
                         Text(
                             text = "DUI",
                             fontFamily= FontFamily(Font(R.font.inter)),
                             fontSize = 13.sp,
                             color = Color.Gray
                         )
                         Spacer(modifier = Modifier.width(30.dp))
                         Text(text = detalle.dui?:"", //aca va de nuevo la variable
                            fontFamily= FontFamily(Font(R.font.inter)),
                             fontWeight = FontWeight.Bold,
                             fontSize = 13.sp,
                         )
                     }
                }

             Spacer(modifier = Modifier.height(60.dp))
             Column(
                 modifier = Modifier
                    .fillMaxWidth()
             ) {
                      Text(
                                text = "Fotógrafo",
                                fontFamily = FontFamily(Font(R.font.inter_semibold)),
                                fontSize= 16.sp,
                                color = Color.Black,
                                textAlign= TextAlign.Start,
                                modifier = Modifier
                                    .padding(end = 260.dp)
                      )
                 Spacer(modifier = Modifier.height(20.dp))
                 Row(){
                    Image(painter = painterResource(id = R.drawable.camara),
                              contentDescription = null,
                          modifier = Modifier
                              .size(25.dp)
                          )
                         Spacer(modifier = Modifier.width(30.dp))
                         Text(text = detalle.fotografo?:"", //aca va de nuevo la variable
                            fontFamily= FontFamily(Font(R.font.inter)),
                             fontWeight = FontWeight.Bold,
                             fontSize = 13.sp,
                         )

                }
             }
         }
    }
}