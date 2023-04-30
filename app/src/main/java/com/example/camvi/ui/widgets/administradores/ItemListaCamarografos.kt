package com.example.camvi.ui.widgets.administradores

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.camvi.R
import com.example.camvi.model.administradores.CamarografoItemData

@Composable
fun ItemListaCamarografos(camarografoItemData: CamarografoItemData) {
    Row(
        modifier = Modifier
            .padding(13.dp)
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Start
    ) {
        Image(
            painter = painterResource(id = R.drawable.avatar),
            contentDescription = "",
            modifier = Modifier
                .size(70.dp)
                .padding(end = 15.dp)
                .clip(
                    RoundedCornerShape(10.dp),
                )
        )
        Column(
            modifier = Modifier
                .weight(1f)
                .padding(vertical = 5.dp)
        ) {
            Text(
                text = camarografoItemData.nombre ?: "Camarografo",
                fontFamily = FontFamily(Font(R.font.inter)),
                fontWeight = FontWeight.Bold,
                color = Color.Black,
                modifier = Modifier.padding(bottom = 5.dp)
            )
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .padding(end = 10.dp)
                        .height(40.dp)
                        .border(1.dp, Color(0xFFD29405), shape = RoundedCornerShape(10.dp))
                        .background(Color(0xFFF3DE8A)),
                    colors = ButtonDefaults.textButtonColors(
                        contentColor = Color.Black
                    ),
                    shape = RoundedCornerShape(10.dp),
                ) {
                    Text(
                        text = "Ver sesiones"
                    )
                }
                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .height(40.dp)
                        .border(1.dp, Color(0xFFD29405), shape = RoundedCornerShape(10.dp))
                        .background(Color(0xFFE9C94C)),
                    colors = ButtonDefaults.textButtonColors(
                        contentColor = Color.Black
                    ),
                    shape = RoundedCornerShape(10.dp)
                ) {
                    Text(
                        text = "Editar"
                    )
                }
            }
        }
    }
}
