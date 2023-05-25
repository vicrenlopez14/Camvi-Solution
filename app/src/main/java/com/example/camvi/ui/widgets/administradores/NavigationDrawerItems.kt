package com.example.camvi.ui.widgets.administradores

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.navOptions
import com.example.camvi.ui.widgets.global.CamviScreen
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NavigationDrawerItems(
    navController: NavHostController,
    drawerState: DrawerState,
    items: List<CamviScreen> = listOf(CamviScreen.Bienvenida)
) {
    val currentBackStackEntryAsState by navController.currentBackStackEntryAsState()

    val destination = currentBackStackEntryAsState?.destination


    items.forEach { screen ->
        AddItem(
            screen = screen,
            currentDestination = destination,
            navController = navController,
            drawerState = drawerState
        )
    }

    AddItemCallback(
        screen = CamviScreen.CerrarSesion,
        currentDestination = destination,
        onClick = {
            navController.navigate(CamviScreen.Bienvenida.route, navOptions {
                this.popUpTo(navController.graph.startDestinationId)
                this.launchSingleTop = true
            })
        }
    )

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AddItemCallback(
    screen: CamviScreen,
    currentDestination: NavDestination?,
    onClick: () -> Unit,
) {
    val scope = rememberCoroutineScope()

    NavigationDrawerItem(
        icon = { Icon(screen.icon ?: Icons.Filled.Home, screen.title) },
        label = {
            Text(
                text = screen.title ?: "Pantalla",
                color = MaterialTheme.colorScheme.onSurfaceVariant
            )
        },
        selected = currentDestination?.route == "SettingPage",
        onClick = {
            onClick()
        },
        colors = NavigationDrawerItemDefaults.colors(
            unselectedContainerColor = MaterialTheme.colorScheme.secondary,
            selectedContainerColor = MaterialTheme.colorScheme.background
        ),
        shape = MaterialTheme.shapes.small,
        modifier = Modifier
            .padding(NavigationDrawerItemDefaults.ItemPadding)
            .height(70.dp)
            .clip(RoundedCornerShape(16.dp))
    )
    Spacer(modifier = Modifier.height(10.dp))

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AddItem(
    screen: CamviScreen,
    currentDestination: NavDestination?,
    navController: NavController,
    drawerState: DrawerState,
) {
    val scope = rememberCoroutineScope()

    NavigationDrawerItem(
        icon = { Icon(screen.icon ?: Icons.Filled.Home, screen.title) },
        label = {
            Text(
                text = screen.title ?: "Pantalla",
                color = MaterialTheme.colorScheme.onSurfaceVariant
            )
        },
        selected = currentDestination?.route == "SettingPage",
        onClick = {
            navController.navigate(screen.route, navOptions {
                this.launchSingleTop = true
                this.restoreState = true
            })
            scope.launch {
                drawerState.close()
            }

        },
        colors = NavigationDrawerItemDefaults.colors(
            unselectedContainerColor = MaterialTheme.colorScheme.secondary,
            selectedContainerColor = MaterialTheme.colorScheme.background
        ),
        shape = MaterialTheme.shapes.small,
        modifier = Modifier
            .padding(NavigationDrawerItemDefaults.ItemPadding)
            .height(70.dp)
            .clip(RoundedCornerShape(16.dp))
    )
    Spacer(modifier = Modifier.height(10.dp))

}