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
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
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

@Composable
fun VerMasFotografoScreen() {
    val context = LocalContext.current

    Column(
        modifier = Modifier
            .padding(top = 10.dp)
            .fillMaxWidth()
            .wrapContentHeight(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.End,
            verticalAlignment = Alignment.Top
        ) {
            Image(
                painter = painterResource(id = R.drawable.campana),
                contentDescription = "Campana",
                modifier = Modifier
                    .width(30.dp)
                    .height(30.dp)
                    .background(color = Color.Transparent)
            )
        }

        Card(
            modifier = Modifier
                .width(390.dp)
                .wrapContentHeight()
                .padding(10.dp)
                .align(Alignment.CenterHorizontally),
            shape = RoundedCornerShape(30.dp),
        ) {
            Column(
                modifier = Modifier.padding(20.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = R.drawable.avatar),
                    contentDescription = "ImagenPerdilCamarografo",
                    modifier = Modifier.size(100.dp)
                )

                OutlinedButton(
                    onClick = { /* Do something */ },
                    shape = RoundedCornerShape(50),
                    colors = ButtonDefaults.outlinedButtonColors(
                        containerColor = Color.White,
                        contentColor = Color(0xFFD29405),
                        disabledContentColor = Color.Gray
                    ),
                    modifier = Modifier
                        .padding(top = 10.dp)
                        .align(Alignment.CenterHorizontally)
                ) {
                    Text(
                        text = "Solicitar",
                        style = MaterialTheme.typography.labelMedium,
                        fontWeight = FontWeight.Bold,
                        fontSize = 15.sp
                    )
                }
            }
        }

        Text(
            text = "Nombre del camarógrafo",
            fontFamily = FontFamily(Font(R.font.inter)),
            fontWeight = FontWeight.Bold,
            fontSize = 15.sp,
            color = Color.Black,
            modifier = Modifier
                .padding(top = 12.dp, start = 40.dp)
                .align(Alignment.Start)
        )

        Text(
            text = "Camarógrafo de Camvi",
            fontFamily = FontFamily(Font(R.font.inter)),
            fontWeight = FontWeight.Bold,
            fontSize = 12.sp,
            color = Color.Black,
            modifier = Modifier
                .padding(top = 2.dp, start = 40.dp)
                .align(Alignment.Start)
        )

        Divider(
            color = Color(0xFFCFCFCF),
            thickness = 1.dp,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 10.dp, bottom = 9.dp)
        )

        Text(
            text = "Información del camarógrafo",
            fontFamily = FontFamily(Font(R.font.inter)),
            fontWeight = FontWeight.Bold,
            fontSize = 12.sp,
            color = Color.Black,
            modifier = Modifier
                .padding(start = 40.dp, bottom = 15.dp)
                .align(Alignment.Start)
        )

        Row(
            modifier = Modifier.padding(bottom = 10.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
        }
    }
}