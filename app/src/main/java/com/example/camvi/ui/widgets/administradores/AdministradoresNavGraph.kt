package com.example.camvi.ui.widgets.global

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.camvi.ui.screens.administradores.AdministradoresDashboard
import com.example.camvi.ui.screens.administradores.CalificacionesScreen
import com.example.camvi.ui.screens.administradores.CamarografosListScreen
import com.example.camvi.ui.screens.administradores.ConfirmacionesScreen
import com.example.camvi.ui.screens.administradores.GaleriaDeFotosScreen
import com.example.camvi.ui.screens.administradores.SesionesAgendadasScreen

@Composable
fun AdministradoresNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = AdministradoresScreen.InicioAdministradores.route
    ) {
        composable(AdministradoresScreen.InicioAdministradores.route) {
            AdministradoresDashboard()
        }

        composable(AdministradoresScreen.CamarografosAdministradores.route) {
            CamarografosListScreen()
        }

        composable(AdministradoresScreen.SesionesAdministradores.route) {
            SesionesAgendadasScreen()
        }

        composable(AdministradoresScreen.ConfirmacionesAdministradores.route) {
            ConfirmacionesScreen()
        }

        composable(AdministradoresScreen.CalificacionesAdministradores.route) {
            CalificacionesScreen()
        }

        composable(AdministradoresScreen.GaleriaDeFotosAdministradores.route) {
            GaleriaDeFotosScreen()
        }
    }
}