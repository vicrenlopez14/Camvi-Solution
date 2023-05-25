package com.example.camvi.ui.screens.administradores

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Preview
@Composable
fun ConfirmacionesScreenPreview() {
    ConfirmacionesScreen(navController = rememberNavController())
}

@Composable
fun ConfirmacionesScreen(navController: NavController) {
    Text(text = "Confirmaciones screen")

}