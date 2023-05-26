package com.example.camvi.ui.screens.camarografos

import android.media.Image
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.camvi.R
import com.example.camvi.model.camarografos.CamarografosSesionesData
import com.example.camvi.model.camarografos.ListCitasData
import com.example.camvi.model.globales.CamviFunctions
import com.example.camvi.ui.widgets.global.CamarografosScreen
import com.example.camvi.ui.widgets.global.CamviButton

@Preview
@Composable
fun SesionesCamarografosPreview() {
    SesionesCamarografos(rememberNavController(), idUsuario = 1)
}

@Composable
fun SesionesCamarografos(
    navController: NavController,
    idUsuario: Int
) {
    val items = remember { mutableStateOf(emptyList<CamarografosSesionesData>()) }

    LaunchedEffect(key1 = idUsuario) {
        items.value = CamviFunctions.fnSesionesCamarografoLista(idUsuario)
    }
       Surface() {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 10.dp, top = 20.dp)

        ) {
            Text(
                text = "Sesiones agendadas",
                fontFamily = FontFamily(Font(R.font.inter_semibold)),
                fontSize = 18.sp,
                color = Color.Black,
                modifier = Modifier
                    .padding(bottom = 5.dp)
                    .padding(end = 56.dp)
            )
            LazyColumn(
                modifier = Modifier
                    .padding(top = 20.dp, start = 10.dp)
                    .fillMaxSize()
            ) {
                items(items.value) { items ->
                    SesionesListItem(
                        sesionesData = ListCitasData(
                                idSesion = items.idSesion,
                                titulo = items.titulo,
                                fotografo = items.fotografo,
                                fechaEvento = items.fechaEvento,
                                fotoGaleria = items.fotoGaleria
                        ),
                        onClick = {
                            navController.navigate("${CamarografosScreen.CamarografosSesionesDetalle.route}/ ${items.idSesion}")
                        }
                    )

                }

            }
        }
    }










}


@Composable
fun SesionesListItem(
    sesionesData: ListCitasData,
    onClick: () -> Unit = {}
){
    Box(
        Modifier
            .fillMaxWidth()
            .fillMaxHeight(0.2f),
    ) {
        Row(
            Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp)
                .clip(RoundedCornerShape(16.dp)),
            horizontalArrangement = Arrangement.SpaceBetween,
        ) {
            Image(
                painter = painterResource(id = R.drawable.placeholderpicture),
                contentDescription = "Sesión",
                contentScale = ContentScale.FillHeight,
                modifier = Modifier
                    .fillMaxHeight()
                    .weight(0.2f)
            )

            Column(
                Modifier
                    .weight(0.5f)
                    .padding(start = 8.dp)
            ) {
                Text(sesionesData.titulo ?: "")

                Spacer(Modifier.height(4.dp))

                Text(sesionesData.fotografo ?: "")

                Spacer(Modifier.height(16.dp))


                Row {
                    Image(
                        painter = painterResource(id = R.drawable.calendar_transparent),
                        contentDescription = "Vencimiento",
                        modifier = Modifier
                            .height(16.dp)
                    )
                    Text("Vence ${sesionesData.fechaEvento ?: ""}")
                }
            }

            Box(
                Modifier
                    .weight(0.3f)
                    .fillMaxSize()
                    .align(Alignment.CenterVertically)
            ) {
                CamviButton(
                    text = "Ver más",
                    modifier = Modifier.align(Alignment.Center),
                    onClick = {
                        onClick()
                    }
                )
            }

        }
    }

}