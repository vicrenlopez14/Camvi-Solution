package com.example.camvi

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.camvi.ui.screens.administradores.AdministradoresNavigationScreen
import com.example.camvi.ui.theme.CamviTheme
import com.example.camvi.ui.theme.CustomCamviTheme

class AdministradoresActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AdministradoresApp()
        }
    }
}

@Composable
fun AdministradoresApp() {
    CustomCamviTheme {
        // A surface container using the 'background' color from the theme
        AdministradoresNavigationScreen()
    }
}
