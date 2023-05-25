package com.example.camvi.ui.widgets.global

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.camvi.ui.screens.clientes.ClientesDashboard
import com.example.camvi.ui.screens.clientes.NotificacionesScreenCliente
import com.example.camvi.ui.screens.clientes.SesionesClientes
import com.example.camvi.ui.screens.clientes.VerMasCitaCliente

@Composable
fun ClientesNavGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = ClientesScreen.InicioClientes.route) {
        composable(route = ClientesScreen.InicioClientes.route) {
            ClientesDashboard(navController)
        }
        composable(route = ClientesScreen.SesionesClientes.route) {
            SesionesClientes(navController)
        }
        composable(route = ClientesScreen.NotificacionesClientes.route) {
            NotificacionesScreenCliente(navController)
        }
        composable(route = ClientesScreen.CalificanosClientes.route) {

        }

        composable(
            "${ClientesScreen.VerMasCitaCliente.route}/{idSesion}",
            arguments = listOf(navArgument("idSesion") { type = NavType.IntType })
        ) { backStackEntry ->
            VerMasCitaCliente(navController, backStackEntry.arguments?.getInt("idSesion") ?: 0)

        }
    }
}