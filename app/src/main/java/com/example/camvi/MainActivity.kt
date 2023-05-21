package com.example.camvi

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.example.camvi.ui.screens.clientes.VerCitasCliente
import com.example.camvi.ui.theme.CustomCamviTheme
import com.example.camvi.ui.widgets.global.GlobalNavGraph

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CamviApp()
        }
    }
}

@Composable
fun CamviApp() {
    CustomCamviTheme {
        Surface {
            val navController = rememberNavController()

            GlobalNavGraph(navController = navController)
        }
    }
}