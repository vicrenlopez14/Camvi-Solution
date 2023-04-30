package com.example.camvi.ui.widgets.global

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.camvi.ui.screens.global.IntroScreen
import com.example.camvi.ui.screens.global.LoginScreen
import com.example.camvi.ui.screens.global.RegisterScreen


@Composable
fun GlobalNavGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = CamviScreen.Bienvenida.route) {
        composable(CamviScreen.Bienvenida.route) {
            IntroScreen(navController)
        }

        composable(CamviScreen.InicioDeSesion.route) {
            LoginScreen(navController)
        }

        composable(CamviScreen.Registro.route) {
            RegisterScreen(navController)
        }
    }
}