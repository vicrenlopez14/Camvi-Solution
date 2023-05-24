package com.example.camvi.viewmodel.clientes

import androidx.lifecycle.ViewModel
import androidx.navigation.NavController

class ClientesNavigatorViewModel: ViewModel() {
    private lateinit var navControllerClientes: NavController

     fun setNavController(navController: NavController) {
        this.navControllerClientes = navController
    }

    fun getNavController(): NavController {
        return navControllerClientes
    }

}