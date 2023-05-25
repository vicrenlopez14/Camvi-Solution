package com.example.camvi.ui.screens.clientes

import android.media.Image
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.SemanticsActions.OnClick
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.example.camvi.R
import com.example.camvi.model.clientes.CitasClienteData
import com.example.camvi.model.clientes.CitasClienteDetalleData
import com.example.camvi.model.clientes.CitasData
import com.example.camvi.model.globales.CamviFunctions
import com.example.camvi.model.globales.Usuario
import com.example.camvi.ui.widgets.clientes.ItemCitasCliente
import com.example.camvi.ui.widgets.global.ClientesScreen
import com.example.camvi.viewmodel.clientes.ClientesNavigatorViewModel

//@Preview

//@Preview
@Composable
fun VerCitasCliente(
    navController: NavController,
    idUsuario: Int

) {
        val items = remember { mutableStateOf(emptyList<CitasClienteDetalleData>())}

        LaunchedEffect(items) {
        try {
            items.value = CamviFunctions.fnListaCitasClientes(idUsuario)

        } catch (e: Exception) {
            println(e)
        }
    }
   Surface() {
        Column (
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 10.dp, top = 20.dp)

            ){
            Text(
                text = "Tus sesiones", // aca va la variable,
                fontFamily = FontFamily(Font(R.font.inter_semibold)),
                    fontSize= 18.sp,
                    color = Color.Black,
                    modifier = Modifier
                        .padding(bottom = 5.dp)
                        .padding(end = 56.dp)
            )
            LazyColumn(
                modifier = Modifier
                    .padding(top = 20.dp, start = 10.dp)
                    .fillMaxSize()
            ){
                items(items.value){ items ->
                    ItemCita(
                        CitasClienteDetalleData= CitasData(
                            idSesion = items.idSesion,
                            titulo = items.titulo,
                            nombre = items.nombre,
                            fecha = items.fecha
                        ),
                        onClick = {
                            navController.navigate("${ClientesScreen.VerMasCitaCliente.route}/ ${items.idSesion}")
                        }
                    )

                }

            }
        }
   }
}


@Composable
fun ItemCita(
    CitasClienteDetalleData: CitasData,
    onClick: () -> Unit = {}
){
    Surface() {
            Column(
                    modifier = Modifier
                        .fillMaxWidth()
            ) {
                Text(
                    text = CitasClienteDetalleData.titulo?: "", //variable de titulo
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
                         text = CitasClienteDetalleData.nombre?:"", //variable de nombre del fotografo
                         fontFamily= FontFamily(Font(R.font.inter)),
                         fontSize = 13.sp,
                         color = Color.Black,

                    )
                        Row(

                        ){
                            Button(
                                onClick = {
                                        onClick()
                                },
                                    modifier = Modifier
                                        .padding(start = 140.dp)
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
                         text = CitasClienteDetalleData.fecha?:"", //variable de fecha de la sesion
                         fontFamily= FontFamily(Font(R.font.inter)),
                         fontSize = 13.sp,
                         color = Color.Black,

                    )
                }
            }
    }
}

