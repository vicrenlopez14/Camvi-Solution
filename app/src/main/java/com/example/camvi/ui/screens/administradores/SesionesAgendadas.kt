package com.example.camvi.ui.screens.administradores

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
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.camvi.R
import com.example.camvi.model.globales.CamviFunctions
import com.example.camvi.model.globales.Session
import com.example.camvi.model.globales.SessionStatus
import com.example.camvi.model.globales.SessionsListInfo
import com.example.camvi.ui.widgets.global.AdministradoresScreen
import com.example.camvi.ui.widgets.global.CamviButton
import com.example.camvi.ui.widgets.global.StatusChip
import com.example.camvi.viewmodel.administradores.AdminsNavigatorViewModel

@Preview
@Composable
fun SesionesAgendadasScreenPreview() {
    SesionesAgendadasScreen(SessionStatus.EnProgreso)
}

@Composable
fun SesionesAgendadasScreen(
    status: SessionStatus,
    adminsNavigationViewModel: AdminsNavigatorViewModel = viewModel()
) {


    val sessions = remember { mutableStateOf(emptyList<Session>()) }


    LaunchedEffect(key1 = sessions) {
        sessions.value = CamviFunctions.getSessionsByStatus(status)
    }

    Surface(
        Modifier
            .fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {
            Spacer(Modifier.height(16.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
            ) {
                Text(
                    status.NaturalName, style = MaterialTheme.typography.headlineSmall,
                    fontWeight = FontWeight.Medium
                )

                StatusChip(status)
            }

            Spacer(Modifier.height(32.dp))

            LazyColumn(Modifier.fillMaxSize()) {
                items(sessions.value) { session ->
                    SessionsListItem(
                        session = SessionsListInfo(
                            id = session.id,
                            titulo = session.titulo,
                            camarografo = session.nombreFotografo,
                            cliente = session.nombreCliente,
                            fechaEvento = session.fechaEvento,
                            fotoGaleria = session.fotoGaleria,
                        ),
                        onClick = {
                            val navController = adminsNavigationViewModel.getNavController()

                            //navController.navigate("${AdministradoresScreen.DetalleCitas.route}/${session.id}")
                        }
                    )
                }
            }
        }
    }
}

@Composable
fun SessionsListItem(
    session: SessionsListInfo,
    onClick: () -> Unit = {}
) {
    Box(
        Modifier
            .fillMaxWidth()
            .fillMaxHeight(0.2f),
    ) {
        Row(
            Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp)
                .clip(RoundedCornerShape(16.dp)),
            horizontalArrangement = Arrangement.SpaceBetween,
        ) {
            Image(
                painter = painterResource(id = R.drawable.placeholderpicture),
                contentDescription = "Sesión",
                contentScale = ContentScale.FillHeight,
                modifier = Modifier
                    .fillMaxHeight()
                    .weight(0.2f)
            )

            Column(
                Modifier
                    .weight(0.5f)
                    .padding(start = 8.dp)
            ) {
                Text(session.titulo ?: "")

                Spacer(Modifier.height(4.dp))

                Text(session.camarografo ?: "")

                Spacer(Modifier.height(16.dp))


                Row {
                    Image(
                        painter = painterResource(id = R.drawable.calendar_transparent),
                        contentDescription = "Vencimiento",
                        modifier = Modifier
                            .height(16.dp)
                    )
                    Text("Vence ${session.fechaEvento ?: ""}")
                }
            }

            Box(
                Modifier
                    .weight(0.3f)
                    .fillMaxSize()
                    .align(Alignment.CenterVertically)
            ) {
                CamviButton(
                    text = "Ver más",
                    modifier = Modifier.align(Alignment.Center),
                    onClick = {
                        onClick()
                    }
                )
            }

        }
    }
}