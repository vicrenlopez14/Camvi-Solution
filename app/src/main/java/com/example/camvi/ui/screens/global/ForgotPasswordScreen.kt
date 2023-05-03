package com.example.camvi.ui.screens.global

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.camvi.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
@Preview
fun ForgotPasswordScreen() {
   Surface() {
        Row(
                    horizontalArrangement = Arrangement.Start,
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.arrowl),
                        contentDescription = null,
                        modifier = Modifier
                            .size(width = 100.dp, height = 40.dp)
                            .padding(top = 18.dp)
                            .padding(end = 60.dp)

                    )
                }
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(40.dp))
        Text(
            text = "Olvidaste tu contraseña",
            color = Color.Black,
            fontSize = 24.sp,
            fontFamily = FontFamily(Font(R.font.inter_boldd)),
            modifier = Modifier.padding(top = 16.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.imgcontra),
            contentDescription = null,
            modifier = Modifier
                .padding(top = 32.dp)
                .size(206.dp)
        )
        Text(
            text = stringResource(id = R.string.indicacion1),
            color = Color.Black,
            fontSize = 16.sp,
            fontFamily = FontFamily(Font(R.font.inter_semibold)),
            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp)
        )
        OutlinedTextField(
            value = "",
            onValueChange = { /*TODO*/ },
            label = {
                Text(
                    text = "Correo electrónico",
                    fontFamily = FontFamily(Font(R.font.inter_semibold)),
                    fontSize = 14.sp,
                    color = Color.Black
                )
            },
            modifier = Modifier
                .padding(top = 32.dp)
                .fillMaxWidth(0.85f)
        )
        Button(
            onClick = { /*TODO*/ },
              shape = RoundedCornerShape(15.dp),
                        border = BorderStroke(width = 1.dp, color = Color(0xFFF3DE8A)),
                        colors = ButtonDefaults.outlinedButtonColors(
                            containerColor = Color.White
                        ),
            modifier = Modifier
                .padding(top = 32.dp)
                .fillMaxWidth(0.7f)
                .height(61.dp)
        ) {
            Text(
                text = "Enviar",
                color = Color.Black,
                fontSize = 16.sp,
                fontFamily = FontFamily(Font(R.font.inter_semibold))
            )
        }
    }
   }
}
