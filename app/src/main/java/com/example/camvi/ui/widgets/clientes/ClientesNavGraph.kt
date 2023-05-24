package com.example.camvi.ui.widgets.global

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.camvi.model.clientes.CitasClienteData
import com.example.camvi.ui.screens.clientes.ClientesDashboard
import com.example.camvi.ui.screens.clientes.VerMasCitaCliente

@Composable
fun ClientesNavGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = ClientesScreen.InicioClientes.route) {
        composable(route = ClientesScreen.InicioClientes.route) {
            ClientesDashboard()
        }
        composable(route = ClientesScreen.SesionesClientes.route) {

        }
        composable(route = ClientesScreen.NotificacionesClientes.route) {

        }
        composable(route = ClientesScreen.CalificanosClientes.route) {

        }

        composable("${ClientesScreen.VerMasCitaCliente.route}/{idSesion}",
        arguments = listOf(navArgument("idSesion"){ type = NavType.IntType})
        ){ backStackEntry ->
            VerMasCitaCliente(backStackEntry.arguments?.getInt("idSesion") ?:0)
        }
    }
}