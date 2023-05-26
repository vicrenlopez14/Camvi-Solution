package com.example.camvi.ui.screens.administradores

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.AlertDialogDefaults.containerColor
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.camvi.R
import com.example.camvi.model.clientes.CitasClienteDetalleData
import com.example.camvi.model.globales.Periodo
import com.example.camvi.ui.widgets.global.CamarografosScreen
import com.example.camvi.ui.widgets.global.CamviButton

@Preview
@Composable
fun SesionesCalificadasPreview(){
    SesionesCalificadas(navController = rememberNavController())
}
@Composable
fun SesionesCalificadas(navController: NavController){

    Surface() {
            Column (
                modifier = Modifier
                    .fillMaxSize()
                    .padding(start = 10.dp, top = 20.dp)
            ) {
                Text(
                    text = "Sesiones calificadas",
                    fontFamily = FontFamily(Font(R.font.inter_semibold)),
                    fontSize= 20.sp,
                    color = Color.Black,
                    modifier = Modifier
                        .padding(bottom = 5.dp)
                        .padding(end = 56.dp)
                )
                Column(
                   Modifier.background(color = colorResource(id = R.color.White), shape = RoundedCornerShape(16.dp))
                ) {
                    Row (
                        horizontalArrangement = Arrangement.SpaceBetween,
                        modifier = Modifier
                            .padding(8.dp)
                            .fillMaxWidth()
                    ){
                        PeriodoTiempo(
                            modifier = Modifier.weight(1f, true),
                            //selected = selectedPeriod.periodOfTime == Periodo.Semana,
                            //onClick = { dashboardViewModel.ChangePeriodOfTime(Periodo.Semana) }
                        )
                        PeriodoTiempo(
                            modifier = Modifier.weight(1f, true),
                            //selected = selectedPeriod.periodOfTime == Periodo.Semana,
                            //onClick = { dashboardViewModel.ChangePeriodOfTime(Periodo.Semana) }
                        )
                        PeriodoTiempo(
                            modifier = Modifier.weight(1f, true),
                            //selected = selectedPeriod.periodOfTime == Periodo.Semana,
                            //onClick = { dashboardViewModel.ChangePeriodOfTime(Periodo.Semana) }
                        )
                    }
                    LazyColumn( modifier = Modifier
                        .padding(top = 20.dp, start = 10.dp)
                        .fillMaxSize()){
                item {
                    sesionesCalificadasItem(navController)
                }
            }
                }
            }
    }
}
@Composable
fun PeriodoTiempo(
    modifier: Modifier,
    selected: Boolean = false,
    periodo: Periodo = Periodo.Semana,
    onClick: () -> Unit = {},
){
    Surface(
        modifier
            .padding(horizontal = 8.dp)
            .clip(RoundedCornerShape(16.dp))
            .clickable { onClick() },
        color = colorResource(id = if (selected) R.color.White else R.color.Yellow),
        contentColor = colorResource(id = if (selected) R.color.Yellow else R.color.White)

    ) {
        Column (
            modifier = Modifier
                .padding(16.dp)
        ){
            Text(
                periodo.Name,
                style = MaterialTheme.typography.bodyLarge,
                modifier = Modifier.align(Alignment.CenterHorizontally),
                textAlign = TextAlign.Center
            )
        }

    }
}


@Composable
fun sesionesCalificadasItem(navController: NavController){
    Surface() {
        Box(
        Modifier.fillMaxHeight(0.6f)
    ) {
        Row(
            Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp)
                .clip(RoundedCornerShape(16.dp)),
            horizontalArrangement = Arrangement.SpaceBetween,
        ) {
            Image(
                painter = painterResource(id = R.drawable.baby),
                contentDescription = "Sesión",
                contentScale = ContentScale.FillHeight,
                modifier = Modifier
                    .fillMaxHeight()
                    .weight(0.3f)

            )

            Column(
                Modifier
                    .weight(0.5f)
                    .padding(start = 8.dp)
            ) {
                Text("Baby shower" ?:"",
                fontFamily = FontFamily(Font(R.font.inter_semibold)),
                fontSize = 18.sp,
                color = Color.Black,)

                Spacer(Modifier.height(4.dp))

                Text("Carlos Figueroa" ?: "")

                Spacer(Modifier.height(16.dp))


                Row {

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
                        navController.navigate("${CamarografosScreen.DetalleCalificacion.route}")
                    }
                )
            }

        }
    }
        
    }
}