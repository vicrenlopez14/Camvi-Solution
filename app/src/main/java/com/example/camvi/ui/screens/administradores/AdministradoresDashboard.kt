@file:OptIn(
    ExperimentalFoundationApi::class, ExperimentalFoundationApi::class,
    ExperimentalFoundationApi::class
)

package com.example.camvi.ui.screens.administradores

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
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
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.camvi.R
import com.example.camvi.model.globales.Periodo
import com.example.camvi.ui.widgets.global.AdministradoresScreen
import com.example.camvi.viewmodel.administradores.AdminsDashboardViewModel
import com.example.camvi.viewmodel.administradores.AdminsNavigatorViewModel
import kotlinx.coroutines.delay

@Preview
@Composable
fun AdministradoresDashboardPreview() {
    AdministradoresDashboard()
}

@Composable
fun AdministradoresDashboard() {
    Surface(Modifier.fillMaxSize()) {
        Column(
            Modifier
                .padding(16.dp)
        ) {
            Header()
            Spacer(Modifier.height(16.dp))
            WarningSesiones()
            Spacer(Modifier.height(16.dp))
            EstadoActual()
            Spacer(Modifier.height(16.dp))
            StatisticsList()
            Spacer(Modifier.height(16.dp))
            SatisfactionCarrousel()
        }
    }
}

@Composable
fun Header() {
    val vector = painterResource(id = R.drawable.photographer)
    Surface(
        modifier = Modifier
            .clip(RoundedCornerShape(32.dp))
            .fillMaxWidth(),
        color = MaterialTheme.colorScheme.primary,
        shadowElevation = 8.dp,
        tonalElevation = 4.dp
    ) {
        Column(Modifier.padding(16.dp)) {
            Image(
                painter = vector,
                contentDescription = null,
                modifier = Modifier
                    .align(Alignment.End)
                    .size(128.dp),
                colorFilter = ColorFilter.tint(MaterialTheme.colorScheme.onPrimary)
            )
            Text("Hola, Bryan", style = MaterialTheme.typography.bodyLarge)
            Text(
                "Esperamos que todo vaya excelente en Camvi",
                style = MaterialTheme.typography.headlineSmall
            )
        }
    }
}

@ExperimentalFoundationApi
@Composable
fun SatisfactionCarrousel(
    adminsDashboardViewModel: AdminsDashboardViewModel = viewModel(),
    navigationViewModel: AdminsNavigatorViewModel = viewModel()
) {
    val adminsDashboardUiState by adminsDashboardViewModel.uiState.collectAsState()

    val pagerState = rememberPagerState()

    LaunchedEffect(Unit) {
        while (true) {
            delay(2000)
            pagerState.animateScrollToPage((pagerState.currentPage + 1) % 5)
        }
    }

    HorizontalPager(pageCount = 2, state = pagerState) { page ->
        LargeIconTextChip(
            text = "Hay ${adminsDashboardUiState.clientSatisfactionPercentage}% de satisfacción entre los usuarios el día de hoy.",
            color = colorResource(id = R.color.GreenSuccess)
        )
        LargeIconTextChip(
            text = "Se agendaron ${adminsDashboardUiState.newSesions} sesiones más.",
            color = colorResource(id = R.color.GreenSuccess),
            modifier = Modifier.clickable {
                val navController = navigationViewModel.getNavController()
                navController.navigate("${AdministradoresScreen.SesionesSinCamarografosAdministradores}/{id}")
            }
        )
    }
}

@Composable
fun WarningSesiones(
    adminsDashboardViewModel: AdminsDashboardViewModel = viewModel(),
    navigationViewModel: AdminsNavigatorViewModel = viewModel(),
) {
    val adminsDashboardUiState by adminsDashboardViewModel.uiState.collectAsState()

    val pagerState = rememberPagerState()

    LaunchedEffect(Unit) {
        while (true) {
            delay(3000)
            pagerState.animateScrollToPage((pagerState.currentPage + 1) % 5)
        }
    }

// Display 10 items
    HorizontalPager(pageCount = 2, state = pagerState) { page ->
        // Our page content
        Surface(
            modifier = Modifier
                .clip(RoundedCornerShape(32.dp))
                .fillMaxWidth(),
            color = colorResource(id = R.color.Yellow),

            ) {
            Row(
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                // Circle shape

                // Warning logo
                Box(
                    Modifier
                        .padding(8.dp)
                        .clip(CircleShape)
                ) {
                    Box(
                        Modifier
                            .size(50.dp)
                            .background(Color.White)
                            .align(Alignment.Center)
                    )
                    Image(
                        painter = painterResource(id = R.drawable.warning),
                        contentDescription = null,
                        modifier = Modifier
                            .size(32.dp)
                            .align(Alignment.Center),
                        colorFilter = ColorFilter.tint(Color.Black)
                    )
                }

                Text(
                    "Hay ${adminsDashboardUiState.sessionsWithoutCamarographer} sesiones sin camarógrafo asignado. Toca aquí.",
                    style = MaterialTheme.typography.bodyMedium,

                    modifier = Modifier
                        .align(Alignment.CenterVertically)
                        .clickable {
                            val navController = navigationViewModel.getNavController()

                            navController.navigate(AdministradoresScreen.SesionesSinCamarografosAdministradores.route)
                        }
                )
            }
        }
    }
}

