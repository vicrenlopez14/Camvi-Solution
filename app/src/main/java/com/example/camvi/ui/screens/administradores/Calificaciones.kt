package com.example.camvi.ui.screens.administradores

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Preview
@Composable
fun CalificacionesScreenPreview() {
    CalificacionesScreen(navController = rememberNavController())
}

@Composable
fun CalificacionesScreen(navController: NavController) {
    Text(text = "Calificaciones screen")
}