package com.example.camvi.ui.widgets.global

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.camvi.ui.screens.camarografos.CamarografosSesionesDetalle
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
            SesionesCamarografos(navController, idUsuario = 0)
        }
        composable(CamarografosScreen.NotificacionesCamarografos.route) {
            NotificacionesCamarografos(navController)
        }
        composable(
            "${CamarografosScreen.CamarografosSesionesDetalle.route}/{idSesion}",
            arguments = listOf(navArgument("idSesion") { type = NavType.IntType })
        ) { backStackEntry ->
            CamarografosSesionesDetalle(navController, backStackEntry.arguments?.getInt("idSesion") ?: 0)

        }
    }
}