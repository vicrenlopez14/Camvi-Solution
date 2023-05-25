package com.example.camvi.ui.screens.administradores

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.camvi.R


@Composable

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
                    modifier = Modifier

                ) {

                }
            }
    }
}
@Composable
fun PeriodoTiempo(){


}