package com.example.camvi.ui.widgets.global

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
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

        composable(route= ClientesScreen.VerMasCitaCliente.route){
        VerMasCitaCliente()
        }
    }
}