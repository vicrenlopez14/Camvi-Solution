package com.example.camvi.ui.widgets.global

import android.view.LayoutInflater
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.camvi.databinding.FragmentLoginBinding
import com.example.camvi.databinding.FragmentPrincipalBinding
import com.example.camvi.databinding.FragmentRegistroBinding
import com.example.camvi.ui.screens.administradores.*
import com.example.camvi.ui.screens.global.IntroScreen
import com.example.camvi.ui.screens.global.LoginScreen
import com.example.camvi.ui.screens.global.RegisterScreen
import com.example.camvi.utils.FragmentScreen


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