package com.example.camvi.ui.widgets.administradores

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.camvi.R

@Composable
@Preview(showBackground = true)
fun ItemListaSesionesSinCamarografos(){

    Card(colors = CardDefaults.cardColors
        (containerColor = colorResource(id = R.color.YellowLight)),
        modifier = Modifier.padding(30.dp)) {

        Column(
            Modifier.fillMaxWidth()) {
            Image(
                painter = painterResource(id = R.drawable.boda),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(194.dp))
            Text(
                modifier = Modifier
                    .padding(start = 15.dp, top = 10.dp),
                text = "Sesión fotográfica familiar",
                fontFamily = FontFamily(Font(R.font.inter_boldd))
            )

            Text(
                modifier = Modifier
                    .padding(start = 15.dp),
                text = "Agendada para 23/04/2023",
            )

            Button(
                onClick = { /*TODO*/ },
                colors = ButtonDefaults.buttonColors
                    (containerColor = colorResource(id = R.color.White)),
                modifier = Modifier.padding(start = 15.dp, bottom = 10.dp, top = 6.dp)) {

                Text(
                    text = "Asignar camarógrafo",
                    color = colorResource(id = R.color.black))
            }
        }
    }
}