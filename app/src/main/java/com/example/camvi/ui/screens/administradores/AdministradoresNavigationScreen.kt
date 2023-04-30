package com.example.camvi.ui.screens.administradores

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.example.camvi.ui.widgets.administradores.DrawerContenido
import com.example.camvi.ui.widgets.global.AdministradoresNavGraph
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AdministradoresNavigationScreen() {

    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
    val coroutineScope = rememberCoroutineScope()
    val navControllerAdministradores = rememberNavController()

    ModalNavigationDrawer(
        drawerState = drawerState,
        drawerContent = {
            ModalDrawerSheet {
                DrawerContenido(navControllerAdministradores, drawerState)
            }
        },
    ) {
        Scaffold(topBar = {
            TopAppBar(title = { Text(text = "Camvi") }, navigationIcon = {

                IconButton(onClick = {
                    if (drawerState.isClosed) {
                        coroutineScope.launch {
                            drawerState.open()
                        }
                    } else {
                        coroutineScope.launch {
                            drawerState.close()
                        }
                    }

                }) {
                    Icon(Icons.Filled.Menu, contentDescription = "Drawer Menu.")
                }

            })
        }) {
            Box(
                modifier = Modifier
                    .padding(it)
                    .fillMaxSize()
            ) {
                AdministradoresNavGraph(navController = navControllerAdministradores)
            }
        }
    }

}