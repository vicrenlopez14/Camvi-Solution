package com.example.camvi.ui.widgets.global

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.camvi.ui.widgets.camarografos.CamarografosDashboard

@Composable
fun CamarografosNavGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = CamviScreen.Bienvenida.route) {
        composable(CamarografosScreen.InicioCamarografos.route) {
            CamarografosDashboard()
        }
        composable(CamarografosScreen.SesionesCamarografos.route) {

        }
        composable(CamarografosScreen.NotificacionesCamarografos.route) {

        }
    }
}