package com.example.camvi.ui.screens.clientes

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Preview
@Composable
fun NotificacionesScreenClientePreview() {
    NotificacionesScreenCliente(rememberNavController())
}

@Composable
fun NotificacionesScreenCliente(navController: NavController) {
    Surface(Modifier.fillMaxSize()) {
        Row {
            Column {
                Text(text = "Notificaciones", style = MaterialTheme.typography.headlineMedium)
                Text(text = "Tus sesiones próximas")
            }

            Button(onClick = { /*TODO*/ }) {
                Text("Limpiar")
            }
        }
    }
}