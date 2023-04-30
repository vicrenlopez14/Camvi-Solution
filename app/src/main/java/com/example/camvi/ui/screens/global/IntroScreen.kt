package com.example.camvi.ui.screens.global

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.camvi.R
import com.example.camvi.ui.widgets.global.CamviScreen

@Composable
fun IntroScreen(navController: NavController) {
    LazyColumn {
        item {

            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = R.drawable.imagen),
                    contentDescription = "Logo",
                    modifier = Modifier.fillMaxSize()
                )
                Text(
                    text = "Bienvenido a ",
                    color = Color.Black,
                    fontSize = 28.sp,
                    fontFamily = FontFamily(Font(R.font.inter_boldd)),
                    modifier = Modifier
                        .paddingFromBaseline(top = 55.dp)
                )
                Text(
                    text = "CAMVI",
                    color = Color.Black,
                    fontSize = 28.sp,
                    fontFamily = FontFamily(Font(R.font.inter_boldd)),
                    modifier = Modifier
                        .paddingFromBaseline(top = 10.dp)
                )
                Button(
                    onClick = {
                        navController.navigate(CamviScreen.Registro.route)
                    },
                    modifier = Modifier
                        .width(167.dp)
                        .height(60.dp)
                        .paddingFromBaseline(top = 145.dp),
                    shape = RoundedCornerShape(8.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.White
                    )
                ) {
                    Text(
                        text = "Registrarse",
                        color = Color.Black,
                        fontSize = 15.sp,
                        fontFamily = FontFamily(Font(R.font.inter_semibold))
                    )
                }
                Button(
                    onClick = {
                        navController.navigate(CamviScreen.InicioDeSesion.route)
                    },
                    modifier = Modifier
                        .width(167.dp)
                        .height(60.dp)
                        .paddingFromBaseline(top = 15.dp),
                    shape = RoundedCornerShape(8.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.White
                    )
                ) {
                    Text(
                        text = "Iniciar sesión",
                        color = Color.Black,
                        fontSize = 15.sp,
                        fontFamily = FontFamily(Font(R.font.inter_semibold))
                    )
                }
                Text(
                    text = "¿Olvidaste tu contraseña?",
                    color = Color.Black,
                    fontSize = 15.sp,
                    fontFamily = FontFamily(Font(R.font.inter_semibold)),
                    modifier = Modifier
                        .paddingFromBaseline(top = 250.dp)
                        .clickable(onClick = { /*TODO*/ })
                )
            }
        }
    }
}
