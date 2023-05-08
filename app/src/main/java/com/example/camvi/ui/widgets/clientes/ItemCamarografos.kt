package com.example.camvi.ui.widgets.clientes

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.camvi.R

@Preview(showBackground = true)
@Composable
fun ItemCamarografos(){
    Card(
        Modifier.padding(30.dp),
        colors = CardDefaults.cardColors
            (containerColor = colorResource(id = R.color.YellowLight)))
    {
        Row(
            Modifier
                .fillMaxWidth()
                .padding(10.dp),
            verticalAlignment = Alignment.CenterVertically)
        {

            Image(
                modifier = Modifier
                    .size(90.dp)
                    .clip(RoundedCornerShape(10.dp))
                    .padding(10.dp),
                painter = painterResource(id = R.drawable.man),
                contentDescription =  null)

            Column(
                Modifier
                    .fillMaxWidth()) {
                Text(
                    text = "Camila Sofia Ramos Handal",
                    Modifier
                        .padding(bottom = 5.dp))

                Button(
                    onClick = { /*TODO*/ },
                    colors = ButtonDefaults.textButtonColors(
                        contentColor = colorResource(id = R.color.DarkYellow)),
                    border = BorderStroke(width = 1.5.dp, color = colorResource(id = R.color.DarkYellow)),
                    shape = RoundedCornerShape(20.dp)) {

                    Text(
                        fontWeight = FontWeight.Bold,
                        text = "Solicitar")
                }
            }
        }
    }
}