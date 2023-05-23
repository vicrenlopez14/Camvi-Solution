package com.example.camvi.viewmodel.administradores

import androidx.lifecycle.ViewModel
import androidx.navigation.NavController
import com.example.camvi.ui.widgets.global.AdministradoresScreen

class AdminsNavigatorViewModel : ViewModel() {
    private lateinit var navController: NavController

    fun setNavController(navController: NavController) {
        this.navController = navController
    }

    fun navigate(route: AdministradoresScreen, args: Any? = null) {
        navController.navigate(route.route)
    }
}
