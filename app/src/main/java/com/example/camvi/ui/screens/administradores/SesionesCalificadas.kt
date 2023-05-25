package com.example.camvi.ui.screens.administradores

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.AlertDialogDefaults.containerColor
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.camvi.R
import com.example.camvi.model.globales.Periodo


@Composable
@Preview
fun SesionesCalificadas(){

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
                    modifier = Modifier.background(color = Color(R.color.Yellow))
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
                }
            }
    }
}
@Composable
fun PeriodoTiempo(
    modifier: Modifier,
    selected: Boolean = false,
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
                text= "",
                style = MaterialTheme.typography.bodyLarge,
                modifier = Modifier.align(Alignment.CenterHorizontally),
                textAlign = TextAlign.Center
            )
        }

    }


}