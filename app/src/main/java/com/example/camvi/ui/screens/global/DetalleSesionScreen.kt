package com.example.camvi.ui.screens.global

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.camvi.R

@Preview
@Composable
fun DetailScreen() {
    Column(
        Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Image(
                painter = painterResource(id = R.drawable.dui),
                contentDescription = "DUI",
                Modifier.size(22.dp),
            )
            Text(
                text = "39893-2",
                style = MaterialTheme.typography.bodySmall.copy(fontFamily = MaterialTheme.typography.bodyMedium.fontFamily),
                color = MaterialTheme.colorScheme.onSurface,
                modifier = Modifier
                    .padding(start = 8.dp)
                    .weight(1f)
            )
            Image(
                painter = painterResource(id = R.drawable.casa),
                contentDescription = "Home Icon",
                Modifier.size(22.dp),
            )
        }
        Spacer(modifier = Modifier.height(8.dp))
        Row(verticalAlignment = Alignment.CenterVertically) {
            Image(
                painter = painterResource(id = R.drawable.celular),
                contentDescription = "Phone Icon",
                Modifier.size(22.dp),
            )
            Text(
                text = "1223-3321",
                style = MaterialTheme.typography.bodySmall.copy(fontFamily = MaterialTheme.typography.bodyMedium.fontFamily),
                color = MaterialTheme.colorScheme.onSurface,
                modifier = Modifier
                    .padding(start = 8.dp)
                    .weight(1f)
            )
            Image(
                painter = painterResource(id = R.drawable.casa),
                contentDescription = "Home Icon",
                Modifier.size(22.dp),
            )
        }
        Spacer(modifier = Modifier.height(8.dp))
        Row(verticalAlignment = Alignment.CenterVertically) {
            Text(
                text = "Nombre:",
                style = MaterialTheme.typography.bodySmall.copy(
                    fontFamily = MaterialTheme.typography.bodyMedium.fontFamily,
                    fontWeight = FontWeight.Medium
                ),
                color = Color(0xFF979797),
                modifier = Modifier.width(81.dp)
            )
            Text(
                text = "Tadeo Pacheco",
                style = MaterialTheme.typography.bodySmall.copy(fontFamily = MaterialTheme.typography.bodyMedium.fontFamily),
                color = MaterialTheme.colorScheme.onSurface,
                modifier = Modifier.weight(1f)
            )
        }
        Spacer(modifier = Modifier.height(8.dp))
        Row(verticalAlignment = Alignment.CenterVertically) {
            Text(
                text = "Contacto:",
                style = MaterialTheme.typography.bodySmall.copy(
                    fontFamily = MaterialTheme.typography.bodyMedium.fontFamily,
                    fontWeight = FontWeight.Medium
                ),
                color = Color(0xFF979797),
                modifier = Modifier.width(81.dp)
            )
            Text(
                text = "1223-3321",
                style = MaterialTheme.typography.bodySmall.copy(fontFamily = MaterialTheme.typography.bodyMedium.fontFamily),
                color = MaterialTheme.colorScheme.onSurface,
                modifier = Modifier.weight(1f)
            )
            Image(
                painter = painterResource(id = R.drawable.casa),
                contentDescription = "Home Icon",
                Modifier.size(22.dp),
            )
        }
    }

}

