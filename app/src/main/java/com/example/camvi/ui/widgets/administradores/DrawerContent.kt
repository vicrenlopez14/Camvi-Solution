package com.example.camvi.ui.widgets.administradores

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.DrawerState
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.camvi.ui.widgets.global.CamviScreen

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DrawerContenido(
    navController: NavHostController,
    drawerState: DrawerState,
    items: List<CamviScreen> = listOf(
        CamviScreen.Bienvenida
    )
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = MaterialTheme.colorScheme.primary.copy(alpha = 0.85f))
            .padding(top = 32.dp),
        contentAlignment = Alignment.Center,
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            DrawerHeader()
            Spacer(modifier = Modifier.height(32.dp))
            NavigationDrawerItems(navController, drawerState, items)
            Spacer(modifier = Modifier.weight(1f))
        }
    }
}

