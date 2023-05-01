package com.example.camvi.ui.screens.global

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.camvi.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun VerifyCodeScreen() {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 8.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start
        ) {
            Image(
                painter = painterResource(id = R.drawable.arrowl),
                contentDescription = null,
                modifier = Modifier
                    .size(22.dp, 25.dp)
                    .padding(start = 16.dp)
            )
            Text(
                text = "Verifica el código",
                fontFamily = FontFamily(Font(R.font.inter_boldd)),
                fontSize = 24.sp,
                color = Color.Black,
                modifier = Modifier
                    .padding(start = 16.dp, top = 8.dp, bottom = 8.dp)
            )
        }
        Image(
            painter = painterResource(id = R.drawable.imgcorreo),
            contentDescription = null,
            modifier = Modifier
                .size(206.dp)
                .padding(top = 16.dp)
        )
        Text(
            text = stringResource(R.string.indicacion2),
            fontFamily = FontFamily(Font(R.font.inter_semibold)),
            fontSize = 16.sp,
            color = Color.Black,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(top = 16.dp)
                .fillMaxWidth()
        )
        OutlinedTextField(
            value = "",
            onValueChange = { },
            label = { Text("Verify Code") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp, start = 16.dp, end = 16.dp)
                .height(52.dp),
            keyboardOptions = KeyboardOptions.Default.copy(
                keyboardType = KeyboardType.Number
            ),
            keyboardActions = KeyboardActions(onDone = { }),
            singleLine = true
        )
        Button(
            onClick = { },
            modifier = Modifier
                .padding(top = 16.dp)
                .fillMaxWidth()
                .height(48.dp)
        ) {
            Text(
                text = "Verificar",
                fontFamily = FontFamily(Font(R.font.inter_semibold)),
                fontSize = 16.sp,
                color = Color.Black
            )
        }
    }
}
