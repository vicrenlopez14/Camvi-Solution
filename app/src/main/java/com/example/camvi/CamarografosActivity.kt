package com.example.camvi

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import com.example.camvi.ui.screens.camarografos.CamarografosNavigationScreen
import com.example.camvi.ui.theme.CustomCamviTheme

class CamarografosActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CamarografosApp()
        }
    }
}

@Composable
fun CamarografosApp() {
    CustomCamviTheme {
        // A surface container using the 'background' color from the theme
        CamarografosNavigationScreen()
    }
}
