package com.example.camvi.ui.widgets.administradores

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.camvi.model.globales.SessionStatus
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
fun AdministradoresNavGraph(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = AdministradoresScreen.InicioAdministradores.route
    ) {
        composable(AdministradoresScreen.InicioAdministradores.route) {
            AdministradoresDashboard(navController)
        }

        composable(AdministradoresScreen.CamarografosAdministradores.route) {
            CamarografosListScreen(navController)
        }

        composable(AdministradoresScreen.SesionesAdministradores.route) {
            SesionesAgendadasScreen(navController, SessionStatus.Pendiente)
        }

        composable(AdministradoresScreen.ConfirmacionesAdministradores.route) {
            ConfirmacionesScreen(navController)
        }

        composable(AdministradoresScreen.CalificacionesAdministradores.route) {
            CalificacionesScreen(navController)
        }

        composable(AdministradoresScreen.SesionesSinCamarografosAdministradores.route) {
            SesionesSinCamarografos(navController)
        }

        composable(
            "${AdministradoresScreen.AsignarCamarografoAdministradores.route}/{sessionId}",
            arguments = listOf(navArgument("sessionId") { type = NavType.IntType })
        ) { backStackEntry ->
            AsignarCamarografoAdmin(backStackEntry.arguments?.getInt("sessionId") ?: 0)
        }

        composable(
            "${AdministradoresScreen.SesionesAgendadasAdministradores.route}/{status}",
            arguments = listOf(navArgument("status") { type = NavType.StringType })
        ) {
            val status: SessionStatus = when (it.arguments?.getString("status")) {
                SessionStatus.EnProgreso.Name -> SessionStatus.EnProgreso
                SessionStatus.Pendiente.Name -> SessionStatus.Pendiente
                SessionStatus.Finalizada.Name -> SessionStatus.Finalizada
                else -> SessionStatus.Pendiente
            }

            SesionesAgendadasScreen(navController, status)
        }

        composable(AdministradoresScreen.SubirFotografiasAdministradores.route) {
            PhotoUploadScreen(navController)
        }

        composable(AdministradoresScreen.CrearCamarografo.route) {
            CrearCamarografo(navController)
        }
    }
}