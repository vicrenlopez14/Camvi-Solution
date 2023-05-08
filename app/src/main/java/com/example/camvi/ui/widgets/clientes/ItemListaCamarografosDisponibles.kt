package com.example.camvi.ui.widgets.clientes

import android.graphics.drawable.shapes.Shape
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
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
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.camvi.R
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

@Preview(showBackground = true)
@Composable
fun ItemListaCamarografosDisponibles(){
    Card(
        colors = CardDefaults.cardColors
            (containerColor = colorResource(id = R.color.YellowLight)),
        modifier = Modifier
            .padding(20.dp)) {

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)) {

            Image(
                painter = painterResource(id = (R.drawable.avatar)),
                contentDescription = null,
                modifier = Modifier
                    .clip(RoundedCornerShape(10.dp))
                    .size(90.dp)
                    .padding(bottom = 10.dp))

            Text(
                text = "Carlos Daniel Figueroa Campos")

            Row(
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 10.dp)
            ) {

                OutlinedButton(
                    onClick = { /*TODO*/ },
                    colors = ButtonDefaults.textButtonColors(
                        contentColor = colorResource(id = R.color.black)),
                    border = BorderStroke(width = 1.5.dp, color = colorResource(id = R.color.black)),
                    shape = RoundedCornerShape(20.dp),
                    modifier = Modifier
                        .padding(end = 10.dp)) {

                    Text(
                        fontWeight = FontWeight.Bold,
                        text = "Ver más")
                }

                OutlinedButton(
                    onClick = { /*TODO*/ },
                    colors = ButtonDefaults.textButtonColors(
                        contentColor = colorResource(id = R.color.DarkYellow)),
                    border = BorderStroke(width = 1.5.dp, color = colorResource(id = R.color.DarkYellow)),
                    shape = RoundedCornerShape(20.dp)){

                    Text(
                        fontWeight = FontWeight.Bold,
                        text = "Solicitar" )
                }
            }
        }
    }
}
