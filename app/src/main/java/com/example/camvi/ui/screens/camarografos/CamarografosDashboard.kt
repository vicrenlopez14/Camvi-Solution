package com.example.camvi.ui.screens.camarografos

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.camvi.R
import com.example.camvi.model.globales.SessionStatus
import com.example.camvi.ui.widgets.global.SessionCard

@Preview
@Composable
fun CamarografosDashboardPreview() {
    CamarografosDashboard()
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun CamarografosDashboard() {
    Surface(
        Modifier
            .fillMaxSize()
    ) {
        Column {
            Box(
                Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(0.3f),
            ) {

                Image(
                    painter = painterResource(id = R.drawable.camarografosheaderback),
                    modifier = Modifier.fillMaxSize(),
                    contentScale = ContentScale.FillBounds,
                    contentDescription = null,
                )
                Column(
                    Modifier
                        .padding(16.dp)
                        .fillMaxSize(),
                    verticalArrangement = Arrangement.SpaceBetween
                ) {
                    Row(Modifier.padding(top = 16.dp)) {
                        Image(
                            painter = painterResource(id = R.drawable.man),
                            contentDescription = null,
                            contentScale = ContentScale.FillBounds,
                            modifier = Modifier
                                .clip(shape = CircleShape)
                                .size(64.dp)
                        )

                        Spacer(Modifier.width(16.dp))

                        Column {
                            Text(
                                stringResource(id = R.string.npc),
                                style = MaterialTheme.typography.titleLarge
                            )
                            Text(
                                "Bienvenido",
                                style = MaterialTheme.typography.titleMedium
                            )
                        }
                    }

                    Row(
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = androidx.compose.ui.Alignment.Bottom,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Column(verticalArrangement = Arrangement.Bottom) {
                            Text(
                                "Trabajo de hoy",
                                style = MaterialTheme.typography.headlineSmall,
                            )
                            Text(
                                "2 sesiones finalizadas",
                                style = MaterialTheme.typography.titleSmall,
                                fontWeight = FontWeight.Bold
                            )
                        }

                        Text(
                            "52%",
                            style = MaterialTheme.typography.displayLarge,
                            fontWeight = FontWeight.Bold
                        )
                    }
                }
            }
            Box {
                Divider(
                    thickness = 12.dp,
                    color = Color.LightGray,
                    modifier = Modifier.fillMaxWidth()
                )
                Divider(
                    thickness = 12.dp,
                    color = colorResource(id = R.color.GreenSuccess),
                    modifier = Modifier.fillMaxWidth(0.52f)
                )
            }

            Column(
                Modifier
                    .fillMaxSize()
                    .padding(16.dp)
            ) {
                Row(
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text("Sesiones", style = MaterialTheme.typography.headlineMedium)
                    TextButton(onClick = { /*TODO*/ }) {
                        Text("Ver todas")
                    }
                }

                Spacer(Modifier.height(16.dp))

                LazyColumn {
                    // random value that can be 1, 2 or 3

                    items(10) {
                        val random = (1..3).random()

                        Box(Modifier.padding(vertical = 16.dp)) {
                            SessionCard(

                                status = if (it % random == 1) SessionStatus.Finalizada else if (it % random == 2) SessionStatus.Pendiente else SessionStatus.EnProgreso,
                                hour = "3:00 P.M",
                                person = "Carlos Figueroa",
                                title = "Grabación de video",
                                municipality = "Mejicanos"
                            )
                        }
                    }
                }
            }


        }

    }
}
