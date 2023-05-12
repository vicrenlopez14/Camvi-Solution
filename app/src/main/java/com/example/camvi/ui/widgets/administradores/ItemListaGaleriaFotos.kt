package com.example.camvi.ui.widgets.administradores

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.camvi.R

@Preview(showBackground = true)
@Composable
fun ItemListaGaleriaFotos(){

    Card(colors = CardDefaults.cardColors
        (containerColor = colorResource(id = R.color.white)),
        modifier = Modifier.padding(30.dp)) {

        Column(
            Modifier.fillMaxWidth()) {
            Image(
                painter = painterResource(id = R.drawable.boda),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(194.dp))

            Row() {
                Text(
                    modifier = Modifier
                        .padding(start = 15.dp, top = 10.dp, end = 155.dp),
                    text = "Boda aesthetic",
                    fontFamily = FontFamily(Font(R.font.inter_boldd))
                )

                IconButton(
                    onClick = { /* do something */ }) {
                    Icon(
                        imageVector = Icons.Default.Delete,
                        contentDescription = null,
                        Modifier
                            .background(color = Color(red = 233, green = 201, blue = 76), shape = CircleShape)
                            .size(400.dp)
                            .padding(5.dp),
                        tint = Color.White
                    )
                }
            }
        }
    }
}