package com.example.camvi.ui.screens.clientes

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
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

@Preview
@Composable
fun VerCitasCliente(){
   Surface() {
        Column (
        modifier = Modifier
                .fillMaxWidth()
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
        }
   }






}

