package com.example.camvi.ui.widgets.global

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Box
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

import com.example.camvi.R

@Preview
@Composable
fun CamviButtonPreview() {
    CamviButton()
}

@Composable
fun CamviButton(text: String = "Button", onClick: () -> Unit = {}, modifier: Modifier = Modifier) {
    Box() {
        OutlinedButton(
            onClick = { onClick() },
            border = BorderStroke(width = 1.5.dp, color = colorResource(id = R.color.DarkYellow)),
            colors = ButtonDefaults.outlinedButtonColors(contentColor = colorResource(id = R.color.DarkYellow)),
            modifier = modifier.align(Alignment.Center)
        ) {
            Text(
                fontWeight = FontWeight.Bold,
                text = text,
                color = colorResource(id = R.color.DarkYellow)
            )
        }
    }
}