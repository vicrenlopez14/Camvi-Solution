package com.example.camvi

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import com.example.camvi.ui.screens.clientes.ClientesNavigationScreen
import com.example.camvi.ui.theme.CustomCamviTheme

class ClientesActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ClientesApp()
        }
    }
}

@Composable
fun ClientesApp() {
    CustomCamviTheme {
        // A surface container using the 'background' color from the theme
        ClientesNavigationScreen()
    }
}
