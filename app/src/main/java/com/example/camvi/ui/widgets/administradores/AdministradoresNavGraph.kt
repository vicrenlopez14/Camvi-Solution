package com.example.camvi.ui.widgets.administradores

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.camvi.ui.screens.administradores.AdministradoresDashboard
import com.example.camvi.ui.screens.administradores.CalificacionesScreen
import com.example.camvi.ui.screens.administradores.CamarografosListScreen
import com.example.camvi.ui.screens.administradores.ConfirmacionesScreen
import com.example.camvi.ui.screens.administradores.CrearCamarografo
import com.example.camvi.ui.screens.administradores.SesionesAgendadasScreen
import com.example.camvi.ui.screens.administradores.SesionesSinCamarografos
import com.example.camvi.ui.screens.global.AsignarCamarografoAdmin
import com.example.camvi.ui.screens.global.PhotoUploadScreen
import com.example.camvi.ui.widgets.global.AdministradoresScreen

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

        composable(AdministradoresScreen.SesionesSinCamarografosAdministradores.route) {
            SesionesSinCamarografos()
        }

        composable(
            "${AdministradoresScreen.AsignarCamarografoAdministradores.route}/{sessionId}",
            arguments = listOf(navArgument("sessionId") { type = NavType.StringType })
        ) { backStackEntry ->
            AsignarCamarografoAdmin(backStackEntry.arguments?.getString("sessionId") ?: "")
        }

        composable(AdministradoresScreen.SesionesAgendadasAdministradores.route) {
            SesionesAgendadasScreen()
        }

        composable(AdministradoresScreen.SubirFotografiasAdministradores.route) {
            PhotoUploadScreen()
        }

        composable(AdministradoresScreen.CrearCamarografo.route){
            CrearCamarografo()
        }
    }
}