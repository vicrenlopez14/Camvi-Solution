package com.example.camvi.ui.widgets.global

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.camvi.ui.screens.camarografos.NotificacionesCamarografos
import com.example.camvi.ui.screens.camarografos.SesionesCamarografos
import com.example.camvi.ui.widgets.camarografos.CamarografosDashboard

@Composable
fun CamarografosNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = CamarografosScreen.InicioCamarografos.route
    ) {
        composable(CamarografosScreen.InicioCamarografos.route) {
            CamarografosDashboard(navController)
        }
        composable(CamarografosScreen.SesionesCamarografos.route) {
            SesionesCamarografos(navController)
        }
        composable(CamarografosScreen.NotificacionesCamarografos.route) {
            NotificacionesCamarografos(navController)
        }
    }
}