@Composable
fun LargeIconTextChip(
    painter: Painter = painterResource(id = R.drawable.warning),
    text: String = "",
    color: Color = colorResource(R.color.Yellow),
    modifier: Modifier = Modifier
) {
    Surface(
        modifier = modifier
            .clip(RoundedCornerShape(32.dp))
            .fillMaxWidth(),
        color = color,

        ) {
        Row(
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            // Warning logo
            Box(Modifier.weight(1f)) {
                Box(
                    Modifier
                        .padding(8.dp)
                        .clip(CircleShape)

                ) {
                    Box(
                        Modifier
                            .size(50.dp)
                            .background(Color.White)
                            .align(Alignment.Center)
                    )
                    Image(
                        painter = painter,
                        contentDescription = null,
                        modifier = Modifier
                            .size(32.dp)
                            .align(Alignment.Center),
                        colorFilter = ColorFilter.tint(Color.Black)
                    )
                }
            }

            Text(
                text,
                style = MaterialTheme.typography.bodyMedium,
                modifier = Modifier
                    .align(Alignment.CenterVertically)
                    .weight(4f)
                    .padding(end = 16.dp)
            )
        }
    }
}


@Composable
fun EstadoActual() {
    Column {
        Text(
            "Estado actual",
            style = MaterialTheme.typography.headlineSmall,
        )

        Spacer(Modifier.height(16.dp))

        PeriodOfTimeButtonRow()
    }
}

@Composable
fun PeriodOfTimeButtonRow(dashboardViewModel: AdminsDashboardViewModel = viewModel()) {
    val selectedPeriod by dashboardViewModel.uiState.collectAsState()

    Column(Modifier.background(color = Color.Black, shape = RoundedCornerShape(16.dp))) {
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .padding(8.dp)
                .fillMaxWidth()
        ) {
            PeriodOfTime(
                periodo = Periodo.Hoy,
                modifier = Modifier.weight(1f, true),
                selected = selectedPeriod.periodOfTime == Periodo.Hoy,
                onClick = { dashboardViewModel.ChangePeriodOfTime(Periodo.Hoy) }
            )
            PeriodOfTime(
                periodo = Periodo.Semana,
                modifier = Modifier.weight(1f, true),
                selected = selectedPeriod.periodOfTime == Periodo.Semana,
                onClick = { dashboardViewModel.ChangePeriodOfTime(Periodo.Semana) }
            )
            PeriodOfTime(
                periodo = Periodo.Mes,
                modifier = Modifier.weight(1f, true),
                selected = selectedPeriod.periodOfTime == Periodo.Mes,
                onClick = { dashboardViewModel.ChangePeriodOfTime(Periodo.Mes) }
            )
        }
    }
}

@Composable
fun PeriodOfTime(
    modifier: Modifier,
    selected: Boolean = false,
    periodo: Periodo = Periodo.Hoy,
    onClick: () -> Unit = {},
) {
    Surface(
        modifier
            .padding(horizontal = 8.dp)
            .clip(RoundedCornerShape(16.dp))
            .clickable { onClick() },
        color = colorResource(id = if (selected) R.color.White else R.color.black),
        contentColor = colorResource(id = if (selected) R.color.black else R.color.White)

    ) {
        Column(
            modifier = Modifier
                .padding(16.dp)

        ) {
            Text(
                periodo.Name,
                style = MaterialTheme.typography.bodyLarge,
                modifier = Modifier.align(Alignment.CenterHorizontally),
                textAlign = TextAlign.Center
            )
        }
    }
}

@Composable
fun StatisticsList() {
    LazyRow(
        Modifier
            .fillMaxHeight(0.6f)
            .fillMaxWidth()
    ) {
        item { SesionesEnCursoWidget() }
        item { SesionesPendientesWidget(3, "David y Camila están libres") }
        item { SesionesCompletadasWidget(2, "Felicidades") }
    }
}

@Composable
fun SesionesCompletadasWidget(
    num: Int = 0,
    description: String = "Estado desconocido"
) {
    StatisticsWidget(
        number = 5,
        label = "Sesiones completadas",
        description = description,
        color = colorResource(id = R.color.GreenSuccess)
    )
}

@Composable
fun SesionesEnCursoWidget(
    adminsDashboardViewModel: AdminsDashboardViewModel = viewModel()
) {
    val adminsDashboardUiState by adminsDashboardViewModel.uiState.collectAsState()

    StatisticsWidget(
        number = adminsDashboardUiState.sesionesEnCurso.num,
        label = "Sesiones en curso",
        description = adminsDashboardUiState.sesionesEnCurso.description,
        color = colorResource(id = R.color.RedError)
    )
}

@Composable
fun SesionesPendientesWidget(
    num: Int = 0,
    description: String = "Estado desconocido"
) {
    StatisticsWidget(
        number = 1,
        label = description,
        description = "",
        color = colorResource(id = R.color.Yellow)
    )
}

@Composable
fun StatisticsWidget(number: Int, label: String, description: String, color: Color) {
    Surface(
        color = color,
        modifier = Modifier
            .width(200.dp)
            .padding(end = 16.dp)
            .clip(
                RoundedCornerShape(16.dp)
            )
    ) {
        Column(Modifier.padding(16.dp)) {
            Column(modifier = Modifier.weight(2f)) {
                Text(number.toString(), style = MaterialTheme.typography.displayMedium)
                Text(label, style = MaterialTheme.typography.bodyLarge)
            }
            Text(
                description,
                style = MaterialTheme.typography.bodyMedium,
                modifier = Modifier.weight(1f)
            )

        }
    }
}


@Composable
fun SatisfactionIndex() {
    Row {

    }
}