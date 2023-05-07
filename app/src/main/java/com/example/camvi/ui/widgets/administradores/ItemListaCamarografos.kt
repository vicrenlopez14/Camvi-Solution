package com.example.camvi.ui.widgets.administradores

import androidx.compose.foundation.BorderStroke
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
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.tooling.preview.PreviewParameterProvider
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
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
                modifier = Modifier.padding(bottom = 5.dp)
            )
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .height(40.dp),
                    colors = ButtonDefaults.textButtonColors(
                        contentColor = Color.Black,
                        containerColor = colorResource(id = R.color.Yellow)),
                    shape = RoundedCornerShape(16.dp),
                ) {
                    Text(
                        text = "Ver sesiones"
                    )
                }
                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .height(40.dp),
                    shape = RoundedCornerShape(16.dp),
                    colors = ButtonDefaults.textButtonColors(
                        contentColor = Color.Black,
                        containerColor = colorResource(id = R.color.DarkYellow)
                    )
                ) {
                    Text(
                        text = "Editar"
                    )
                }
            }
        }
    }
}
