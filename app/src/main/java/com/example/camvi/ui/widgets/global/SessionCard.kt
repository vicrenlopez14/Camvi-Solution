package com.example.camvi.ui.widgets.global

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.camvi.R
import com.example.camvi.model.globales.SessionStatus


@Composable
fun SessionCard(
    status: SessionStatus,
    municipality: String,
    person: String,
    hour: String,
    title: String,
) {
    Surface(
        shape = RoundedCornerShape(16.dp),
        modifier = Modifier
            .height(200.dp)
            .fillMaxWidth()
            .clip(RoundedCornerShape(16.dp)),
        contentColor = colorResource(id = R.color.White),
    ) {
        Image(
            painter = painterResource(id = R.drawable.session_bg_client),
            contentDescription = "Clientes Dashboard",
            Modifier.fillMaxSize(),
            contentScale = ContentScale.FillBounds
        )
        Column(
            Modifier
                .fillMaxHeight()
                .padding(horizontal = 16.dp, vertical = 8.dp),
            verticalArrangement = Arrangement.SpaceBetween,
        ) {
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .fillMaxWidth()

            ) {
                StatusChip(status)

                Text(
                    municipality,
                    style = MaterialTheme.typography.bodyLarge,
                    color = colorResource(id = R.color.White),
                )
            }

            Column() {
                Text(
                    (if (person.length > 13) person.substring(
                        0,
                        13
                    ) + "..." else person) + " - ${hour}",
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.Medium,
                )
                Text(
                    title,
                    style = MaterialTheme.typography.titleLarge,
                    fontWeight = FontWeight.Bold
                )
            }
        }
    }
}