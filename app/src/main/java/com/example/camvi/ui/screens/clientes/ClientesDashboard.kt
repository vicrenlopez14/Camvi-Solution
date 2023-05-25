package com.example.camvi.ui.screens.clientes

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
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.camvi.R
import com.example.camvi.model.globales.SessionStatus
import com.example.camvi.ui.widgets.global.CamviButton
import com.example.camvi.ui.widgets.global.ClientesScreen
import com.example.camvi.ui.widgets.global.SessionCard

@Preview
@Composable
fun ClientesDashboardPreview() {
    ClientesDashboard(rememberNavController())
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun ClientesDashboard(navController: NavController) {
    Surface(
        Modifier
            .fillMaxSize()

    ) {
        Column(Modifier.padding(16.dp)) {
            Spacer(Modifier.height(48.dp))
            Row {
                Image(
                    painter = painterResource(id = R.drawable.clients_dash_picture),
                    contentDescription = "Clientes Dashboard",
                    Modifier.size(100.dp)
                )
                Box(Modifier.align(Alignment.CenterVertically)) {
                    Text(
                        "Inmortaliza tus momentos",
                        style = MaterialTheme.typography.headlineMedium,
                        fontWeight = FontWeight.Bold
                    )
                }
            }

            Spacer(Modifier.height(48.dp))

            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("Tus sesiones", style = MaterialTheme.typography.headlineMedium)
                TextButton(onClick = {
                    navController.navigate(ClientesScreen.SesionesClientes.route)

                }) {
                    Text("Ver todas")
                }
            }

            Spacer(Modifier.height(16.dp))

            // Card
            HorizontalPager(pageCount = 5) {
                SessionCard(
                    status = SessionStatus.EnProgreso,
                    hour = "3:00 P.M",
                    person = "Carlos Figueroa",
                    title = "Grabación de video",
                    municipality = "Mejicanos"
                )
            }

            Spacer(Modifier.height(48.dp))

            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("Camarógrafos", style = MaterialTheme.typography.headlineMedium)
                TextButton(onClick = { /*TODO*/ }) {
                    Text("Ver todos")
                }
            }

            Box(
                Modifier
                    .fillMaxWidth()
                    .height(200.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.clients_dash_background),
                    contentDescription = "Clientes Dashboard",
                    Modifier
                        .fillMaxWidth()
                        .fillMaxHeight(0.8f)
                        .align(Alignment.BottomCenter),
                    contentScale = ContentScale.FillBounds
                )
                Row(horizontalArrangement = Arrangement.SpaceBetween) {
                    Image(
                        modifier = Modifier
                            .weight(1f)
                            .fillMaxSize(),
                        painter = painterResource(id = R.drawable.handsome_man),
                        contentScale = ContentScale.FillBounds,
                        contentDescription = "Clientes Dashboard",
                    )
                    Column(
                        modifier = Modifier
                            .weight(1f)
                            .align(Alignment.CenterVertically)
                    ) {
                        Text(
                            "Carlos Figueroa",
                            style = MaterialTheme.typography.titleLarge,
                            fontWeight = FontWeight.Medium
                        )
                        Spacer(modifier = Modifier.height(16.dp))
                        Text(
                            "Especializado en bodas y todo tipo de eventos familiares",
                            style = MaterialTheme.typography.bodyMedium
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.height(16.dp))

            CamviButton(
                text = "Quiero reservar una sesión",
                modifier = Modifier
                    .fillMaxWidth()
            )
        }


    }
}
