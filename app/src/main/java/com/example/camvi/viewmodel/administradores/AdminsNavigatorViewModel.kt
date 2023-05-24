package com.example.camvi.viewmodel.administradores

import androidx.lifecycle.ViewModel
import androidx.navigation.NavController

class AdminsNavigatorViewModel : ViewModel() {
    private lateinit var navController: NavController = NavController()

    fun setNavController(navController: NavController) {
        this.navController = navController
    }

    fun getNavController(): NavController {
        return navController
    }
}
