package com.example.camvi.ui.screens.global

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.camvi.R

@Composable
fun VerSesionesAgendadasScreen() {
    Image(
        painter = painterResource(id = R.drawable.menu),
        contentDescription = null,
        modifier = Modifier
            .size(50.dp, 47.dp)
            .padding(start = 16.dp, top = 16.dp, end = 345.dp, bottom = 668.dp)
    )

    Text(
        text = "Sesiones agendadas",
        fontSize = 28.sp,
        color = Color.Black,
        modifier = Modifier
            .padding(bottom = 620.dp)
            .fillMaxWidth()
    )

    Image(
        painter = painterResource(id = R.drawable.line),
        contentDescription = null,
        modifier = Modifier
            .padding(start = 34.dp, top = 119.dp, bottom = 607.dp)
            .fillMaxWidth()
    )

    Image(
        painter = painterResource(id = R.drawable.personicon),
        contentDescription = null,
        modifier = Modifier
            .padding(start = 123.dp, top = 193.dp, end = 261.dp, bottom = 512.dp)
            .size(27.dp, 26.dp)
    )

    Text(
        text = "José Ramírez",
        fontSize = 16.sp,
        modifier = Modifier
            .padding(start = 152.dp, top = 193.dp, end = 162.dp, bottom = 516.dp)
    )

    Image(
        painter = painterResource(id = R.drawable.calendar),
        contentDescription = null,
        modifier = Modifier
            .padding(start = 123.dp, top = 228.dp, end = 262.dp, bottom = 483.dp)
            .size(26.dp, 20.dp)
    )

    Text(
        text = "Vence el 23/05/2023",
        fontSize = 14.sp,
        modifier = Modifier
            .padding(start = 154.dp, top = 228.dp, end = 124.dp, bottom = 484.dp)
    )

    Image(
        painter = painterResource(id = R.drawable.sesion),
        contentDescription = null,
        modifier = Modifier
            .padding(start = 27.dp, top = 267.dp, end = 26.dp, bottom = 3.dp)
            .size(359.dp, 305.dp)
    )


}