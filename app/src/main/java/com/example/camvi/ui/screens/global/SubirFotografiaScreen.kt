package com.example.camvi.ui.screens.global

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.camvi.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PhotoUploadScreen() {
    Column(
        Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text(
            text = "Subir fotografía",
            fontFamily = FontFamily(Font(R.font.inter)),
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black,
            modifier = Modifier
                .padding(start = 30.dp, top = 20.dp)
                .align(Alignment.Start)
        )
        Column(
            Modifier
                .fillMaxWidth()
                .wrapContentHeight()
                .padding(top = 20.dp)
        ) {
            Row(
                Modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
                    .padding(start = 30.dp)
            ) {
//                Card(
//                    Modifier
//                        .size(40.dp)
//                        .padding(end = 10.dp),
//                    shape = RoundedCornerShape(100.dp),
//                    backgroundColor = Color(0xFFF1D462)
//                ) {
//                    Image(
//                        painter = painterResource(id = R.drawable.signo),
//                        contentDescription = "Agregar archivo",
//                        modifier = Modifier
//                            .size(20.dp)
//                            .align(Alignment.Center)
//                    )
//                }
                Column(
                    Modifier
                        .fillMaxWidth()
                        .wrapContentHeight()
                ) {
                    Text(
                        text = "Agregar archivo",
                        fontFamily = FontFamily(Font(R.font.inter)),
                        fontWeight = FontWeight.Bold,
                        color = Color.Black
                    )
                    Text(
                        text = "PNG o JPG ;  12 MB máximo.",
                        fontFamily = FontFamily(Font(R.font.inter)),
                        color = Color.Black
                    )
                }
            }
            Text(
                text = "Título",
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp,
                modifier = Modifier
                    .padding(top = 20.dp, start = 30.dp)
                    .align(Alignment.Start)
            )
            TextField(
                value = "",
                onValueChange = {},
                modifier = Modifier
                    .width(350.dp)
                    .height(55.dp)
                    .padding(start = 30.dp),
                placeholder = {
                    Text(
                        text = "Foto de fiesta familiar"
                    )
                }
            )
            Button(
                onClick = {},
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)
                    .padding(top = 20.dp, bottom = 35.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFFECC734)
                )
            ) {
                Text(
                    text = "Publicar",
                    fontFamily = FontFamily(Font(R.font.inter)),
                    fontWeight = FontWeight.Bold,
                    color = Color.Black,
//                    modifier = Modifier.align(Alignment.CenterHorizontally)
                )
            }
        }
    }
}
